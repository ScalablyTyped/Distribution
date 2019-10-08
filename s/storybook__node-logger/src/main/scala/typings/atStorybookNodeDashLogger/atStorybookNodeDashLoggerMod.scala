package typings.atStorybookNodeDashLogger

import org.scalablytyped.runtime.TopLevel
import typings.chalk.chalkMod.Chalk
import typings.npmlog.npmlogMod.Logger
import typings.std.TemplateStringsArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/node-logger", JSImport.Namespace)
@js.native
object atStorybookNodeDashLoggerMod extends js.Object {
  @js.native
  object colors extends js.Object {
    @JSName("blue")
    var blue_Original: Chalk with Anon_SupportsColor = js.native
    @JSName("gray")
    var gray_Original: Chalk with Anon_SupportsColor = js.native
    @JSName("green")
    var green_Original: Chalk with Anon_SupportsColor = js.native
    @JSName("orange")
    var orange_Original: Chalk with Anon_SupportsColor = js.native
    @JSName("pink")
    var pink_Original: Chalk with Anon_SupportsColor = js.native
    @JSName("purple")
    var purple_Original: Chalk with Anon_SupportsColor = js.native
    @JSName("red")
    var red_Original: Chalk with Anon_SupportsColor = js.native
    def blue(text: String*): String = js.native
    def blue(text: TemplateStringsArray, placeholders: String*): String = js.native
    def gray(text: String*): String = js.native
    def gray(text: TemplateStringsArray, placeholders: String*): String = js.native
    def green(text: String*): String = js.native
    def green(text: TemplateStringsArray, placeholders: String*): String = js.native
    def orange(text: String*): String = js.native
    def orange(text: TemplateStringsArray, placeholders: String*): String = js.native
    def pink(text: String*): String = js.native
    def pink(text: TemplateStringsArray, placeholders: String*): String = js.native
    def purple(text: String*): String = js.native
    def purple(text: TemplateStringsArray, placeholders: String*): String = js.native
    def red(text: String*): String = js.native
    def red(text: TemplateStringsArray, placeholders: String*): String = js.native
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
    def trace(hasMessageTime: Anon_Message): Unit = js.native
    def warn(message: String): Unit = js.native
  }
  
}

