package typings.reactNativeElements

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonError extends js.Object {
  var error: String
  var primary: String
  var secondary: String
  var success: String
  var warning: String
}

object AnonError {
  @scala.inline
  def apply(error: String, primary: String, secondary: String, success: String, warning: String): AnonError = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], primary = primary.asInstanceOf[js.Any], secondary = secondary.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], warning = warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonError]
  }
}

