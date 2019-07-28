package typings.reactDashNative.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeolocationError extends js.Object {
  var PERMISSION_DENIED: Double
  var POSITION_UNAVAILABLE: Double
  var TIMEOUT: Double
  var code: Double
  var message: String
}

object GeolocationError {
  @scala.inline
  def apply(
    PERMISSION_DENIED: Double,
    POSITION_UNAVAILABLE: Double,
    TIMEOUT: Double,
    code: Double,
    message: String
  ): GeolocationError = {
    val __obj = js.Dynamic.literal(PERMISSION_DENIED = PERMISSION_DENIED, POSITION_UNAVAILABLE = POSITION_UNAVAILABLE, TIMEOUT = TIMEOUT, code = code, message = message)
  
    __obj.asInstanceOf[GeolocationError]
  }
}

