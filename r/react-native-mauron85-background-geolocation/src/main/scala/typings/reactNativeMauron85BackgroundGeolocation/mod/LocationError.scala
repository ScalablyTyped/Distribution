package typings.reactNativeMauron85BackgroundGeolocation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationError extends js.Object {
  /**
    * Reason of an error occurring when using the geolocating device.
    *
    * Possible error codes:
    *  1. PERMISSION_DENIED
    *  2. LOCATION_UNAVAILABLE
    *  3. TIMEOUT
    */
  var code: LocationErrorCode
  /** Message describing the details of the error */
  var message: String
}

object LocationError {
  @scala.inline
  def apply(code: LocationErrorCode, message: String): LocationError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationError]
  }
}

