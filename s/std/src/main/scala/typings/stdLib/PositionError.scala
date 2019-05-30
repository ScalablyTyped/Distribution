package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The reason of an error occurring when using the geolocating device. */
trait PositionError extends js.Object {
  val PERMISSION_DENIED: scala.Double
  val POSITION_UNAVAILABLE: scala.Double
  val TIMEOUT: scala.Double
  val code: scala.Double
  val message: java.lang.String
}

object PositionError {
  @scala.inline
  def apply(
    PERMISSION_DENIED: scala.Double,
    POSITION_UNAVAILABLE: scala.Double,
    TIMEOUT: scala.Double,
    code: scala.Double,
    message: java.lang.String
  ): PositionError = {
    val __obj = js.Dynamic.literal(PERMISSION_DENIED = PERMISSION_DENIED, POSITION_UNAVAILABLE = POSITION_UNAVAILABLE, TIMEOUT = TIMEOUT, code = code, message = message)
  
    __obj.asInstanceOf[PositionError]
  }
}

