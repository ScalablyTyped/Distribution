package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OverconstrainedError extends Error {
  var constraint: java.lang.String
}

object OverconstrainedError {
  @scala.inline
  def apply(
    constraint: java.lang.String,
    message: java.lang.String,
    name: java.lang.String,
    stack: java.lang.String = null
  ): OverconstrainedError = {
    val __obj = js.Dynamic.literal(constraint = constraint.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverconstrainedError]
  }
}

