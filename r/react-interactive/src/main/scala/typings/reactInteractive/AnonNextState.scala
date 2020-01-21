package typings.reactInteractive

import typings.reactInteractive.mod.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNextState extends js.Object {
  var nextState: State
  var prevState: State
}

object AnonNextState {
  @scala.inline
  def apply(nextState: State, prevState: State): AnonNextState = {
    val __obj = js.Dynamic.literal(nextState = nextState.asInstanceOf[js.Any], prevState = prevState.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonNextState]
  }
}

