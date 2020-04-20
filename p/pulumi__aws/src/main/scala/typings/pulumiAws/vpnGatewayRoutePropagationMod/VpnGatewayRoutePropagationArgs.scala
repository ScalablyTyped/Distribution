package typings.pulumiAws.vpnGatewayRoutePropagationMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VpnGatewayRoutePropagationArgs extends js.Object {
  /**
    * The id of the `aws.ec2.RouteTable` to propagate routes into.
    */
  val routeTableId: Input[String] = js.native
  /**
    * The id of the `aws.ec2.VpnGateway` to propagate routes from.
    */
  val vpnGatewayId: Input[String] = js.native
}

object VpnGatewayRoutePropagationArgs {
  @scala.inline
  def apply(routeTableId: Input[String], vpnGatewayId: Input[String]): VpnGatewayRoutePropagationArgs = {
    val __obj = js.Dynamic.literal(routeTableId = routeTableId.asInstanceOf[js.Any], vpnGatewayId = vpnGatewayId.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpnGatewayRoutePropagationArgs]
  }
}

