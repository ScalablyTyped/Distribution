package typings.pulumiAws.inputMod.ecs

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CapacityProviderAutoScalingGroupProvider extends StObject {
  
  /**
    * - The Amazon Resource Name (ARN) of the associated auto scaling group.
    */
  var autoScalingGroupArn: Input[String]
  
  /**
    * - Nested argument defining the parameters of the auto scaling. Defined below.
    */
  var managedScaling: js.UndefOr[Input[CapacityProviderAutoScalingGroupProviderManagedScaling]] = js.undefined
  
  /**
    * - Enables or disables container-aware termination of instances in the auto scaling group when scale-in happens. Valid values are `ENABLED` and `DISABLED`.
    */
  var managedTerminationProtection: js.UndefOr[Input[String]] = js.undefined
}
object CapacityProviderAutoScalingGroupProvider {
  
  inline def apply(autoScalingGroupArn: Input[String]): CapacityProviderAutoScalingGroupProvider = {
    val __obj = js.Dynamic.literal(autoScalingGroupArn = autoScalingGroupArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CapacityProviderAutoScalingGroupProvider]
  }
  
  extension [Self <: CapacityProviderAutoScalingGroupProvider](x: Self) {
    
    inline def setAutoScalingGroupArn(value: Input[String]): Self = StObject.set(x, "autoScalingGroupArn", value.asInstanceOf[js.Any])
    
    inline def setManagedScaling(value: Input[CapacityProviderAutoScalingGroupProviderManagedScaling]): Self = StObject.set(x, "managedScaling", value.asInstanceOf[js.Any])
    
    inline def setManagedScalingUndefined: Self = StObject.set(x, "managedScaling", js.undefined)
    
    inline def setManagedTerminationProtection(value: Input[String]): Self = StObject.set(x, "managedTerminationProtection", value.asInstanceOf[js.Any])
    
    inline def setManagedTerminationProtectionUndefined: Self = StObject.set(x, "managedTerminationProtection", js.undefined)
  }
}
