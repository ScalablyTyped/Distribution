package typings.pulumiAws.outputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
}

