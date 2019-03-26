package typings
package requestDashPromiseDashNativeLib.errorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestError
  extends stdLib.Error {
  var cause: js.Any
  var error: js.Any
  var options: requestDashPromiseDashNativeLib.requestDashPromiseDashNativeMod.requestPromiseNs.Options
  var response: requestDashPromiseDashNativeLib.requestDashPromiseDashNativeMod.requestPromiseNs.FullResponse
}

@JSImport("request-promise-native/errors", "RequestError")
@js.native
class RequestErrorCls protected () extends RequestError {
  def this(cause: js.Any, options: requestDashPromiseDashNativeLib.requestDashPromiseDashNativeMod.requestPromiseNs.Options, response: requestDashPromiseDashNativeLib.requestDashPromiseDashNativeMod.requestPromiseNs.FullResponse) = this()
  /* CompleteClass */
  override var cause: js.Any = js.native
  /* CompleteClass */
  override var error: js.Any = js.native
  /* CompleteClass */
  override var message: java.lang.String = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
  /* CompleteClass */
  override var options: requestDashPromiseDashNativeLib.requestDashPromiseDashNativeMod.requestPromiseNs.Options = js.native
  /* CompleteClass */
  override var response: requestDashPromiseDashNativeLib.requestDashPromiseDashNativeMod.requestPromiseNs.FullResponse = js.native
}

object RequestError {
  @scala.inline
  def apply(
    cause: js.Any,
    error: js.Any,
    message: java.lang.String,
    name: java.lang.String,
    options: requestDashPromiseDashNativeLib.requestDashPromiseDashNativeMod.requestPromiseNs.Options,
    response: requestDashPromiseDashNativeLib.requestDashPromiseDashNativeMod.requestPromiseNs.FullResponse,
    stack: java.lang.String = null
  ): RequestError = {
    val __obj = js.Dynamic.literal(cause = cause, error = error, message = message, name = name, options = options.asInstanceOf[js.Any], response = response)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[RequestError]
  }
}

