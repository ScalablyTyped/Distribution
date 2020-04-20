package typings.pulumiAws.vpcEndpointSubnetAssociationMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VpcEndpointSubnetAssociationArgs extends js.Object {
  /**
    * The ID of the subnet to be associated with the VPC endpoint.
    */
  val subnetId: Input[String] = js.native
  /**
    * The ID of the VPC endpoint with which the subnet will be associated.
    */
  val vpcEndpointId: Input[String] = js.native
}

object VpcEndpointSubnetAssociationArgs {
  @scala.inline
  def apply(subnetId: Input[String], vpcEndpointId: Input[String]): VpcEndpointSubnetAssociationArgs = {
    val __obj = js.Dynamic.literal(subnetId = subnetId.asInstanceOf[js.Any], vpcEndpointId = vpcEndpointId.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpcEndpointSubnetAssociationArgs]
  }
}

