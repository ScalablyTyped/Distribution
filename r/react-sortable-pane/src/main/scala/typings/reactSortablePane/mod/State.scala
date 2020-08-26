package typings.reactSortablePane.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait State extends js.Object {
  var delta: Double = js.native
  var isPressed: Boolean = js.native
  var isResizing: Boolean = js.native
  var lastPressed: Double = js.native
  var mouse: Double = js.native
  var panes: js.Array[PaneProperty] = js.native
}

object State {
  @scala.inline
  def apply(
    delta: Double,
    isPressed: Boolean,
    isResizing: Boolean,
    lastPressed: Double,
    mouse: Double,
    panes: js.Array[PaneProperty]
  ): State = {
    val __obj = js.Dynamic.literal(delta = delta.asInstanceOf[js.Any], isPressed = isPressed.asInstanceOf[js.Any], isResizing = isResizing.asInstanceOf[js.Any], lastPressed = lastPressed.asInstanceOf[js.Any], mouse = mouse.asInstanceOf[js.Any], panes = panes.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
  @scala.inline
  implicit class StateOps[Self <: State] (val x: Self) extends AnyVal {
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
    def setDelta(value: Double): Self = this.set("delta", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsPressed(value: Boolean): Self = this.set("isPressed", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsResizing(value: Boolean): Self = this.set("isResizing", value.asInstanceOf[js.Any])
    @scala.inline
    def setLastPressed(value: Double): Self = this.set("lastPressed", value.asInstanceOf[js.Any])
    @scala.inline
    def setMouse(value: Double): Self = this.set("mouse", value.asInstanceOf[js.Any])
    @scala.inline
    def setPanesVarargs(value: PaneProperty*): Self = this.set("panes", js.Array(value :_*))
    @scala.inline
    def setPanes(value: js.Array[PaneProperty]): Self = this.set("panes", value.asInstanceOf[js.Any])
  }
  
}

