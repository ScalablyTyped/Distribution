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
  @scala.inline
  implicit class GetVpcEndpointDnsEntryOps[Self <: GetVpcEndpointDnsEntry] (val x: Self) extends AnyVal {
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
    def setDnsName(value: String): Self = this.set("dnsName", value.asInstanceOf[js.Any])
    @scala.inline
    def setHostedZoneId(value: String): Self = this.set("hostedZoneId", value.asInstanceOf[js.Any])
  }
  
}

