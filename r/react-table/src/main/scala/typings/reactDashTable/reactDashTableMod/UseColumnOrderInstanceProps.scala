package typings.reactDashTable.reactDashTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UseColumnOrderInstanceProps[D /* <: js.Object */] extends js.Object {
  def setColumnOrder(updater: js.Function1[/* columnOrder */ js.Array[IdType[D]], js.Array[IdType[D]]]): Unit
}

object UseColumnOrderInstanceProps {
  @scala.inline
  def apply[D /* <: js.Object */](setColumnOrder: js.Function1[/* columnOrder */ js.Array[IdType[D]], js.Array[IdType[D]]] => Unit): UseColumnOrderInstanceProps[D] = {
    val __obj = js.Dynamic.literal(setColumnOrder = js.Any.fromFunction1(setColumnOrder))
  
    __obj.asInstanceOf[UseColumnOrderInstanceProps[D]]
  }
}

