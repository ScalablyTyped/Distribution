package typings.projectOxford.mod.PersonGroupResponses

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TrainingStatus extends js.Object {
  
  var endTime: String = js.native
  
  var personGroupId: String = js.native
  
  var startTime: String = js.native
  
  var status: String = js.native
}
object TrainingStatus {
  
  @scala.inline
  def apply(endTime: String, personGroupId: String, startTime: String, status: String): TrainingStatus = {
    val __obj = js.Dynamic.literal(endTime = endTime.asInstanceOf[js.Any], personGroupId = personGroupId.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrainingStatus]
  }
  
  @scala.inline
  implicit class TrainingStatusOps[Self <: TrainingStatus] (val x: Self) extends AnyVal {
    
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
    def setEndTime(value: String): Self = this.set("endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersonGroupId(value: String): Self = this.set("personGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTime(value: String): Self = this.set("startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
  }
}
