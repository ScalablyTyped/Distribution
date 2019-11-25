package typings.simplesignal.simplesignalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimpleSignal[F /* <: js.Function */] extends js.Object {
  var functions: js.Any
  val numItems: Double
  def add(func: F): Boolean
  def dispatch(args: js.Any*): Unit
  def remove(func: F): Boolean
  def removeAll(): Boolean
}

object SimpleSignal {
  @scala.inline
  def apply[F /* <: js.Function */](
    add: F => Boolean,
    dispatch: /* repeated */ js.Any => Unit,
    functions: js.Any,
    numItems: Double,
    remove: F => Boolean,
    removeAll: () => Boolean
  ): SimpleSignal[F] = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), dispatch = js.Any.fromFunction1(dispatch), functions = functions.asInstanceOf[js.Any], numItems = numItems.asInstanceOf[js.Any], remove = js.Any.fromFunction1(remove), removeAll = js.Any.fromFunction0(removeAll))
  
    __obj.asInstanceOf[SimpleSignal[F]]
  }
}

