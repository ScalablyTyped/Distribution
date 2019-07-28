package typings.soap.libClientMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISoapError extends Error {
  var body: js.UndefOr[js.Any] = js.undefined
  var response: js.UndefOr[js.Any] = js.undefined
}

object ISoapError {
  @scala.inline
  def apply(message: String, name: String, body: js.Any = null, response: js.Any = null, stack: String = null): ISoapError = {
    val __obj = js.Dynamic.literal(message = message, name = name)
    if (body != null) __obj.updateDynamic("body")(body)
    if (response != null) __obj.updateDynamic("response")(response)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[ISoapError]
  }
}

