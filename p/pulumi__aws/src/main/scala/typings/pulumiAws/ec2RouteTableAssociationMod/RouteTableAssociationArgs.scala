package typings.pulumiAws.ec2RouteTableAssociationMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouteTableAssociationArgs extends js.Object {
  
  /**
    * The gateway ID to create an association. Conflicts with `subnetId`.
    */
  val gatewayId: js.UndefOr[Input[String]] = js.native
  
  /**
    * The ID of the routing table to associate with.
    */
  val routeTableId: Input[String] = js.native
  
  /**
    * The subnet ID to create an association. Conflicts with `gatewayId`.
    */
  val subnetId: js.UndefOr[Input[String]] = js.native
}
object RouteTableAssociationArgs {
  
  @scala.inline
  def apply(routeTableId: Input[String]): RouteTableAssociationArgs = {
    val __obj = js.Dynamic.literal(routeTableId = routeTableId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteTableAssociationArgs]
  }
  
  @scala.inline
  implicit class RouteTableAssociationArgsOps[Self <: RouteTableAssociationArgs] (val x: Self) extends AnyVal {
    
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
    def setRouteTableId(value: Input[String]): Self = this.set("routeTableId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGatewayId(value: Input[String]): Self = this.set("gatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGatewayId: Self = this.set("gatewayId", js.undefined)
    
    @scala.inline
    def setSubnetId(value: Input[String]): Self = this.set("subnetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubnetId: Self = this.set("subnetId", js.undefined)
  }
}
