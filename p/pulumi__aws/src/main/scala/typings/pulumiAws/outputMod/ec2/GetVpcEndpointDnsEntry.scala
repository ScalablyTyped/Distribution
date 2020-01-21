package typings.pulumiAws.outputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetVpcEndpointDnsEntry extends js.Object {
  /**
    * The DNS name.
    */
  var dnsName: String = js.native
  /**
    * The ID of the private hosted zone.
    */
  var hostedZoneId: String = js.native
}

object GetVpcEndpointDnsEntry {
  @scala.inline
  def apply(dnsName: String, hostedZoneId: String): GetVpcEndpointDnsEntry = {
    val __obj = js.Dynamic.literal(dnsName = dnsName.asInstanceOf[js.Any], hostedZoneId = hostedZoneId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetVpcEndpointDnsEntry]
  }
}

