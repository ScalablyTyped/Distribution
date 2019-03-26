package typings
package requestDashPromiseLib.errorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransformError
  extends stdLib.Error {
  var cause: js.Any
  var error: js.Any
  var options: requestDashPromiseLib.requestDashPromiseMod.requestPromiseNs.Options
  var response: nodeLib.httpMod.IncomingMessage
}

@JSImport("request-promise/errors", "TransformError")
@js.native
class TransformErrorCls protected () extends TransformError {
  def this(cause: js.Any, options: requestDashPromiseLib.requestDashPromiseMod.requestPromiseNs.Options, response: nodeLib.httpMod.IncomingMessage) = this()
  /* CompleteClass */
  override var cause: js.Any = js.native
  /* CompleteClass */
  override var error: js.Any = js.native
  /* CompleteClass */
  override var message: java.lang.String = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
  /* CompleteClass */
  override var options: requestDashPromiseLib.requestDashPromiseMod.requestPromiseNs.Options = js.native
  /* CompleteClass */
  override var response: nodeLib.httpMod.IncomingMessage = js.native
}

object TransformError {
  @scala.inline
  def apply(
    cause: js.Any,
    error: js.Any,
    message: java.lang.String,
    name: java.lang.String,
    options: requestDashPromiseLib.requestDashPromiseMod.requestPromiseNs.Options,
    response: nodeLib.httpMod.IncomingMessage,
    stack: java.lang.String = null
  ): TransformError = {
    val __obj = js.Dynamic.literal(cause = cause, error = error, message = message, name = name, options = options.asInstanceOf[js.Any], response = response)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[TransformError]
  }
}

