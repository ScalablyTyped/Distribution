package typings
package atSindresorhusToDashMillisecondsLib.atSindresorhusToDashMillisecondsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeDescriptor extends js.Object {
  val days: js.UndefOr[scala.Double] = js.undefined
  val hours: js.UndefOr[scala.Double] = js.undefined
  val microseconds: js.UndefOr[scala.Double] = js.undefined
  val milliseconds: js.UndefOr[scala.Double] = js.undefined
  val minutes: js.UndefOr[scala.Double] = js.undefined
  val nanoseconds: js.UndefOr[scala.Double] = js.undefined
  val seconds: js.UndefOr[scala.Double] = js.undefined
}

object TimeDescriptor {
  @scala.inline
  def apply(
    days: scala.Int | scala.Double = null,
    hours: scala.Int | scala.Double = null,
    microseconds: scala.Int | scala.Double = null,
    milliseconds: scala.Int | scala.Double = null,
    minutes: scala.Int | scala.Double = null,
    nanoseconds: scala.Int | scala.Double = null,
    seconds: scala.Int | scala.Double = null
  ): TimeDescriptor = {
    val __obj = js.Dynamic.literal()
    if (days != null) __obj.updateDynamic("days")(days.asInstanceOf[js.Any])
    if (hours != null) __obj.updateDynamic("hours")(hours.asInstanceOf[js.Any])
    if (microseconds != null) __obj.updateDynamic("microseconds")(microseconds.asInstanceOf[js.Any])
    if (milliseconds != null) __obj.updateDynamic("milliseconds")(milliseconds.asInstanceOf[js.Any])
    if (minutes != null) __obj.updateDynamic("minutes")(minutes.asInstanceOf[js.Any])
    if (nanoseconds != null) __obj.updateDynamic("nanoseconds")(nanoseconds.asInstanceOf[js.Any])
    if (seconds != null) __obj.updateDynamic("seconds")(seconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeDescriptor]
  }
}

