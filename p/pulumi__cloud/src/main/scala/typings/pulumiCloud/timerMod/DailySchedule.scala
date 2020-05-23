package typings.pulumiCloud.timerMod

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
  def apply(hourUTC: js.UndefOr[Double] = js.undefined, minuteUTC: js.UndefOr[Double] = js.undefined): DailySchedule = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(hourUTC)) __obj.updateDynamic("hourUTC")(hourUTC.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minuteUTC)) __obj.updateDynamic("minuteUTC")(minuteUTC.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DailySchedule]
  }
}

