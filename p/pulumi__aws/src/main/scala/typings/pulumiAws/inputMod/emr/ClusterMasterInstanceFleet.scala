package typings.pulumiAws.inputMod.emr

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClusterMasterInstanceFleet extends js.Object {
  
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
  implicit class ClusterMasterInstanceFleetOps[Self <: ClusterMasterInstanceFleet] (val x: Self) extends AnyVal {
    
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
    def setId(value: Input[String]): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setInstanceTypeConfigsVarargs(value: Input[ClusterMasterInstanceFleetInstanceTypeConfig]*): Self = this.set("instanceTypeConfigs", js.Array(value :_*))
    
    @scala.inline
    def setInstanceTypeConfigs(value: Input[js.Array[Input[ClusterMasterInstanceFleetInstanceTypeConfig]]]): Self = this.set("instanceTypeConfigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceTypeConfigs: Self = this.set("instanceTypeConfigs", js.undefined)
    
    @scala.inline
    def setLaunchSpecifications(value: Input[ClusterMasterInstanceFleetLaunchSpecifications]): Self = this.set("launchSpecifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLaunchSpecifications: Self = this.set("launchSpecifications", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setProvisionedOnDemandCapacity(value: Input[Double]): Self = this.set("provisionedOnDemandCapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProvisionedOnDemandCapacity: Self = this.set("provisionedOnDemandCapacity", js.undefined)
    
    @scala.inline
    def setProvisionedSpotCapacity(value: Input[Double]): Self = this.set("provisionedSpotCapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProvisionedSpotCapacity: Self = this.set("provisionedSpotCapacity", js.undefined)
    
    @scala.inline
    def setTargetOnDemandCapacity(value: Input[Double]): Self = this.set("targetOnDemandCapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetOnDemandCapacity: Self = this.set("targetOnDemandCapacity", js.undefined)
    
    @scala.inline
    def setTargetSpotCapacity(value: Input[Double]): Self = this.set("targetSpotCapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetSpotCapacity: Self = this.set("targetSpotCapacity", js.undefined)
  }
}
