package typings.rcSteps

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interfaceMod {
  
  trait Icons extends StObject {
    
    var error: ReactNode
    
    var finish: ReactNode
  }
  object Icons {
    
    @scala.inline
    def apply(): Icons = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Icons]
    }
    
    @scala.inline
    implicit class IconsMutableBuilder[Self <: Icons] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: ReactNode): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setFinish(value: ReactNode): Self = StObject.set(x, "finish", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFinishUndefined: Self = StObject.set(x, "finish", js.undefined)
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
    
    @scala.inline
    def error: typings.rcSteps.rcStepsStrings.error = "error".asInstanceOf[typings.rcSteps.rcStepsStrings.error]
    
    @scala.inline
    def finish: typings.rcSteps.rcStepsStrings.finish = "finish".asInstanceOf[typings.rcSteps.rcStepsStrings.finish]
    
    @scala.inline
    def process: typings.rcSteps.rcStepsStrings.process = "process".asInstanceOf[typings.rcSteps.rcStepsStrings.process]
  }
}
