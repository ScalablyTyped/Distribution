package typings.pulumiAws.outputMod.ecs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CapacityProviderAutoScalingGroupProviderManagedScaling extends js.Object {
  /**
    * The maximum step adjustment size. A number between 1 and 10,000.
    */
  var maximumScalingStepSize: Double = js.native
  /**
    * The minimum step adjustment size. A number between 1 and 10,000.
    */
  var minimumScalingStepSize: Double = js.native
  /**
    * Whether auto scaling is managed by ECS. Valid values are `ENABLED` and `DISABLED`.
    */
  var status: String = js.native
  /**
    * The target utilization for the capacity provider. A number between 1 and 100.
    */
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
  @scala.inline
  implicit class CapacityProviderAutoScalingGroupProviderManagedScalingOps[Self <: CapacityProviderAutoScalingGroupProviderManagedScaling] (val x: Self) extends AnyVal {
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
    def setMaximumScalingStepSize(value: Double): Self = this.set("maximumScalingStepSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinimumScalingStepSize(value: Double): Self = this.set("minimumScalingStepSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setTargetCapacity(value: Double): Self = this.set("targetCapacity", value.asInstanceOf[js.Any])
  }
  
}

