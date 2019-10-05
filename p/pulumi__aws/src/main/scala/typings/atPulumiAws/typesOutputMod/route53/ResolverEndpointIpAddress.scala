package typings.atPulumiAws.typesOutputMod.route53

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolverEndpointIpAddress extends js.Object {
  /**
    * The IP address in the subnet that you want to use for DNS queries.
    */
  var ip: String
  var ipId: String
  /**
    * The ID of the subnet that contains the IP address.
    */
  var subnetId: String
}

object ResolverEndpointIpAddress {
  @scala.inline
  def apply(ip: String, ipId: String, subnetId: String): ResolverEndpointIpAddress = {
    val __obj = js.Dynamic.literal(ip = ip, ipId = ipId, subnetId = subnetId)
  
    __obj.asInstanceOf[ResolverEndpointIpAddress]
  }
}

