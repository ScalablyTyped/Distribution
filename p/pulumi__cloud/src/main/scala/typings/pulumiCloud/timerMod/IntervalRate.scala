package typings.pulumiCloud.timerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntervalRate extends js.Object {
  /**
    * The number of days in the interval.  Must be a positive integer.
    */
  var days: js.UndefOr[Double] = js.undefined
  /**
    * The number of hours in the interval.  Must be a positive integer.
    */
  var hours: js.UndefOr[Double] = js.undefined
  /**
    * The number of minutes in the interval.  Must be a positive integer.
    */
  var minutes: js.UndefOr[Double] = js.undefined
}

object IntervalRate {
  @scala.inline
  def apply(
    days: js.UndefOr[Double] = js.undefined,
    hours: js.UndefOr[Double] = js.undefined,
    minutes: js.UndefOr[Double] = js.undefined
  ): IntervalRate = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(days)) __obj.updateDynamic("days")(days.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hours)) __obj.updateDynamic("hours")(hours.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minutes)) __obj.updateDynamic("minutes")(minutes.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntervalRate]
  }
}

