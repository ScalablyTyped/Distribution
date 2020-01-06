package typings.atPulumiAws.ec2VpcEndpointRouteTableAssociationMod

import typings.atPulumiPulumi.outputMod.Input
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
  def apply(routeTableId: Input[String] = null, vpcEndpointId: Input[String] = null): VpcEndpointRouteTableAssociationState = {
    val __obj = js.Dynamic.literal()
    if (routeTableId != null) __obj.updateDynamic("routeTableId")(routeTableId.asInstanceOf[js.Any])
    if (vpcEndpointId != null) __obj.updateDynamic("vpcEndpointId")(vpcEndpointId.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpcEndpointRouteTableAssociationState]
  }
}

