package typings.pulumiAws.inputMod.ec2

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpotFleetRequestLaunchTemplateConfigOverride extends js.Object {
  
  /**
    * The availability zone in which to place the request.
    */
  var availabilityZone: js.UndefOr[Input[String]] = js.native
  
  /**
    * The type of instance to request.
    */
  var instanceType: js.UndefOr[Input[String]] = js.native
  
  /**
    * The priority for the launch template override. The lower the number, the higher the priority. If no number is set, the launch template override has the lowest priority.
    */
  var priority: js.UndefOr[Input[Double]] = js.native
  
  /**
    * The maximum spot bid for this override request.
    */
  var spotPrice: js.UndefOr[Input[String]] = js.native
  
  /**
    * The subnet in which to launch the requested instance.
    */
  var subnetId: js.UndefOr[Input[String]] = js.native
  
  /**
    * The capacity added to the fleet by a fulfilled request.
    */
  var weightedCapacity: js.UndefOr[Input[Double]] = js.native
}
object SpotFleetRequestLaunchTemplateConfigOverride {
  
  @scala.inline
  def apply(): SpotFleetRequestLaunchTemplateConfigOverride = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpotFleetRequestLaunchTemplateConfigOverride]
  }
  
  @scala.inline
  implicit class SpotFleetRequestLaunchTemplateConfigOverrideOps[Self <: SpotFleetRequestLaunchTemplateConfigOverride] (val x: Self) extends AnyVal {
    
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
    def setAvailabilityZone(value: Input[String]): Self = this.set("availabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvailabilityZone: Self = this.set("availabilityZone", js.undefined)
    
    @scala.inline
    def setInstanceType(value: Input[String]): Self = this.set("instanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceType: Self = this.set("instanceType", js.undefined)
    
    @scala.inline
    def setPriority(value: Input[Double]): Self = this.set("priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePriority: Self = this.set("priority", js.undefined)
    
    @scala.inline
    def setSpotPrice(value: Input[String]): Self = this.set("spotPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpotPrice: Self = this.set("spotPrice", js.undefined)
    
    @scala.inline
    def setSubnetId(value: Input[String]): Self = this.set("subnetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubnetId: Self = this.set("subnetId", js.undefined)
    
    @scala.inline
    def setWeightedCapacity(value: Input[Double]): Self = this.set("weightedCapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeightedCapacity: Self = this.set("weightedCapacity", js.undefined)
  }
}
