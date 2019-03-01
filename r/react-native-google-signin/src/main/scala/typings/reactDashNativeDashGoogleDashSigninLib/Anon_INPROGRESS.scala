package typings
package reactDashNativeDashGoogleDashSigninLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_INPROGRESS extends js.Object {
  var IN_PROGRESS: java.lang.String
  var PLAY_SERVICES_NOT_AVAILABLE: java.lang.String
  var SIGN_IN_CANCELLED: java.lang.String
  var SIGN_IN_REQUIRED: java.lang.String
}

object Anon_INPROGRESS {
  @scala.inline
  def apply(
    IN_PROGRESS: java.lang.String,
    PLAY_SERVICES_NOT_AVAILABLE: java.lang.String,
    SIGN_IN_CANCELLED: java.lang.String,
    SIGN_IN_REQUIRED: java.lang.String
  ): Anon_INPROGRESS = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("IN_PROGRESS")(IN_PROGRESS)
    __obj.updateDynamic("PLAY_SERVICES_NOT_AVAILABLE")(PLAY_SERVICES_NOT_AVAILABLE)
    __obj.updateDynamic("SIGN_IN_CANCELLED")(SIGN_IN_CANCELLED)
    __obj.updateDynamic("SIGN_IN_REQUIRED")(SIGN_IN_REQUIRED)
    __obj.asInstanceOf[Anon_INPROGRESS]
  }
}

