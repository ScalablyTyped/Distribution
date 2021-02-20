package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.saucelabs.anon.Browser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResponseCreateManualJobLegacy200
  extends /* key */ StringDictionary[js.Any] {
  
  var error: js.UndefOr[Boolean] = js.native
  
  var job_id: js.UndefOr[Unit] = js.native
  
  var metadata: Browser = js.native
  
  var task_id: String = js.native
}
object ResponseCreateManualJobLegacy200 {
  
  @scala.inline
  def apply(metadata: Browser, task_id: String): ResponseCreateManualJobLegacy200 = {
    val __obj = js.Dynamic.literal(metadata = metadata.asInstanceOf[js.Any], task_id = task_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseCreateManualJobLegacy200]
  }
  
  @scala.inline
  implicit class ResponseCreateManualJobLegacy200MutableBuilder[Self <: ResponseCreateManualJobLegacy200] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setJob_id(value: Unit): Self = StObject.set(x, "job_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJob_idUndefined: Self = StObject.set(x, "job_id", js.undefined)
    
    @scala.inline
    def setMetadata(value: Browser): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTask_id(value: String): Self = StObject.set(x, "task_id", value.asInstanceOf[js.Any])
  }
}
