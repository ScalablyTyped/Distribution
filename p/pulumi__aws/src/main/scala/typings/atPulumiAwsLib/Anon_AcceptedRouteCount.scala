package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AcceptedRouteCount extends js.Object {
  var acceptedRouteCount: scala.Double
  var lastStatusChange: java.lang.String
  var outsideIpAddress: java.lang.String
  var status: java.lang.String
  var statusMessage: java.lang.String
}

object Anon_AcceptedRouteCount {
  @scala.inline
  def apply(
    acceptedRouteCount: scala.Double,
    lastStatusChange: java.lang.String,
    outsideIpAddress: java.lang.String,
    status: java.lang.String,
    statusMessage: java.lang.String
  ): Anon_AcceptedRouteCount = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acceptedRouteCount")(acceptedRouteCount)
    __obj.updateDynamic("lastStatusChange")(lastStatusChange)
    __obj.updateDynamic("outsideIpAddress")(outsideIpAddress)
    __obj.updateDynamic("status")(status)
    __obj.updateDynamic("statusMessage")(statusMessage)
    __obj.asInstanceOf[Anon_AcceptedRouteCount]
  }
}

