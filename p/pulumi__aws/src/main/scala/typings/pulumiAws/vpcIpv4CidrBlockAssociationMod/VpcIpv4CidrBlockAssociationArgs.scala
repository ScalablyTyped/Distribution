package typings.pulumiAws.vpcIpv4CidrBlockAssociationMod

import typings.pulumiPulumi.outputMod.Input
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
  @scala.inline
  implicit class VpcIpv4CidrBlockAssociationArgsOps[Self <: VpcIpv4CidrBlockAssociationArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCidrBlock(value: Input[String]): Self = this.set("cidrBlock", value.asInstanceOf[js.Any])
    @scala.inline
    def setVpcId(value: Input[String]): Self = this.set("vpcId", value.asInstanceOf[js.Any])
  }
  
}

