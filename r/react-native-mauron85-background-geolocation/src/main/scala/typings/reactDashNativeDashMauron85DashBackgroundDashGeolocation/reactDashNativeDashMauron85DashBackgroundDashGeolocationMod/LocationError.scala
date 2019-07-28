package typings.reactDashNativeDashMauron85DashBackgroundDashGeolocation.reactDashNativeDashMauron85DashBackgroundDashGeolocationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationError extends js.Object {
  /** Reason of an error occurring when using the geolocating device. */
  var code: Double
  /** Message describing the details of the error */
  var message: String
}

object LocationError {
  @scala.inline
  def apply(code: Double, message: String): LocationError = {
    val __obj = js.Dynamic.literal(code = code, message = message)
  
    __obj.asInstanceOf[LocationError]
  }
}

