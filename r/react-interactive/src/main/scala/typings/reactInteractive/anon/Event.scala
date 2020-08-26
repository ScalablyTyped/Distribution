package typings.reactInteractive.anon

import typings.react.mod.SyntheticEvent
import typings.reactInteractive.mod.State
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Event extends js.Object {
  var event: SyntheticEvent[Element, typings.std.Event] = js.native
  var nextState: State = js.native
  var prevState: State = js.native
}

object Event {
  @scala.inline
  def apply(event: SyntheticEvent[Element, typings.std.Event], nextState: State, prevState: State): Event = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], nextState = nextState.asInstanceOf[js.Any], prevState = prevState.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
  @scala.inline
  implicit class EventOps[Self <: Event] (val x: Self) extends AnyVal {
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
    def setEvent(value: SyntheticEvent[Element, typings.std.Event]): Self = this.set("event", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextState(value: State): Self = this.set("nextState", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrevState(value: State): Self = this.set("prevState", value.asInstanceOf[js.Any])
  }
  
}

