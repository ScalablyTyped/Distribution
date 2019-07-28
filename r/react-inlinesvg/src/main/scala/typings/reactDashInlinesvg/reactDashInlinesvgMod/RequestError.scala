package typings.reactDashInlinesvg.reactDashInlinesvgMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestError extends Error {
  var isHttpError: Boolean
  var status: Double
}

object RequestError {
  @scala.inline
  def apply(isHttpError: Boolean, message: String, name: String, status: Double, stack: String = null): RequestError = {
    val __obj = js.Dynamic.literal(isHttpError = isHttpError, message = message, name = name, status = status)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[RequestError]
  }
}

