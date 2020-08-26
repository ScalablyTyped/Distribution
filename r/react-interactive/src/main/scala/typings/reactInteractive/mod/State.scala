package typings.reactInteractive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait State extends js.Object {
  var focus: Focus = js.native
  var iState: IState = js.native
}

object State {
  @scala.inline
  def apply(focus: Focus, iState: IState): State = {
    val __obj = js.Dynamic.literal(focus = focus.asInstanceOf[js.Any], iState = iState.asInstanceOf[js.Any])
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
    def setFocus(value: Focus): Self = this.set("focus", value.asInstanceOf[js.Any])
    @scala.inline
    def setIState(value: IState): Self = this.set("iState", value.asInstanceOf[js.Any])
  }
  
}

