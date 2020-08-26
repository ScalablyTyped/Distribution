package typings.reactQuery.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConsoleObject extends js.Object {
  var error: ConsoleFunction = js.native
  var log: ConsoleFunction = js.native
  var warn: ConsoleFunction = js.native
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
  @scala.inline
  implicit class ConsoleObjectOps[Self <: ConsoleObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setError(value: /* repeated */ js.Any => Unit): Self = this.set("error", js.Any.fromFunction1(value))
    @scala.inline
    def setLog(value: /* repeated */ js.Any => Unit): Self = this.set("log", js.Any.fromFunction1(value))
    @scala.inline
    def setWarn(value: /* repeated */ js.Any => Unit): Self = this.set("warn", js.Any.fromFunction1(value))
  }
  
}

