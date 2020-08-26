package typings.pulumiCloud.timerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HourlySchedule extends js.Object {
  /**
    * The minute, in UTC, that the timer should fire.
    */
  var minuteUTC: js.UndefOr[Double] = js.native
}

object HourlySchedule {
  @scala.inline
  def apply(): HourlySchedule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HourlySchedule]
  }
  @scala.inline
  implicit class HourlyScheduleOps[Self <: HourlySchedule] (val x: Self) extends AnyVal {
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
    def setMinuteUTC(value: Double): Self = this.set("minuteUTC", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinuteUTC: Self = this.set("minuteUTC", js.undefined)
  }
  
}

