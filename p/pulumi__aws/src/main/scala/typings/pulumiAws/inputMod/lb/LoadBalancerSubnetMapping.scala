package typings.pulumiAws.inputMod.lb

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoadBalancerSubnetMapping extends js.Object {
  /**
    * The allocation ID of the Elastic IP address.
    */
  var allocationId: js.UndefOr[Input[String]] = js.native
  /**
    * The id of the subnet of which to attach to the load balancer. You can specify only one subnet per Availability Zone.
    */
  var subnetId: Input[String] = js.native
}

object LoadBalancerSubnetMapping {
  @scala.inline
  def apply(subnetId: Input[String], allocationId: Input[String] = null): LoadBalancerSubnetMapping = {
    val __obj = js.Dynamic.literal(subnetId = subnetId.asInstanceOf[js.Any])
    if (allocationId != null) __obj.updateDynamic("allocationId")(allocationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadBalancerSubnetMapping]
  }
}

