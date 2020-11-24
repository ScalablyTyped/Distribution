package typings.pulumiAws.mainRouteTableAssociationMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MainRouteTableAssociationState extends js.Object {
  
  /**
    * Used internally, see __Notes__ below
    */
  val originalRouteTableId: js.UndefOr[Input[String]] = js.native
  
  /**
    * The ID of the Route Table to set as the new
    * main route table for the target VPC
    */
  val routeTableId: js.UndefOr[Input[String]] = js.native
  
  /**
    * The ID of the VPC whose main route table should be set
    */
  val vpcId: js.UndefOr[Input[String]] = js.native
}
object MainRouteTableAssociationState {
  
  @scala.inline
  def apply(): MainRouteTableAssociationState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MainRouteTableAssociationState]
  }
  
  @scala.inline
  implicit class MainRouteTableAssociationStateOps[Self <: MainRouteTableAssociationState] (val x: Self) extends AnyVal {
    
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
    def setOriginalRouteTableId(value: Input[String]): Self = this.set("originalRouteTableId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOriginalRouteTableId: Self = this.set("originalRouteTableId", js.undefined)
    
    @scala.inline
    def setRouteTableId(value: Input[String]): Self = this.set("routeTableId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRouteTableId: Self = this.set("routeTableId", js.undefined)
    
    @scala.inline
    def setVpcId(value: Input[String]): Self = this.set("vpcId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpcId: Self = this.set("vpcId", js.undefined)
  }
}
