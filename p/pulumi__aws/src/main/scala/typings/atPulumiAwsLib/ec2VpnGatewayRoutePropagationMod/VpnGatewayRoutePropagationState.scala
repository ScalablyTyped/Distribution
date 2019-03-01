package typings
package atPulumiAwsLib.ec2VpnGatewayRoutePropagationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VpnGatewayRoutePropagationState extends js.Object {
  /**
    * The id of the `aws_route_table` to propagate routes into.
    */
  val routeTableId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The id of the `aws_vpn_gateway` to propagate routes from.
    */
  val vpnGatewayId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object VpnGatewayRoutePropagationState {
  @scala.inline
  def apply(
    routeTableId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    vpnGatewayId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): VpnGatewayRoutePropagationState = {
    val __obj = js.Dynamic.literal()
    if (routeTableId != null) __obj.updateDynamic("routeTableId")(routeTableId.asInstanceOf[js.Any])
    if (vpnGatewayId != null) __obj.updateDynamic("vpnGatewayId")(vpnGatewayId.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpnGatewayRoutePropagationState]
  }
}

