package typings.atPulumiAws.ec2MainRouteTableAssociationMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MainRouteTableAssociationState extends js.Object {
  /**
    * Used internally, see __Notes__ below
    */
  val originalRouteTableId: js.UndefOr[Input[String]] = js.undefined
  /**
    * The ID of the Route Table to set as the new
    * main route table for the target VPC
    */
  val routeTableId: js.UndefOr[Input[String]] = js.undefined
  /**
    * The ID of the VPC whose main route table should be set
    */
  val vpcId: js.UndefOr[Input[String]] = js.undefined
}

object MainRouteTableAssociationState {
  @scala.inline
  def apply(
    originalRouteTableId: Input[String] = null,
    routeTableId: Input[String] = null,
    vpcId: Input[String] = null
  ): MainRouteTableAssociationState = {
    val __obj = js.Dynamic.literal()
    if (originalRouteTableId != null) __obj.updateDynamic("originalRouteTableId")(originalRouteTableId.asInstanceOf[js.Any])
    if (routeTableId != null) __obj.updateDynamic("routeTableId")(routeTableId.asInstanceOf[js.Any])
    if (vpcId != null) __obj.updateDynamic("vpcId")(vpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MainRouteTableAssociationState]
  }
}

