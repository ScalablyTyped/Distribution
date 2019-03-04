package typings
package requestDashPromiseDashNativeLib.errorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestError
  extends nodeLib.Error {
  var cause: js.Any
  var error: js.Any
  var options: requestDashPromiseDashNativeLib.requestDashPromiseDashNativeMod.requestPromiseNs.Options
  var response: requestDashPromiseDashNativeLib.requestDashPromiseDashNativeMod.requestPromiseNs.FullResponse
}

object RequestError {
  @scala.inline
  def apply(
    cause: js.Any,
    error: js.Any,
    options: requestDashPromiseDashNativeLib.requestDashPromiseDashNativeMod.requestPromiseNs.Options,
    response: requestDashPromiseDashNativeLib.requestDashPromiseDashNativeMod.requestPromiseNs.FullResponse,
    stack: java.lang.String = null
  ): RequestError = {
    val __obj = js.Dynamic.literal(cause = cause, error = error, options = options.asInstanceOf[js.Any], response = response)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[RequestError]
  }
}

