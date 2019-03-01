package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CidrBlockEgressOnlyGatewayId extends js.Object {
  var cidrBlock: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var egressOnlyGatewayId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var gatewayId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var instanceId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var ipv6CidrBlock: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var natGatewayId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var networkInterfaceId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var transitGatewayId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var vpcPeeringConnectionId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object Anon_CidrBlockEgressOnlyGatewayId {
  @scala.inline
  def apply(
    cidrBlock: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    egressOnlyGatewayId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    gatewayId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    instanceId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    ipv6CidrBlock: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    natGatewayId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    networkInterfaceId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    transitGatewayId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    vpcPeeringConnectionId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): Anon_CidrBlockEgressOnlyGatewayId = {
    val __obj = js.Dynamic.literal()
    if (cidrBlock != null) __obj.updateDynamic("cidrBlock")(cidrBlock.asInstanceOf[js.Any])
    if (egressOnlyGatewayId != null) __obj.updateDynamic("egressOnlyGatewayId")(egressOnlyGatewayId.asInstanceOf[js.Any])
    if (gatewayId != null) __obj.updateDynamic("gatewayId")(gatewayId.asInstanceOf[js.Any])
    if (instanceId != null) __obj.updateDynamic("instanceId")(instanceId.asInstanceOf[js.Any])
    if (ipv6CidrBlock != null) __obj.updateDynamic("ipv6CidrBlock")(ipv6CidrBlock.asInstanceOf[js.Any])
    if (natGatewayId != null) __obj.updateDynamic("natGatewayId")(natGatewayId.asInstanceOf[js.Any])
    if (networkInterfaceId != null) __obj.updateDynamic("networkInterfaceId")(networkInterfaceId.asInstanceOf[js.Any])
    if (transitGatewayId != null) __obj.updateDynamic("transitGatewayId")(transitGatewayId.asInstanceOf[js.Any])
    if (vpcPeeringConnectionId != null) __obj.updateDynamic("vpcPeeringConnectionId")(vpcPeeringConnectionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CidrBlockEgressOnlyGatewayId]
  }
}

