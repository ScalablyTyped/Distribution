package typings.pusherJs

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcCoreLoggerMod extends Shortcut {
  
  @JSImport("pusher-js/types/src/core/logger", JSImport.Default)
  @js.native
  val default: Logger = js.native
  
  trait Logger extends StObject {
    
    def debug(args: Any*): Unit
    
    def error(args: Any*): Unit
    
    /* private */ var globalLog: Any
    
    /* private */ var globalLogError: Any
    
    /* private */ var globalLogWarn: Any
    
    /* private */ var log: Any
    
    def warn(args: Any*): Unit
  }
  object Logger {
    
    inline def apply(
      debug: /* repeated */ Any => Unit,
      error: /* repeated */ Any => Unit,
      globalLog: Any,
      globalLogError: Any,
      globalLogWarn: Any,
      log: Any,
      warn: /* repeated */ Any => Unit
    ): Logger = {
      val __obj = js.Dynamic.literal(debug = js.Any.fromFunction1(debug), error = js.Any.fromFunction1(error), globalLog = globalLog.asInstanceOf[js.Any], globalLogError = globalLogError.asInstanceOf[js.Any], globalLogWarn = globalLogWarn.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], warn = js.Any.fromFunction1(warn))
      __obj.asInstanceOf[Logger]
    }
    
    extension [Self <: Logger](x: Self) {
      
      inline def setDebug(value: /* repeated */ Any => Unit): Self = StObject.set(x, "debug", js.Any.fromFunction1(value))
      
      inline def setError(value: /* repeated */ Any => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      inline def setGlobalLog(value: Any): Self = StObject.set(x, "globalLog", value.asInstanceOf[js.Any])
      
      inline def setGlobalLogError(value: Any): Self = StObject.set(x, "globalLogError", value.asInstanceOf[js.Any])
      
      inline def setGlobalLogWarn(value: Any): Self = StObject.set(x, "globalLogWarn", value.asInstanceOf[js.Any])
      
      inline def setLog(value: Any): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      
      inline def setWarn(value: /* repeated */ Any => Unit): Self = StObject.set(x, "warn", js.Any.fromFunction1(value))
    }
  }
  
  type _To = Logger
  
  /* This means you don't have to write `default`, but can instead just say `typesSrcCoreLoggerMod.foo` */
  override def _to: Logger = default
}
