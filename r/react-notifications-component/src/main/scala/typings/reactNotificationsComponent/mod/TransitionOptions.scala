package typings.reactNotificationsComponent.mod

import typings.reactNotificationsComponent.reactNotificationsComponentStrings.`ease-in-out`
import typings.reactNotificationsComponent.reactNotificationsComponentStrings.`ease-in`
import typings.reactNotificationsComponent.reactNotificationsComponentStrings.`ease-out`
import typings.reactNotificationsComponent.reactNotificationsComponentStrings.`step-end`
import typings.reactNotificationsComponent.reactNotificationsComponentStrings.`step-start`
import typings.reactNotificationsComponent.reactNotificationsComponentStrings.ease
import typings.reactNotificationsComponent.reactNotificationsComponentStrings.linear
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransitionOptions extends js.Object {
  var delay: js.UndefOr[Double] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var timingFunction: js.UndefOr[
    ease | linear | `ease-in` | `ease-out` | `ease-in-out` | `step-start` | `step-end`
  ] = js.undefined
}

object TransitionOptions {
  @scala.inline
  def apply(
    delay: js.UndefOr[Double] = js.undefined,
    duration: js.UndefOr[Double] = js.undefined,
    timingFunction: ease | linear | `ease-in` | `ease-out` | `ease-in-out` | `step-start` | `step-end` = null
  ): TransitionOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(delay)) __obj.updateDynamic("delay")(delay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (timingFunction != null) __obj.updateDynamic("timingFunction")(timingFunction.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitionOptions]
  }
}

