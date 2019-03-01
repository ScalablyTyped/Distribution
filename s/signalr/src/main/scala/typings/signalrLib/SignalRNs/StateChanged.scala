package typings
package signalrLib.SignalRNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StateChanged extends js.Object {
  var newState: scala.Double
  var oldState: scala.Double
}

object StateChanged {
  @scala.inline
  def apply(newState: scala.Double, oldState: scala.Double): StateChanged = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("newState")(newState)
    __obj.updateDynamic("oldState")(oldState)
    __obj.asInstanceOf[StateChanged]
  }
}

