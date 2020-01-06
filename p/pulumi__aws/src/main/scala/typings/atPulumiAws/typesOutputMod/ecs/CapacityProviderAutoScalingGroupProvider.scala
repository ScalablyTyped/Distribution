package typings.atPulumiAws.typesOutputMod.ecs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CapacityProviderAutoScalingGroupProvider extends js.Object {
  var autoScalingGroupArn: String = js.native
  var managedScaling: CapacityProviderAutoScalingGroupProviderManagedScaling = js.native
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
}

