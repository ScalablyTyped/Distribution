package typings.atPulumiAws.ec2MainRouteTableAssociationMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MainRouteTableAssociationArgs extends js.Object {
  /**
    * The ID of the Route Table to set as the new
    * main route table for the target VPC
    */
  val routeTableId: Input[String]
  /**
    * The ID of the VPC whose main route table should be set
    */
  val vpcId: Input[String]
}

object MainRouteTableAssociationArgs {
  @scala.inline
  def apply(routeTableId: Input[String], vpcId: Input[String]): MainRouteTableAssociationArgs = {
    val __obj = js.Dynamic.literal(routeTableId = routeTableId.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MainRouteTableAssociationArgs]
  }
}

