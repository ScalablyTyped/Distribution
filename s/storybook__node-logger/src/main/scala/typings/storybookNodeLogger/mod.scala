package typings.storybookNodeLogger

import org.scalablytyped.runtime.Shortcut
import typings.chalk.mod.Chalk
import typings.npmlog.mod.Logger
import typings.std.TemplateStringsArray
import typings.storybookNodeLogger.anon.Message
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object colors {
    
    @JSImport("@storybook/node-logger", "colors")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@storybook/node-logger", "colors.blue")
    @js.native
    def blue: Chalk = js.native
    @scala.inline
    def blue(text: js.Any*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("blue")(text.asInstanceOf[js.Any]).asInstanceOf[String]
    /**
    		Use a template string.
    		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
    		@example
    		```
    		import chalk = require('chalk');
    		log(chalk`
    		CPU: {red ${cpu.totalPercent}%}
    		RAM: {green ${ram.used / ram.total * 100}%}
    		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
    		`);
    		```
    		@example
    		```
    		import chalk = require('chalk');
    		log(chalk.red.bgBlack`2 + 3 = {bold ${2 + 3}}`)
    		```
    		*/
    @scala.inline
    def blue(text: TemplateStringsArray, placeholders: js.Any*): String = (^.asInstanceOf[js.Dynamic].applyDynamic("blue")(text.asInstanceOf[js.Any], placeholders.asInstanceOf[js.Any])).asInstanceOf[String]
    @scala.inline
    def blue_=(x: Chalk): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blue")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/node-logger", "colors.gray")
    @js.native
    def gray: Chalk = js.native
    @scala.inline
    def gray(text: js.Any*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("gray")(text.asInstanceOf[js.Any]).asInstanceOf[String]
    /**
    		Use a template string.
    		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
    		@example
    		```
    		import chalk = require('chalk');
    		log(chalk`
    		CPU: {red ${cpu.totalPercent}%}
    		RAM: {green ${ram.used / ram.total * 100}%}
    		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
    		`);
    		```
    		@example
    		```
    		import chalk = require('chalk');
    		log(chalk.red.bgBlack`2 + 3 = {bold ${2 + 3}}`)
    		```
    		*/
    @scala.inline
    def gray(text: TemplateStringsArray, placeholders: js.Any*): String = (^.asInstanceOf[js.Dynamic].applyDynamic("gray")(text.asInstanceOf[js.Any], placeholders.asInstanceOf[js.Any])).asInstanceOf[String]
    @scala.inline
    def gray_=(x: Chalk): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gray")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/node-logger", "colors.green")
    @js.native
    def green: Chalk = js.native
    @scala.inline
    def green(text: js.Any*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("green")(text.asInstanceOf[js.Any]).asInstanceOf[String]
    /**
    		Use a template string.
    		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
    		@example
    		```
    		import chalk = require('chalk');
    		log(chalk`
    		CPU: {red ${cpu.totalPercent}%}
    		RAM: {green ${ram.used / ram.total * 100}%}
    		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
    		`);
    		```
    		@example
    		```
    		import chalk = require('chalk');
    		log(chalk.red.bgBlack`2 + 3 = {bold ${2 + 3}}`)
    		```
    		*/
    @scala.inline
    def green(text: TemplateStringsArray, placeholders: js.Any*): String = (^.asInstanceOf[js.Dynamic].applyDynamic("green")(text.asInstanceOf[js.Any], placeholders.asInstanceOf[js.Any])).asInstanceOf[String]
    @scala.inline
    def green_=(x: Chalk): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("green")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/node-logger", "colors.orange")
    @js.native
    def orange: Chalk = js.native
    @scala.inline
    def orange(text: js.Any*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("orange")(text.asInstanceOf[js.Any]).asInstanceOf[String]
    /**
    		Use a template string.
    		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
    		@example
    		```
    		import chalk = require('chalk');
    		log(chalk`
    		CPU: {red ${cpu.totalPercent}%}
    		RAM: {green ${ram.used / ram.total * 100}%}
    		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
    		`);
    		```
    		@example
    		```
    		import chalk = require('chalk');
    		log(chalk.red.bgBlack`2 + 3 = {bold ${2 + 3}}`)
    		```
    		*/
    @scala.inline
    def orange(text: TemplateStringsArray, placeholders: js.Any*): String = (^.asInstanceOf[js.Dynamic].applyDynamic("orange")(text.asInstanceOf[js.Any], placeholders.asInstanceOf[js.Any])).asInstanceOf[String]
    @scala.inline
    def orange_=(x: Chalk): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("orange")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/node-logger", "colors.pink")
    @js.native
    def pink: Chalk = js.native
    @scala.inline
    def pink(text: js.Any*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("pink")(text.asInstanceOf[js.Any]).asInstanceOf[String]
    /**
    		Use a template string.
    		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
    		@example
    		```
    		import chalk = require('chalk');
    		log(chalk`
    		CPU: {red ${cpu.totalPercent}%}
    		RAM: {green ${ram.used / ram.total * 100}%}
    		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
    		`);
    		```
    		@example
    		```
    		import chalk = require('chalk');
    		log(chalk.red.bgBlack`2 + 3 = {bold ${2 + 3}}`)
    		```
    		*/
    @scala.inline
    def pink(text: TemplateStringsArray, placeholders: js.Any*): String = (^.asInstanceOf[js.Dynamic].applyDynamic("pink")(text.asInstanceOf[js.Any], placeholders.asInstanceOf[js.Any])).asInstanceOf[String]
    @scala.inline
    def pink_=(x: Chalk): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pink")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/node-logger", "colors.purple")
    @js.native
    def purple: Chalk = js.native
    @scala.inline
    def purple(text: js.Any*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("purple")(text.asInstanceOf[js.Any]).asInstanceOf[String]
    /**
    		Use a template string.
    		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
    		@example
    		```
    		import chalk = require('chalk');
    		log(chalk`
    		CPU: {red ${cpu.totalPercent}%}
    		RAM: {green ${ram.used / ram.total * 100}%}
    		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
    		`);
    		```
    		@example
    		```
    		import chalk = require('chalk');
    		log(chalk.red.bgBlack`2 + 3 = {bold ${2 + 3}}`)
    		```
    		*/
    @scala.inline
    def purple(text: TemplateStringsArray, placeholders: js.Any*): String = (^.asInstanceOf[js.Dynamic].applyDynamic("purple")(text.asInstanceOf[js.Any], placeholders.asInstanceOf[js.Any])).asInstanceOf[String]
    @scala.inline
    def purple_=(x: Chalk): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("purple")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/node-logger", "colors.red")
    @js.native
    def red: Chalk = js.native
    @scala.inline
    def red(text: js.Any*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("red")(text.asInstanceOf[js.Any]).asInstanceOf[String]
    /**
    		Use a template string.
    		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
    		@example
    		```
    		import chalk = require('chalk');
    		log(chalk`
    		CPU: {red ${cpu.totalPercent}%}
    		RAM: {green ${ram.used / ram.total * 100}%}
    		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
    		`);
    		```
    		@example
    		```
    		import chalk = require('chalk');
    		log(chalk.red.bgBlack`2 + 3 = {bold ${2 + 3}}`)
    		```
    		*/
    @scala.inline
    def red(text: TemplateStringsArray, placeholders: js.Any*): String = (^.asInstanceOf[js.Dynamic].applyDynamic("red")(text.asInstanceOf[js.Any], placeholders.asInstanceOf[js.Any])).asInstanceOf[String]
    @scala.inline
    def red_=(x: Chalk): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("red")(x.asInstanceOf[js.Any])
  }
  
  object instance extends Shortcut {
    
    @JSImport("@storybook/node-logger", "instance")
    @js.native
    val ^ : Logger = js.native
    
    type _To = Logger
    
    /* This means you don't have to write `^`, but can instead just say `instance.foo` */
    override def _to: Logger = ^
  }
  
  object logger {
    
    @JSImport("@storybook/node-logger", "logger")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def error(message: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(message.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def info(message: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("info")(message.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def line(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("line")().asInstanceOf[Unit]
    @scala.inline
    def line(count: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("line")(count.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def plain(message: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("plain")(message.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def setLevel(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLevel")().asInstanceOf[Unit]
    @scala.inline
    def setLevel(level: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLevel")(level.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def trace(hasMessageTime: Message): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("trace")(hasMessageTime.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def warn(message: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("warn")(message.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
}
