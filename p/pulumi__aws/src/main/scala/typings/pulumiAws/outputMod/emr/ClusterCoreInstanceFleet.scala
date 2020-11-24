package typings.pulumiAws.outputMod.emr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClusterCoreInstanceFleet extends js.Object {
  
  /**
    * The ID of the EMR Cluster
    */
  var id: String = js.native
  
  /**
    * Configuration block for instance fleet
    */
  var instanceTypeConfigs: js.UndefOr[js.Array[ClusterCoreInstanceFleetInstanceTypeConfig]] = js.native
  
  /**
    * Configuration block for launch specification
    */
  var launchSpecifications: js.UndefOr[ClusterCoreInstanceFleetLaunchSpecifications] = js.native
  
  /**
    * Friendly name given to the instance fleet.
    */
  var name: js.UndefOr[String] = js.native
  
  var provisionedOnDemandCapacity: Double = js.native
  
  var provisionedSpotCapacity: Double = js.native
  
  /**
    * The target capacity of On-Demand units for the instance fleet, which determines how many On-Demand instances to provision.
    */
  var targetOnDemandCapacity: js.UndefOr[Double] = js.native
  
  /**
    * The target capacity of Spot units for the instance fleet, which determines how many Spot instances to provision.
    */
  var targetSpotCapacity: js.UndefOr[Double] = js.native
}
object ClusterCoreInstanceFleet {
  
  @scala.inline
  def apply(id: String, provisionedOnDemandCapacity: Double, provisionedSpotCapacity: Double): ClusterCoreInstanceFleet = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], provisionedOnDemandCapacity = provisionedOnDemandCapacity.asInstanceOf[js.Any], provisionedSpotCapacity = provisionedSpotCapacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterCoreInstanceFleet]
  }
  
  @scala.inline
  implicit class ClusterCoreInstanceFleetOps[Self <: ClusterCoreInstanceFleet] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvisionedOnDemandCapacity(value: Double): Self = this.set("provisionedOnDemandCapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvisionedSpotCapacity(value: Double): Self = this.set("provisionedSpotCapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceTypeConfigsVarargs(value: ClusterCoreInstanceFleetInstanceTypeConfig*): Self = this.set("instanceTypeConfigs", js.Array(value :_*))
    
    @scala.inline
    def setInstanceTypeConfigs(value: js.Array[ClusterCoreInstanceFleetInstanceTypeConfig]): Self = this.set("instanceTypeConfigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceTypeConfigs: Self = this.set("instanceTypeConfigs", js.undefined)
    
    @scala.inline
    def setLaunchSpecifications(value: ClusterCoreInstanceFleetLaunchSpecifications): Self = this.set("launchSpecifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLaunchSpecifications: Self = this.set("launchSpecifications", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setTargetOnDemandCapacity(value: Double): Self = this.set("targetOnDemandCapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetOnDemandCapacity: Self = this.set("targetOnDemandCapacity", js.undefined)
    
    @scala.inline
    def setTargetSpotCapacity(value: Double): Self = this.set("targetSpotCapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetSpotCapacity: Self = this.set("targetSpotCapacity", js.undefined)
  }
}
