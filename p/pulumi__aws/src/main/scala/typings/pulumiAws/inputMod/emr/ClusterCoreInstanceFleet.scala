package typings.pulumiAws.inputMod.emr

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterCoreInstanceFleet extends StObject {
  
  /**
    * The ID of the EMR Cluster
    */
  var id: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Configuration block for instance fleet
    */
  var instanceTypeConfigs: js.UndefOr[Input[js.Array[Input[ClusterCoreInstanceFleetInstanceTypeConfig]]]] = js.undefined
  
  /**
    * Configuration block for launch specification
    */
  var launchSpecifications: js.UndefOr[Input[ClusterCoreInstanceFleetLaunchSpecifications]] = js.undefined
  
  /**
    * Friendly name given to the instance fleet.
    */
  var name: js.UndefOr[Input[String]] = js.undefined
  
  var provisionedOnDemandCapacity: js.UndefOr[Input[Double]] = js.undefined
  
  var provisionedSpotCapacity: js.UndefOr[Input[Double]] = js.undefined
  
  /**
    * The target capacity of On-Demand units for the instance fleet, which determines how many On-Demand instances to provision.
    */
  var targetOnDemandCapacity: js.UndefOr[Input[Double]] = js.undefined
  
  /**
    * The target capacity of Spot units for the instance fleet, which determines how many Spot instances to provision.
    */
  var targetSpotCapacity: js.UndefOr[Input[Double]] = js.undefined
}
object ClusterCoreInstanceFleet {
  
  inline def apply(): ClusterCoreInstanceFleet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterCoreInstanceFleet]
  }
  
  extension [Self <: ClusterCoreInstanceFleet](x: Self) {
    
    inline def setId(value: Input[String]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setInstanceTypeConfigs(value: Input[js.Array[Input[ClusterCoreInstanceFleetInstanceTypeConfig]]]): Self = StObject.set(x, "instanceTypeConfigs", value.asInstanceOf[js.Any])
    
    inline def setInstanceTypeConfigsUndefined: Self = StObject.set(x, "instanceTypeConfigs", js.undefined)
    
    inline def setInstanceTypeConfigsVarargs(value: Input[ClusterCoreInstanceFleetInstanceTypeConfig]*): Self = StObject.set(x, "instanceTypeConfigs", js.Array(value :_*))
    
    inline def setLaunchSpecifications(value: Input[ClusterCoreInstanceFleetLaunchSpecifications]): Self = StObject.set(x, "launchSpecifications", value.asInstanceOf[js.Any])
    
    inline def setLaunchSpecificationsUndefined: Self = StObject.set(x, "launchSpecifications", js.undefined)
    
    inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setProvisionedOnDemandCapacity(value: Input[Double]): Self = StObject.set(x, "provisionedOnDemandCapacity", value.asInstanceOf[js.Any])
    
    inline def setProvisionedOnDemandCapacityUndefined: Self = StObject.set(x, "provisionedOnDemandCapacity", js.undefined)
    
    inline def setProvisionedSpotCapacity(value: Input[Double]): Self = StObject.set(x, "provisionedSpotCapacity", value.asInstanceOf[js.Any])
    
    inline def setProvisionedSpotCapacityUndefined: Self = StObject.set(x, "provisionedSpotCapacity", js.undefined)
    
    inline def setTargetOnDemandCapacity(value: Input[Double]): Self = StObject.set(x, "targetOnDemandCapacity", value.asInstanceOf[js.Any])
    
    inline def setTargetOnDemandCapacityUndefined: Self = StObject.set(x, "targetOnDemandCapacity", js.undefined)
    
    inline def setTargetSpotCapacity(value: Input[Double]): Self = StObject.set(x, "targetSpotCapacity", value.asInstanceOf[js.Any])
    
    inline def setTargetSpotCapacityUndefined: Self = StObject.set(x, "targetSpotCapacity", js.undefined)
  }
}
