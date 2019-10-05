package typings.atPulumiAws.typesOutputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultRouteTableRoute extends js.Object {
  /**
    * The CIDR block of the route.
    */
  var cidrBlock: js.UndefOr[String] = js.undefined
  /**
    * Identifier of a VPC Egress Only Internet Gateway.
    */
  var egressOnlyGatewayId: js.UndefOr[String] = js.undefined
  /**
    * Identifier of a VPC internet gateway or a virtual private gateway.
    */
  var gatewayId: js.UndefOr[String] = js.undefined
  /**
    * Identifier of an EC2 instance.
    */
  var instanceId: js.UndefOr[String] = js.undefined
  /**
    * The Ipv6 CIDR block of the route
    */
  var ipv6CidrBlock: js.UndefOr[String] = js.undefined
  /**
    * Identifier of a VPC NAT gateway.
    */
  var natGatewayId: js.UndefOr[String] = js.undefined
  /**
    * Identifier of an EC2 network interface.
    */
  var networkInterfaceId: js.UndefOr[String] = js.undefined
  /**
    * Identifier of an EC2 Transit Gateway.
    */
  var transitGatewayId: js.UndefOr[String] = js.undefined
  /**
    * Identifier of a VPC peering connection.
    */
  var vpcPeeringConnectionId: js.UndefOr[String] = js.undefined
}

object DefaultRouteTableRoute {
  @scala.inline
  def apply(
    cidrBlock: String = null,
    egressOnlyGatewayId: String = null,
    gatewayId: String = null,
    instanceId: String = null,
    ipv6CidrBlock: String = null,
    natGatewayId: String = null,
    networkInterfaceId: String = null,
    transitGatewayId: String = null,
    vpcPeeringConnectionId: String = null
  ): DefaultRouteTableRoute = {
    val __obj = js.Dynamic.literal()
    if (cidrBlock != null) __obj.updateDynamic("cidrBlock")(cidrBlock)
    if (egressOnlyGatewayId != null) __obj.updateDynamic("egressOnlyGatewayId")(egressOnlyGatewayId)
    if (gatewayId != null) __obj.updateDynamic("gatewayId")(gatewayId)
    if (instanceId != null) __obj.updateDynamic("instanceId")(instanceId)
    if (ipv6CidrBlock != null) __obj.updateDynamic("ipv6CidrBlock")(ipv6CidrBlock)
    if (natGatewayId != null) __obj.updateDynamic("natGatewayId")(natGatewayId)
    if (networkInterfaceId != null) __obj.updateDynamic("networkInterfaceId")(networkInterfaceId)
    if (transitGatewayId != null) __obj.updateDynamic("transitGatewayId")(transitGatewayId)
    if (vpcPeeringConnectionId != null) __obj.updateDynamic("vpcPeeringConnectionId")(vpcPeeringConnectionId)
    __obj.asInstanceOf[DefaultRouteTableRoute]
  }
}

