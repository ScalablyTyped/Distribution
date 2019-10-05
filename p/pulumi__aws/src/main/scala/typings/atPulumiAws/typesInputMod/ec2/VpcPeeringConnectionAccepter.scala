package typings.atPulumiAws.typesInputMod.ec2

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VpcPeeringConnectionAccepter extends js.Object {
  /**
    * Allow a local linked EC2-Classic instance to communicate
    * with instances in a peer VPC. This enables an outbound communication from the local ClassicLink connection
    * to the remote VPC.
    */
  var allowClassicLinkToRemoteVpc: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * Allow a local VPC to resolve public DNS hostnames to
    * private IP addresses when queried from instances in the peer VPC. This is
    * [not supported](https://docs.aws.amazon.com/vpc/latest/peering/modify-peering-connections.html) for
    * inter-region VPC peering.
    */
  var allowRemoteVpcDnsResolution: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * Allow a local VPC to communicate with a linked EC2-Classic
    * instance in a peer VPC. This enables an outbound communication from the local VPC to the remote ClassicLink
    * connection.
    */
  var allowVpcToRemoteClassicLink: js.UndefOr[Input[Boolean]] = js.undefined
}

object VpcPeeringConnectionAccepter {
  @scala.inline
  def apply(
    allowClassicLinkToRemoteVpc: Input[Boolean] = null,
    allowRemoteVpcDnsResolution: Input[Boolean] = null,
    allowVpcToRemoteClassicLink: Input[Boolean] = null
  ): VpcPeeringConnectionAccepter = {
    val __obj = js.Dynamic.literal()
    if (allowClassicLinkToRemoteVpc != null) __obj.updateDynamic("allowClassicLinkToRemoteVpc")(allowClassicLinkToRemoteVpc.asInstanceOf[js.Any])
    if (allowRemoteVpcDnsResolution != null) __obj.updateDynamic("allowRemoteVpcDnsResolution")(allowRemoteVpcDnsResolution.asInstanceOf[js.Any])
    if (allowVpcToRemoteClassicLink != null) __obj.updateDynamic("allowVpcToRemoteClassicLink")(allowVpcToRemoteClassicLink.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpcPeeringConnectionAccepter]
  }
}

