package typings.atPulumiAws.typesOutputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FleetLaunchTemplateConfigOverride extends js.Object {
  /**
    * Availability Zone in which to launch the instances.
    */
  var availabilityZone: js.UndefOr[String] = js.native
  /**
    * Instance type.
    */
  var instanceType: js.UndefOr[String] = js.native
  /**
    * Maximum price per unit hour that you are willing to pay for a Spot Instance.
    */
  var maxPrice: js.UndefOr[String] = js.native
  /**
    * Priority for the launch template override. If `onDemandOptions` `allocationStrategy` is set to `prioritized`, EC2 Fleet uses priority to determine which launch template override to use first in fulfilling On-Demand capacity. The highest priority is launched first. The lower the number, the higher the priority. If no number is set, the launch template override has the lowest priority. Valid values are whole numbers starting at 0.
    */
  var priority: js.UndefOr[Double] = js.native
  /**
    * ID of the subnet in which to launch the instances.
    */
  var subnetId: js.UndefOr[String] = js.native
  /**
    * Number of units provided by the specified instance type.
    */
  var weightedCapacity: js.UndefOr[Double] = js.native
}

object FleetLaunchTemplateConfigOverride {
  @scala.inline
  def apply(
    availabilityZone: String = null,
    instanceType: String = null,
    maxPrice: String = null,
    priority: Int | Double = null,
    subnetId: String = null,
    weightedCapacity: Int | Double = null
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

