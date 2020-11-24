package typings.pulumiAws.vpcAssociationAuthorizationMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VpcAssociationAuthorizationArgs extends js.Object {
  
  /**
    * The VPC to authorize for association with the private hosted zone.
    */
  val vpcId: Input[String] = js.native
  
  /**
    * The VPC's region. Defaults to the region of the AWS provider.
    */
  val vpcRegion: js.UndefOr[Input[String]] = js.native
  
  /**
    * The ID of the private hosted zone that you want to authorize associating a VPC with.
    */
  val zoneId: Input[String] = js.native
}
object VpcAssociationAuthorizationArgs {
  
  @scala.inline
  def apply(vpcId: Input[String], zoneId: Input[String]): VpcAssociationAuthorizationArgs = {
    val __obj = js.Dynamic.literal(vpcId = vpcId.asInstanceOf[js.Any], zoneId = zoneId.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpcAssociationAuthorizationArgs]
  }
  
  @scala.inline
  implicit class VpcAssociationAuthorizationArgsOps[Self <: VpcAssociationAuthorizationArgs] (val x: Self) extends AnyVal {
    
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
    def setZoneId(value: Input[String]): Self = this.set("zoneId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcRegion(value: Input[String]): Self = this.set("vpcRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpcRegion: Self = this.set("vpcRegion", js.undefined)
  }
}
