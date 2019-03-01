package typings
package atSindresorhusToDashMillisecondsLib.atSindresorhusToDashMillisecondsMod.toMillisecondsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeSpec extends js.Object {
  var days: js.UndefOr[scala.Double] = js.undefined
  var hours: js.UndefOr[scala.Double] = js.undefined
  var microseconds: js.UndefOr[scala.Double] = js.undefined
  var milliseconds: js.UndefOr[scala.Double] = js.undefined
  var minutes: js.UndefOr[scala.Double] = js.undefined
  var nanoseconds: js.UndefOr[scala.Double] = js.undefined
  var seconds: js.UndefOr[scala.Double] = js.undefined
}

object TimeSpec {
  @scala.inline
  def apply(
    days: scala.Int | scala.Double = null,
    hours: scala.Int | scala.Double = null,
    microseconds: scala.Int | scala.Double = null,
    milliseconds: scala.Int | scala.Double = null,
    minutes: scala.Int | scala.Double = null,
    nanoseconds: scala.Int | scala.Double = null,
    seconds: scala.Int | scala.Double = null
  ): TimeSpec = {
    val __obj = js.Dynamic.literal()
    if (days != null) __obj.updateDynamic("days")(days.asInstanceOf[js.Any])
    if (hours != null) __obj.updateDynamic("hours")(hours.asInstanceOf[js.Any])
    if (microseconds != null) __obj.updateDynamic("microseconds")(microseconds.asInstanceOf[js.Any])
    if (milliseconds != null) __obj.updateDynamic("milliseconds")(milliseconds.asInstanceOf[js.Any])
    if (minutes != null) __obj.updateDynamic("minutes")(minutes.asInstanceOf[js.Any])
    if (nanoseconds != null) __obj.updateDynamic("nanoseconds")(nanoseconds.asInstanceOf[js.Any])
    if (seconds != null) __obj.updateDynamic("seconds")(seconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeSpec]
  }
}

