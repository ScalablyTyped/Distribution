package typings
package requestDashPromiseLib.errorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatusCodeError
  extends stdLib.Error {
  var error: js.Any
  var options: requestDashPromiseLib.requestDashPromiseMod.Options
  var response: nodeLib.httpMod.IncomingMessage
  var statusCode: scala.Double
}

@JSImport("request-promise/errors", "StatusCodeError")
@js.native
class StatusCodeErrorCls protected () extends StatusCodeError {
  def this(statusCode: scala.Double, body: js.Any, options: requestDashPromiseLib.requestDashPromiseMod.Options, response: nodeLib.httpMod.IncomingMessage) = this()
  /* CompleteClass */
  override var error: js.Any = js.native
  /* CompleteClass */
  override var message: java.lang.String = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
  /* CompleteClass */
  override var options: requestDashPromiseLib.requestDashPromiseMod.Options = js.native
  /* CompleteClass */
  override var response: nodeLib.httpMod.IncomingMessage = js.native
  /* CompleteClass */
  override var statusCode: scala.Double = js.native
}

object StatusCodeError {
  @scala.inline
  def apply(
    error: js.Any,
    message: java.lang.String,
    name: java.lang.String,
    options: requestDashPromiseLib.requestDashPromiseMod.Options,
    response: nodeLib.httpMod.IncomingMessage,
    statusCode: scala.Double,
    stack: java.lang.String = null
  ): StatusCodeError = {
    val __obj = js.Dynamic.literal(error = error, message = message, name = name, options = options.asInstanceOf[js.Any], response = response, statusCode = statusCode)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[StatusCodeError]
  }
}

