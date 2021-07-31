package typings.pulumiAws.outputMod.emr

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterCoreInstanceFleet extends StObject {
  
  /**
    * The ID of the EMR Cluster
    */
  var id: String
  
  /**
    * Configuration block for instance fleet
    */
  var instanceTypeConfigs: js.UndefOr[js.Array[ClusterCoreInstanceFleetInstanceTypeConfig]] = js.undefined
  
  /**
    * Configuration block for launch specification
    */
  var launchSpecifications: js.UndefOr[ClusterCoreInstanceFleetLaunchSpecifications] = js.undefined
  
  /**
    * Friendly name given to the instance fleet.
    */
  var name: js.UndefOr[String] = js.undefined
  
  var provisionedOnDemandCapacity: Double
  
  var provisionedSpotCapacity: Double
  
  /**
    * The target capacity of On-Demand units for the instance fleet, which determines how many On-Demand instances to provision.
    */
  var targetOnDemandCapacity: js.UndefOr[Double] = js.undefined
  
  /**
    * The target capacity of Spot units for the instance fleet, which determines how many Spot instances to provision.
    */
  var targetSpotCapacity: js.UndefOr[Double] = js.undefined
}
object ClusterCoreInstanceFleet {
  
  @scala.inline
  def apply(id: String, provisionedOnDemandCapacity: Double, provisionedSpotCapacity: Double): ClusterCoreInstanceFleet = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], provisionedOnDemandCapacity = provisionedOnDemandCapacity.asInstanceOf[js.Any], provisionedSpotCapacity = provisionedSpotCapacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterCoreInstanceFleet]
  }
  
  @scala.inline
  implicit class ClusterCoreInstanceFleetMutableBuilder[Self <: ClusterCoreInstanceFleet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceTypeConfigs(value: js.Array[ClusterCoreInstanceFleetInstanceTypeConfig]): Self = StObject.set(x, "instanceTypeConfigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceTypeConfigsUndefined: Self = StObject.set(x, "instanceTypeConfigs", js.undefined)
    
    @scala.inline
    def setInstanceTypeConfigsVarargs(value: ClusterCoreInstanceFleetInstanceTypeConfig*): Self = StObject.set(x, "instanceTypeConfigs", js.Array(value :_*))
    
    @scala.inline
    def setLaunchSpecifications(value: ClusterCoreInstanceFleetLaunchSpecifications): Self = StObject.set(x, "launchSpecifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLaunchSpecificationsUndefined: Self = StObject.set(x, "launchSpecifications", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setProvisionedOnDemandCapacity(value: Double): Self = StObject.set(x, "provisionedOnDemandCapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvisionedSpotCapacity(value: Double): Self = StObject.set(x, "provisionedSpotCapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetOnDemandCapacity(value: Double): Self = StObject.set(x, "targetOnDemandCapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetOnDemandCapacityUndefined: Self = StObject.set(x, "targetOnDemandCapacity", js.undefined)
    
    @scala.inline
    def setTargetSpotCapacity(value: Double): Self = StObject.set(x, "targetSpotCapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetSpotCapacityUndefined: Self = StObject.set(x, "targetSpotCapacity", js.undefined)
  }
}
