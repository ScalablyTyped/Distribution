package typings.atPulumiAws.ec2VpcIpv4CidrBlockAssociationMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VpcIpv4CidrBlockAssociationArgs extends js.Object {
  /**
    * The additional IPv4 CIDR block to associate with the VPC.
    */
  val cidrBlock: Input[String] = js.native
  /**
    * The ID of the VPC to make the association with.
    */
  val vpcId: Input[String] = js.native
}

object VpcIpv4CidrBlockAssociationArgs {
  @scala.inline
  def apply(cidrBlock: Input[String], vpcId: Input[String]): VpcIpv4CidrBlockAssociationArgs = {
    val __obj = js.Dynamic.literal(cidrBlock = cidrBlock.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VpcIpv4CidrBlockAssociationArgs]
  }
}

