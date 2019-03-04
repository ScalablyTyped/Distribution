package typings
package reactDashInlinesvgLib.reactDashInlinesvgMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestError
  extends stdLib.Error {
  var isHttpError: scala.Boolean
  var status: scala.Double
}

object RequestError {
  @scala.inline
  def apply(
    isHttpError: scala.Boolean,
    message: java.lang.String,
    name: java.lang.String,
    status: scala.Double,
    stack: java.lang.String = null
  ): RequestError = {
    val __obj = js.Dynamic.literal(isHttpError = isHttpError, message = message, name = name, status = status)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[RequestError]
  }
}

