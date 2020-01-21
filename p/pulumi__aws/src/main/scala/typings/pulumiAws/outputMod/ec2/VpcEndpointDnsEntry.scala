package typings.pulumiAws.outputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VpcEndpointDnsEntry extends js.Object {
  /**
    * The DNS name.
    */
  var dnsName: String = js.native
  /**
    * The ID of the private hosted zone.
    */
  var hostedZoneId: String = js.native
}

object VpcEndpointDnsEntry {
  @scala.inline
  def apply(dnsName: String, hostedZoneId: String): VpcEndpointDnsEntry = {
    val __obj = js.Dynamic.literal(dnsName = dnsName.asInstanceOf[js.Any], hostedZoneId = hostedZoneId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VpcEndpointDnsEntry]
  }
}

