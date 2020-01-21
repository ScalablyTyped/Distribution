package typings.pulumiAws.outputMod.alb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetLoadBalancerSubnetMapping extends js.Object {
  var allocationId: js.UndefOr[String] = js.native
  var subnetId: String = js.native
}

object GetLoadBalancerSubnetMapping {
  @scala.inline
  def apply(subnetId: String, allocationId: String = null): GetLoadBalancerSubnetMapping = {
    val __obj = js.Dynamic.literal(subnetId = subnetId.asInstanceOf[js.Any])
    if (allocationId != null) __obj.updateDynamic("allocationId")(allocationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLoadBalancerSubnetMapping]
  }
}

