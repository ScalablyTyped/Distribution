package typings.atPulumiAws.directconnectGatewayAssociationProposalMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GatewayAssociationProposalArgs extends js.Object {
  /**
    * VPC prefixes (CIDRs) to advertise to the Direct Connect gateway. Defaults to the CIDR block of the VPC associated with the Virtual Gateway. To enable drift detection, must be configured.
    */
  val allowedPrefixes: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * The ID of the VGW or transit gateway with which to associate the Direct Connect gateway.
    */
  val associatedGatewayId: js.UndefOr[Input[String]] = js.undefined
  /**
    * Direct Connect Gateway identifier.
    */
  val dxGatewayId: Input[String]
  /**
    * AWS Account identifier of the Direct Connect Gateway's owner.
    */
  val dxGatewayOwnerAccountId: Input[String]
  /**
    * *Deprecated:* Use `associated_gateway_id` instead. Virtual Gateway identifier to associate with the Direct Connect Gateway.
    */
  val vpnGatewayId: js.UndefOr[Input[String]] = js.undefined
}

object GatewayAssociationProposalArgs {
  @scala.inline
  def apply(
    dxGatewayId: Input[String],
    dxGatewayOwnerAccountId: Input[String],
    allowedPrefixes: Input[js.Array[Input[String]]] = null,
    associatedGatewayId: Input[String] = null,
    vpnGatewayId: Input[String] = null
  ): GatewayAssociationProposalArgs = {
    val __obj = js.Dynamic.literal(dxGatewayId = dxGatewayId.asInstanceOf[js.Any], dxGatewayOwnerAccountId = dxGatewayOwnerAccountId.asInstanceOf[js.Any])
    if (allowedPrefixes != null) __obj.updateDynamic("allowedPrefixes")(allowedPrefixes.asInstanceOf[js.Any])
    if (associatedGatewayId != null) __obj.updateDynamic("associatedGatewayId")(associatedGatewayId.asInstanceOf[js.Any])
    if (vpnGatewayId != null) __obj.updateDynamic("vpnGatewayId")(vpnGatewayId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GatewayAssociationProposalArgs]
  }
}

