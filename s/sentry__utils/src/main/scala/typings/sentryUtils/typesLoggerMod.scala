package typings.sentryUtils

import typings.sentryUtils.sentryUtilsStrings.assert
import typings.sentryUtils.sentryUtilsStrings.debug
import typings.sentryUtils.sentryUtilsStrings.error
import typings.sentryUtils.sentryUtilsStrings.info
import typings.sentryUtils.sentryUtilsStrings.log
import typings.sentryUtils.sentryUtilsStrings.trace
import typings.sentryUtils.sentryUtilsStrings.warn
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLoggerMod {
  
  @JSImport("@sentry/utils/types/logger", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@sentry/utils/types/logger", "CONSOLE_LEVELS")
  @js.native
  val CONSOLE_LEVELS: js.Tuple7[debug, info, warn, error, log, assert, trace] = js.native
  
  inline def consoleSandbox[T](callback: js.Function0[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("consoleSandbox")(callback.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @JSImport("@sentry/utils/types/logger", "logger")
  @js.native
  def logger: Logger_ = js.native
  inline def logger_=(x: Logger_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("logger")(x.asInstanceOf[js.Any])
  
  /* Rewritten from type alias, can be one of: 
    - typings.sentryUtils.sentryUtilsStrings.debug
    - typings.sentryUtils.sentryUtilsStrings.info
    - typings.sentryUtils.sentryUtilsStrings.warn
    - typings.sentryUtils.sentryUtilsStrings.error
    - typings.sentryUtils.sentryUtilsStrings.log
    - typings.sentryUtils.sentryUtilsStrings.assert
    - typings.sentryUtils.sentryUtilsStrings.trace
  */
  trait ConsoleLevel extends StObject
  
  type LoggerConsoleMethods = Record[debug | info | warn | error | log | assert | trace, LoggerMethod]
  
  @js.native
  trait LoggerMethod extends StObject {
    
    def apply(args: Any*): Unit = js.native
  }
  
  /** JSDoc */
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in 'debug' | 'info' | 'warn' | 'error' | 'log' | 'assert' | 'trace' ]: @sentry/utils.@sentry/utils/types/logger.LoggerMethod} */ trait Logger_ extends StObject {
    
    def disable(): Unit
    
    def enable(): Unit
  }
  object Logger_ {
    
    inline def apply(disable: () => Unit, enable: () => Unit): Logger_ = {
      val __obj = js.Dynamic.literal(disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable))
      __obj.asInstanceOf[Logger_]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Logger_] (val x: Self) extends AnyVal {
      
      inline def setDisable(value: () => Unit): Self = StObject.set(x, "disable", js.Any.fromFunction0(value))
      
      inline def setEnable(value: () => Unit): Self = StObject.set(x, "enable", js.Any.fromFunction0(value))
    }
  }
}
