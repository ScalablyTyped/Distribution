package typings.pulumiAws.inputMod.mq

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BrokerMaintenanceWindowStartTime extends js.Object {
  /**
    * The day of the week. e.g. `MONDAY`, `TUESDAY`, or `WEDNESDAY`
    */
  var dayOfWeek: Input[String] = js.native
  /**
    * The time, in 24-hour format. e.g. `02:00`
    */
  var timeOfDay: Input[String] = js.native
  /**
    * The time zone, UTC by default, in either the Country/City format, or the UTC offset format. e.g. `CET`
    */
  var timeZone: Input[String] = js.native
}

object BrokerMaintenanceWindowStartTime {
  @scala.inline
  def apply(dayOfWeek: Input[String], timeOfDay: Input[String], timeZone: Input[String]): BrokerMaintenanceWindowStartTime = {
    val __obj = js.Dynamic.literal(dayOfWeek = dayOfWeek.asInstanceOf[js.Any], timeOfDay = timeOfDay.asInstanceOf[js.Any], timeZone = timeZone.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BrokerMaintenanceWindowStartTime]
  }
}

