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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cause")(cause)
    __obj.updateDynamic("error")(error)
    __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.updateDynamic("response")(response)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[RequestError]
  }
}

