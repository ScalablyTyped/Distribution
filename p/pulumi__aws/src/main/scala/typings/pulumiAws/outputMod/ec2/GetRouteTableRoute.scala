package typings.pulumiAws.outputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRouteTableRoute extends js.Object {
  /**
    * The CIDR block of the route.
    */
  var cidrBlock: String = js.native
  /**
    * The ID of the Egress Only Internet Gateway.
    */
  var egressOnlyGatewayId: String = js.native
  /**
    * The id of an Internet Gateway or Virtual Private Gateway which is connected to the Route Table (not exported if not passed as a parameter).
    */
  var gatewayId: String = js.native
  /**
    * The EC2 instance ID.
    */
  var instanceId: String = js.native
  /**
    * The IPv6 CIDR block of the route.
    */
  var ipv6CidrBlock: String = js.native
  /**
    * The NAT Gateway ID.
    */
  var natGatewayId: String = js.native
  /**
    * The ID of the elastic network interface (eni) to use.
    */
  var networkInterfaceId: String = js.native
  /**
    * The EC2 Transit Gateway ID.
    */
  var transitGatewayId: String = js.native
  /**
    * The VPC Peering ID.
    */
  var vpcPeeringConnectionId: String = js.native
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
    val __obj = js.Dynamic.literal(cidrBlock = cidrBlock.asInstanceOf[js.Any], egressOnlyGatewayId = egressOnlyGatewayId.asInstanceOf[js.Any], gatewayId = gatewayId.asInstanceOf[js.Any], instanceId = instanceId.asInstanceOf[js.Any], ipv6CidrBlock = ipv6CidrBlock.asInstanceOf[js.Any], natGatewayId = natGatewayId.asInstanceOf[js.Any], networkInterfaceId = networkInterfaceId.asInstanceOf[js.Any], transitGatewayId = transitGatewayId.asInstanceOf[js.Any], vpcPeeringConnectionId = vpcPeeringConnectionId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetRouteTableRoute]
  }
}

