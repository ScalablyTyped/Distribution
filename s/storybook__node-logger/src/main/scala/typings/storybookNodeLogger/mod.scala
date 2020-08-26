package typings.storybookNodeLogger

import org.scalablytyped.runtime.TopLevel
import typings.chalk.mod.Chalk
import typings.npmlog.mod.Logger
import typings.std.TemplateStringsArray
import typings.storybookNodeLogger.anon.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/node-logger", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  object colors extends js.Object {
    @JSName("blue")
    var blue_Original: Chalk = js.native
    @JSName("gray")
    var gray_Original: Chalk = js.native
    @JSName("green")
    var green_Original: Chalk = js.native
    @JSName("orange")
    var orange_Original: Chalk = js.native
    @JSName("pink")
    var pink_Original: Chalk = js.native
    @JSName("purple")
    var purple_Original: Chalk = js.native
    @JSName("red")
    var red_Original: Chalk = js.native
    def blue(text: js.Any*): String = js.native
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
    def blue(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
    def gray(text: js.Any*): String = js.native
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
    def gray(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
    def green(text: js.Any*): String = js.native
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
    def green(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
    def orange(text: js.Any*): String = js.native
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
    def orange(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
    def pink(text: js.Any*): String = js.native
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
    def pink(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
    def purple(text: js.Any*): String = js.native
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
    def purple(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
    def red(text: js.Any*): String = js.native
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
    def red(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
  }
  
  @js.native
  object instance extends TopLevel[Logger]
  
  @js.native
  object logger extends js.Object {
    def error(message: String): Unit = js.native
    def info(message: String): Unit = js.native
    def line(): Unit = js.native
    def line(count: Double): Unit = js.native
    def plain(message: String): Unit = js.native
    def setLevel(): Unit = js.native
    def setLevel(level: String): Unit = js.native
    def trace(hasMessageTime: Message): Unit = js.native
    def warn(message: String): Unit = js.native
  }
  
}

