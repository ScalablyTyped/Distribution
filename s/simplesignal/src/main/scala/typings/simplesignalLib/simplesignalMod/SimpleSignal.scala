package typings
package simplesignalLib.simplesignalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimpleSignal[F /* <: js.Function */] extends js.Object {
  var functions: js.Any
  val numItems: scala.Double
  def add(func: F): scala.Boolean
  def dispatch(args: js.Any*): scala.Unit
  def remove(func: F): scala.Boolean
  def removeAll(): scala.Boolean
}

object SimpleSignal {
  @scala.inline
  def apply[F /* <: js.Function */](
    add: F => scala.Boolean,
    dispatch: /* repeated */ js.Any => scala.Unit,
    functions: js.Any,
    numItems: scala.Double,
    remove: F => scala.Boolean,
    removeAll: () => scala.Boolean
  ): SimpleSignal[F] = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), dispatch = js.Any.fromFunction1(dispatch), functions = functions, numItems = numItems, remove = js.Any.fromFunction1(remove), removeAll = js.Any.fromFunction0(removeAll))
  
    __obj.asInstanceOf[SimpleSignal[F]]
  }
}

