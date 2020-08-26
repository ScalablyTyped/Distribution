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
  def apply(): VpnGatewayAttachmentState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpnGatewayAttachmentState]
  }
  @scala.inline
  implicit class VpnGatewayAttachmentStateOps[Self <: VpnGatewayAttachmentState] (val x: Self) extends AnyVal {
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
    def setVpcId(value: Input[String]): Self = this.set("vpcId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcId: Self = this.set("vpcId", js.undefined)
    @scala.inline
    def setVpnGatewayId(value: Input[String]): Self = this.set("vpnGatewayId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpnGatewayId: Self = this.set("vpnGatewayId", js.undefined)
  }
  
}

