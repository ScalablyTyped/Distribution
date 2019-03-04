package typings
package atPulumiAwsLib.ec2GetRouteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetRouteArgs extends js.Object {
  /**
    * The CIDR block of the Route belonging to the Route Table.
    */
  val destinationCidrBlock: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The IPv6 CIDR block of the Route belonging to the Route Table.
    */
  val destinationIpv6CidrBlock: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The Egress Only Gateway ID of the Route belonging to the Route Table.
    */
  val egressOnlyGatewayId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The Gateway ID of the Route belonging to the Route Table.
    */
  val gatewayId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The Instance ID of the Route belonging to the Route Table.
    */
  val instanceId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The NAT Gateway ID of the Route belonging to the Route Table.
    */
  val natGatewayId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The Network Interface ID of the Route belonging to the Route Table.
    */
  val networkInterfaceId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The id of the specific Route Table containing the Route entry.
    */
  val routeTableId: java.lang.String
  /**
    * The EC2 Transit Gateway ID of the Route belonging to the Route Table.
    */
  val transitGatewayId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The VPC Peering Connection ID of the Route belonging to the Route Table.
    */
  val vpcPeeringConnectionId: js.UndefOr[java.lang.String] = js.undefined
}

object GetRouteArgs {
  @scala.inline
  def apply(
    routeTableId: java.lang.String,
    destinationCidrBlock: java.lang.String = null,
    destinationIpv6CidrBlock: java.lang.String = null,
    egressOnlyGatewayId: java.lang.String = null,
    gatewayId: java.lang.String = null,
    instanceId: java.lang.String = null,
    natGatewayId: java.lang.String = null,
    networkInterfaceId: java.lang.String = null,
    transitGatewayId: java.lang.String = null,
    vpcPeeringConnectionId: java.lang.String = null
  ): GetRouteArgs = {
    val __obj = js.Dynamic.literal(routeTableId = routeTableId)
    if (destinationCidrBlock != null) __obj.updateDynamic("destinationCidrBlock")(destinationCidrBlock)
    if (destinationIpv6CidrBlock != null) __obj.updateDynamic("destinationIpv6CidrBlock")(destinationIpv6CidrBlock)
    if (egressOnlyGatewayId != null) __obj.updateDynamic("egressOnlyGatewayId")(egressOnlyGatewayId)
    if (gatewayId != null) __obj.updateDynamic("gatewayId")(gatewayId)
    if (instanceId != null) __obj.updateDynamic("instanceId")(instanceId)
    if (natGatewayId != null) __obj.updateDynamic("natGatewayId")(natGatewayId)
    if (networkInterfaceId != null) __obj.updateDynamic("networkInterfaceId")(networkInterfaceId)
    if (transitGatewayId != null) __obj.updateDynamic("transitGatewayId")(transitGatewayId)
    if (vpcPeeringConnectionId != null) __obj.updateDynamic("vpcPeeringConnectionId")(vpcPeeringConnectionId)
    __obj.asInstanceOf[GetRouteArgs]
  }
}

