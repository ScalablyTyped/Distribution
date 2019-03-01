package typings
package atPulumiAwsLib.ec2VpcEndpointSubnetAssociationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VpcEndpointSubnetAssociationArgs extends js.Object {
  /**
    * The ID of the subnet to be associated with the VPC endpoint.
    */
  val subnetId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The ID of the VPC endpoint with which the subnet will be associated.
    */
  val vpcEndpointId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object VpcEndpointSubnetAssociationArgs {
  @scala.inline
  def apply(
    subnetId: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    vpcEndpointId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  ): VpcEndpointSubnetAssociationArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("subnetId")(subnetId.asInstanceOf[js.Any])
    __obj.updateDynamic("vpcEndpointId")(vpcEndpointId.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpcEndpointSubnetAssociationArgs]
  }
}

