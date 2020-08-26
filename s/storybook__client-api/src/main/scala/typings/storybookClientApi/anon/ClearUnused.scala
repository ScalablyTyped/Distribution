package typings.storybookClientApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClearUnused extends js.Object {
  def clearUnused(): Unit = js.native
  def markAllAsUnused(): Unit = js.native
  def register(subscribe: js.Function0[Unit]): Unit = js.native
}

object ClearUnused {
  @scala.inline
  def apply(clearUnused: () => Unit, markAllAsUnused: () => Unit, register: js.Function0[Unit] => Unit): ClearUnused = {
    val __obj = js.Dynamic.literal(clearUnused = js.Any.fromFunction0(clearUnused), markAllAsUnused = js.Any.fromFunction0(markAllAsUnused), register = js.Any.fromFunction1(register))
    __obj.asInstanceOf[ClearUnused]
  }
  @scala.inline
  implicit class ClearUnusedOps[Self <: ClearUnused] (val x: Self) extends AnyVal {
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
    def setClearUnused(value: () => Unit): Self = this.set("clearUnused", js.Any.fromFunction0(value))
    @scala.inline
    def setMarkAllAsUnused(value: () => Unit): Self = this.set("markAllAsUnused", js.Any.fromFunction0(value))
    @scala.inline
    def setRegister(value: js.Function0[Unit] => Unit): Self = this.set("register", js.Any.fromFunction1(value))
  }
  
}

