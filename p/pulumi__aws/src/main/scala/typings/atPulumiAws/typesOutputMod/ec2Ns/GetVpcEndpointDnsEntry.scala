package typings.atPulumiAws.typesOutputMod.ec2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetVpcEndpointDnsEntry extends js.Object {
  /**
    * The DNS name.
    */
  var dnsName: String
  /**
    * The ID of the private hosted zone.
    */
  var hostedZoneId: String
}

object GetVpcEndpointDnsEntry {
  @scala.inline
  def apply(dnsName: String, hostedZoneId: String): GetVpcEndpointDnsEntry = {
    val __obj = js.Dynamic.literal(dnsName = dnsName, hostedZoneId = hostedZoneId)
  
    __obj.asInstanceOf[GetVpcEndpointDnsEntry]
  }
}

