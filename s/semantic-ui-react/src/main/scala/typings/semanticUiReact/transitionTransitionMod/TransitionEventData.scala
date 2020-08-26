package typings.semanticUiReact.transitionTransitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransitionEventData extends TransitionProps {
  var status: TRANSITION_STATUSES = js.native
}

object TransitionEventData {
  @scala.inline
  def apply(status: TRANSITION_STATUSES): TransitionEventData = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitionEventData]
  }
  @scala.inline
  implicit class TransitionEventDataOps[Self <: TransitionEventData] (val x: Self) extends AnyVal {
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
    def setStatus(value: TRANSITION_STATUSES): Self = this.set("status", value.asInstanceOf[js.Any])
  }
  
}

