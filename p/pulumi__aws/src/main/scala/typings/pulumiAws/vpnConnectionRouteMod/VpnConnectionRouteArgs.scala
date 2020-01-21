package typings.pulumiAws.vpnConnectionRouteMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VpnConnectionRouteArgs extends js.Object {
  /**
    * The CIDR block associated with the local subnet of the customer network.
    */
  val destinationCidrBlock: Input[String] = js.native
  /**
    * The ID of the VPN connection.
    */
  val vpnConnectionId: Input[String] = js.native
}

object VpnConnectionRouteArgs {
  @scala.inline
  def apply(destinationCidrBlock: Input[String], vpnConnectionId: Input[String]): VpnConnectionRouteArgs = {
    val __obj = js.Dynamic.literal(destinationCidrBlock = destinationCidrBlock.asInstanceOf[js.Any], vpnConnectionId = vpnConnectionId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VpnConnectionRouteArgs]
  }
}

