package typings.pulumiAws.vpcEndpointRouteTableAssociationMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VpcEndpointRouteTableAssociationState extends js.Object {
  /**
    * Identifier of the EC2 Route Table to be associated with the VPC Endpoint.
    */
  val routeTableId: js.UndefOr[Input[String]] = js.native
  /**
    * Identifier of the VPC Endpoint with which the EC2 Route Table will be associated.
    */
  val vpcEndpointId: js.UndefOr[Input[String]] = js.native
}

object VpcEndpointRouteTableAssociationState {
  @scala.inline
  def apply(): VpcEndpointRouteTableAssociationState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpcEndpointRouteTableAssociationState]
  }
  @scala.inline
  implicit class VpcEndpointRouteTableAssociationStateOps[Self <: VpcEndpointRouteTableAssociationState] (val x: Self) extends AnyVal {
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
    def deleteRouteTableId: Self = this.set("routeTableId", js.undefined)
    @scala.inline
    def setVpcEndpointId(value: Input[String]): Self = this.set("vpcEndpointId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcEndpointId: Self = this.set("vpcEndpointId", js.undefined)
  }
  
}

