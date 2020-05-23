package typings.reactTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UseRowStateCellProps[D /* <: js.Object */] extends js.Object {
  var state: UseRowStateLocalState[D, _]
  def setState(updater: UseRowUpdater[_]): Unit
}

object UseRowStateCellProps {
  @scala.inline
  def apply[D](setState: UseRowUpdater[_] => Unit, state: UseRowStateLocalState[D, _]): UseRowStateCellProps[D] = {
    val __obj = js.Dynamic.literal(setState = js.Any.fromFunction1(setState), state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseRowStateCellProps[D]]
  }
}

