package typings
package atPulumiCloudLib.timerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DailySchedule extends js.Object {
  /**
    * The hour, in UTC, that the timer should fire.
    */
  var hourUTC: js.UndefOr[scala.Double] = js.undefined
  /**
    * The minute, in UTC, that the timer should fire.
    */
  var minuteUTC: js.UndefOr[scala.Double] = js.undefined
}

object DailySchedule {
  @scala.inline
  def apply(hourUTC: scala.Int | scala.Double = null, minuteUTC: scala.Int | scala.Double = null): DailySchedule = {
    val __obj = js.Dynamic.literal()
    if (hourUTC != null) __obj.updateDynamic("hourUTC")(hourUTC.asInstanceOf[js.Any])
    if (minuteUTC != null) __obj.updateDynamic("minuteUTC")(minuteUTC.asInstanceOf[js.Any])
    __obj.asInstanceOf[DailySchedule]
  }
}

