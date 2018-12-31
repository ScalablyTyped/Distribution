package typings
package atPulumiAwsLib.ec2MainRouteTableAssociationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MainRouteTableAssociationArgs extends js.Object {
  /**
    * The ID of the Route Table to set as the new
    * main route table for the target VPC
    */
  val routeTableId: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * The ID of the VPC whose main route table should be set
    */
  val vpcId: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

