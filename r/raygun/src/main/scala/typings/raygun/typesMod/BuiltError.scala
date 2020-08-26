package typings.raygun.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BuiltError extends js.Object {
  var className: js.UndefOr[String] = js.native
  var innerError: js.UndefOr[BuiltError] = js.native
  var message: String = js.native
  var stackTrace: js.UndefOr[js.Array[StackFrame]] = js.native
}

object BuiltError {
  @scala.inline
  def apply(message: String): BuiltError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuiltError]
  }
  @scala.inline
  implicit class BuiltErrorOps[Self <: BuiltError] (val x: Self) extends AnyVal {
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
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setInnerError(value: BuiltError): Self = this.set("innerError", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInnerError: Self = this.set("innerError", js.undefined)
    @scala.inline
    def setStackTraceVarargs(value: StackFrame*): Self = this.set("stackTrace", js.Array(value :_*))
    @scala.inline
    def setStackTrace(value: js.Array[StackFrame]): Self = this.set("stackTrace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStackTrace: Self = this.set("stackTrace", js.undefined)
  }
  
}

