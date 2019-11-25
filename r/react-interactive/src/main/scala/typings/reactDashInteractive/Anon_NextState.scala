package typings.reactDashInteractive

import typings.reactDashInteractive.reactDashInteractiveMod.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NextState extends js.Object {
  var nextState: State
  var prevState: State
}

object Anon_NextState {
  @scala.inline
  def apply(nextState: State, prevState: State): Anon_NextState = {
    val __obj = js.Dynamic.literal(nextState = nextState.asInstanceOf[js.Any], prevState = prevState.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_NextState]
  }
}

