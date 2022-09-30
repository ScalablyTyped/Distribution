package typings.reactQuery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loggerMod {
  
  @JSImport("react-query/types/core/logger", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getLogger(): Logger = ^.asInstanceOf[js.Dynamic].applyDynamic("getLogger")().asInstanceOf[Logger]
  
  inline def setLogger(newLogger: Logger): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLogger")(newLogger.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @js.native
  trait LogFunction extends StObject {
    
    def apply(args: Any*): Unit = js.native
  }
  
  trait Logger extends StObject {
    
    var error: LogFunction
    
    var log: LogFunction
    
    var warn: LogFunction
  }
  object Logger {
    
    inline def apply(error: LogFunction, log: LogFunction, warn: LogFunction): Logger = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], warn = warn.asInstanceOf[js.Any])
      __obj.asInstanceOf[Logger]
    }
    
    extension [Self <: Logger](x: Self) {
      
      inline def setError(value: LogFunction): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setLog(value: LogFunction): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      
      inline def setWarn(value: LogFunction): Self = StObject.set(x, "warn", value.asInstanceOf[js.Any])
    }
  }
}
