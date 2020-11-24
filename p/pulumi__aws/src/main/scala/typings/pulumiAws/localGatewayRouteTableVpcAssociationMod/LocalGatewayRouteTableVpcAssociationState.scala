package typings.pulumiAws.localGatewayRouteTableVpcAssociationMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocalGatewayRouteTableVpcAssociationState extends js.Object {
  
  val localGatewayId: js.UndefOr[Input[String]] = js.native
  
  /**
    * Identifier of EC2 Local Gateway Route Table.
    */
  val localGatewayRouteTableId: js.UndefOr[Input[String]] = js.native
  
  /**
    * Key-value map of resource tags.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  
  /**
    * Identifier of EC2 VPC.
    */
  val vpcId: js.UndefOr[Input[String]] = js.native
}
object LocalGatewayRouteTableVpcAssociationState {
  
  @scala.inline
  def apply(): LocalGatewayRouteTableVpcAssociationState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalGatewayRouteTableVpcAssociationState]
  }
  
  @scala.inline
  implicit class LocalGatewayRouteTableVpcAssociationStateOps[Self <: LocalGatewayRouteTableVpcAssociationState] (val x: Self) extends AnyVal {
    
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
    def setLocalGatewayId(value: Input[String]): Self = this.set("localGatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalGatewayId: Self = this.set("localGatewayId", js.undefined)
    
    @scala.inline
    def setLocalGatewayRouteTableId(value: Input[String]): Self = this.set("localGatewayRouteTableId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalGatewayRouteTableId: Self = this.set("localGatewayRouteTableId", js.undefined)
    
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    
    @scala.inline
    def setVpcId(value: Input[String]): Self = this.set("vpcId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpcId: Self = this.set("vpcId", js.undefined)
  }
}
