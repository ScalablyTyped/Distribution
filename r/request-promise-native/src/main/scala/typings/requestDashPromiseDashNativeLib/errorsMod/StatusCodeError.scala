package typings
package requestDashPromiseDashNativeLib.errorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatusCodeError
  extends stdLib.Error {
  var error: js.Any
  var options: requestDashPromiseDashNativeLib.requestDashPromiseDashNativeMod.Options
  var response: requestDashPromiseDashNativeLib.requestDashPromiseDashNativeMod.FullResponse
  var statusCode: scala.Double
}

@JSImport("request-promise-native/errors", "StatusCodeError")
@js.native
class StatusCodeErrorCls protected () extends StatusCodeError {
  def this(statusCode: scala.Double, body: js.Any, options: requestDashPromiseDashNativeLib.requestDashPromiseDashNativeMod.Options, response: requestDashPromiseDashNativeLib.requestDashPromiseDashNativeMod.FullResponse) = this()
  /* CompleteClass */
  override var error: js.Any = js.native
  /* CompleteClass */
  override var message: java.lang.String = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
  /* CompleteClass */
  override var options: requestDashPromiseDashNativeLib.requestDashPromiseDashNativeMod.Options = js.native
  /* CompleteClass */
  override var response: requestDashPromiseDashNativeLib.requestDashPromiseDashNativeMod.FullResponse = js.native
  /* CompleteClass */
  override var statusCode: scala.Double = js.native
}

object StatusCodeError {
  @scala.inline
  def apply(
    error: js.Any,
    message: java.lang.String,
    name: java.lang.String,
    options: requestDashPromiseDashNativeLib.requestDashPromiseDashNativeMod.Options,
    response: requestDashPromiseDashNativeLib.requestDashPromiseDashNativeMod.FullResponse,
    statusCode: scala.Double,
    stack: java.lang.String = null
  ): StatusCodeError = {
    val __obj = js.Dynamic.literal(error = error, message = message, name = name, options = options.asInstanceOf[js.Any], response = response, statusCode = statusCode)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[StatusCodeError]
  }
}

