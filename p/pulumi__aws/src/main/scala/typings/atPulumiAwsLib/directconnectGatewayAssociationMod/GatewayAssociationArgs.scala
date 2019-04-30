package typings
package atPulumiAwsLib.directconnectGatewayAssociationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GatewayAssociationArgs extends js.Object {
  /**
    * VPC prefixes (CIDRs) to advertise to the Direct Connect gateway. Defaults to the CIDR block of the VPC associated with the Virtual Gateway. To enable drift detection, must be configured.
    */
  val allowedPrefixes: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * The ID of the Direct Connect gateway.
    */
  val dxGatewayId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The ID of the VGW with which to associate the gateway.
    */
  val vpnGatewayId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object GatewayAssociationArgs {
  @scala.inline
  def apply(
    dxGatewayId: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    vpnGatewayId: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    allowedPrefixes: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null
  ): GatewayAssociationArgs = {
    val __obj = js.Dynamic.literal(dxGatewayId = dxGatewayId.asInstanceOf[js.Any], vpnGatewayId = vpnGatewayId.asInstanceOf[js.Any])
    if (allowedPrefixes != null) __obj.updateDynamic("allowedPrefixes")(allowedPrefixes.asInstanceOf[js.Any])
    __obj.asInstanceOf[GatewayAssociationArgs]
  }
}

