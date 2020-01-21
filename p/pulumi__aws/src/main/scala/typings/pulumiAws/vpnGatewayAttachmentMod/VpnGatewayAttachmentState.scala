package typings.pulumiAws.vpnGatewayAttachmentMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VpnGatewayAttachmentState extends js.Object {
  /**
    * The ID of the VPC.
    */
  val vpcId: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of the Virtual Private Gateway.
    */
  val vpnGatewayId: js.UndefOr[Input[String]] = js.native
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

