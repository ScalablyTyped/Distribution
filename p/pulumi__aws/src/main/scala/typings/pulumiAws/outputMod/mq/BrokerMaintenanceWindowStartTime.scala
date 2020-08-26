package typings.pulumiAws.outputMod.mq

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BrokerMaintenanceWindowStartTime extends js.Object {
  /**
    * The day of the week. e.g. `MONDAY`, `TUESDAY`, or `WEDNESDAY`
    */
  var dayOfWeek: String = js.native
  /**
    * The time, in 24-hour format. e.g. `02:00`
    */
  var timeOfDay: String = js.native
  /**
    * The time zone, UTC by default, in either the Country/City format, or the UTC offset format. e.g. `CET`
    */
  var timeZone: String = js.native
}

object BrokerMaintenanceWindowStartTime {
  @scala.inline
  def apply(dayOfWeek: String, timeOfDay: String, timeZone: String): BrokerMaintenanceWindowStartTime = {
    val __obj = js.Dynamic.literal(dayOfWeek = dayOfWeek.asInstanceOf[js.Any], timeOfDay = timeOfDay.asInstanceOf[js.Any], timeZone = timeZone.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrokerMaintenanceWindowStartTime]
  }
  @scala.inline
  implicit class BrokerMaintenanceWindowStartTimeOps[Self <: BrokerMaintenanceWindowStartTime] (val x: Self) extends AnyVal {
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
    def setDayOfWeek(value: String): Self = this.set("dayOfWeek", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimeOfDay(value: String): Self = this.set("timeOfDay", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimeZone(value: String): Self = this.set("timeZone", value.asInstanceOf[js.Any])
  }
  
}

