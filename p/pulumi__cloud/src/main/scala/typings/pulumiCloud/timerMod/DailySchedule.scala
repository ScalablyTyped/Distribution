package typings.pulumiCloud.timerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DailySchedule extends js.Object {
  /**
    * The hour, in UTC, that the timer should fire.
    */
  var hourUTC: js.UndefOr[Double] = js.native
  /**
    * The minute, in UTC, that the timer should fire.
    */
  var minuteUTC: js.UndefOr[Double] = js.native
}

object DailySchedule {
  @scala.inline
  def apply(): DailySchedule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DailySchedule]
  }
  @scala.inline
  implicit class DailyScheduleOps[Self <: DailySchedule] (val x: Self) extends AnyVal {
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
    def setHourUTC(value: Double): Self = this.set("hourUTC", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHourUTC: Self = this.set("hourUTC", js.undefined)
    @scala.inline
    def setMinuteUTC(value: Double): Self = this.set("minuteUTC", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinuteUTC: Self = this.set("minuteUTC", js.undefined)
  }
  
}

