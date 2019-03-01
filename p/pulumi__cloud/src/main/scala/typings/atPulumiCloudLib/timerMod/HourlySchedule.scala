package typings
package atPulumiCloudLib.timerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HourlySchedule extends js.Object {
  /**
    * The minute, in UTC, that the timer should fire.
    */
  var minuteUTC: js.UndefOr[scala.Double] = js.undefined
}

object HourlySchedule {
  @scala.inline
  def apply(minuteUTC: scala.Int | scala.Double = null): HourlySchedule = {
    val __obj = js.Dynamic.literal()
    if (minuteUTC != null) __obj.updateDynamic("minuteUTC")(minuteUTC.asInstanceOf[js.Any])
    __obj.asInstanceOf[HourlySchedule]
  }
}

