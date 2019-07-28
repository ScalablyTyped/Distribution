package typings.atPulumiAws.ec2VpnGatewayAttachmentMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VpnGatewayAttachmentState extends js.Object {
  /**
    * The ID of the VPC.
    */
  val vpcId: js.UndefOr[Input[String]] = js.undefined
  /**
    * The ID of the Virtual Private Gateway.
    */
  val vpnGatewayId: js.UndefOr[Input[String]] = js.undefined
}

object VpnGatewayAttachmentState {
  @scala.inline
  def apply(vpcId: Input[String] = null, vpnGatewayId: Input[String] = null): VpnGatewayAttachmentState = {
    val __obj = js.Dynamic.literal()
    if (vpcId != null) __obj.updateDynamic("vpcId")(vpcId.asInstanceOf[js.Any])
    if (vpnGatewayId != null) __obj.updateDynamic("vpnGatewayId")(vpnGatewayId.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpnGatewayAttachmentState]
  }
}

