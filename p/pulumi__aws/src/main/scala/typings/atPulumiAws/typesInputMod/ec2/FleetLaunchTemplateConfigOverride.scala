package typings.atPulumiAws.typesInputMod.ec2

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FleetLaunchTemplateConfigOverride extends js.Object {
  /**
    * Availability Zone in which to launch the instances.
    */
  var availabilityZone: js.UndefOr[Input[String]] = js.undefined
  /**
    * Instance type.
    */
  var instanceType: js.UndefOr[Input[String]] = js.undefined
  /**
    * Maximum price per unit hour that you are willing to pay for a Spot Instance.
    */
  var maxPrice: js.UndefOr[Input[String]] = js.undefined
  /**
    * Priority for the launch template override. If `onDemandOptions` `allocationStrategy` is set to `prioritized`, EC2 Fleet uses priority to determine which launch template override to use first in fulfilling On-Demand capacity. The highest priority is launched first. The lower the number, the higher the priority. If no number is set, the launch template override has the lowest priority. Valid values are whole numbers starting at 0.
    */
  var priority: js.UndefOr[Input[Double]] = js.undefined
  /**
    * ID of the subnet in which to launch the instances.
    */
  var subnetId: js.UndefOr[Input[String]] = js.undefined
  /**
    * Number of units provided by the specified instance type.
    */
  var weightedCapacity: js.UndefOr[Input[Double]] = js.undefined
}

object FleetLaunchTemplateConfigOverride {
  @scala.inline
  def apply(
    availabilityZone: Input[String] = null,
    instanceType: Input[String] = null,
    maxPrice: Input[String] = null,
    priority: Input[Double] = null,
    subnetId: Input[String] = null,
    weightedCapacity: Input[Double] = null
  ): FleetLaunchTemplateConfigOverride = {
    val __obj = js.Dynamic.literal()
    if (availabilityZone != null) __obj.updateDynamic("availabilityZone")(availabilityZone.asInstanceOf[js.Any])
    if (instanceType != null) __obj.updateDynamic("instanceType")(instanceType.asInstanceOf[js.Any])
    if (maxPrice != null) __obj.updateDynamic("maxPrice")(maxPrice.asInstanceOf[js.Any])
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (subnetId != null) __obj.updateDynamic("subnetId")(subnetId.asInstanceOf[js.Any])
    if (weightedCapacity != null) __obj.updateDynamic("weightedCapacity")(weightedCapacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[FleetLaunchTemplateConfigOverride]
  }
}

