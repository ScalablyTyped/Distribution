package typings.pulumiAws.inputMod.ec2

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VpnConnectionVgwTelemetry extends js.Object {
  var acceptedRouteCount: js.UndefOr[Input[Double]] = js.native
  var lastStatusChange: js.UndefOr[Input[String]] = js.native
  var outsideIpAddress: js.UndefOr[Input[String]] = js.native
  var status: js.UndefOr[Input[String]] = js.native
  var statusMessage: js.UndefOr[Input[String]] = js.native
}

object VpnConnectionVgwTelemetry {
  @scala.inline
  def apply(): VpnConnectionVgwTelemetry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpnConnectionVgwTelemetry]
  }
  @scala.inline
  implicit class VpnConnectionVgwTelemetryOps[Self <: VpnConnectionVgwTelemetry] (val x: Self) extends AnyVal {
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
    def setAcceptedRouteCount(value: Input[Double]): Self = this.set("acceptedRouteCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAcceptedRouteCount: Self = this.set("acceptedRouteCount", js.undefined)
    @scala.inline
    def setLastStatusChange(value: Input[String]): Self = this.set("lastStatusChange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastStatusChange: Self = this.set("lastStatusChange", js.undefined)
    @scala.inline
    def setOutsideIpAddress(value: Input[String]): Self = this.set("outsideIpAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutsideIpAddress: Self = this.set("outsideIpAddress", js.undefined)
    @scala.inline
    def setStatus(value: Input[String]): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setStatusMessage(value: Input[String]): Self = this.set("statusMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusMessage: Self = this.set("statusMessage", js.undefined)
  }
  
}

