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
  
  /* Rewritten from type alias, can be one of: 
    - typings.rcSteps.rcStepsStrings.error
    - typings.rcSteps.rcStepsStrings.process
    - typings.rcSteps.rcStepsStrings.finish
    - typings.rcSteps.rcStepsStrings.wait
  */
  trait Status extends StObject
  object Status {
    
    inline def error: typings.rcSteps.rcStepsStrings.error = "error".asInstanceOf[typings.rcSteps.rcStepsStrings.error]
    
    inline def finish: typings.rcSteps.rcStepsStrings.finish = "finish".asInstanceOf[typings.rcSteps.rcStepsStrings.finish]
    
    inline def process: typings.rcSteps.rcStepsStrings.process = "process".asInstanceOf[typings.rcSteps.rcStepsStrings.process]
  }
}
