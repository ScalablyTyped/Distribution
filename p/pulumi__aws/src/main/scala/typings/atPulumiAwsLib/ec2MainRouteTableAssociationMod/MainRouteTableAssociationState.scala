package typings
package atPulumiAwsLib.ec2MainRouteTableAssociationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MainRouteTableAssociationState extends js.Object {
  /**
    * Used internally, see __Notes__ below
    */
  val originalRouteTableId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The ID of the Route Table to set as the new
    * main route table for the target VPC
    */
  val routeTableId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The ID of the VPC whose main route table should be set
    */
  val vpcId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object MainRouteTableAssociationState {
  @scala.inline
  def apply(
    originalRouteTableId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    routeTableId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    vpcId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): MainRouteTableAssociationState = {
    val __obj = js.Dynamic.literal()
    if (originalRouteTableId != null) __obj.updateDynamic("originalRouteTableId")(originalRouteTableId.asInstanceOf[js.Any])
    if (routeTableId != null) __obj.updateDynamic("routeTableId")(routeTableId.asInstanceOf[js.Any])
    if (vpcId != null) __obj.updateDynamic("vpcId")(vpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MainRouteTableAssociationState]
  }
}

