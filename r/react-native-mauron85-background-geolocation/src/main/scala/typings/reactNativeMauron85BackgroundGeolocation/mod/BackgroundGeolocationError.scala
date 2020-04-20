package typings.reactNativeMauron85BackgroundGeolocation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackgroundGeolocationError extends js.Object {
  var code: Double
  var message: String
}

object BackgroundGeolocationError {
  @scala.inline
  def apply(code: Double, message: String): BackgroundGeolocationError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundGeolocationError]
  }
}

