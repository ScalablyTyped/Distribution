package typings.pulumiAws.outputMod.ecs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CapacityProviderAutoScalingGroupProvider extends StObject {
  
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
  implicit class CapacityProviderAutoScalingGroupProviderMutableBuilder[Self <: CapacityProviderAutoScalingGroupProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoScalingGroupArn(value: String): Self = StObject.set(x, "autoScalingGroupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManagedScaling(value: CapacityProviderAutoScalingGroupProviderManagedScaling): Self = StObject.set(x, "managedScaling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManagedTerminationProtection(value: String): Self = StObject.set(x, "managedTerminationProtection", value.asInstanceOf[js.Any])
  }
}
