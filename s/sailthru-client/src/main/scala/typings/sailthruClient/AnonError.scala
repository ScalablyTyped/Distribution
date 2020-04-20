package typings.sailthruClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonError extends js.Object {
  var error: String
  var errormsg: String
  var statusCode: String
}

object AnonError {
  @scala.inline
  def apply(error: String, errormsg: String, statusCode: String): AnonError = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], errormsg = errormsg.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonError]
  }
}

