package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CidrBlockEgressOnlyGatewayIdGatewayId extends js.Object {
  var cidrBlock: String
  var egressOnlyGatewayId: String
  var gatewayId: String
  var instanceId: String
  var ipv6CidrBlock: String
  var natGatewayId: String
  var networkInterfaceId: String
  var transitGatewayId: String
  var vpcPeeringConnectionId: String
}

object Anon_CidrBlockEgressOnlyGatewayIdGatewayId {
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
  ): Anon_CidrBlockEgressOnlyGatewayIdGatewayId = {
    val __obj = js.Dynamic.literal(cidrBlock = cidrBlock, egressOnlyGatewayId = egressOnlyGatewayId, gatewayId = gatewayId, instanceId = instanceId, ipv6CidrBlock = ipv6CidrBlock, natGatewayId = natGatewayId, networkInterfaceId = networkInterfaceId, transitGatewayId = transitGatewayId, vpcPeeringConnectionId = vpcPeeringConnectionId)
  
    __obj.asInstanceOf[Anon_CidrBlockEgressOnlyGatewayIdGatewayId]
  }
}

