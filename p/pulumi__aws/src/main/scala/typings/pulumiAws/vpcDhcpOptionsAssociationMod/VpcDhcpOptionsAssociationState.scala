package typings.pulumiAws.vpcDhcpOptionsAssociationMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VpcDhcpOptionsAssociationState extends js.Object {
  
  /**
    * The ID of the DHCP Options Set to associate to the VPC.
    */
  val dhcpOptionsId: js.UndefOr[Input[String]] = js.native
  
  /**
    * The ID of the VPC to which we would like to associate a DHCP Options Set.
    */
  val vpcId: js.UndefOr[Input[String]] = js.native
}
object VpcDhcpOptionsAssociationState {
  
  @scala.inline
  def apply(): VpcDhcpOptionsAssociationState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpcDhcpOptionsAssociationState]
  }
  
  @scala.inline
  implicit class VpcDhcpOptionsAssociationStateOps[Self <: VpcDhcpOptionsAssociationState] (val x: Self) extends AnyVal {
    
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
    def setDhcpOptionsId(value: Input[String]): Self = this.set("dhcpOptionsId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDhcpOptionsId: Self = this.set("dhcpOptionsId", js.undefined)
    
    @scala.inline
    def setVpcId(value: Input[String]): Self = this.set("vpcId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpcId: Self = this.set("vpcId", js.undefined)
  }
}
