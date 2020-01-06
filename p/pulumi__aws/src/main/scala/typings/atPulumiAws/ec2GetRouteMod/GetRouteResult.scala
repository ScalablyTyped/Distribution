package typings.atPulumiAws.ec2GetRouteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRouteResult extends js.Object {
  val destinationCidrBlock: String = js.native
  val destinationIpv6CidrBlock: String = js.native
  val egressOnlyGatewayId: String = js.native
  val gatewayId: String = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  val instanceId: String = js.native
  val natGatewayId: String = js.native
  val networkInterfaceId: String = js.native
  val routeTableId: String = js.native
  val transitGatewayId: String = js.native
  val vpcPeeringConnectionId: String = js.native
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
    val __obj = js.Dynamic.literal(destinationCidrBlock = destinationCidrBlock.asInstanceOf[js.Any], destinationIpv6CidrBlock = destinationIpv6CidrBlock.asInstanceOf[js.Any], egressOnlyGatewayId = egressOnlyGatewayId.asInstanceOf[js.Any], gatewayId = gatewayId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], instanceId = instanceId.asInstanceOf[js.Any], natGatewayId = natGatewayId.asInstanceOf[js.Any], networkInterfaceId = networkInterfaceId.asInstanceOf[js.Any], routeTableId = routeTableId.asInstanceOf[js.Any], transitGatewayId = transitGatewayId.asInstanceOf[js.Any], vpcPeeringConnectionId = vpcPeeringConnectionId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetRouteResult]
  }
}

