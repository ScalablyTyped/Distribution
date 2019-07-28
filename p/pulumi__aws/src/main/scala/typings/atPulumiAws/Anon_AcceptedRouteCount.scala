package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AcceptedRouteCount extends js.Object {
  var acceptedRouteCount: Double
  var lastStatusChange: String
  var outsideIpAddress: String
  var status: String
  var statusMessage: String
}

object Anon_AcceptedRouteCount {
  @scala.inline
  def apply(
    acceptedRouteCount: Double,
    lastStatusChange: String,
    outsideIpAddress: String,
    status: String,
    statusMessage: String
  ): Anon_AcceptedRouteCount = {
    val __obj = js.Dynamic.literal(acceptedRouteCount = acceptedRouteCount, lastStatusChange = lastStatusChange, outsideIpAddress = outsideIpAddress, status = status, statusMessage = statusMessage)
  
    __obj.asInstanceOf[Anon_AcceptedRouteCount]
  }
}

