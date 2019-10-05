package typings.raygun.raygunMod.raygun

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RaygunErrorObject extends js.Object {
  var className: String
  var innerError: js.UndefOr[RaygunErrorObject] = js.undefined
  var message: String
  var stackTrace: js.Array[StackFrame]
}

object RaygunErrorObject {
  @scala.inline
  def apply(
    className: String,
    message: String,
    stackTrace: js.Array[StackFrame],
    innerError: RaygunErrorObject = null
  ): RaygunErrorObject = {
    val __obj = js.Dynamic.literal(className = className, message = message, stackTrace = stackTrace)
    if (innerError != null) __obj.updateDynamic("innerError")(innerError)
    __obj.asInstanceOf[RaygunErrorObject]
  }
}

