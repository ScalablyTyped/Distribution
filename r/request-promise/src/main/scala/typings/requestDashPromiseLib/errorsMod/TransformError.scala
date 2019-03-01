package typings
package requestDashPromiseLib.errorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransformError
  extends nodeLib.Error {
  var cause: js.Any
  var error: js.Any
  var options: requestDashPromiseLib.requestDashPromiseMod.requestPromiseNs.Options
  var response: nodeLib.httpMod.IncomingMessage
}

object TransformError {
  @scala.inline
  def apply(
    cause: js.Any,
    error: js.Any,
    options: requestDashPromiseLib.requestDashPromiseMod.requestPromiseNs.Options,
    response: nodeLib.httpMod.IncomingMessage,
    stack: java.lang.String = null
  ): TransformError = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cause")(cause)
    __obj.updateDynamic("error")(error)
    __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.updateDynamic("response")(response)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[TransformError]
  }
}

