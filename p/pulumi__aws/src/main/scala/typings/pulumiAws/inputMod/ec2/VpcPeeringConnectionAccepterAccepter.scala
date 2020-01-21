package typings.pulumiAws.inputMod.ec2

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VpcPeeringConnectionAccepterAccepter extends js.Object {
  /**
    * Indicates whether a local ClassicLink connection can communicate
    * with the peer VPC over the VPC Peering Connection.
    */
  var allowClassicLinkToRemoteVpc: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Indicates whether a local VPC can resolve public DNS hostnames to
    * private IP addresses when queried from instances in a peer VPC.
    */
  var allowRemoteVpcDnsResolution: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Indicates whether a local VPC can communicate with a ClassicLink
    * connection in the peer VPC over the VPC Peering Connection.
    */
  var allowVpcToRemoteClassicLink: js.UndefOr[Input[Boolean]] = js.native
}

object VpcPeeringConnectionAccepterAccepter {
  @scala.inline
  def apply(
    allowClassicLinkToRemoteVpc: Input[Boolean] = null,
    allowRemoteVpcDnsResolution: Input[Boolean] = null,
    allowVpcToRemoteClassicLink: Input[Boolean] = null
  ): VpcPeeringConnectionAccepterAccepter = {
    val __obj = js.Dynamic.literal()
    if (allowClassicLinkToRemoteVpc != null) __obj.updateDynamic("allowClassicLinkToRemoteVpc")(allowClassicLinkToRemoteVpc.asInstanceOf[js.Any])
    if (allowRemoteVpcDnsResolution != null) __obj.updateDynamic("allowRemoteVpcDnsResolution")(allowRemoteVpcDnsResolution.asInstanceOf[js.Any])
    if (allowVpcToRemoteClassicLink != null) __obj.updateDynamic("allowVpcToRemoteClassicLink")(allowVpcToRemoteClassicLink.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpcPeeringConnectionAccepterAccepter]
  }
}

