package typings.pulumiAws.inputMod.route53

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResolverEndpointIpAddress extends js.Object {
  
  /**
    * The IP address in the subnet that you want to use for DNS queries.
    */
  var ip: js.UndefOr[Input[String]] = js.native
  
  var ipId: js.UndefOr[Input[String]] = js.native
  
  /**
    * The ID of the subnet that contains the IP address.
    */
  var subnetId: Input[String] = js.native
}
object ResolverEndpointIpAddress {
  
  @scala.inline
  def apply(subnetId: Input[String]): ResolverEndpointIpAddress = {
    val __obj = js.Dynamic.literal(subnetId = subnetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolverEndpointIpAddress]
  }
  
  @scala.inline
  implicit class ResolverEndpointIpAddressOps[Self <: ResolverEndpointIpAddress] (val x: Self) extends AnyVal {
    
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
    def setIp(value: Input[String]): Self = this.set("ip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIp: Self = this.set("ip", js.undefined)
    
    @scala.inline
    def setIpId(value: Input[String]): Self = this.set("ipId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIpId: Self = this.set("ipId", js.undefined)
  }
}
