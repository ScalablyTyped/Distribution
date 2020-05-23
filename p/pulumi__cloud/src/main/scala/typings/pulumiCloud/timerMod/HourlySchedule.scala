package typings.pulumiCloud.timerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HourlySchedule extends js.Object {
  /**
    * The minute, in UTC, that the timer should fire.
    */
  var minuteUTC: js.UndefOr[Double] = js.undefined
}

object HourlySchedule {
  @scala.inline
  def apply(minuteUTC: js.UndefOr[Double] = js.undefined): HourlySchedule = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(minuteUTC)) __obj.updateDynamic("minuteUTC")(minuteUTC.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[HourlySchedule]
  }
}

