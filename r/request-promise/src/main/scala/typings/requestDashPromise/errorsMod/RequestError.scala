package typings.requestDashPromise.errorsMod

import typings.node.httpMod.IncomingMessage
import typings.requestDashPromise.requestDashPromiseMod.Options
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestError extends Error {
  var cause: js.Any
  var error: js.Any
  var options: Options
  var response: IncomingMessage
}

@JSImport("request-promise/errors", "RequestError")
@js.native
class RequestErrorCls protected () extends RequestError {
  def this(cause: js.Any, options: Options, response: IncomingMessage) = this()
  /* CompleteClass */
  override var cause: js.Any = js.native
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
}

object RequestError {
  @scala.inline
  def apply(
    cause: js.Any,
    error: js.Any,
    message: String,
    name: String,
    options: Options,
    response: IncomingMessage,
    stack: String = null
  ): RequestError = {
    val __obj = js.Dynamic.literal(cause = cause, error = error, message = message, name = name, options = options.asInstanceOf[js.Any], response = response)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[RequestError]
  }
}

