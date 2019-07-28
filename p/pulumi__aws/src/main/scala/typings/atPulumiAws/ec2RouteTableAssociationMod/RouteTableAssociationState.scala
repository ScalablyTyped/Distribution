package typings.atPulumiAws.ec2RouteTableAssociationMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteTableAssociationState extends js.Object {
  /**
    * The ID of the routing table to associate with.
    */
  val routeTableId: js.UndefOr[Input[String]] = js.undefined
  /**
    * The subnet ID to create an association.
    */
  val subnetId: js.UndefOr[Input[String]] = js.undefined
}

object RouteTableAssociationState {
  @scala.inline
  def apply(routeTableId: Input[String] = null, subnetId: Input[String] = null): RouteTableAssociationState = {
    val __obj = js.Dynamic.literal()
    if (routeTableId != null) __obj.updateDynamic("routeTableId")(routeTableId.asInstanceOf[js.Any])
    if (subnetId != null) __obj.updateDynamic("subnetId")(subnetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteTableAssociationState]
  }
}

