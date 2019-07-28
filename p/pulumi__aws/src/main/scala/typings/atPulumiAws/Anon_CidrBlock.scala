package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CidrBlock extends js.Object {
  var cidrBlock: js.UndefOr[String] = js.undefined
  var egressOnlyGatewayId: js.UndefOr[String] = js.undefined
  var gatewayId: js.UndefOr[String] = js.undefined
  var instanceId: js.UndefOr[String] = js.undefined
  var ipv6CidrBlock: js.UndefOr[String] = js.undefined
  var natGatewayId: js.UndefOr[String] = js.undefined
  var networkInterfaceId: js.UndefOr[String] = js.undefined
  var transitGatewayId: js.UndefOr[String] = js.undefined
  var vpcPeeringConnectionId: js.UndefOr[String] = js.undefined
}

object Anon_CidrBlock {
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
  ): Anon_CidrBlock = {
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
    __obj.asInstanceOf[Anon_CidrBlock]
  }
}

