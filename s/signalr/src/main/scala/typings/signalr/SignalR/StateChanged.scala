package typings.signalr.SignalR

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StateChanged extends js.Object {
  var newState: Double
  var oldState: Double
}

object StateChanged {
  @scala.inline
  def apply(newState: Double, oldState: Double): StateChanged = {
    val __obj = js.Dynamic.literal(newState = newState, oldState = oldState)
  
    __obj.asInstanceOf[StateChanged]
  }
}

