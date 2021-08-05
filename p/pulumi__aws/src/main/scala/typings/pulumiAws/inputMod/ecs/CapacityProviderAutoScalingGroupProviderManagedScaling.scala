package typings.pulumiAws.inputMod.ecs

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CapacityProviderAutoScalingGroupProviderManagedScaling extends StObject {
  
  /**
    * The maximum step adjustment size. A number between 1 and 10,000.
    */
  var maximumScalingStepSize: js.UndefOr[Input[Double]] = js.undefined
  
  /**
    * The minimum step adjustment size. A number between 1 and 10,000.
    */
  var minimumScalingStepSize: js.UndefOr[Input[Double]] = js.undefined
  
  /**
    * Whether auto scaling is managed by ECS. Valid values are `ENABLED` and `DISABLED`.
    */
  var status: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The target utilization for the capacity provider. A number between 1 and 100.
    */
  var targetCapacity: js.UndefOr[Input[Double]] = js.undefined
}
object CapacityProviderAutoScalingGroupProviderManagedScaling {
  
  inline def apply(): CapacityProviderAutoScalingGroupProviderManagedScaling = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CapacityProviderAutoScalingGroupProviderManagedScaling]
  }
  
  extension [Self <: CapacityProviderAutoScalingGroupProviderManagedScaling](x: Self) {
    
    inline def setMaximumScalingStepSize(value: Input[Double]): Self = StObject.set(x, "maximumScalingStepSize", value.asInstanceOf[js.Any])
    
    inline def setMaximumScalingStepSizeUndefined: Self = StObject.set(x, "maximumScalingStepSize", js.undefined)
    
    inline def setMinimumScalingStepSize(value: Input[Double]): Self = StObject.set(x, "minimumScalingStepSize", value.asInstanceOf[js.Any])
    
    inline def setMinimumScalingStepSizeUndefined: Self = StObject.set(x, "minimumScalingStepSize", js.undefined)
    
    inline def setStatus(value: Input[String]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTargetCapacity(value: Input[Double]): Self = StObject.set(x, "targetCapacity", value.asInstanceOf[js.Any])
    
    inline def setTargetCapacityUndefined: Self = StObject.set(x, "targetCapacity", js.undefined)
  }
}
