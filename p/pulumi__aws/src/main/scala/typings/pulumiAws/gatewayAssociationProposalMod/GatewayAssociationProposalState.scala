package typings.pulumiAws.gatewayAssociationProposalMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GatewayAssociationProposalState extends js.Object {
  /**
    * VPC prefixes (CIDRs) to advertise to the Direct Connect gateway. Defaults to the CIDR block of the VPC associated with the Virtual Gateway. To enable drift detection, must be configured.
    */
  val allowedPrefixes: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The ID of the VGW or transit gateway with which to associate the Direct Connect gateway.
    */
  val associatedGatewayId: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of the AWS account that owns the VGW or transit gateway with which to associate the Direct Connect gateway.
    */
  val associatedGatewayOwnerAccountId: js.UndefOr[Input[String]] = js.native
  /**
    * The type of the associated gateway, `transitGateway` or `virtualPrivateGateway`.
    */
  val associatedGatewayType: js.UndefOr[Input[String]] = js.native
  /**
    * Direct Connect Gateway identifier.
    */
  val dxGatewayId: js.UndefOr[Input[String]] = js.native
  /**
    * AWS Account identifier of the Direct Connect Gateway's owner.
    */
  val dxGatewayOwnerAccountId: js.UndefOr[Input[String]] = js.native
  /**
    * *Deprecated:* Use `associatedGatewayId` instead. Virtual Gateway identifier to associate with the Direct Connect Gateway.
    *
    * @deprecated use 'associated_gateway_id' argument instead
    */
  val vpnGatewayId: js.UndefOr[Input[String]] = js.native
}

object GatewayAssociationProposalState {
  @scala.inline
  def apply(): GatewayAssociationProposalState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GatewayAssociationProposalState]
  }
  @scala.inline
  implicit class GatewayAssociationProposalStateOps[Self <: GatewayAssociationProposalState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAllowedPrefixesVarargs(value: Input[String]*): Self = this.set("allowedPrefixes", js.Array(value :_*))
    @scala.inline
    def setAllowedPrefixes(value: Input[js.Array[Input[String]]]): Self = this.set("allowedPrefixes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowedPrefixes: Self = this.set("allowedPrefixes", js.undefined)
    @scala.inline
    def setAssociatedGatewayId(value: Input[String]): Self = this.set("associatedGatewayId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssociatedGatewayId: Self = this.set("associatedGatewayId", js.undefined)
    @scala.inline
    def setAssociatedGatewayOwnerAccountId(value: Input[String]): Self = this.set("associatedGatewayOwnerAccountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssociatedGatewayOwnerAccountId: Self = this.set("associatedGatewayOwnerAccountId", js.undefined)
    @scala.inline
    def setAssociatedGatewayType(value: Input[String]): Self = this.set("associatedGatewayType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssociatedGatewayType: Self = this.set("associatedGatewayType", js.undefined)
    @scala.inline
    def setDxGatewayId(value: Input[String]): Self = this.set("dxGatewayId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDxGatewayId: Self = this.set("dxGatewayId", js.undefined)
    @scala.inline
    def setDxGatewayOwnerAccountId(value: Input[String]): Self = this.set("dxGatewayOwnerAccountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDxGatewayOwnerAccountId: Self = this.set("dxGatewayOwnerAccountId", js.undefined)
    @scala.inline
    def setVpnGatewayId(value: Input[String]): Self = this.set("vpnGatewayId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpnGatewayId: Self = this.set("vpnGatewayId", js.undefined)
  }
  
}

