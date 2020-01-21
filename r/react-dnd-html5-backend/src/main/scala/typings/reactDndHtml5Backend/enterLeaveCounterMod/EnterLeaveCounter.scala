package typings.reactDndHtml5Backend.enterLeaveCounterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnterLeaveCounter extends js.Object {
  var entered: js.Any
  var isNodeInDocument: js.Any
  def enter(enteringNode: js.Any): Boolean
  def leave(leavingNode: js.Any): Boolean
  def reset(): Unit
}

object EnterLeaveCounter {
  @scala.inline
  def apply(
    enter: js.Any => Boolean,
    entered: js.Any,
    isNodeInDocument: js.Any,
    leave: js.Any => Boolean,
    reset: () => Unit
  ): EnterLeaveCounter = {
    val __obj = js.Dynamic.literal(enter = js.Any.fromFunction1(enter), entered = entered.asInstanceOf[js.Any], isNodeInDocument = isNodeInDocument.asInstanceOf[js.Any], leave = js.Any.fromFunction1(leave), reset = js.Any.fromFunction0(reset))
  
    __obj.asInstanceOf[EnterLeaveCounter]
  }
}

