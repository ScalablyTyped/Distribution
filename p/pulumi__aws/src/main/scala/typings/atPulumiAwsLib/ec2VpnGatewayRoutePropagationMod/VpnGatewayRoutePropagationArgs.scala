package typings
package atPulumiAwsLib.ec2VpnGatewayRoutePropagationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VpnGatewayRoutePropagationArgs extends js.Object {
  /**
    * The id of the `aws_route_table` to propagate routes into.
    */
  val routeTableId: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * The id of the `aws_vpn_gateway` to propagate routes from.
    */
  val vpnGatewayId: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

