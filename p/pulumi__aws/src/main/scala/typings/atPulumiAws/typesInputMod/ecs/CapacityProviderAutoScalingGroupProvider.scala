package typings.atPulumiAws.typesInputMod.ecs

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CapacityProviderAutoScalingGroupProvider extends js.Object {
  var autoScalingGroupArn: Input[String] = js.native
  var managedScaling: js.UndefOr[Input[CapacityProviderAutoScalingGroupProviderManagedScaling]] = js.native
  var managedTerminationProtection: js.UndefOr[Input[String]] = js.native
}

object CapacityProviderAutoScalingGroupProvider {
  @scala.inline
  def apply(
    autoScalingGroupArn: Input[String],
    managedScaling: Input[CapacityProviderAutoScalingGroupProviderManagedScaling] = null,
    managedTerminationProtection: Input[String] = null
  ): CapacityProviderAutoScalingGroupProvider = {
    val __obj = js.Dynamic.literal(autoScalingGroupArn = autoScalingGroupArn.asInstanceOf[js.Any])
    if (managedScaling != null) __obj.updateDynamic("managedScaling")(managedScaling.asInstanceOf[js.Any])
    if (managedTerminationProtection != null) __obj.updateDynamic("managedTerminationProtection")(managedTerminationProtection.asInstanceOf[js.Any])
    __obj.asInstanceOf[CapacityProviderAutoScalingGroupProvider]
  }
}

