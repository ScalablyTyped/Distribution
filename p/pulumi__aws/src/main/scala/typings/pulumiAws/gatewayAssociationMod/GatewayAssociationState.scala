package typings.pulumiAws.gatewayAssociationMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GatewayAssociationState extends js.Object {
  /**
    * VPC prefixes (CIDRs) to advertise to the Direct Connect gateway. Defaults to the CIDR block of the VPC associated with the Virtual Gateway. To enable drift detection, must be configured.
    */
  val allowedPrefixes: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The ID of the VGW or transit gateway with which to associate the Direct Connect gateway.
    * Used for single account Direct Connect gateway associations.
    */
  val associatedGatewayId: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of the AWS account that owns the VGW or transit gateway with which to associate the Direct Connect gateway.
    * Used for cross-account Direct Connect gateway associations.
    */
  val associatedGatewayOwnerAccountId: js.UndefOr[Input[String]] = js.native
  /**
    * The type of the associated gateway, `transitGateway` or `virtualPrivateGateway`.
    */
  val associatedGatewayType: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of the Direct Connect gateway association.
    */
  val dxGatewayAssociationId: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of the Direct Connect gateway.
    */
  val dxGatewayId: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of the AWS account that owns the Direct Connect gateway.
    */
  val dxGatewayOwnerAccountId: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of the Direct Connect gateway association proposal.
    * Used for cross-account Direct Connect gateway associations.
    */
  val proposalId: js.UndefOr[Input[String]] = js.native
  /**
    * *Deprecated:* Use `associatedGatewayId` instead. The ID of the VGW with which to associate the gateway.
    * Used for single account Direct Connect gateway associations.
    */
  val vpnGatewayId: js.UndefOr[Input[String]] = js.native
}

object GatewayAssociationState {
  @scala.inline
  def apply(
    allowedPrefixes: Input[js.Array[Input[String]]] = null,
    associatedGatewayId: Input[String] = null,
    associatedGatewayOwnerAccountId: Input[String] = null,
    associatedGatewayType: Input[String] = null,
    dxGatewayAssociationId: Input[String] = null,
    dxGatewayId: Input[String] = null,
    dxGatewayOwnerAccountId: Input[String] = null,
    proposalId: Input[String] = null,
    vpnGatewayId: Input[String] = null
  ): GatewayAssociationState = {
    val __obj = js.Dynamic.literal()
    if (allowedPrefixes != null) __obj.updateDynamic("allowedPrefixes")(allowedPrefixes.asInstanceOf[js.Any])
    if (associatedGatewayId != null) __obj.updateDynamic("associatedGatewayId")(associatedGatewayId.asInstanceOf[js.Any])
    if (associatedGatewayOwnerAccountId != null) __obj.updateDynamic("associatedGatewayOwnerAccountId")(associatedGatewayOwnerAccountId.asInstanceOf[js.Any])
    if (associatedGatewayType != null) __obj.updateDynamic("associatedGatewayType")(associatedGatewayType.asInstanceOf[js.Any])
    if (dxGatewayAssociationId != null) __obj.updateDynamic("dxGatewayAssociationId")(dxGatewayAssociationId.asInstanceOf[js.Any])
    if (dxGatewayId != null) __obj.updateDynamic("dxGatewayId")(dxGatewayId.asInstanceOf[js.Any])
    if (dxGatewayOwnerAccountId != null) __obj.updateDynamic("dxGatewayOwnerAccountId")(dxGatewayOwnerAccountId.asInstanceOf[js.Any])
    if (proposalId != null) __obj.updateDynamic("proposalId")(proposalId.asInstanceOf[js.Any])
    if (vpnGatewayId != null) __obj.updateDynamic("vpnGatewayId")(vpnGatewayId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GatewayAssociationState]
  }
}

