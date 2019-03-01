package typings
package redlockLib.redlockMod.RedlockNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LockError
  extends nodeLib.Error {
  val name: redlockLib.redlockLibStrings.LockError
}

object LockError {
  @scala.inline
  def apply(name: redlockLib.redlockLibStrings.LockError, stack: java.lang.String = null): LockError = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[LockError]
  }
}

