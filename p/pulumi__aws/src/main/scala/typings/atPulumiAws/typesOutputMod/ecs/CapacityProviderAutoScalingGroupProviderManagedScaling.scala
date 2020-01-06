package typings.atPulumiAws.typesOutputMod.ecs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CapacityProviderAutoScalingGroupProviderManagedScaling extends js.Object {
  var maximumScalingStepSize: Double = js.native
  var minimumScalingStepSize: Double = js.native
  var status: String = js.native
  var targetCapacity: Double = js.native
}

object CapacityProviderAutoScalingGroupProviderManagedScaling {
  @scala.inline
  def apply(
    maximumScalingStepSize: Double,
    minimumScalingStepSize: Double,
    status: String,
    targetCapacity: Double
  ): CapacityProviderAutoScalingGroupProviderManagedScaling = {
    val __obj = js.Dynamic.literal(maximumScalingStepSize = maximumScalingStepSize.asInstanceOf[js.Any], minimumScalingStepSize = minimumScalingStepSize.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], targetCapacity = targetCapacity.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CapacityProviderAutoScalingGroupProviderManagedScaling]
  }
}

