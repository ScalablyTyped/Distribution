package typings.storybookClientLogger

import typings.storybookClientLogger.storybookClientLoggerStrings.debug
import typings.storybookClientLogger.storybookClientLoggerStrings.error
import typings.storybookClientLogger.storybookClientLoggerStrings.info
import typings.storybookClientLogger.storybookClientLoggerStrings.log
import typings.storybookClientLogger.storybookClientLoggerStrings.trace
import typings.storybookClientLogger.storybookClientLoggerStrings.warn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@storybook/client-logger", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  object logger extends js.Object {
    
    def debug(message: js.Any, rest: js.Any*): Unit = js.native
    
    def error(message: js.Any, rest: js.Any*): Unit = js.native
    
    def info(message: js.Any, rest: js.Any*): Unit = js.native
    
    def log(message: js.Any, rest: js.Any*): Unit = js.native
    
    def trace(message: js.Any, rest: js.Any*): Unit = js.native
    
    def warn(message: js.Any, rest: js.Any*): Unit = js.native
  }
  
  @js.native
  object pretty extends js.Object {
    
    def apply(`type`: /* keyof @storybook/client-logger.anon.Debug */ trace | debug | info | warn | error | log): js.Function1[/* repeated */ String, Unit] = js.native
    
    def debug(args: String*): Unit = js.native
    
    def error(args: String*): Unit = js.native
    
    def info(args: String*): Unit = js.native
    
    def trace(args: String*): Unit = js.native
    
    def warn(args: String*): Unit = js.native
  }
}
