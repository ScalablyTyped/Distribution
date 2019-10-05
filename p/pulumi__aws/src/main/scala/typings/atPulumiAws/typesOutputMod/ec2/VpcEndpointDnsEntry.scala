package typings.atPulumiAws.typesOutputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VpcEndpointDnsEntry extends js.Object {
  /**
    * The DNS name.
    */
  var dnsName: String
  /**
    * The ID of the private hosted zone.
    */
  var hostedZoneId: String
}

object VpcEndpointDnsEntry {
  @scala.inline
  def apply(dnsName: String, hostedZoneId: String): VpcEndpointDnsEntry = {
    val __obj = js.Dynamic.literal(dnsName = dnsName, hostedZoneId = hostedZoneId)
  
    __obj.asInstanceOf[VpcEndpointDnsEntry]
  }
}

