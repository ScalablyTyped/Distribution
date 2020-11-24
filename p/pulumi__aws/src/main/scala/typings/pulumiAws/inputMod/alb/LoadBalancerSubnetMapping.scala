package typings.pulumiAws.inputMod.alb

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoadBalancerSubnetMapping extends js.Object {
  
  /**
    * The allocation ID of the Elastic IP address.
    */
  var allocationId: js.UndefOr[Input[String]] = js.native
  
  var outpostId: js.UndefOr[Input[String]] = js.native
  
  /**
    * A private ipv4 address within the subnet to assign to the internal-facing load balancer.
    */
  var privateIpv4Address: js.UndefOr[Input[String]] = js.native
  
  /**
    * The id of the subnet of which to attach to the load balancer. You can specify only one subnet per Availability Zone.
    */
  var subnetId: Input[String] = js.native
}
object LoadBalancerSubnetMapping {
  
  @scala.inline
  def apply(subnetId: Input[String]): LoadBalancerSubnetMapping = {
    val __obj = js.Dynamic.literal(subnetId = subnetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadBalancerSubnetMapping]
  }
  
  @scala.inline
  implicit class LoadBalancerSubnetMappingOps[Self <: LoadBalancerSubnetMapping] (val x: Self) extends AnyVal {
    
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
    def setSubnetId(value: Input[String]): Self = this.set("subnetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllocationId(value: Input[String]): Self = this.set("allocationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllocationId: Self = this.set("allocationId", js.undefined)
    
    @scala.inline
    def setOutpostId(value: Input[String]): Self = this.set("outpostId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutpostId: Self = this.set("outpostId", js.undefined)
    
    @scala.inline
    def setPrivateIpv4Address(value: Input[String]): Self = this.set("privateIpv4Address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivateIpv4Address: Self = this.set("privateIpv4Address", js.undefined)
  }
}
