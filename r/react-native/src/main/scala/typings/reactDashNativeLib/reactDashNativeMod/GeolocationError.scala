package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeolocationError extends js.Object {
  var PERMISSION_DENIED: scala.Double
  var POSITION_UNAVAILABLE: scala.Double
  var TIMEOUT: scala.Double
  var code: scala.Double
  var message: java.lang.String
}

object GeolocationError {
  @scala.inline
  def apply(
    PERMISSION_DENIED: scala.Double,
    POSITION_UNAVAILABLE: scala.Double,
    TIMEOUT: scala.Double,
    code: scala.Double,
    message: java.lang.String
  ): GeolocationError = {
    val __obj = js.Dynamic.literal(PERMISSION_DENIED = PERMISSION_DENIED, POSITION_UNAVAILABLE = POSITION_UNAVAILABLE, TIMEOUT = TIMEOUT, code = code, message = message)
  
    __obj.asInstanceOf[GeolocationError]
  }
}

