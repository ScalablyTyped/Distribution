package typings.pulumiAws.instanceFleetMod

import typings.pulumiAws.inputMod.emr.InstanceFleetInstanceTypeConfig
import typings.pulumiAws.inputMod.emr.InstanceFleetLaunchSpecifications
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceFleetState extends js.Object {
  
  /**
    * ID of the EMR Cluster to attach to. Changing this forces a new resource to be created.
    */
  val clusterId: js.UndefOr[Input[String]] = js.native
  
  /**
    * Configuration block for instance fleet
    */
  val instanceTypeConfigs: js.UndefOr[Input[js.Array[Input[InstanceFleetInstanceTypeConfig]]]] = js.native
  
  /**
    * Configuration block for launch specification
    */
  val launchSpecifications: js.UndefOr[Input[InstanceFleetLaunchSpecifications]] = js.native
  
  /**
    * Friendly name given to the instance fleet.
    */
  val name: js.UndefOr[Input[String]] = js.native
  
  val provisionedOnDemandCapacity: js.UndefOr[Input[Double]] = js.native
  
  val provisionedSpotCapacity: js.UndefOr[Input[Double]] = js.native
  
  /**
    * The target capacity of On-Demand units for the instance fleet, which determines how many On-Demand instances to provision.
    */
  val targetOnDemandCapacity: js.UndefOr[Input[Double]] = js.native
  
  /**
    * The target capacity of Spot units for the instance fleet, which determines how many Spot instances to provision.
    */
  val targetSpotCapacity: js.UndefOr[Input[Double]] = js.native
}
object InstanceFleetState {
  
  @scala.inline
  def apply(): InstanceFleetState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceFleetState]
  }
  
  @scala.inline
  implicit class InstanceFleetStateOps[Self <: InstanceFleetState] (val x: Self) extends AnyVal {
    
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
    def setClusterId(value: Input[String]): Self = this.set("clusterId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusterId: Self = this.set("clusterId", js.undefined)
    
    @scala.inline
    def setInstanceTypeConfigsVarargs(value: Input[InstanceFleetInstanceTypeConfig]*): Self = this.set("instanceTypeConfigs", js.Array(value :_*))
    
    @scala.inline
    def setInstanceTypeConfigs(value: Input[js.Array[Input[InstanceFleetInstanceTypeConfig]]]): Self = this.set("instanceTypeConfigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceTypeConfigs: Self = this.set("instanceTypeConfigs", js.undefined)
    
    @scala.inline
    def setLaunchSpecifications(value: Input[InstanceFleetLaunchSpecifications]): Self = this.set("launchSpecifications", value.asInstanceOf[js.Any])
    
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
