package typings.atPulumiCloud.timerMod

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
  def apply(days: Int | Double = null, hours: Int | Double = null, minutes: Int | Double = null): IntervalRate = {
    val __obj = js.Dynamic.literal()
    if (days != null) __obj.updateDynamic("days")(days.asInstanceOf[js.Any])
    if (hours != null) __obj.updateDynamic("hours")(hours.asInstanceOf[js.Any])
    if (minutes != null) __obj.updateDynamic("minutes")(minutes.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntervalRate]
  }
}

