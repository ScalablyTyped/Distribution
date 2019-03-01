package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CidrBlock extends js.Object {
  var cidrBlock: js.UndefOr[java.lang.String] = js.undefined
  var egressOnlyGatewayId: js.UndefOr[java.lang.String] = js.undefined
  var gatewayId: js.UndefOr[java.lang.String] = js.undefined
  var instanceId: js.UndefOr[java.lang.String] = js.undefined
  var ipv6CidrBlock: js.UndefOr[java.lang.String] = js.undefined
  var natGatewayId: js.UndefOr[java.lang.String] = js.undefined
  var networkInterfaceId: js.UndefOr[java.lang.String] = js.undefined
  var transitGatewayId: js.UndefOr[java.lang.String] = js.undefined
  var vpcPeeringConnectionId: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_CidrBlock {
  @scala.inline
  def apply(
    cidrBlock: java.lang.String = null,
    egressOnlyGatewayId: java.lang.String = null,
    gatewayId: java.lang.String = null,
    instanceId: java.lang.String = null,
    ipv6CidrBlock: java.lang.String = null,
    natGatewayId: java.lang.String = null,
    networkInterfaceId: java.lang.String = null,
    transitGatewayId: java.lang.String = null,
    vpcPeeringConnectionId: java.lang.String = null
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

