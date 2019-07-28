package typings.atPulumiCloud.timerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DailySchedule extends js.Object {
  /**
    * The hour, in UTC, that the timer should fire.
    */
  var hourUTC: js.UndefOr[Double] = js.undefined
  /**
    * The minute, in UTC, that the timer should fire.
    */
  var minuteUTC: js.UndefOr[Double] = js.undefined
}

object DailySchedule {
  @scala.inline
  def apply(hourUTC: Int | Double = null, minuteUTC: Int | Double = null): DailySchedule = {
    val __obj = js.Dynamic.literal()
    if (hourUTC != null) __obj.updateDynamic("hourUTC")(hourUTC.asInstanceOf[js.Any])
    if (minuteUTC != null) __obj.updateDynamic("minuteUTC")(minuteUTC.asInstanceOf[js.Any])
    __obj.asInstanceOf[DailySchedule]
  }
}

