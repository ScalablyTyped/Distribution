package typings.pulumiAws.vpcAssociationAuthorizationMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VpcAssociationAuthorizationState extends js.Object {
  
  /**
    * The VPC to authorize for association with the private hosted zone.
    */
  val vpcId: js.UndefOr[Input[String]] = js.native
  
  /**
    * The VPC's region. Defaults to the region of the AWS provider.
    */
  val vpcRegion: js.UndefOr[Input[String]] = js.native
  
  /**
    * The ID of the private hosted zone that you want to authorize associating a VPC with.
    */
  val zoneId: js.UndefOr[Input[String]] = js.native
}
object VpcAssociationAuthorizationState {
  
  @scala.inline
  def apply(): VpcAssociationAuthorizationState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpcAssociationAuthorizationState]
  }
  
  @scala.inline
  implicit class VpcAssociationAuthorizationStateOps[Self <: VpcAssociationAuthorizationState] (val x: Self) extends AnyVal {
    
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
    def setVpcId(value: Input[String]): Self = this.set("vpcId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpcId: Self = this.set("vpcId", js.undefined)
    
    @scala.inline
    def setVpcRegion(value: Input[String]): Self = this.set("vpcRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpcRegion: Self = this.set("vpcRegion", js.undefined)
    
    @scala.inline
    def setZoneId(value: Input[String]): Self = this.set("zoneId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoneId: Self = this.set("zoneId", js.undefined)
  }
}
