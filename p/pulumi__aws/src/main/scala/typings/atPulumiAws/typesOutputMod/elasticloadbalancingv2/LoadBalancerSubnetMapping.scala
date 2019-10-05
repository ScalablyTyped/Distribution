package typings.atPulumiAws.typesOutputMod.elasticloadbalancingv2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadBalancerSubnetMapping extends js.Object {
  /**
    * The allocation ID of the Elastic IP address.
    */
  var allocationId: js.UndefOr[String] = js.undefined
  /**
    * The id of the subnet of which to attach to the load balancer. You can specify only one subnet per Availability Zone.
    */
  var subnetId: String
}

object LoadBalancerSubnetMapping {
  @scala.inline
  def apply(subnetId: String, allocationId: String = null): LoadBalancerSubnetMapping = {
    val __obj = js.Dynamic.literal(subnetId = subnetId)
    if (allocationId != null) __obj.updateDynamic("allocationId")(allocationId)
    __obj.asInstanceOf[LoadBalancerSubnetMapping]
  }
}

