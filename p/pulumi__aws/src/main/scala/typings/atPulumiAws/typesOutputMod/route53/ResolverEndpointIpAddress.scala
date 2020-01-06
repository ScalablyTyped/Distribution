package typings.atPulumiAws.typesOutputMod.route53

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
}

