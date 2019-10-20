package typings.reactDashInteractive.reactDashInteractiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State extends js.Object {
  var focus: Focus
  var iState: IState
}

object State {
  @scala.inline
  def apply(focus: Focus, iState: IState): State = {
    val __obj = js.Dynamic.literal(focus = focus, iState = iState)
  
    __obj.asInstanceOf[State]
  }
}

