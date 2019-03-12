package typings
package redlockLib.redlockMod.RedlockNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LockError
  extends stdLib.Error {
  @JSName("name")
  val name_LockError: redlockLib.redlockLibStrings.LockError
}

object LockError {
  @scala.inline
  def apply(
    message: java.lang.String,
    name: redlockLib.redlockLibStrings.LockError,
    stack: java.lang.String = null
  ): LockError = {
    val __obj = js.Dynamic.literal(message = message, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[LockError]
  }
}

