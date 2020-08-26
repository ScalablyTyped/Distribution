package typings.pulumiAws.outputMod.ecs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CapacityProviderAutoScalingGroupProvider extends js.Object {
  /**
    * - The Amazon Resource Name (ARN) of the associated auto scaling group.
    */
  var autoScalingGroupArn: String = js.native
  /**
    * - Nested argument defining the parameters of the auto scaling. Defined below.
    */
  var managedScaling: CapacityProviderAutoScalingGroupProviderManagedScaling = js.native
  /**
    * - Enables or disables container-aware termination of instances in the auto scaling group when scale-in happens. Valid values are `ENABLED` and `DISABLED`.
    */
  var managedTerminationProtection: String = js.native
}

object CapacityProviderAutoScalingGroupProvider {
  @scala.inline
  def apply(
    autoScalingGroupArn: String,
    managedScaling: CapacityProviderAutoScalingGroupProviderManagedScaling,
    managedTerminationProtection: String
  ): CapacityProviderAutoScalingGroupProvider = {
    val __obj = js.Dynamic.literal(autoScalingGroupArn = autoScalingGroupArn.asInstanceOf[js.Any], managedScaling = managedScaling.asInstanceOf[js.Any], managedTerminationProtection = managedTerminationProtection.asInstanceOf[js.Any])
    __obj.asInstanceOf[CapacityProviderAutoScalingGroupProvider]
  }
  @scala.inline
  implicit class CapacityProviderAutoScalingGroupProviderOps[Self <: CapacityProviderAutoScalingGroupProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAutoScalingGroupArn(value: String): Self = this.set("autoScalingGroupArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setManagedScaling(value: CapacityProviderAutoScalingGroupProviderManagedScaling): Self = this.set("managedScaling", value.asInstanceOf[js.Any])
    @scala.inline
    def setManagedTerminationProtection(value: String): Self = this.set("managedTerminationProtection", value.asInstanceOf[js.Any])
  }
  
}

