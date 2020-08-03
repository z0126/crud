package com.example.test.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class test {
    @ResponseBody
    @RequestMapping("/action")
    public String toCustomer() {
        return "system  menu_list";
    }
}
