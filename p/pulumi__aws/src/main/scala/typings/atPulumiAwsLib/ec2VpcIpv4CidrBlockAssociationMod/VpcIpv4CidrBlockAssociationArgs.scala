package typings
package atPulumiAwsLib.ec2VpcIpv4CidrBlockAssociationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VpcIpv4CidrBlockAssociationArgs extends js.Object {
  /**
    * The additional IPv4 CIDR block to associate with the VPC.
    */
  val cidrBlock: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * The ID of the VPC to make the association with.
    */
  val vpcId: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

