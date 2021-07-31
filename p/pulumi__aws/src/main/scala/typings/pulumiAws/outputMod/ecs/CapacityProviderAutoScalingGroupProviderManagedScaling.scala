package typings.pulumiAws.outputMod.ecs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CapacityProviderAutoScalingGroupProviderManagedScaling extends StObject {
  
  /**
    * The maximum step adjustment size. A number between 1 and 10,000.
    */
  var maximumScalingStepSize: Double
  
  /**
    * The minimum step adjustment size. A number between 1 and 10,000.
    */
  var minimumScalingStepSize: Double
  
  /**
    * Whether auto scaling is managed by ECS. Valid values are `ENABLED` and `DISABLED`.
    */
  var status: String
  
  /**
    * The target utilization for the capacity provider. A number between 1 and 100.
    */
  var targetCapacity: Double
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
  implicit class CapacityProviderAutoScalingGroupProviderManagedScalingMutableBuilder[Self <: CapacityProviderAutoScalingGroupProviderManagedScaling] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaximumScalingStepSize(value: Double): Self = StObject.set(x, "maximumScalingStepSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumScalingStepSize(value: Double): Self = StObject.set(x, "minimumScalingStepSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetCapacity(value: Double): Self = StObject.set(x, "targetCapacity", value.asInstanceOf[js.Any])
  }
}
