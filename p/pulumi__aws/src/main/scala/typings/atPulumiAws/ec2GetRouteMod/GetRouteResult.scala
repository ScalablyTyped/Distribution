package typings.atPulumiAws.ec2GetRouteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetRouteResult extends js.Object {
  val destinationCidrBlock: String
  val destinationIpv6CidrBlock: String
  val egressOnlyGatewayId: String
  val gatewayId: String
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String
  val instanceId: String
  val natGatewayId: String
  val networkInterfaceId: String
  val routeTableId: String
  val transitGatewayId: String
  val vpcPeeringConnectionId: String
}

object GetRouteResult {
  @scala.inline
  def apply(
    destinationCidrBlock: String,
    destinationIpv6CidrBlock: String,
    egressOnlyGatewayId: String,
    gatewayId: String,
    id: String,
    instanceId: String,
    natGatewayId: String,
    networkInterfaceId: String,
    routeTableId: String,
    transitGatewayId: String,
    vpcPeeringConnectionId: String
  ): GetRouteResult = {
    val __obj = js.Dynamic.literal(destinationCidrBlock = destinationCidrBlock, destinationIpv6CidrBlock = destinationIpv6CidrBlock, egressOnlyGatewayId = egressOnlyGatewayId, gatewayId = gatewayId, id = id, instanceId = instanceId, natGatewayId = natGatewayId, networkInterfaceId = networkInterfaceId, routeTableId = routeTableId, transitGatewayId = transitGatewayId, vpcPeeringConnectionId = vpcPeeringConnectionId)
  
    __obj.asInstanceOf[GetRouteResult]
  }
}

