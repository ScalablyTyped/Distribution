package typings
package atPulumiAwsLib.ec2VpcIpv4CidrBlockAssociationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VpcIpv4CidrBlockAssociationArgs extends js.Object {
  /**
    * The additional IPv4 CIDR block to associate with the VPC.
    */
  val cidrBlock: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The ID of the VPC to make the association with.
    */
  val vpcId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object VpcIpv4CidrBlockAssociationArgs {
  @scala.inline
  def apply(
    cidrBlock: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    vpcId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  ): VpcIpv4CidrBlockAssociationArgs = {
    val __obj = js.Dynamic.literal(cidrBlock = cidrBlock.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VpcIpv4CidrBlockAssociationArgs]
  }
}

