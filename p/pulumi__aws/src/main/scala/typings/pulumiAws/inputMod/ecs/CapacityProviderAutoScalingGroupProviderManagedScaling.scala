package typings.pulumiAws.inputMod.ecs

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CapacityProviderAutoScalingGroupProviderManagedScaling extends js.Object {
  
  /**
    * The maximum step adjustment size. A number between 1 and 10,000.
    */
  var maximumScalingStepSize: js.UndefOr[Input[Double]] = js.native
  
  /**
    * The minimum step adjustment size. A number between 1 and 10,000.
    */
  var minimumScalingStepSize: js.UndefOr[Input[Double]] = js.native
  
  /**
    * Whether auto scaling is managed by ECS. Valid values are `ENABLED` and `DISABLED`.
    */
  var status: js.UndefOr[Input[String]] = js.native
  
  /**
    * The target utilization for the capacity provider. A number between 1 and 100.
    */
  var targetCapacity: js.UndefOr[Input[Double]] = js.native
}
object CapacityProviderAutoScalingGroupProviderManagedScaling {
  
  @scala.inline
  def apply(): CapacityProviderAutoScalingGroupProviderManagedScaling = {
    val __obj = js.Dynamic.literal()
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
    def setMaximumScalingStepSize(value: Input[Double]): Self = this.set("maximumScalingStepSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximumScalingStepSize: Self = this.set("maximumScalingStepSize", js.undefined)
    
    @scala.inline
    def setMinimumScalingStepSize(value: Input[Double]): Self = this.set("minimumScalingStepSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimumScalingStepSize: Self = this.set("minimumScalingStepSize", js.undefined)
    
    @scala.inline
    def setStatus(value: Input[String]): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setTargetCapacity(value: Input[Double]): Self = this.set("targetCapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetCapacity: Self = this.set("targetCapacity", js.undefined)
  }
}
