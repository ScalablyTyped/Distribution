package typings.pulumiAws.routeTableMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouteTableState extends js.Object {
  
  /**
    * EC2 Transit Gateway Route Table Amazon Resource Name (ARN).
    */
  val arn: js.UndefOr[Input[String]] = js.native
  
  /**
    * Boolean whether this is the default association route table for the EC2 Transit Gateway.
    */
  val defaultAssociationRouteTable: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * Boolean whether this is the default propagation route table for the EC2 Transit Gateway.
    */
  val defaultPropagationRouteTable: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * Key-value tags for the EC2 Transit Gateway Route Table.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  
  /**
    * Identifier of EC2 Transit Gateway.
    */
  val transitGatewayId: js.UndefOr[Input[String]] = js.native
}
object RouteTableState {
  
  @scala.inline
  def apply(): RouteTableState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouteTableState]
  }
  
  @scala.inline
  implicit class RouteTableStateOps[Self <: RouteTableState] (val x: Self) extends AnyVal {
    
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
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    
    @scala.inline
    def setDefaultAssociationRouteTable(value: Input[Boolean]): Self = this.set("defaultAssociationRouteTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultAssociationRouteTable: Self = this.set("defaultAssociationRouteTable", js.undefined)
    
    @scala.inline
    def setDefaultPropagationRouteTable(value: Input[Boolean]): Self = this.set("defaultPropagationRouteTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultPropagationRouteTable: Self = this.set("defaultPropagationRouteTable", js.undefined)
    
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    
    @scala.inline
    def setTransitGatewayId(value: Input[String]): Self = this.set("transitGatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitGatewayId: Self = this.set("transitGatewayId", js.undefined)
  }
}
