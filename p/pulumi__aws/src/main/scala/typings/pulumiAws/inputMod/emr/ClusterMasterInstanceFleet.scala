package typings.pulumiAws.inputMod.emr

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClusterMasterInstanceFleet extends StObject {
  
  /**
    * The ID of the EMR Cluster
    */
  var id: js.UndefOr[Input[String]] = js.native
  
  /**
    * Configuration block for instance fleet
    */
  var instanceTypeConfigs: js.UndefOr[Input[js.Array[Input[ClusterMasterInstanceFleetInstanceTypeConfig]]]] = js.native
  
  /**
    * Configuration block for launch specification
    */
  var launchSpecifications: js.UndefOr[Input[ClusterMasterInstanceFleetLaunchSpecifications]] = js.native
  
  /**
    * Friendly name given to the instance fleet.
    */
  var name: js.UndefOr[Input[String]] = js.native
  
  var provisionedOnDemandCapacity: js.UndefOr[Input[Double]] = js.native
  
  var provisionedSpotCapacity: js.UndefOr[Input[Double]] = js.native
  
  /**
    * The target capacity of On-Demand units for the instance fleet, which determines how many On-Demand instances to provision.
    */
  var targetOnDemandCapacity: js.UndefOr[Input[Double]] = js.native
  
  /**
    * The target capacity of Spot units for the instance fleet, which determines how many Spot instances to provision.
    */
  var targetSpotCapacity: js.UndefOr[Input[Double]] = js.native
}
object ClusterMasterInstanceFleet {
  
  @scala.inline
  def apply(): ClusterMasterInstanceFleet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterMasterInstanceFleet]
  }
  
  @scala.inline
  implicit class ClusterMasterInstanceFleetMutableBuilder[Self <: ClusterMasterInstanceFleet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: Input[String]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setInstanceTypeConfigs(value: Input[js.Array[Input[ClusterMasterInstanceFleetInstanceTypeConfig]]]): Self = StObject.set(x, "instanceTypeConfigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceTypeConfigsUndefined: Self = StObject.set(x, "instanceTypeConfigs", js.undefined)
    
    @scala.inline
    def setInstanceTypeConfigsVarargs(value: Input[ClusterMasterInstanceFleetInstanceTypeConfig]*): Self = StObject.set(x, "instanceTypeConfigs", js.Array(value :_*))
    
    @scala.inline
    def setLaunchSpecifications(value: Input[ClusterMasterInstanceFleetLaunchSpecifications]): Self = StObject.set(x, "launchSpecifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLaunchSpecificationsUndefined: Self = StObject.set(x, "launchSpecifications", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setProvisionedOnDemandCapacity(value: Input[Double]): Self = StObject.set(x, "provisionedOnDemandCapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvisionedOnDemandCapacityUndefined: Self = StObject.set(x, "provisionedOnDemandCapacity", js.undefined)
    
    @scala.inline
    def setProvisionedSpotCapacity(value: Input[Double]): Self = StObject.set(x, "provisionedSpotCapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvisionedSpotCapacityUndefined: Self = StObject.set(x, "provisionedSpotCapacity", js.undefined)
    
    @scala.inline
    def setTargetOnDemandCapacity(value: Input[Double]): Self = StObject.set(x, "targetOnDemandCapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetOnDemandCapacityUndefined: Self = StObject.set(x, "targetOnDemandCapacity", js.undefined)
    
    @scala.inline
    def setTargetSpotCapacity(value: Input[Double]): Self = StObject.set(x, "targetSpotCapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetSpotCapacityUndefined: Self = StObject.set(x, "targetSpotCapacity", js.undefined)
  }
}
