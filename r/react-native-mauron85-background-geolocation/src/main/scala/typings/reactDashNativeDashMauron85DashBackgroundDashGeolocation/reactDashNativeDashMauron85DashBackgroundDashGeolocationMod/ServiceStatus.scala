package typings.reactDashNativeDashMauron85DashBackgroundDashGeolocation.reactDashNativeDashMauron85DashBackgroundDashGeolocationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceStatus extends js.Object {
  var authorization: Double
  var hasPermissions: Boolean
  var isRunning: Boolean
  var locationServicesEnabled: Boolean
}

object ServiceStatus {
  @scala.inline
  def apply(
    authorization: Double,
    hasPermissions: Boolean,
    isRunning: Boolean,
    locationServicesEnabled: Boolean
  ): ServiceStatus = {
    val __obj = js.Dynamic.literal(authorization = authorization, hasPermissions = hasPermissions, isRunning = isRunning, locationServicesEnabled = locationServicesEnabled)
  
    __obj.asInstanceOf[ServiceStatus]
  }
}

