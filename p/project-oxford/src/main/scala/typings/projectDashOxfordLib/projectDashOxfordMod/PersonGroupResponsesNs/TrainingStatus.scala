package typings
package projectDashOxfordLib.projectDashOxfordMod.PersonGroupResponsesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrainingStatus extends js.Object {
  var endTime: java.lang.String
  var personGroupId: java.lang.String
  var startTime: java.lang.String
  var status: java.lang.String
}

object TrainingStatus {
  @scala.inline
  def apply(
    endTime: java.lang.String,
    personGroupId: java.lang.String,
    startTime: java.lang.String,
    status: java.lang.String
  ): TrainingStatus = {
    val __obj = js.Dynamic.literal(endTime = endTime, personGroupId = personGroupId, startTime = startTime, status = status)
  
    __obj.asInstanceOf[TrainingStatus]
  }
}

