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
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], stackTrace = stackTrace.asInstanceOf[js.Any])
    if (innerError != null) __obj.updateDynamic("innerError")(innerError.asInstanceOf[js.Any])
    __obj.asInstanceOf[RaygunErrorObject]
  }
}

