package typings.atPulumiAws.typesOutputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VpnConnectionVgwTelemetry extends js.Object {
  var acceptedRouteCount: Double
  var lastStatusChange: String
  var outsideIpAddress: String
  var status: String
  var statusMessage: String
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
    val __obj = js.Dynamic.literal(acceptedRouteCount = acceptedRouteCount, lastStatusChange = lastStatusChange, outsideIpAddress = outsideIpAddress, status = status, statusMessage = statusMessage)
  
    __obj.asInstanceOf[VpnConnectionVgwTelemetry]
  }
}

