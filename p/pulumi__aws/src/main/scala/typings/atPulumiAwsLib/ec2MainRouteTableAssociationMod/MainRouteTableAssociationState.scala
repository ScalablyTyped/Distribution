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

