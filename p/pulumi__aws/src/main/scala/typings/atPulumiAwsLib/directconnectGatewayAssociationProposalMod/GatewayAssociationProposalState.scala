package typings
package atPulumiAwsLib.directconnectGatewayAssociationProposalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GatewayAssociationProposalState extends js.Object {
  /**
    * VPC prefixes (CIDRs) to advertise to the Direct Connect gateway. Defaults to the CIDR block of the VPC associated with the Virtual Gateway. To enable drift detection, must be configured.
    */
  val allowedPrefixes: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * Direct Connect Gateway identifier.
    */
  val dxGatewayId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * AWS Account identifier of the Direct Connect Gateway.
    */
  val dxGatewayOwnerAccountId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Virtual Gateway identifier to associate with the Direct Connect Gateway.
    */
  val vpnGatewayId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object GatewayAssociationProposalState {
  @scala.inline
  def apply(
    allowedPrefixes: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null,
    dxGatewayId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    dxGatewayOwnerAccountId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    vpnGatewayId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): GatewayAssociationProposalState = {
    val __obj = js.Dynamic.literal()
    if (allowedPrefixes != null) __obj.updateDynamic("allowedPrefixes")(allowedPrefixes.asInstanceOf[js.Any])
    if (dxGatewayId != null) __obj.updateDynamic("dxGatewayId")(dxGatewayId.asInstanceOf[js.Any])
    if (dxGatewayOwnerAccountId != null) __obj.updateDynamic("dxGatewayOwnerAccountId")(dxGatewayOwnerAccountId.asInstanceOf[js.Any])
    if (vpnGatewayId != null) __obj.updateDynamic("vpnGatewayId")(vpnGatewayId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GatewayAssociationProposalState]
  }
}

