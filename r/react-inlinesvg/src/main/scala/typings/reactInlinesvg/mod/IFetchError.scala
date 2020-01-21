package typings.reactInlinesvg.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFetchError extends Error {
  var code: String
  var errno: String
  var `type`: String
}

object IFetchError {
  @scala.inline
  def apply(code: String, errno: String, message: String, name: String, `type`: String, stack: String = null): IFetchError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], errno = errno.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFetchError]
  }
}

