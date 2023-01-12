package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobsState
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var completed: js.UndefOr[Double] = js.undefined
  
  var errored: js.UndefOr[Double] = js.undefined
  
  var failed: js.UndefOr[Double] = js.undefined
  
  var finished: js.UndefOr[Double] = js.undefined
  
  var passed: js.UndefOr[Double] = js.undefined
  
  var public: js.UndefOr[Double] = js.undefined
  
  var queued: js.UndefOr[Double] = js.undefined
  
  var running: js.UndefOr[Double] = js.undefined
}
object JobsState {
  
  inline def apply(): JobsState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobsState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JobsState] (val x: Self) extends AnyVal {
    
    inline def setCompleted(value: Double): Self = StObject.set(x, "completed", value.asInstanceOf[js.Any])
    
    inline def setCompletedUndefined: Self = StObject.set(x, "completed", js.undefined)
    
    inline def setErrored(value: Double): Self = StObject.set(x, "errored", value.asInstanceOf[js.Any])
    
    inline def setErroredUndefined: Self = StObject.set(x, "errored", js.undefined)
    
    inline def setFailed(value: Double): Self = StObject.set(x, "failed", value.asInstanceOf[js.Any])
    
    inline def setFailedUndefined: Self = StObject.set(x, "failed", js.undefined)
    
    inline def setFinished(value: Double): Self = StObject.set(x, "finished", value.asInstanceOf[js.Any])
    
    inline def setFinishedUndefined: Self = StObject.set(x, "finished", js.undefined)
    
    inline def setPassed(value: Double): Self = StObject.set(x, "passed", value.asInstanceOf[js.Any])
    
    inline def setPassedUndefined: Self = StObject.set(x, "passed", js.undefined)
    
    inline def setPublic(value: Double): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
    
    inline def setPublicUndefined: Self = StObject.set(x, "public", js.undefined)
    
    inline def setQueued(value: Double): Self = StObject.set(x, "queued", value.asInstanceOf[js.Any])
    
    inline def setQueuedUndefined: Self = StObject.set(x, "queued", js.undefined)
    
    inline def setRunning(value: Double): Self = StObject.set(x, "running", value.asInstanceOf[js.Any])
    
    inline def setRunningUndefined: Self = StObject.set(x, "running", js.undefined)
  }
}
