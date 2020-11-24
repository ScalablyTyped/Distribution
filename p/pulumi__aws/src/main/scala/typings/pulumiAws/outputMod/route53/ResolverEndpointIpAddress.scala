package typings.pulumiAws.outputMod.route53

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResolverEndpointIpAddress extends js.Object {
  
  /**
    * The IP address in the subnet that you want to use for DNS queries.
    */
  var ip: String = js.native
  
  var ipId: String = js.native
  
  /**
    * The ID of the subnet that contains the IP address.
    */
  var subnetId: String = js.native
}
object ResolverEndpointIpAddress {
  
  @scala.inline
  def apply(ip: String, ipId: String, subnetId: String): ResolverEndpointIpAddress = {
    val __obj = js.Dynamic.literal(ip = ip.asInstanceOf[js.Any], ipId = ipId.asInstanceOf[js.Any], subnetId = subnetId.asInstanceOf[js.Any])
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
    def setIp(value: String): Self = this.set("ip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpId(value: String): Self = this.set("ipId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetId(value: String): Self = this.set("subnetId", value.asInstanceOf[js.Any])
  }
}
