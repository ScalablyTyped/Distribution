package typings.sharepoint.Srch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait U extends StObject
object U {
  
  @js.native
  sealed trait LoadScriptsProgress extends StObject
  @JSGlobal("Srch.U.LoadScriptsProgress")
  @js.native
  object LoadScriptsProgress extends StObject {
    
    @js.native
    sealed trait failure extends LoadScriptsProgress
    
    @js.native
    sealed trait loading extends LoadScriptsProgress
    
    @js.native
    sealed trait success extends LoadScriptsProgress
  }
  
  @js.native
  trait Ids extends StObject
  
  @js.native
  trait LoadScriptsState extends StObject {
    
    var progress: Double = js.native
    
    var scriptsToLoad: js.Any = js.native
    
    var timeoutHandle: js.Any = js.native
  }
  object LoadScriptsState {
    
    @scala.inline
    def apply(progress: Double, scriptsToLoad: js.Any, timeoutHandle: js.Any): LoadScriptsState = {
      val __obj = js.Dynamic.literal(progress = progress.asInstanceOf[js.Any], scriptsToLoad = scriptsToLoad.asInstanceOf[js.Any], timeoutHandle = timeoutHandle.asInstanceOf[js.Any])
      __obj.asInstanceOf[LoadScriptsState]
    }
    
    @scala.inline
    implicit class LoadScriptsStateMutableBuilder[Self <: LoadScriptsState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScriptsToLoad(value: js.Any): Self = StObject.set(x, "scriptsToLoad", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutHandle(value: js.Any): Self = StObject.set(x, "timeoutHandle", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PropNames extends StObject
}
