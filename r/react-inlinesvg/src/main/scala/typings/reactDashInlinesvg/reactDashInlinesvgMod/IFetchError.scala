package typings.reactDashInlinesvg.reactDashInlinesvgMod

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
    val __obj = js.Dynamic.literal(code = code, errno = errno, message = message, name = name)
    __obj.updateDynamic("type")(`type`)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[IFetchError]
  }
}

