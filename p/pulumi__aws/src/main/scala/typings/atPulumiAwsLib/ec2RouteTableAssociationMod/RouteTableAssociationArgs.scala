package typings
package atPulumiAwsLib.ec2RouteTableAssociationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteTableAssociationArgs extends js.Object {
  /**
    * The ID of the routing table to associate with.
    */
  val routeTableId: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * The subnet ID to create an association.
    */
  val subnetId: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

