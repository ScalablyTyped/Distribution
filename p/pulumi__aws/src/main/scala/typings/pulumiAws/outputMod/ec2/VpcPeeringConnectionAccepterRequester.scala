package typings.pulumiAws.outputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VpcPeeringConnectionAccepterRequester extends js.Object {
  /**
    * Indicates whether a local ClassicLink connection can communicate
    * with the peer VPC over the VPC Peering Connection.
    */
  var allowClassicLinkToRemoteVpc: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether a local VPC can resolve public DNS hostnames to
    * private IP addresses when queried from instances in a peer VPC.
    */
  var allowRemoteVpcDnsResolution: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether a local VPC can communicate with a ClassicLink
    * connection in the peer VPC over the VPC Peering Connection.
    */
  var allowVpcToRemoteClassicLink: js.UndefOr[Boolean] = js.native
}

object VpcPeeringConnectionAccepterRequester {
  @scala.inline
  def apply(): VpcPeeringConnectionAccepterRequester = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpcPeeringConnectionAccepterRequester]
  }
  @scala.inline
  implicit class VpcPeeringConnectionAccepterRequesterOps[Self <: VpcPeeringConnectionAccepterRequester] (val x: Self) extends AnyVal {
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
    def setAllowClassicLinkToRemoteVpc(value: Boolean): Self = this.set("allowClassicLinkToRemoteVpc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowClassicLinkToRemoteVpc: Self = this.set("allowClassicLinkToRemoteVpc", js.undefined)
    @scala.inline
    def setAllowRemoteVpcDnsResolution(value: Boolean): Self = this.set("allowRemoteVpcDnsResolution", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowRemoteVpcDnsResolution: Self = this.set("allowRemoteVpcDnsResolution", js.undefined)
    @scala.inline
    def setAllowVpcToRemoteClassicLink(value: Boolean): Self = this.set("allowVpcToRemoteClassicLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowVpcToRemoteClassicLink: Self = this.set("allowVpcToRemoteClassicLink", js.undefined)
  }
  
}

