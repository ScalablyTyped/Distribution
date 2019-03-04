package typings
package atPulumiAwsLib.ec2VpcEndpointRouteTableAssociationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VpcEndpointRouteTableAssociationArgs extends js.Object {
  /**
    * Identifier of the EC2 Route Table to be associated with the VPC Endpoint.
    */
  val routeTableId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * Identifier of the VPC Endpoint with which the EC2 Route Table will be associated.
    */
  val vpcEndpointId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object VpcEndpointRouteTableAssociationArgs {
  @scala.inline
  def apply(
    routeTableId: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    vpcEndpointId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  ): VpcEndpointRouteTableAssociationArgs = {
    val __obj = js.Dynamic.literal(routeTableId = routeTableId.asInstanceOf[js.Any], vpcEndpointId = vpcEndpointId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VpcEndpointRouteTableAssociationArgs]
  }
}

