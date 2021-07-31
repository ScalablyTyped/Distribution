package typings.sentryUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loggerMod {
  
  @JSImport("@sentry/utils/dist/logger", "logger")
  @js.native
  val logger: Logger_ = js.native
  
  trait Logger_ extends StObject {
    
    /** JSDoc */
    var _enabled: js.Any
    
    /** JSDoc */
    def disable(): Unit
    
    /** JSDoc */
    def enable(): Unit
    
    /** JSDoc */
    def error(args: js.Any*): Unit
    
    /** JSDoc */
    def log(args: js.Any*): Unit
    
    /** JSDoc */
    def warn(args: js.Any*): Unit
  }
  object Logger_ {
    
    @scala.inline
    def apply(
      _enabled: js.Any,
      disable: () => Unit,
      enable: () => Unit,
      error: /* repeated */ js.Any => Unit,
      log: /* repeated */ js.Any => Unit,
      warn: /* repeated */ js.Any => Unit
    ): Logger_ = {
      val __obj = js.Dynamic.literal(_enabled = _enabled.asInstanceOf[js.Any], disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable), error = js.Any.fromFunction1(error), log = js.Any.fromFunction1(log), warn = js.Any.fromFunction1(warn))
      __obj.asInstanceOf[Logger_]
    }
    
    @scala.inline
    implicit class Logger_MutableBuilder[Self <: Logger_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisable(value: () => Unit): Self = StObject.set(x, "disable", js.Any.fromFunction0(value))
      
      @scala.inline
      def setEnable(value: () => Unit): Self = StObject.set(x, "enable", js.Any.fromFunction0(value))
      
      @scala.inline
      def setError(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLog(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "log", js.Any.fromFunction1(value))
      
      @scala.inline
      def setWarn(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "warn", js.Any.fromFunction1(value))
      
      @scala.inline
      def set_enabled(value: js.Any): Self = StObject.set(x, "_enabled", value.asInstanceOf[js.Any])
    }
  }
}
