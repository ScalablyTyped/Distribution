package typings
package atPulumiAwsLib.ec2VpcIpv4CidrBlockAssociationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VpcIpv4CidrBlockAssociationState extends js.Object {
  /**
    * The additional IPv4 CIDR block to associate with the VPC.
    */
  val cidrBlock: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The ID of the VPC to make the association with.
    */
  val vpcId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

