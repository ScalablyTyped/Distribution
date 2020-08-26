package typings.rsocketCore.rsocketleaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LeaseHandler extends js.Object {
  def errorMessage(): String = js.native
  def use(): Boolean = js.native
}

object LeaseHandler {
  @scala.inline
  def apply(errorMessage: () => String, use: () => Boolean): LeaseHandler = {
    val __obj = js.Dynamic.literal(errorMessage = js.Any.fromFunction0(errorMessage), use = js.Any.fromFunction0(use))
    __obj.asInstanceOf[LeaseHandler]
  }
  @scala.inline
  implicit class LeaseHandlerOps[Self <: LeaseHandler] (val x: Self) extends AnyVal {
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
    def setErrorMessage(value: () => String): Self = this.set("errorMessage", js.Any.fromFunction0(value))
    @scala.inline
    def setUse(value: () => Boolean): Self = this.set("use", js.Any.fromFunction0(value))
  }
  
}

