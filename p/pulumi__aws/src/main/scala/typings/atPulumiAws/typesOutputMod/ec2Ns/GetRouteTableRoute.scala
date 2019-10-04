package typings.atPulumiAws.typesOutputMod.ec2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetRouteTableRoute extends js.Object {
  /**
    * The CIDR block of the route.
    */
  var cidrBlock: String
  /**
    * The ID of the Egress Only Internet Gateway.
    */
  var egressOnlyGatewayId: String
  /**
    * The Internet Gateway ID.
    */
  var gatewayId: String
  /**
    * The EC2 instance ID.
    */
  var instanceId: String
  /**
    * The IPv6 CIDR block of the route.
    */
  var ipv6CidrBlock: String
  /**
    * The NAT Gateway ID.
    */
  var natGatewayId: String
  /**
    * The ID of the elastic network interface (eni) to use.
    */
  var networkInterfaceId: String
  /**
    * The EC2 Transit Gateway ID.
    */
  var transitGatewayId: String
  /**
    * The VPC Peering ID.
    */
  var vpcPeeringConnectionId: String
}

object GetRouteTableRoute {
  @scala.inline
  def apply(
    cidrBlock: String,
    egressOnlyGatewayId: String,
    gatewayId: String,
    instanceId: String,
    ipv6CidrBlock: String,
    natGatewayId: String,
    networkInterfaceId: String,
    transitGatewayId: String,
    vpcPeeringConnectionId: String
  ): GetRouteTableRoute = {
    val __obj = js.Dynamic.literal(cidrBlock = cidrBlock, egressOnlyGatewayId = egressOnlyGatewayId, gatewayId = gatewayId, instanceId = instanceId, ipv6CidrBlock = ipv6CidrBlock, natGatewayId = natGatewayId, networkInterfaceId = networkInterfaceId, transitGatewayId = transitGatewayId, vpcPeeringConnectionId = vpcPeeringConnectionId)
  
    __obj.asInstanceOf[GetRouteTableRoute]
  }
}

