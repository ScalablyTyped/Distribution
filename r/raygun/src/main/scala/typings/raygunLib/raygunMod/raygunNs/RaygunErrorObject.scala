package typings
package raygunLib.raygunMod.raygunNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RaygunErrorObject extends js.Object {
  var className: java.lang.String
  var innerError: js.UndefOr[RaygunErrorObject] = js.undefined
  var message: java.lang.String
  var stackTrace: js.Array[StackFrame]
}

object RaygunErrorObject {
  @scala.inline
  def apply(
    className: java.lang.String,
    message: java.lang.String,
    stackTrace: js.Array[StackFrame],
    innerError: RaygunErrorObject = null
  ): RaygunErrorObject = {
    val __obj = js.Dynamic.literal(className = className, message = message, stackTrace = stackTrace)
    if (innerError != null) __obj.updateDynamic("innerError")(innerError)
    __obj.asInstanceOf[RaygunErrorObject]
  }
}

