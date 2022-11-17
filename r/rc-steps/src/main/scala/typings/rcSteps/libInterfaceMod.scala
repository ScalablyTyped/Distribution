package typings.rcSteps

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libInterfaceMod {
  
  trait Icons extends StObject {
    
    var error: ReactNode
    
    var finish: ReactNode
  }
  object Icons {
    
    inline def apply(): Icons = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Icons]
    }
    
    extension [Self <: Icons](x: Self) {
      
      inline def setError(value: ReactNode): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setFinish(value: ReactNode): Self = StObject.set(x, "finish", value.asInstanceOf[js.Any])
      
      inline def setFinishUndefined: Self = StObject.set(x, "finish", js.undefined)
    }
  }
  
  object Status {
    
    inline def error: "error" = "error".asInstanceOf["error"]
    
    inline def finish: "finish" = "finish".asInstanceOf["finish"]
    
    inline def process: "process" = "process".asInstanceOf["process"]
  }
  type Status = "error" | "process" | "finish" | "wait"
}
