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
  @scala.inline
  implicit class VpcEndpointDnsEntryOps[Self <: VpcEndpointDnsEntry] (val x: Self) extends AnyVal {
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

