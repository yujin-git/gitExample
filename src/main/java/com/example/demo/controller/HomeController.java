package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * HomeController
 */
@Controller
public class HomeController {

    // @GetMapping("/hello")
    // public String home(@RequestParam(value="message", required=false) String message, Model model) {
    //     model.addAttribute("message", "helloworld");
    //     return "home";
    // }

    @GetMapping("/hello")
    public String home(@RequestParam("msg") String msg, Model model) {
        model.addAttribute("msg", msg);
        return "home";
    }
    
}