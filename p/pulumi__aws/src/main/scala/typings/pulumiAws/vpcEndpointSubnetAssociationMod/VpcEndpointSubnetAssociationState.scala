package typings.pulumiAws.vpcEndpointSubnetAssociationMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VpcEndpointSubnetAssociationState extends js.Object {
  /**
    * The ID of the subnet to be associated with the VPC endpoint.
    */
  val subnetId: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of the VPC endpoint with which the subnet will be associated.
    */
  val vpcEndpointId: js.UndefOr[Input[String]] = js.native
}

object VpcEndpointSubnetAssociationState {
  @scala.inline
  def apply(): VpcEndpointSubnetAssociationState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpcEndpointSubnetAssociationState]
  }
  @scala.inline
  implicit class VpcEndpointSubnetAssociationStateOps[Self <: VpcEndpointSubnetAssociationState] (val x: Self) extends AnyVal {
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
    def setSubnetId(value: Input[String]): Self = this.set("subnetId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubnetId: Self = this.set("subnetId", js.undefined)
    @scala.inline
    def setVpcEndpointId(value: Input[String]): Self = this.set("vpcEndpointId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcEndpointId: Self = this.set("vpcEndpointId", js.undefined)
  }
  
}

