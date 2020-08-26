package typings.pulumiAws.inputMod.ec2

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FleetLaunchTemplateConfigOverride extends js.Object {
  /**
    * Availability Zone in which to launch the instances.
    */
  var availabilityZone: js.UndefOr[Input[String]] = js.native
  /**
    * Instance type.
    */
  var instanceType: js.UndefOr[Input[String]] = js.native
  /**
    * Maximum price per unit hour that you are willing to pay for a Spot Instance.
    */
  var maxPrice: js.UndefOr[Input[String]] = js.native
  /**
    * Priority for the launch template override. If `onDemandOptions` `allocationStrategy` is set to `prioritized`, EC2 Fleet uses priority to determine which launch template override to use first in fulfilling On-Demand capacity. The highest priority is launched first. The lower the number, the higher the priority. If no number is set, the launch template override has the lowest priority. Valid values are whole numbers starting at 0.
    */
  var priority: js.UndefOr[Input[Double]] = js.native
  /**
    * ID of the subnet in which to launch the instances.
    */
  var subnetId: js.UndefOr[Input[String]] = js.native
  /**
    * Number of units provided by the specified instance type.
    */
  var weightedCapacity: js.UndefOr[Input[Double]] = js.native
}

object FleetLaunchTemplateConfigOverride {
  @scala.inline
  def apply(): FleetLaunchTemplateConfigOverride = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FleetLaunchTemplateConfigOverride]
  }
  @scala.inline
  implicit class FleetLaunchTemplateConfigOverrideOps[Self <: FleetLaunchTemplateConfigOverride] (val x: Self) extends AnyVal {
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
    def setMaxPrice(value: Input[String]): Self = this.set("maxPrice", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxPrice: Self = this.set("maxPrice", js.undefined)
    @scala.inline
    def setPriority(value: Input[Double]): Self = this.set("priority", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePriority: Self = this.set("priority", js.undefined)
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

