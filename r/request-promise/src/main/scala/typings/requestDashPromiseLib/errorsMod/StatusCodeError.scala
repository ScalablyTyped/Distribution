package typings
package requestDashPromiseLib.errorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatusCodeError
  extends nodeLib.Error {
  var error: js.Any
  var options: requestDashPromiseLib.requestDashPromiseMod.requestPromiseNs.Options
  var response: nodeLib.httpMod.IncomingMessage
  var statusCode: scala.Double
}

object StatusCodeError {
  @scala.inline
  def apply(
    error: js.Any,
    options: requestDashPromiseLib.requestDashPromiseMod.requestPromiseNs.Options,
    response: nodeLib.httpMod.IncomingMessage,
    statusCode: scala.Double,
    stack: java.lang.String = null
  ): StatusCodeError = {
    val __obj = js.Dynamic.literal(error = error, options = options.asInstanceOf[js.Any], response = response, statusCode = statusCode)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[StatusCodeError]
  }
}

