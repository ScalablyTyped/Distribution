package typings.pulumiAws.mainRouteTableAssociationMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MainRouteTableAssociationArgs extends js.Object {
  /**
    * The ID of the Route Table to set as the new
    * main route table for the target VPC
    */
  val routeTableId: Input[String] = js.native
  /**
    * The ID of the VPC whose main route table should be set
    */
  val vpcId: Input[String] = js.native
}

object MainRouteTableAssociationArgs {
  @scala.inline
  def apply(routeTableId: Input[String], vpcId: Input[String]): MainRouteTableAssociationArgs = {
    val __obj = js.Dynamic.literal(routeTableId = routeTableId.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MainRouteTableAssociationArgs]
  }
  @scala.inline
  implicit class MainRouteTableAssociationArgsOps[Self <: MainRouteTableAssociationArgs] (val x: Self) extends AnyVal {
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
    def setVpcId(value: Input[String]): Self = this.set("vpcId", value.asInstanceOf[js.Any])
  }
  
}

