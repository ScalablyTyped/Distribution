package typings
package atPulumiAwsLib.ec2VpnConnectionRouteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VpnConnectionRouteState extends js.Object {
  /**
    * The CIDR block associated with the local subnet of the customer network.
    */
  val destinationCidrBlock: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The ID of the VPN connection.
    */
  val vpnConnectionId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object VpnConnectionRouteState {
  @scala.inline
  def apply(
    destinationCidrBlock: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    vpnConnectionId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): VpnConnectionRouteState = {
    val __obj = js.Dynamic.literal()
    if (destinationCidrBlock != null) __obj.updateDynamic("destinationCidrBlock")(destinationCidrBlock.asInstanceOf[js.Any])
    if (vpnConnectionId != null) __obj.updateDynamic("vpnConnectionId")(vpnConnectionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpnConnectionRouteState]
  }
}

