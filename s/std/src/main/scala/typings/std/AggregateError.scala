package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AggregateError extends Error {
  var errors: js.Array[_]
}

object AggregateError {
  @scala.inline
  def apply(
    errors: js.Array[_],
    message: java.lang.String,
    name: java.lang.String,
    stack: java.lang.String = null
  ): AggregateError = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregateError]
  }
}

