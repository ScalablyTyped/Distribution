package typings.pulumiAws.outputMod.lb

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
  def apply(subnetId: String): GetLoadBalancerSubnetMapping = {
    val __obj = js.Dynamic.literal(subnetId = subnetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLoadBalancerSubnetMapping]
  }
  @scala.inline
  implicit class GetLoadBalancerSubnetMappingOps[Self <: GetLoadBalancerSubnetMapping] (val x: Self) extends AnyVal {
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
    def setSubnetId(value: String): Self = this.set("subnetId", value.asInstanceOf[js.Any])
    @scala.inline
    def setAllocationId(value: String): Self = this.set("allocationId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllocationId: Self = this.set("allocationId", js.undefined)
  }
  
}

