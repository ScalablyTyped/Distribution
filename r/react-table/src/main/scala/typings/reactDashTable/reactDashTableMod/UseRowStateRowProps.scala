package typings.reactDashTable.reactDashTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UseRowStateRowProps[D /* <: js.Object */] extends js.Object {
  var state: UseRowStateLocalState[D, _]
  def setState(updater: UseRowUpdater[_]): Unit
}

object UseRowStateRowProps {
  @scala.inline
  def apply[D /* <: js.Object */](setState: UseRowUpdater[_] => Unit, state: UseRowStateLocalState[D, _]): UseRowStateRowProps[D] = {
    val __obj = js.Dynamic.literal(setState = js.Any.fromFunction1(setState), state = state.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UseRowStateRowProps[D]]
  }
}

