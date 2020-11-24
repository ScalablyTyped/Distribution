package typings.pulumiAws.gatewayAssociationMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
object GatewayAssociationState {
  
  @scala.inline
  def apply(): GatewayAssociationState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GatewayAssociationState]
  }
  
  @scala.inline
  implicit class GatewayAssociationStateOps[Self <: GatewayAssociationState] (val x: Self) extends AnyVal {
    
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
    def setDxGatewayAssociationId(value: Input[String]): Self = this.set("dxGatewayAssociationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDxGatewayAssociationId: Self = this.set("dxGatewayAssociationId", js.undefined)
    
    @scala.inline
    def setDxGatewayId(value: Input[String]): Self = this.set("dxGatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDxGatewayId: Self = this.set("dxGatewayId", js.undefined)
    
    @scala.inline
    def setDxGatewayOwnerAccountId(value: Input[String]): Self = this.set("dxGatewayOwnerAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDxGatewayOwnerAccountId: Self = this.set("dxGatewayOwnerAccountId", js.undefined)
    
    @scala.inline
    def setProposalId(value: Input[String]): Self = this.set("proposalId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProposalId: Self = this.set("proposalId", js.undefined)
  }
}
