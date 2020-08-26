package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The reason of an error occurring when using the geolocating device. */
@js.native
trait PositionError extends js.Object {
  val PERMISSION_DENIED: Double = js.native
  val POSITION_UNAVAILABLE: Double = js.native
  val TIMEOUT: Double = js.native
  val code: Double = js.native
  val message: java.lang.String = js.native
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
  @scala.inline
  implicit class PositionErrorOps[Self <: PositionError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPERMISSION_DENIED(value: Double): Self = this.set("PERMISSION_DENIED", value.asInstanceOf[js.Any])
    @scala.inline
    def setPOSITION_UNAVAILABLE(value: Double): Self = this.set("POSITION_UNAVAILABLE", value.asInstanceOf[js.Any])
    @scala.inline
    def setTIMEOUT(value: Double): Self = this.set("TIMEOUT", value.asInstanceOf[js.Any])
    @scala.inline
    def setCode(value: Double): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: java.lang.String): Self = this.set("message", value.asInstanceOf[js.Any])
  }
  
}

