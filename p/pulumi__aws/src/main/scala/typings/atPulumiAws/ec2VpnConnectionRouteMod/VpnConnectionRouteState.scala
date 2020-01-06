package typings.atPulumiAws.ec2VpnConnectionRouteMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VpnConnectionRouteState extends js.Object {
  /**
    * The CIDR block associated with the local subnet of the customer network.
    */
  val destinationCidrBlock: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of the VPN connection.
    */
  val vpnConnectionId: js.UndefOr[Input[String]] = js.native
}

object VpnConnectionRouteState {
  @scala.inline
  def apply(destinationCidrBlock: Input[String] = null, vpnConnectionId: Input[String] = null): VpnConnectionRouteState = {
    val __obj = js.Dynamic.literal()
    if (destinationCidrBlock != null) __obj.updateDynamic("destinationCidrBlock")(destinationCidrBlock.asInstanceOf[js.Any])
    if (vpnConnectionId != null) __obj.updateDynamic("vpnConnectionId")(vpnConnectionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpnConnectionRouteState]
  }
}

