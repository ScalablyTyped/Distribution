package typings.pulumiAws.vpcIpv4CidrBlockAssociationMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VpcIpv4CidrBlockAssociationState extends js.Object {
  /**
    * The additional IPv4 CIDR block to associate with the VPC.
    */
  val cidrBlock: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of the VPC to make the association with.
    */
  val vpcId: js.UndefOr[Input[String]] = js.native
}

object VpcIpv4CidrBlockAssociationState {
  @scala.inline
  def apply(cidrBlock: Input[String] = null, vpcId: Input[String] = null): VpcIpv4CidrBlockAssociationState = {
    val __obj = js.Dynamic.literal()
    if (cidrBlock != null) __obj.updateDynamic("cidrBlock")(cidrBlock.asInstanceOf[js.Any])
    if (vpcId != null) __obj.updateDynamic("vpcId")(vpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpcIpv4CidrBlockAssociationState]
  }
}

