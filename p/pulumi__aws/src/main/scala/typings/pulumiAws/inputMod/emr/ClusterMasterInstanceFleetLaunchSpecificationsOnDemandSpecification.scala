package typings.pulumiAws.inputMod.emr

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterMasterInstanceFleetLaunchSpecificationsOnDemandSpecification extends StObject {
  
  /**
    * Specifies the strategy to use in launching Spot instance fleets. Currently, the only option is `capacity-optimized` (the default), which launches instances from Spot instance pools with optimal capacity for the number of instances that are launching.
    */
  var allocationStrategy: Input[String]
}
object ClusterMasterInstanceFleetLaunchSpecificationsOnDemandSpecification {
  
  inline def apply(allocationStrategy: Input[String]): ClusterMasterInstanceFleetLaunchSpecificationsOnDemandSpecification = {
    val __obj = js.Dynamic.literal(allocationStrategy = allocationStrategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterMasterInstanceFleetLaunchSpecificationsOnDemandSpecification]
  }
  
  extension [Self <: ClusterMasterInstanceFleetLaunchSpecificationsOnDemandSpecification](x: Self) {
    
    inline def setAllocationStrategy(value: Input[String]): Self = StObject.set(x, "allocationStrategy", value.asInstanceOf[js.Any])
  }
}
