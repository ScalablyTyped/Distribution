package typings.reactInteractive

import typings.react.mod.SyntheticEvent
import typings.reactInteractive.mod.State
import typings.std.Element
import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEvent extends js.Object {
  var event: SyntheticEvent[Element, Event_]
  var nextState: State
  var prevState: State
}

object AnonEvent {
  @scala.inline
  def apply(event: SyntheticEvent[Element, Event_], nextState: State, prevState: State): AnonEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], nextState = nextState.asInstanceOf[js.Any], prevState = prevState.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonEvent]
  }
}

