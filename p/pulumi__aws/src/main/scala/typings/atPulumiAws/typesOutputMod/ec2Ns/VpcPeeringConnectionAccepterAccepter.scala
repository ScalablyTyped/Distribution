package typings.atPulumiAws.typesOutputMod.ec2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VpcPeeringConnectionAccepterAccepter extends js.Object {
  /**
    * Indicates whether a local ClassicLink connection can communicate
    * with the peer VPC over the VPC Peering Connection.
    */
  var allowClassicLinkToRemoteVpc: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates whether a local VPC can resolve public DNS hostnames to
    * private IP addresses when queried from instances in a peer VPC.
    */
  var allowRemoteVpcDnsResolution: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates whether a local VPC can communicate with a ClassicLink
    * connection in the peer VPC over the VPC Peering Connection.
    */
  var allowVpcToRemoteClassicLink: js.UndefOr[Boolean] = js.undefined
}

object VpcPeeringConnectionAccepterAccepter {
  @scala.inline
  def apply(
    allowClassicLinkToRemoteVpc: js.UndefOr[Boolean] = js.undefined,
    allowRemoteVpcDnsResolution: js.UndefOr[Boolean] = js.undefined,
    allowVpcToRemoteClassicLink: js.UndefOr[Boolean] = js.undefined
  ): VpcPeeringConnectionAccepterAccepter = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowClassicLinkToRemoteVpc)) __obj.updateDynamic("allowClassicLinkToRemoteVpc")(allowClassicLinkToRemoteVpc)
    if (!js.isUndefined(allowRemoteVpcDnsResolution)) __obj.updateDynamic("allowRemoteVpcDnsResolution")(allowRemoteVpcDnsResolution)
    if (!js.isUndefined(allowVpcToRemoteClassicLink)) __obj.updateDynamic("allowVpcToRemoteClassicLink")(allowVpcToRemoteClassicLink)
    __obj.asInstanceOf[VpcPeeringConnectionAccepterAccepter]
  }
}

