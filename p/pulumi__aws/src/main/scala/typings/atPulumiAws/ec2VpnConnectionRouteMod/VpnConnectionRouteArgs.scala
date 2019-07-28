package typings.atPulumiAws.ec2VpnConnectionRouteMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VpnConnectionRouteArgs extends js.Object {
  /**
    * The CIDR block associated with the local subnet of the customer network.
    */
  val destinationCidrBlock: Input[String]
  /**
    * The ID of the VPN connection.
    */
  val vpnConnectionId: Input[String]
}

object VpnConnectionRouteArgs {
  @scala.inline
  def apply(destinationCidrBlock: Input[String], vpnConnectionId: Input[String]): VpnConnectionRouteArgs = {
    val __obj = js.Dynamic.literal(destinationCidrBlock = destinationCidrBlock.asInstanceOf[js.Any], vpnConnectionId = vpnConnectionId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VpnConnectionRouteArgs]
  }
}

