package typings.signalr.SignalR

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StateChanged extends js.Object {
  var newState: Double = js.native
  var oldState: Double = js.native
}

object StateChanged {
  @scala.inline
  def apply(newState: Double, oldState: Double): StateChanged = {
    val __obj = js.Dynamic.literal(newState = newState.asInstanceOf[js.Any], oldState = oldState.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateChanged]
  }
  @scala.inline
  implicit class StateChangedOps[Self <: StateChanged] (val x: Self) extends AnyVal {
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
    def setNewState(value: Double): Self = this.set("newState", value.asInstanceOf[js.Any])
    @scala.inline
    def setOldState(value: Double): Self = this.set("oldState", value.asInstanceOf[js.Any])
  }
  
}

