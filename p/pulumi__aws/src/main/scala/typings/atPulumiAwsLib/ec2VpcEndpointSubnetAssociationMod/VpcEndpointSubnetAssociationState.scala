package typings
package atPulumiAwsLib.ec2VpcEndpointSubnetAssociationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VpcEndpointSubnetAssociationState extends js.Object {
  /**
    * The ID of the subnet to be associated with the VPC endpoint.
    */
  val subnetId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The ID of the VPC endpoint with which the subnet will be associated.
    */
  val vpcEndpointId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object VpcEndpointSubnetAssociationState {
  @scala.inline
  def apply(
    subnetId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    vpcEndpointId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): VpcEndpointSubnetAssociationState = {
    val __obj = js.Dynamic.literal()
    if (subnetId != null) __obj.updateDynamic("subnetId")(subnetId.asInstanceOf[js.Any])
    if (vpcEndpointId != null) __obj.updateDynamic("vpcEndpointId")(vpcEndpointId.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpcEndpointSubnetAssociationState]
  }
}

