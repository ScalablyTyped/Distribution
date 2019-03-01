package typings
package atPulumiAwsLib.ec2VpnGatewayAttachmentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VpnGatewayAttachmentArgs extends js.Object {
  /**
    * The ID of the VPC.
    */
  val vpcId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The ID of the Virtual Private Gateway.
    */
  val vpnGatewayId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object VpnGatewayAttachmentArgs {
  @scala.inline
  def apply(
    vpcId: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    vpnGatewayId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  ): VpnGatewayAttachmentArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("vpcId")(vpcId.asInstanceOf[js.Any])
    __obj.updateDynamic("vpnGatewayId")(vpnGatewayId.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpnGatewayAttachmentArgs]
  }
}

