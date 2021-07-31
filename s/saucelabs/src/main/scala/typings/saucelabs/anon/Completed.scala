package typings.saucelabs.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Completed
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
  var completed: js.UndefOr[Double] = js.undefined
  
  var errored: js.UndefOr[Double] = js.undefined
  
  var failed: js.UndefOr[Double] = js.undefined
  
  var finished: js.UndefOr[Double] = js.undefined
  
  var passed: js.UndefOr[Double] = js.undefined
  
  var public: js.UndefOr[Double] = js.undefined
  
  var queued: js.UndefOr[Double] = js.undefined
  
  var running: js.UndefOr[Double] = js.undefined
}
object Completed {
  
  @scala.inline
  def apply(): Completed = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Completed]
  }
  
  @scala.inline
  implicit class CompletedMutableBuilder[Self <: Completed] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompleted(value: Double): Self = StObject.set(x, "completed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompletedUndefined: Self = StObject.set(x, "completed", js.undefined)
    
    @scala.inline
    def setErrored(value: Double): Self = StObject.set(x, "errored", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErroredUndefined: Self = StObject.set(x, "errored", js.undefined)
    
    @scala.inline
    def setFailed(value: Double): Self = StObject.set(x, "failed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailedUndefined: Self = StObject.set(x, "failed", js.undefined)
    
    @scala.inline
    def setFinished(value: Double): Self = StObject.set(x, "finished", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFinishedUndefined: Self = StObject.set(x, "finished", js.undefined)
    
    @scala.inline
    def setPassed(value: Double): Self = StObject.set(x, "passed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassedUndefined: Self = StObject.set(x, "passed", js.undefined)
    
    @scala.inline
    def setPublic(value: Double): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicUndefined: Self = StObject.set(x, "public", js.undefined)
    
    @scala.inline
    def setQueued(value: Double): Self = StObject.set(x, "queued", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueuedUndefined: Self = StObject.set(x, "queued", js.undefined)
    
    @scala.inline
    def setRunning(value: Double): Self = StObject.set(x, "running", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunningUndefined: Self = StObject.set(x, "running", js.undefined)
  }
}
