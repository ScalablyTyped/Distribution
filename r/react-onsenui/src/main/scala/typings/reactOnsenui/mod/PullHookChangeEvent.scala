package typings.reactOnsenui.mod

import typings.reactOnsenui.reactOnsenuiStrings.action
import typings.reactOnsenui.reactOnsenuiStrings.initial
import typings.reactOnsenui.reactOnsenuiStrings.preaction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PullHookChangeEvent extends js.Object {
  var state: initial | preaction | action = js.native
}

object PullHookChangeEvent {
  @scala.inline
  def apply(state: initial | preaction | action): PullHookChangeEvent = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullHookChangeEvent]
  }
  @scala.inline
  implicit class PullHookChangeEventOps[Self <: PullHookChangeEvent] (val x: Self) extends AnyVal {
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
    def setState(value: initial | preaction | action): Self = this.set("state", value.asInstanceOf[js.Any])
  }
  
}

