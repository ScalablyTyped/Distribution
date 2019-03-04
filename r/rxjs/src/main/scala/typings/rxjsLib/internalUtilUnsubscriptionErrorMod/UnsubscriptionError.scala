package typings
package rxjsLib.internalUtilUnsubscriptionErrorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnsubscriptionError
  extends stdLib.Error {
  val errors: js.Array[_]
}

object UnsubscriptionError {
  @scala.inline
  def apply(
    errors: js.Array[_],
    message: java.lang.String,
    name: java.lang.String,
    stack: java.lang.String = null
  ): UnsubscriptionError = {
    val __obj = js.Dynamic.literal(errors = errors, message = message, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[UnsubscriptionError]
  }
}

