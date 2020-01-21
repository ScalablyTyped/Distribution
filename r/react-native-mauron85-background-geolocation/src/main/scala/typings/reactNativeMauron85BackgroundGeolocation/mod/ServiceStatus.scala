package typings.reactNativeMauron85BackgroundGeolocation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceStatus extends js.Object {
  /**
    * Authorization status.
    *
    * Posible values:
    *  NOT_AUTHORIZED, AUTHORIZED, AUTHORIZED_FOREGROUND
    *
    * @example
    * if (authorization == BackgroundGeolocation.NOT_AUTHORIZED) {...}
    */
  var authorization: AuthorizationStatus
  /** TRUE if service is running. */
  var isRunning: Boolean
  /** TRUE if location services are enabled */
  var locationServicesEnabled: Boolean
}

object ServiceStatus {
  @scala.inline
  def apply(authorization: AuthorizationStatus, isRunning: Boolean, locationServicesEnabled: Boolean): ServiceStatus = {
    val __obj = js.Dynamic.literal(authorization = authorization.asInstanceOf[js.Any], isRunning = isRunning.asInstanceOf[js.Any], locationServicesEnabled = locationServicesEnabled.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ServiceStatus]
  }
}

