package typings.atPulumiAws.directconnectGatewayAssociationProposalMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GatewayAssociationProposalState extends js.Object {
  /**
    * VPC prefixes (CIDRs) to advertise to the Direct Connect gateway. Defaults to the CIDR block of the VPC associated with the Virtual Gateway. To enable drift detection, must be configured.
    */
  val allowedPrefixes: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * The ID of the VGW or transit gateway with which to associate the Direct Connect gateway.
    */
  val associatedGatewayId: js.UndefOr[Input[String]] = js.undefined
  /**
    * The ID of the AWS account that owns the VGW or transit gateway with which to associate the Direct Connect gateway.
    */
  val associatedGatewayOwnerAccountId: js.UndefOr[Input[String]] = js.undefined
  /**
    * The type of the associated gateway, `transitGateway` or `virtualPrivateGateway`.
    */
  val associatedGatewayType: js.UndefOr[Input[String]] = js.undefined
  /**
    * Direct Connect Gateway identifier.
    */
  val dxGatewayId: js.UndefOr[Input[String]] = js.undefined
  /**
    * AWS Account identifier of the Direct Connect Gateway's owner.
    */
  val dxGatewayOwnerAccountId: js.UndefOr[Input[String]] = js.undefined
  /**
    * *Deprecated:* Use `associated_gateway_id` instead. Virtual Gateway identifier to associate with the Direct Connect Gateway.
    */
  val vpnGatewayId: js.UndefOr[Input[String]] = js.undefined
}

object GatewayAssociationProposalState {
  @scala.inline
  def apply(
    allowedPrefixes: Input[js.Array[Input[String]]] = null,
    associatedGatewayId: Input[String] = null,
    associatedGatewayOwnerAccountId: Input[String] = null,
    associatedGatewayType: Input[String] = null,
    dxGatewayId: Input[String] = null,
    dxGatewayOwnerAccountId: Input[String] = null,
    vpnGatewayId: Input[String] = null
  ): GatewayAssociationProposalState = {
    val __obj = js.Dynamic.literal()
    if (allowedPrefixes != null) __obj.updateDynamic("allowedPrefixes")(allowedPrefixes.asInstanceOf[js.Any])
    if (associatedGatewayId != null) __obj.updateDynamic("associatedGatewayId")(associatedGatewayId.asInstanceOf[js.Any])
    if (associatedGatewayOwnerAccountId != null) __obj.updateDynamic("associatedGatewayOwnerAccountId")(associatedGatewayOwnerAccountId.asInstanceOf[js.Any])
    if (associatedGatewayType != null) __obj.updateDynamic("associatedGatewayType")(associatedGatewayType.asInstanceOf[js.Any])
    if (dxGatewayId != null) __obj.updateDynamic("dxGatewayId")(dxGatewayId.asInstanceOf[js.Any])
    if (dxGatewayOwnerAccountId != null) __obj.updateDynamic("dxGatewayOwnerAccountId")(dxGatewayOwnerAccountId.asInstanceOf[js.Any])
    if (vpnGatewayId != null) __obj.updateDynamic("vpnGatewayId")(vpnGatewayId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GatewayAssociationProposalState]
  }
}

