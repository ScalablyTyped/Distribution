package typings.atPulumiAws.ec2VpnGatewayAttachmentMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VpnGatewayAttachmentArgs extends js.Object {
  /**
    * The ID of the VPC.
    */
  val vpcId: Input[String] = js.native
  /**
    * The ID of the Virtual Private Gateway.
    */
  val vpnGatewayId: Input[String] = js.native
}

object VpnGatewayAttachmentArgs {
  @scala.inline
  def apply(vpcId: Input[String], vpnGatewayId: Input[String]): VpnGatewayAttachmentArgs = {
    val __obj = js.Dynamic.literal(vpcId = vpcId.asInstanceOf[js.Any], vpnGatewayId = vpnGatewayId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VpnGatewayAttachmentArgs]
  }
}

