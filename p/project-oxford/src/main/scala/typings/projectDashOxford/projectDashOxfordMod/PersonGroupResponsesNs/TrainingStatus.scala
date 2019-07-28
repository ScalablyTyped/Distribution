package typings.projectDashOxford.projectDashOxfordMod.PersonGroupResponsesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrainingStatus extends js.Object {
  var endTime: String
  var personGroupId: String
  var startTime: String
  var status: String
}

object TrainingStatus {
  @scala.inline
  def apply(endTime: String, personGroupId: String, startTime: String, status: String): TrainingStatus = {
    val __obj = js.Dynamic.literal(endTime = endTime, personGroupId = personGroupId, startTime = startTime, status = status)
  
    __obj.asInstanceOf[TrainingStatus]
  }
}

