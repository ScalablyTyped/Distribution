package typings
package atPulumiAwsLib.ec2VpcEndpointRouteTableAssociationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VpcEndpointRouteTableAssociationState extends js.Object {
  /**
    * Identifier of the EC2 Route Table to be associated with the VPC Endpoint.
    */
  val routeTableId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Identifier of the VPC Endpoint with which the EC2 Route Table will be associated.
    */
  val vpcEndpointId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object VpcEndpointRouteTableAssociationState {
  @scala.inline
  def apply(
    routeTableId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    vpcEndpointId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): VpcEndpointRouteTableAssociationState = {
    val __obj = js.Dynamic.literal()
    if (routeTableId != null) __obj.updateDynamic("routeTableId")(routeTableId.asInstanceOf[js.Any])
    if (vpcEndpointId != null) __obj.updateDynamic("vpcEndpointId")(vpcEndpointId.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpcEndpointRouteTableAssociationState]
  }
}

