package typings.atPulumiAws.ec2VpnGatewayRoutePropagationMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VpnGatewayRoutePropagationState extends js.Object {
  /**
    * The id of the `aws.ec2.RouteTable` to propagate routes into.
    */
  val routeTableId: js.UndefOr[Input[String]] = js.undefined
  /**
    * The id of the `aws.ec2.VpnGateway` to propagate routes from.
    */
  val vpnGatewayId: js.UndefOr[Input[String]] = js.undefined
}

object VpnGatewayRoutePropagationState {
  @scala.inline
  def apply(routeTableId: Input[String] = null, vpnGatewayId: Input[String] = null): VpnGatewayRoutePropagationState = {
    val __obj = js.Dynamic.literal()
    if (routeTableId != null) __obj.updateDynamic("routeTableId")(routeTableId.asInstanceOf[js.Any])
    if (vpnGatewayId != null) __obj.updateDynamic("vpnGatewayId")(vpnGatewayId.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpnGatewayRoutePropagationState]
  }
}

