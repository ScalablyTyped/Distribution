package typings.pulumiAws.outputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VpnConnectionVgwTelemetry extends js.Object {
  
  var acceptedRouteCount: Double = js.native
  
  var lastStatusChange: String = js.native
  
  var outsideIpAddress: String = js.native
  
  var status: String = js.native
  
  var statusMessage: String = js.native
}
object VpnConnectionVgwTelemetry {
  
  @scala.inline
  def apply(
    acceptedRouteCount: Double,
    lastStatusChange: String,
    outsideIpAddress: String,
    status: String,
    statusMessage: String
  ): VpnConnectionVgwTelemetry = {
    val __obj = js.Dynamic.literal(acceptedRouteCount = acceptedRouteCount.asInstanceOf[js.Any], lastStatusChange = lastStatusChange.asInstanceOf[js.Any], outsideIpAddress = outsideIpAddress.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusMessage = statusMessage.asInstanceOf[js.Any])
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
    def setAcceptedRouteCount(value: Double): Self = this.set("acceptedRouteCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastStatusChange(value: String): Self = this.set("lastStatusChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutsideIpAddress(value: String): Self = this.set("outsideIpAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusMessage(value: String): Self = this.set("statusMessage", value.asInstanceOf[js.Any])
  }
}
