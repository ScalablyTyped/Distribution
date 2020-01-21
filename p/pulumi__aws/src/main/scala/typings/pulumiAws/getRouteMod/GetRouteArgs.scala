package typings.pulumiAws.getRouteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRouteArgs extends js.Object {
  /**
    * The CIDR block of the Route belonging to the Route Table.
    */
  val destinationCidrBlock: js.UndefOr[String] = js.native
  /**
    * The IPv6 CIDR block of the Route belonging to the Route Table.
    */
  val destinationIpv6CidrBlock: js.UndefOr[String] = js.native
  /**
    * The Egress Only Gateway ID of the Route belonging to the Route Table.
    */
  val egressOnlyGatewayId: js.UndefOr[String] = js.native
  /**
    * The Gateway ID of the Route belonging to the Route Table.
    */
  val gatewayId: js.UndefOr[String] = js.native
  /**
    * The Instance ID of the Route belonging to the Route Table.
    */
  val instanceId: js.UndefOr[String] = js.native
  /**
    * The NAT Gateway ID of the Route belonging to the Route Table.
    */
  val natGatewayId: js.UndefOr[String] = js.native
  /**
    * The Network Interface ID of the Route belonging to the Route Table.
    */
  val networkInterfaceId: js.UndefOr[String] = js.native
  /**
    * The id of the specific Route Table containing the Route entry.
    */
  val routeTableId: String = js.native
  /**
    * The EC2 Transit Gateway ID of the Route belonging to the Route Table.
    */
  val transitGatewayId: js.UndefOr[String] = js.native
  /**
    * The VPC Peering Connection ID of the Route belonging to the Route Table.
    */
  val vpcPeeringConnectionId: js.UndefOr[String] = js.native
}

object GetRouteArgs {
  @scala.inline
  def apply(
    routeTableId: String,
    destinationCidrBlock: String = null,
    destinationIpv6CidrBlock: String = null,
    egressOnlyGatewayId: String = null,
    gatewayId: String = null,
    instanceId: String = null,
    natGatewayId: String = null,
    networkInterfaceId: String = null,
    transitGatewayId: String = null,
    vpcPeeringConnectionId: String = null
  ): GetRouteArgs = {
    val __obj = js.Dynamic.literal(routeTableId = routeTableId.asInstanceOf[js.Any])
    if (destinationCidrBlock != null) __obj.updateDynamic("destinationCidrBlock")(destinationCidrBlock.asInstanceOf[js.Any])
    if (destinationIpv6CidrBlock != null) __obj.updateDynamic("destinationIpv6CidrBlock")(destinationIpv6CidrBlock.asInstanceOf[js.Any])
    if (egressOnlyGatewayId != null) __obj.updateDynamic("egressOnlyGatewayId")(egressOnlyGatewayId.asInstanceOf[js.Any])
    if (gatewayId != null) __obj.updateDynamic("gatewayId")(gatewayId.asInstanceOf[js.Any])
    if (instanceId != null) __obj.updateDynamic("instanceId")(instanceId.asInstanceOf[js.Any])
    if (natGatewayId != null) __obj.updateDynamic("natGatewayId")(natGatewayId.asInstanceOf[js.Any])
    if (networkInterfaceId != null) __obj.updateDynamic("networkInterfaceId")(networkInterfaceId.asInstanceOf[js.Any])
    if (transitGatewayId != null) __obj.updateDynamic("transitGatewayId")(transitGatewayId.asInstanceOf[js.Any])
    if (vpcPeeringConnectionId != null) __obj.updateDynamic("vpcPeeringConnectionId")(vpcPeeringConnectionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRouteArgs]
  }
}

