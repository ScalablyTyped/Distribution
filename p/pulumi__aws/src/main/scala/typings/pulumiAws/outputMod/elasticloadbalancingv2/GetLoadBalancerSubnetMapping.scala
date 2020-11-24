package typings.pulumiAws.outputMod.elasticloadbalancingv2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetLoadBalancerSubnetMapping extends js.Object {
  
  var allocationId: String = js.native
  
  var outpostId: String = js.native
  
  var privateIpv4Address: String = js.native
  
  var subnetId: String = js.native
}
object GetLoadBalancerSubnetMapping {
  
  @scala.inline
  def apply(allocationId: String, outpostId: String, privateIpv4Address: String, subnetId: String): GetLoadBalancerSubnetMapping = {
    val __obj = js.Dynamic.literal(allocationId = allocationId.asInstanceOf[js.Any], outpostId = outpostId.asInstanceOf[js.Any], privateIpv4Address = privateIpv4Address.asInstanceOf[js.Any], subnetId = subnetId.asInstanceOf[js.Any])
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
    def setAllocationId(value: String): Self = this.set("allocationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutpostId(value: String): Self = this.set("outpostId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateIpv4Address(value: String): Self = this.set("privateIpv4Address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetId(value: String): Self = this.set("subnetId", value.asInstanceOf[js.Any])
  }
}
