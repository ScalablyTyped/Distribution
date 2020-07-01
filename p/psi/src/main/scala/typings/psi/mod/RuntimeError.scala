package typings.psi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RuntimeError extends js.Object {
  var code: String
  var message: String
}

object RuntimeError {
  @scala.inline
  def apply(code: String, message: String): RuntimeError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuntimeError]
  }
}

