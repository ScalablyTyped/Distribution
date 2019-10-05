package typings.atPulumiAws.typesOutputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VpcPeeringConnectionRequester extends js.Object {
  /**
    * Allow a local linked EC2-Classic instance to communicate
    * with instances in a peer VPC. This enables an outbound communication from the local ClassicLink connection
    * to the remote VPC.
    */
  var allowClassicLinkToRemoteVpc: js.UndefOr[Boolean] = js.undefined
  /**
    * Allow a local VPC to resolve public DNS hostnames to
    * private IP addresses when queried from instances in the peer VPC. This is
    * [not supported](https://docs.aws.amazon.com/vpc/latest/peering/modify-peering-connections.html) for
    * inter-region VPC peering.
    */
  var allowRemoteVpcDnsResolution: js.UndefOr[Boolean] = js.undefined
  /**
    * Allow a local VPC to communicate with a linked EC2-Classic
    * instance in a peer VPC. This enables an outbound communication from the local VPC to the remote ClassicLink
    * connection.
    */
  var allowVpcToRemoteClassicLink: js.UndefOr[Boolean] = js.undefined
}

object VpcPeeringConnectionRequester {
  @scala.inline
  def apply(
    allowClassicLinkToRemoteVpc: js.UndefOr[Boolean] = js.undefined,
    allowRemoteVpcDnsResolution: js.UndefOr[Boolean] = js.undefined,
    allowVpcToRemoteClassicLink: js.UndefOr[Boolean] = js.undefined
  ): VpcPeeringConnectionRequester = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowClassicLinkToRemoteVpc)) __obj.updateDynamic("allowClassicLinkToRemoteVpc")(allowClassicLinkToRemoteVpc)
    if (!js.isUndefined(allowRemoteVpcDnsResolution)) __obj.updateDynamic("allowRemoteVpcDnsResolution")(allowRemoteVpcDnsResolution)
    if (!js.isUndefined(allowVpcToRemoteClassicLink)) __obj.updateDynamic("allowVpcToRemoteClassicLink")(allowVpcToRemoteClassicLink)
    __obj.asInstanceOf[VpcPeeringConnectionRequester]
  }
}

