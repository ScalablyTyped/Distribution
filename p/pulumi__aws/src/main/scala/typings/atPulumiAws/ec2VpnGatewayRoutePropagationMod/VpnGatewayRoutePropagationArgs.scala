package typings.atPulumiAws.ec2VpnGatewayRoutePropagationMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VpnGatewayRoutePropagationArgs extends js.Object {
  /**
    * The id of the `aws_route_table` to propagate routes into.
    */
  val routeTableId: Input[String]
  /**
    * The id of the `aws_vpn_gateway` to propagate routes from.
    */
  val vpnGatewayId: Input[String]
}

object VpnGatewayRoutePropagationArgs {
  @scala.inline
  def apply(routeTableId: Input[String], vpnGatewayId: Input[String]): VpnGatewayRoutePropagationArgs = {
    val __obj = js.Dynamic.literal(routeTableId = routeTableId.asInstanceOf[js.Any], vpnGatewayId = vpnGatewayId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VpnGatewayRoutePropagationArgs]
  }
}

