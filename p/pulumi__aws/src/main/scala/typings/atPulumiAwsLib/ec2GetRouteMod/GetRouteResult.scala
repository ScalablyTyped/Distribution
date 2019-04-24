package typings
package atPulumiAwsLib.ec2GetRouteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetRouteResult extends js.Object {
  val destinationCidrBlock: java.lang.String
  val destinationIpv6CidrBlock: java.lang.String
  val egressOnlyGatewayId: java.lang.String
  val gatewayId: java.lang.String
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
  val instanceId: java.lang.String
  val natGatewayId: java.lang.String
  val networkInterfaceId: java.lang.String
  val routeTableId: java.lang.String
  val transitGatewayId: java.lang.String
  val vpcPeeringConnectionId: java.lang.String
}

object GetRouteResult {
  @scala.inline
  def apply(
    destinationCidrBlock: java.lang.String,
    destinationIpv6CidrBlock: java.lang.String,
    egressOnlyGatewayId: java.lang.String,
    gatewayId: java.lang.String,
    id: java.lang.String,
    instanceId: java.lang.String,
    natGatewayId: java.lang.String,
    networkInterfaceId: java.lang.String,
    routeTableId: java.lang.String,
    transitGatewayId: java.lang.String,
    vpcPeeringConnectionId: java.lang.String
  ): GetRouteResult = {
    val __obj = js.Dynamic.literal(destinationCidrBlock = destinationCidrBlock, destinationIpv6CidrBlock = destinationIpv6CidrBlock, egressOnlyGatewayId = egressOnlyGatewayId, gatewayId = gatewayId, id = id, instanceId = instanceId, natGatewayId = natGatewayId, networkInterfaceId = networkInterfaceId, routeTableId = routeTableId, transitGatewayId = transitGatewayId, vpcPeeringConnectionId = vpcPeeringConnectionId)
  
    __obj.asInstanceOf[GetRouteResult]
  }
}

