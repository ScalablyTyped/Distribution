package typings
package rollLib.rollMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvalidInputError
  extends stdLib.Error {
  @JSName("name")
  var name_InvalidInputError: rollLib.rollLibStrings.InvalidInputError
}

object InvalidInputError {
  @scala.inline
  def apply(
    message: java.lang.String,
    name: rollLib.rollLibStrings.InvalidInputError,
    stack: java.lang.String = null
  ): InvalidInputError = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("name")(name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[InvalidInputError]
  }
}

