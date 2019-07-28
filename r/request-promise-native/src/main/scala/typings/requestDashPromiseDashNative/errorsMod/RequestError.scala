package typings.requestDashPromiseDashNative.errorsMod

import typings.requestDashPromiseDashNative.requestDashPromiseDashNativeMod.FullResponse
import typings.requestDashPromiseDashNative.requestDashPromiseDashNativeMod.Options
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestError extends Error {
  var cause: js.Any
  var error: js.Any
  var options: Options
  var response: FullResponse
}

@JSImport("request-promise-native/errors", "RequestError")
@js.native
class RequestErrorCls protected () extends RequestError {
  def this(cause: js.Any, options: Options, response: FullResponse) = this()
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
  override var response: FullResponse = js.native
}

object RequestError {
  @scala.inline
  def apply(
    cause: js.Any,
    error: js.Any,
    message: String,
    name: String,
    options: Options,
    response: FullResponse,
    stack: String = null
  ): RequestError = {
    val __obj = js.Dynamic.literal(cause = cause, error = error, message = message, name = name, options = options.asInstanceOf[js.Any], response = response)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[RequestError]
  }
}

