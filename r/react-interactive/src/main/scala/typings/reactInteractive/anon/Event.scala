package typings.reactInteractive.anon

import typings.react.mod.SyntheticEvent
import typings.reactInteractive.mod.State
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Event extends js.Object {
  var event: SyntheticEvent[Element, typings.std.Event]
  var nextState: State
  var prevState: State
}

object Event {
  @scala.inline
  def apply(event: SyntheticEvent[Element, typings.std.Event], nextState: State, prevState: State): Event = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], nextState = nextState.asInstanceOf[js.Any], prevState = prevState.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
}

