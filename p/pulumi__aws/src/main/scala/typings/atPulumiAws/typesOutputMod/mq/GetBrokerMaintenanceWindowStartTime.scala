package typings.atPulumiAws.typesOutputMod.mq

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBrokerMaintenanceWindowStartTime extends js.Object {
  var dayOfWeek: String
  var timeOfDay: String
  var timeZone: String
}

object GetBrokerMaintenanceWindowStartTime {
  @scala.inline
  def apply(dayOfWeek: String, timeOfDay: String, timeZone: String): GetBrokerMaintenanceWindowStartTime = {
    val __obj = js.Dynamic.literal(dayOfWeek = dayOfWeek, timeOfDay = timeOfDay, timeZone = timeZone)
  
    __obj.asInstanceOf[GetBrokerMaintenanceWindowStartTime]
  }
}

