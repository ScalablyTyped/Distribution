package typings.sindresorhusToMilliseconds.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeDescriptor extends js.Object {
  val days: js.UndefOr[Double] = js.undefined
  val hours: js.UndefOr[Double] = js.undefined
  val microseconds: js.UndefOr[Double] = js.undefined
  val milliseconds: js.UndefOr[Double] = js.undefined
  val minutes: js.UndefOr[Double] = js.undefined
  val nanoseconds: js.UndefOr[Double] = js.undefined
  val seconds: js.UndefOr[Double] = js.undefined
}

object TimeDescriptor {
  @scala.inline
  def apply(
    days: js.UndefOr[Double] = js.undefined,
    hours: js.UndefOr[Double] = js.undefined,
    microseconds: js.UndefOr[Double] = js.undefined,
    milliseconds: js.UndefOr[Double] = js.undefined,
    minutes: js.UndefOr[Double] = js.undefined,
    nanoseconds: js.UndefOr[Double] = js.undefined,
    seconds: js.UndefOr[Double] = js.undefined
  ): TimeDescriptor = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(days)) __obj.updateDynamic("days")(days.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hours)) __obj.updateDynamic("hours")(hours.get.asInstanceOf[js.Any])
    if (!js.isUndefined(microseconds)) __obj.updateDynamic("microseconds")(microseconds.get.asInstanceOf[js.Any])
    if (!js.isUndefined(milliseconds)) __obj.updateDynamic("milliseconds")(milliseconds.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minutes)) __obj.updateDynamic("minutes")(minutes.get.asInstanceOf[js.Any])
    if (!js.isUndefined(nanoseconds)) __obj.updateDynamic("nanoseconds")(nanoseconds.get.asInstanceOf[js.Any])
    if (!js.isUndefined(seconds)) __obj.updateDynamic("seconds")(seconds.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeDescriptor]
  }
}

