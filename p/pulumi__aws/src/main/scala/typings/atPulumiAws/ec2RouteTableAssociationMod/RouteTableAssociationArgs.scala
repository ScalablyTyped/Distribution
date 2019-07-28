package typings.atPulumiAws.ec2RouteTableAssociationMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteTableAssociationArgs extends js.Object {
  /**
    * The ID of the routing table to associate with.
    */
  val routeTableId: Input[String]
  /**
    * The subnet ID to create an association.
    */
  val subnetId: Input[String]
}

object RouteTableAssociationArgs {
  @scala.inline
  def apply(routeTableId: Input[String], subnetId: Input[String]): RouteTableAssociationArgs = {
    val __obj = js.Dynamic.literal(routeTableId = routeTableId.asInstanceOf[js.Any], subnetId = subnetId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RouteTableAssociationArgs]
  }
}

