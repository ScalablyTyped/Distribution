package typings
package requestDashPromiseDashNativeLib.errorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatusCodeError
  extends stdLib.Error {
  var error: js.Any
  var options: requestDashPromiseDashNativeLib.requestDashPromiseDashNativeMod.requestPromiseNs.Options
  var response: requestDashPromiseDashNativeLib.requestDashPromiseDashNativeMod.requestPromiseNs.FullResponse
  var statusCode: scala.Double
}

object StatusCodeError {
  @scala.inline
  def apply(
    error: js.Any,
    message: java.lang.String,
    name: java.lang.String,
    options: requestDashPromiseDashNativeLib.requestDashPromiseDashNativeMod.requestPromiseNs.Options,
    response: requestDashPromiseDashNativeLib.requestDashPromiseDashNativeMod.requestPromiseNs.FullResponse,
    statusCode: scala.Double,
    stack: java.lang.String = null
  ): StatusCodeError = {
    val __obj = js.Dynamic.literal(error = error, message = message, name = name, options = options.asInstanceOf[js.Any], response = response, statusCode = statusCode)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[StatusCodeError]
  }
}

