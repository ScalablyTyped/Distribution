package typings.atPulumiAws.typesOutputMod.mq

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BrokerMaintenanceWindowStartTime extends js.Object {
  /**
    * The day of the week. e.g. `MONDAY`, `TUESDAY`, or `WEDNESDAY`
    */
  var dayOfWeek: String
  /**
    * The time, in 24-hour format. e.g. `02:00`
    */
  var timeOfDay: String
  /**
    * The time zone, UTC by default, in either the Country/City format, or the UTC offset format. e.g. `CET`
    */
  var timeZone: String
}

object BrokerMaintenanceWindowStartTime {
  @scala.inline
  def apply(dayOfWeek: String, timeOfDay: String, timeZone: String): BrokerMaintenanceWindowStartTime = {
    val __obj = js.Dynamic.literal(dayOfWeek = dayOfWeek, timeOfDay = timeOfDay, timeZone = timeZone)
  
    __obj.asInstanceOf[BrokerMaintenanceWindowStartTime]
  }
}

