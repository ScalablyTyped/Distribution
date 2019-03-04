package typings
package atPulumiAwsLib.ec2RouteTableAssociationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteTableAssociationArgs extends js.Object {
  /**
    * The ID of the routing table to associate with.
    */
  val routeTableId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The subnet ID to create an association.
    */
  val subnetId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object RouteTableAssociationArgs {
  @scala.inline
  def apply(
    routeTableId: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    subnetId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  ): RouteTableAssociationArgs = {
    val __obj = js.Dynamic.literal(routeTableId = routeTableId.asInstanceOf[js.Any], subnetId = subnetId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RouteTableAssociationArgs]
  }
}

