package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.saucelabs.anon.Browser
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
  implicit class ResponseCreateManualJobLegacy200Ops[Self <: ResponseCreateManualJobLegacy200] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMetadata(value: Browser): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTask_id(value: String): Self = this.set("task_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: Boolean): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setJob_id(value: Unit): Self = this.set("job_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJob_id: Self = this.set("job_id", js.undefined)
  }
}
