package typings.atPulumiAws.typesOutputMod.ec2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PeeringConnectionOptionsRequester extends js.Object {
  /**
    * Allow a local linked EC2-Classic instance to communicate
    * with instances in a peer VPC. This enables an outbound communication from the local ClassicLink connection
    * to the remote VPC. This option is not supported for inter-region VPC peering.
    */
  var allowClassicLinkToRemoteVpc: js.UndefOr[Boolean] = js.undefined
  /**
    * Allow a local VPC to resolve public DNS hostnames to
    * private IP addresses when queried from instances in the peer VPC.
    */
  var allowRemoteVpcDnsResolution: js.UndefOr[Boolean] = js.undefined
  /**
    * Allow a local VPC to communicate with a linked EC2-Classic
    * instance in a peer VPC. This enables an outbound communication from the local VPC to the remote ClassicLink
    * connection. This option is not supported for inter-region VPC peering.
    */
  var allowVpcToRemoteClassicLink: js.UndefOr[Boolean] = js.undefined
}

object PeeringConnectionOptionsRequester {
  @scala.inline
  def apply(
    allowClassicLinkToRemoteVpc: js.UndefOr[Boolean] = js.undefined,
    allowRemoteVpcDnsResolution: js.UndefOr[Boolean] = js.undefined,
    allowVpcToRemoteClassicLink: js.UndefOr[Boolean] = js.undefined
  ): PeeringConnectionOptionsRequester = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowClassicLinkToRemoteVpc)) __obj.updateDynamic("allowClassicLinkToRemoteVpc")(allowClassicLinkToRemoteVpc)
    if (!js.isUndefined(allowRemoteVpcDnsResolution)) __obj.updateDynamic("allowRemoteVpcDnsResolution")(allowRemoteVpcDnsResolution)
    if (!js.isUndefined(allowVpcToRemoteClassicLink)) __obj.updateDynamic("allowVpcToRemoteClassicLink")(allowVpcToRemoteClassicLink)
    __obj.asInstanceOf[PeeringConnectionOptionsRequester]
  }
}

