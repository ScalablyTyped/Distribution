package typings.pulumiAws.outputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VpcPeeringConnectionAccepter extends js.Object {
  /**
    * Allow a local linked EC2-Classic instance to communicate
    * with instances in a peer VPC. This enables an outbound communication from the local ClassicLink connection
    * to the remote VPC.
    */
  var allowClassicLinkToRemoteVpc: js.UndefOr[Boolean] = js.native
  /**
    * Allow a local VPC to resolve public DNS hostnames to
    * private IP addresses when queried from instances in the peer VPC. This is
    * [not supported](https://docs.aws.amazon.com/vpc/latest/peering/modify-peering-connections.html) for
    * inter-region VPC peering.
    */
  var allowRemoteVpcDnsResolution: js.UndefOr[Boolean] = js.native
  /**
    * Allow a local VPC to communicate with a linked EC2-Classic
    * instance in a peer VPC. This enables an outbound communication from the local VPC to the remote ClassicLink
    * connection.
    */
  var allowVpcToRemoteClassicLink: js.UndefOr[Boolean] = js.native
}

object VpcPeeringConnectionAccepter {
  @scala.inline
  def apply(): VpcPeeringConnectionAccepter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpcPeeringConnectionAccepter]
  }
  @scala.inline
  implicit class VpcPeeringConnectionAccepterOps[Self <: VpcPeeringConnectionAccepter] (val x: Self) extends AnyVal {
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

