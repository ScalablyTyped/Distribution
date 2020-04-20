package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The reason of an error occurring when using the geolocating device. */
trait PositionError extends js.Object {
  val PERMISSION_DENIED: Double
  val POSITION_UNAVAILABLE: Double
  val TIMEOUT: Double
  val code: Double
  val message: java.lang.String
}

object PositionError {
  @scala.inline
  def apply(
    PERMISSION_DENIED: Double,
    POSITION_UNAVAILABLE: Double,
    TIMEOUT: Double,
    code: Double,
    message: java.lang.String
  ): PositionError = {
    val __obj = js.Dynamic.literal(PERMISSION_DENIED = PERMISSION_DENIED.asInstanceOf[js.Any], POSITION_UNAVAILABLE = POSITION_UNAVAILABLE.asInstanceOf[js.Any], TIMEOUT = TIMEOUT.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[PositionError]
  }
}

