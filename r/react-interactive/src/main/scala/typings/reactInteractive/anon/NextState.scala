package typings.reactInteractive.anon

import typings.reactInteractive.mod.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NextState extends js.Object {
  var nextState: State
  var prevState: State
}

object NextState {
  @scala.inline
  def apply(nextState: State, prevState: State): NextState = {
    val __obj = js.Dynamic.literal(nextState = nextState.asInstanceOf[js.Any], prevState = prevState.asInstanceOf[js.Any])
    __obj.asInstanceOf[NextState]
  }
}

