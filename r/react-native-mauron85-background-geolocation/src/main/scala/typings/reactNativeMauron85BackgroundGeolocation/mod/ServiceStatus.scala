package typings.reactNativeMauron85BackgroundGeolocation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
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
  var authorization: AuthorizationStatus = js.native
  /** TRUE if service is running. */
  var isRunning: Boolean = js.native
  /** TRUE if location services are enabled */
  var locationServicesEnabled: Boolean = js.native
}

object ServiceStatus {
  @scala.inline
  def apply(authorization: AuthorizationStatus, isRunning: Boolean, locationServicesEnabled: Boolean): ServiceStatus = {
    val __obj = js.Dynamic.literal(authorization = authorization.asInstanceOf[js.Any], isRunning = isRunning.asInstanceOf[js.Any], locationServicesEnabled = locationServicesEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceStatus]
  }
  @scala.inline
  implicit class ServiceStatusOps[Self <: ServiceStatus] (val x: Self) extends AnyVal {
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
    def setAuthorization(value: AuthorizationStatus): Self = this.set("authorization", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsRunning(value: Boolean): Self = this.set("isRunning", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocationServicesEnabled(value: Boolean): Self = this.set("locationServicesEnabled", value.asInstanceOf[js.Any])
  }
  
}

