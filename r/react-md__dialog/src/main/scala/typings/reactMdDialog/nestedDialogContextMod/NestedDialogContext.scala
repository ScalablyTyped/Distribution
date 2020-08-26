package typings.reactMdDialog.nestedDialogContextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NestedDialogContext extends js.Object {
  var stack: js.Array[String] = js.native
  def add(dialogId: String): Unit = js.native
  def remove(dialogId: String): Unit = js.native
}

object NestedDialogContext {
  @scala.inline
  def apply(add: String => Unit, remove: String => Unit, stack: js.Array[String]): NestedDialogContext = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), remove = js.Any.fromFunction1(remove), stack = stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[NestedDialogContext]
  }
  @scala.inline
  implicit class NestedDialogContextOps[Self <: NestedDialogContext] (val x: Self) extends AnyVal {
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
    def setAdd(value: String => Unit): Self = this.set("add", js.Any.fromFunction1(value))
    @scala.inline
    def setRemove(value: String => Unit): Self = this.set("remove", js.Any.fromFunction1(value))
    @scala.inline
    def setStackVarargs(value: String*): Self = this.set("stack", js.Array(value :_*))
    @scala.inline
    def setStack(value: js.Array[String]): Self = this.set("stack", value.asInstanceOf[js.Any])
  }
  
}

