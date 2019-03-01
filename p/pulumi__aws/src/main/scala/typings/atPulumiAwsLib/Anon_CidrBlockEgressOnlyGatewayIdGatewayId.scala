package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CidrBlockEgressOnlyGatewayIdGatewayId extends js.Object {
  var cidrBlock: java.lang.String
  var egressOnlyGatewayId: java.lang.String
  var gatewayId: java.lang.String
  var instanceId: java.lang.String
  var ipv6CidrBlock: java.lang.String
  var natGatewayId: java.lang.String
  var networkInterfaceId: java.lang.String
  var transitGatewayId: java.lang.String
  var vpcPeeringConnectionId: java.lang.String
}

object Anon_CidrBlockEgressOnlyGatewayIdGatewayId {
  @scala.inline
  def apply(
    cidrBlock: java.lang.String,
    egressOnlyGatewayId: java.lang.String,
    gatewayId: java.lang.String,
    instanceId: java.lang.String,
    ipv6CidrBlock: java.lang.String,
    natGatewayId: java.lang.String,
    networkInterfaceId: java.lang.String,
    transitGatewayId: java.lang.String,
    vpcPeeringConnectionId: java.lang.String
  ): Anon_CidrBlockEgressOnlyGatewayIdGatewayId = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cidrBlock")(cidrBlock)
    __obj.updateDynamic("egressOnlyGatewayId")(egressOnlyGatewayId)
    __obj.updateDynamic("gatewayId")(gatewayId)
    __obj.updateDynamic("instanceId")(instanceId)
    __obj.updateDynamic("ipv6CidrBlock")(ipv6CidrBlock)
    __obj.updateDynamic("natGatewayId")(natGatewayId)
    __obj.updateDynamic("networkInterfaceId")(networkInterfaceId)
    __obj.updateDynamic("transitGatewayId")(transitGatewayId)
    __obj.updateDynamic("vpcPeeringConnectionId")(vpcPeeringConnectionId)
    __obj.asInstanceOf[Anon_CidrBlockEgressOnlyGatewayIdGatewayId]
  }
}

