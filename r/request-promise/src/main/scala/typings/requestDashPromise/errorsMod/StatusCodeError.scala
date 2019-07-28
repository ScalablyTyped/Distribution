package typings.requestDashPromise.errorsMod

import typings.node.httpMod.IncomingMessage
import typings.requestDashPromise.requestDashPromiseMod.Options
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatusCodeError extends Error {
  var error: js.Any
  var options: Options
  var response: IncomingMessage
  var statusCode: Double
}

@JSImport("request-promise/errors", "StatusCodeError")
@js.native
class StatusCodeErrorCls protected () extends StatusCodeError {
  def this(statusCode: Double, body: js.Any, options: Options, response: IncomingMessage) = this()
  /* CompleteClass */
  override var error: js.Any = js.native
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var name: String = js.native
  /* CompleteClass */
  override var options: Options = js.native
  /* CompleteClass */
  override var response: IncomingMessage = js.native
  /* CompleteClass */
  override var statusCode: Double = js.native
}

object StatusCodeError {
  @scala.inline
  def apply(
    error: js.Any,
    message: String,
    name: String,
    options: Options,
    response: IncomingMessage,
    statusCode: Double,
    stack: String = null
  ): StatusCodeError = {
    val __obj = js.Dynamic.literal(error = error, message = message, name = name, options = options.asInstanceOf[js.Any], response = response, statusCode = statusCode)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[StatusCodeError]
  }
}

