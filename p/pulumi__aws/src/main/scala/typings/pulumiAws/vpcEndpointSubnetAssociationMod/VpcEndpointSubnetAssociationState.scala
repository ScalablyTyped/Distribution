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
  def apply(subnetId: Input[String] = null, vpcEndpointId: Input[String] = null): VpcEndpointSubnetAssociationState = {
    val __obj = js.Dynamic.literal()
    if (subnetId != null) __obj.updateDynamic("subnetId")(subnetId.asInstanceOf[js.Any])
    if (vpcEndpointId != null) __obj.updateDynamic("vpcEndpointId")(vpcEndpointId.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpcEndpointSubnetAssociationState]
  }
}

