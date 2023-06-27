package typings.smithyTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesLoggerMod {
  
  trait Logger extends StObject {
    
    def debug(content: Any*): Unit
    
    def error(content: Any*): Unit
    
    def info(content: Any*): Unit
    
    var trace: js.UndefOr[js.Function1[/* repeated */ Any, Unit]] = js.undefined
    
    def warn(content: Any*): Unit
  }
  object Logger {
    
    inline def apply(
      debug: /* repeated */ Any => Unit,
      error: /* repeated */ Any => Unit,
      info: /* repeated */ Any => Unit,
      warn: /* repeated */ Any => Unit
    ): Logger = {
      val __obj = js.Dynamic.literal(debug = js.Any.fromFunction1(debug), error = js.Any.fromFunction1(error), info = js.Any.fromFunction1(info), warn = js.Any.fromFunction1(warn))
      __obj.asInstanceOf[Logger]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Logger] (val x: Self) extends AnyVal {
      
      inline def setDebug(value: /* repeated */ Any => Unit): Self = StObject.set(x, "debug", js.Any.fromFunction1(value))
      
      inline def setError(value: /* repeated */ Any => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      inline def setInfo(value: /* repeated */ Any => Unit): Self = StObject.set(x, "info", js.Any.fromFunction1(value))
      
      inline def setTrace(value: /* repeated */ Any => Unit): Self = StObject.set(x, "trace", js.Any.fromFunction1(value))
      
      inline def setTraceUndefined: Self = StObject.set(x, "trace", js.undefined)
      
      inline def setWarn(value: /* repeated */ Any => Unit): Self = StObject.set(x, "warn", js.Any.fromFunction1(value))
    }
  }
}
