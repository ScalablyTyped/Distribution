package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AutoPauseMaxCapacity extends js.Object {
  var autoPause: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  var maxCapacity: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  var minCapacity: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  var secondsUntilAutoPause: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  var timeoutAction: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object Anon_AutoPauseMaxCapacity {
  @scala.inline
  def apply(
    autoPause: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    maxCapacity: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    minCapacity: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    secondsUntilAutoPause: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    timeoutAction: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
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

