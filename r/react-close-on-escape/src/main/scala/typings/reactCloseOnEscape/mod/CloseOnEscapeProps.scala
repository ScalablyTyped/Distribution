package typings.reactCloseOnEscape.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloseOnEscapeProps extends js.Object {
  /**
    * Callback triggered by pressing ESC
    */
  def onEscape(): Unit = js.native
}

object CloseOnEscapeProps {
  @scala.inline
  def apply(onEscape: () => Unit): CloseOnEscapeProps = {
    val __obj = js.Dynamic.literal(onEscape = js.Any.fromFunction0(onEscape))
    __obj.asInstanceOf[CloseOnEscapeProps]
  }
  @scala.inline
  implicit class CloseOnEscapePropsOps[Self <: CloseOnEscapeProps] (val x: Self) extends AnyVal {
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
    def setOnEscape(value: () => Unit): Self = this.set("onEscape", js.Any.fromFunction0(value))
  }
  
}

