package typings.reactQuery.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConsoleObject extends js.Object {
  var error: ConsoleFunction
  var log: ConsoleFunction
  var warn: ConsoleFunction
}

object ConsoleObject {
  @scala.inline
  def apply(
    error: /* repeated */ js.Any => Unit,
    log: /* repeated */ js.Any => Unit,
    warn: /* repeated */ js.Any => Unit
  ): ConsoleObject = {
    val __obj = js.Dynamic.literal(error = js.Any.fromFunction1(error), log = js.Any.fromFunction1(log), warn = js.Any.fromFunction1(warn))
  
    __obj.asInstanceOf[ConsoleObject]
  }
}

