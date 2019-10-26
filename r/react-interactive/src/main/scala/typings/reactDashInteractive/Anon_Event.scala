package typings.reactDashInteractive

import typings.react.reactMod.SyntheticEvent
import typings.reactDashInteractive.reactDashInteractiveMod.State
import typings.std.Element
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Event extends js.Object {
  var event: SyntheticEvent[Element, Event]
  var nextState: State
  var prevState: State
}

object Anon_Event {
  @scala.inline
  def apply(event: SyntheticEvent[Element, Event], nextState: State, prevState: State): Anon_Event = {
    val __obj = js.Dynamic.literal(event = event, nextState = nextState, prevState = prevState)
  
    __obj.asInstanceOf[Anon_Event]
  }
}

