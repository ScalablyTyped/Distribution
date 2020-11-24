package typings.pulumiAws.gatewayAssociationProposalMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GatewayAssociationProposalArgs extends js.Object {
  
  /**
    * VPC prefixes (CIDRs) to advertise to the Direct Connect gateway. Defaults to the CIDR block of the VPC associated with the Virtual Gateway. To enable drift detection, must be configured.
    */
  val allowedPrefixes: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * The ID of the VGW or transit gateway with which to associate the Direct Connect gateway.
    */
  val associatedGatewayId: Input[String] = js.native
  
  /**
    * Direct Connect Gateway identifier.
    */
  val dxGatewayId: Input[String] = js.native
  
  /**
    * AWS Account identifier of the Direct Connect Gateway's owner.
    */
  val dxGatewayOwnerAccountId: Input[String] = js.native
}
object GatewayAssociationProposalArgs {
  
  @scala.inline
  def apply(
    associatedGatewayId: Input[String],
    dxGatewayId: Input[String],
    dxGatewayOwnerAccountId: Input[String]
  ): GatewayAssociationProposalArgs = {
    val __obj = js.Dynamic.literal(associatedGatewayId = associatedGatewayId.asInstanceOf[js.Any], dxGatewayId = dxGatewayId.asInstanceOf[js.Any], dxGatewayOwnerAccountId = dxGatewayOwnerAccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GatewayAssociationProposalArgs]
  }
  
  @scala.inline
  implicit class GatewayAssociationProposalArgsOps[Self <: GatewayAssociationProposalArgs] (val x: Self) extends AnyVal {
    
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
    def setAssociatedGatewayId(value: Input[String]): Self = this.set("associatedGatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDxGatewayId(value: Input[String]): Self = this.set("dxGatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDxGatewayOwnerAccountId(value: Input[String]): Self = this.set("dxGatewayOwnerAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedPrefixesVarargs(value: Input[String]*): Self = this.set("allowedPrefixes", js.Array(value :_*))
    
    @scala.inline
    def setAllowedPrefixes(value: Input[js.Array[Input[String]]]): Self = this.set("allowedPrefixes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowedPrefixes: Self = this.set("allowedPrefixes", js.undefined)
  }
}
