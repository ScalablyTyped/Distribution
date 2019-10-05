package typings.atPulumiAws.typesOutputMod.applicationloadbalancing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetLoadBalancerSubnetMapping extends js.Object {
  var allocationId: js.UndefOr[String] = js.undefined
  var subnetId: String
}

object GetLoadBalancerSubnetMapping {
  @scala.inline
  def apply(subnetId: String, allocationId: String = null): GetLoadBalancerSubnetMapping = {
    val __obj = js.Dynamic.literal(subnetId = subnetId)
    if (allocationId != null) __obj.updateDynamic("allocationId")(allocationId)
    __obj.asInstanceOf[GetLoadBalancerSubnetMapping]
  }
}

