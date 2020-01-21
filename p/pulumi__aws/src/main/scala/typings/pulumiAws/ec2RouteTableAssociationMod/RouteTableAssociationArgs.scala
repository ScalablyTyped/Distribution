package typings.pulumiAws.ec2RouteTableAssociationMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouteTableAssociationArgs extends js.Object {
  /**
    * The gateway ID to create an association. Conflicts with `subnetId`.
    */
  val gatewayId: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of the routing table to associate with.
    */
  val routeTableId: Input[String] = js.native
  /**
    * The subnet ID to create an association. Conflicts with `gatewayId`.
    */
  val subnetId: js.UndefOr[Input[String]] = js.native
}

object RouteTableAssociationArgs {
  @scala.inline
  def apply(routeTableId: Input[String], gatewayId: Input[String] = null, subnetId: Input[String] = null): RouteTableAssociationArgs = {
    val __obj = js.Dynamic.literal(routeTableId = routeTableId.asInstanceOf[js.Any])
    if (gatewayId != null) __obj.updateDynamic("gatewayId")(gatewayId.asInstanceOf[js.Any])
    if (subnetId != null) __obj.updateDynamic("subnetId")(subnetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteTableAssociationArgs]
  }
}

