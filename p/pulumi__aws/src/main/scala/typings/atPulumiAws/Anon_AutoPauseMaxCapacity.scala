package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AutoPauseMaxCapacity extends js.Object {
  var autoPause: js.UndefOr[Input[Boolean]] = js.undefined
  var maxCapacity: js.UndefOr[Input[Double]] = js.undefined
  var minCapacity: js.UndefOr[Input[Double]] = js.undefined
  var secondsUntilAutoPause: js.UndefOr[Input[Double]] = js.undefined
  var timeoutAction: js.UndefOr[Input[String]] = js.undefined
}

object Anon_AutoPauseMaxCapacity {
  @scala.inline
  def apply(
    autoPause: Input[Boolean] = null,
    maxCapacity: Input[Double] = null,
    minCapacity: Input[Double] = null,
    secondsUntilAutoPause: Input[Double] = null,
    timeoutAction: Input[String] = null
  ): Anon_AutoPauseMaxCapacity = {
    val __obj = js.Dynamic.literal()
    if (autoPause != null) __obj.updateDynamic("autoPause")(autoPause.asInstanceOf[js.Any])
    if (maxCapacity != null) __obj.updateDynamic("maxCapacity")(maxCapacity.asInstanceOf[js.Any])
    if (minCapacity != null) __obj.updateDynamic("minCapacity")(minCapacity.asInstanceOf[js.Any])
    if (secondsUntilAutoPause != null) __obj.updateDynamic("secondsUntilAutoPause")(secondsUntilAutoPause.asInstanceOf[js.Any])
    if (timeoutAction != null) __obj.updateDynamic("timeoutAction")(timeoutAction.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AutoPauseMaxCapacity]
  }
}

