package typings.sharepoint.Srch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait U extends StObject
object U {
  
  @js.native
  sealed trait LoadScriptsProgress extends StObject
  @JSGlobal("Srch.U.LoadScriptsProgress")
  @js.native
  object LoadScriptsProgress extends StObject {
    
    @js.native
    sealed trait failure
      extends StObject
         with LoadScriptsProgress
    
    @js.native
    sealed trait loading
      extends StObject
         with LoadScriptsProgress
    
    @js.native
    sealed trait success
      extends StObject
         with LoadScriptsProgress
  }
  
  trait Ids extends StObject
  
  trait LoadScriptsState extends StObject {
    
    var progress: Double
    
    var scriptsToLoad: Any
    
    var timeoutHandle: Any
  }
  object LoadScriptsState {
    
    inline def apply(progress: Double, scriptsToLoad: Any, timeoutHandle: Any): LoadScriptsState = {
      val __obj = js.Dynamic.literal(progress = progress.asInstanceOf[js.Any], scriptsToLoad = scriptsToLoad.asInstanceOf[js.Any], timeoutHandle = timeoutHandle.asInstanceOf[js.Any])
      __obj.asInstanceOf[LoadScriptsState]
    }
    
    extension [Self <: LoadScriptsState](x: Self) {
      
      inline def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
      
      inline def setScriptsToLoad(value: Any): Self = StObject.set(x, "scriptsToLoad", value.asInstanceOf[js.Any])
      
      inline def setTimeoutHandle(value: Any): Self = StObject.set(x, "timeoutHandle", value.asInstanceOf[js.Any])
    }
  }
  
  trait PropNames extends StObject
}
