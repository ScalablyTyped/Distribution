package typings.requireHacker.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Log extends js.Object {
  var options: LogOptions = js.native
  def debug(args: js.Any*): Unit = js.native
  def error(args: js.Any*): Unit = js.native
  def trace(args: js.Any*): Unit = js.native
  def warning(args: js.Any*): Unit = js.native
}

object Log {
  @scala.inline
  def apply(
    debug: /* repeated */ js.Any => Unit,
    error: /* repeated */ js.Any => Unit,
    options: LogOptions,
    trace: /* repeated */ js.Any => Unit,
    warning: /* repeated */ js.Any => Unit
  ): Log = {
    val __obj = js.Dynamic.literal(debug = js.Any.fromFunction1(debug), error = js.Any.fromFunction1(error), options = options.asInstanceOf[js.Any], trace = js.Any.fromFunction1(trace), warning = js.Any.fromFunction1(warning))
    __obj.asInstanceOf[Log]
  }
  @scala.inline
  implicit class LogOps[Self <: Log] (val x: Self) extends AnyVal {
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
    def setDebug(value: /* repeated */ js.Any => Unit): Self = this.set("debug", js.Any.fromFunction1(value))
    @scala.inline
    def setError(value: /* repeated */ js.Any => Unit): Self = this.set("error", js.Any.fromFunction1(value))
    @scala.inline
    def setOptions(value: LogOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def setTrace(value: /* repeated */ js.Any => Unit): Self = this.set("trace", js.Any.fromFunction1(value))
    @scala.inline
    def setWarning(value: /* repeated */ js.Any => Unit): Self = this.set("warning", js.Any.fromFunction1(value))
  }
  
}

