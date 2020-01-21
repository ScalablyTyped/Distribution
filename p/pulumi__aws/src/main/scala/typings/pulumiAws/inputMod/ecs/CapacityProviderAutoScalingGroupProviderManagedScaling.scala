package typings.pulumiAws.inputMod.ecs

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CapacityProviderAutoScalingGroupProviderManagedScaling extends js.Object {
  var maximumScalingStepSize: js.UndefOr[Input[Double]] = js.native
  var minimumScalingStepSize: js.UndefOr[Input[Double]] = js.native
  var status: js.UndefOr[Input[String]] = js.native
  var targetCapacity: js.UndefOr[Input[Double]] = js.native
}

object CapacityProviderAutoScalingGroupProviderManagedScaling {
  @scala.inline
  def apply(
    maximumScalingStepSize: Input[Double] = null,
    minimumScalingStepSize: Input[Double] = null,
    status: Input[String] = null,
    targetCapacity: Input[Double] = null
  ): CapacityProviderAutoScalingGroupProviderManagedScaling = {
    val __obj = js.Dynamic.literal()
    if (maximumScalingStepSize != null) __obj.updateDynamic("maximumScalingStepSize")(maximumScalingStepSize.asInstanceOf[js.Any])
    if (minimumScalingStepSize != null) __obj.updateDynamic("minimumScalingStepSize")(minimumScalingStepSize.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (targetCapacity != null) __obj.updateDynamic("targetCapacity")(targetCapacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[CapacityProviderAutoScalingGroupProviderManagedScaling]
  }
}

