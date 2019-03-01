package typings
package reactDashNativeLib

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("PERMISSION_DENIED")(PERMISSION_DENIED)
    __obj.updateDynamic("POSITION_UNAVAILABLE")(POSITION_UNAVAILABLE)
    __obj.updateDynamic("TIMEOUT")(TIMEOUT)
    __obj.updateDynamic("code")(code)
    __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[GeolocationError]
  }
}

