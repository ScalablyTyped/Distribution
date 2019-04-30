package typings
package atPulumiAwsLib.directconnectGatewayAssociationProposalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GatewayAssociationProposalArgs extends js.Object {
  /**
    * VPC prefixes (CIDRs) to advertise to the Direct Connect gateway. Defaults to the CIDR block of the VPC associated with the Virtual Gateway. To enable drift detection, must be configured.
    */
  val allowedPrefixes: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * Direct Connect Gateway identifier.
    */
  val dxGatewayId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * AWS Account identifier of the Direct Connect Gateway.
    */
  val dxGatewayOwnerAccountId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * Virtual Gateway identifier to associate with the Direct Connect Gateway.
    */
  val vpnGatewayId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object GatewayAssociationProposalArgs {
  @scala.inline
  def apply(
    dxGatewayId: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    dxGatewayOwnerAccountId: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    vpnGatewayId: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    allowedPrefixes: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null
  ): GatewayAssociationProposalArgs = {
    val __obj = js.Dynamic.literal(dxGatewayId = dxGatewayId.asInstanceOf[js.Any], dxGatewayOwnerAccountId = dxGatewayOwnerAccountId.asInstanceOf[js.Any], vpnGatewayId = vpnGatewayId.asInstanceOf[js.Any])
    if (allowedPrefixes != null) __obj.updateDynamic("allowedPrefixes")(allowedPrefixes.asInstanceOf[js.Any])
    __obj.asInstanceOf[GatewayAssociationProposalArgs]
  }
}

