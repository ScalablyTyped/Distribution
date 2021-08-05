package typings.pulumiAws.outputMod.emr

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterCoreInstanceFleetLaunchSpecificationsSpotSpecification extends StObject {
  
  /**
    * Specifies the strategy to use in launching Spot instance fleets. Currently, the only option is `capacity-optimized` (the default), which launches instances from Spot instance pools with optimal capacity for the number of instances that are launching.
    */
  var allocationStrategy: String
  
  /**
    * The defined duration for Spot instances (also known as Spot blocks) in minutes. When specified, the Spot instance does not terminate before the defined duration expires, and defined duration pricing for Spot instances applies. Valid values are 60, 120, 180, 240, 300, or 360. The duration period starts as soon as a Spot instance receives its instance ID. At the end of the duration, Amazon EC2 marks the Spot instance for termination and provides a Spot instance termination notice, which gives the instance a two-minute warning before it terminates.
    */
  var blockDurationMinutes: js.UndefOr[Double] = js.undefined
  
  /**
    * The action to take when TargetSpotCapacity has not been fulfilled when the TimeoutDurationMinutes has expired; that is, when all Spot instances could not be provisioned within the Spot provisioning timeout. Valid values are `TERMINATE_CLUSTER` and `SWITCH_TO_ON_DEMAND`. SWITCH_TO_ON_DEMAND specifies that if no Spot instances are available, On-Demand Instances should be provisioned to fulfill any remaining Spot capacity.
    */
  var timeoutAction: String
  
  /**
    * The spot provisioning timeout period in minutes. If Spot instances are not provisioned within this time period, the TimeOutAction is taken. Minimum value is 5 and maximum value is 1440. The timeout applies only during initial provisioning, when the cluster is first created.
    */
  var timeoutDurationMinutes: Double
}
object ClusterCoreInstanceFleetLaunchSpecificationsSpotSpecification {
  
  inline def apply(allocationStrategy: String, timeoutAction: String, timeoutDurationMinutes: Double): ClusterCoreInstanceFleetLaunchSpecificationsSpotSpecification = {
    val __obj = js.Dynamic.literal(allocationStrategy = allocationStrategy.asInstanceOf[js.Any], timeoutAction = timeoutAction.asInstanceOf[js.Any], timeoutDurationMinutes = timeoutDurationMinutes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterCoreInstanceFleetLaunchSpecificationsSpotSpecification]
  }
  
  extension [Self <: ClusterCoreInstanceFleetLaunchSpecificationsSpotSpecification](x: Self) {
    
    inline def setAllocationStrategy(value: String): Self = StObject.set(x, "allocationStrategy", value.asInstanceOf[js.Any])
    
    inline def setBlockDurationMinutes(value: Double): Self = StObject.set(x, "blockDurationMinutes", value.asInstanceOf[js.Any])
    
    inline def setBlockDurationMinutesUndefined: Self = StObject.set(x, "blockDurationMinutes", js.undefined)
    
    inline def setTimeoutAction(value: String): Self = StObject.set(x, "timeoutAction", value.asInstanceOf[js.Any])
    
    inline def setTimeoutDurationMinutes(value: Double): Self = StObject.set(x, "timeoutDurationMinutes", value.asInstanceOf[js.Any])
  }
}
