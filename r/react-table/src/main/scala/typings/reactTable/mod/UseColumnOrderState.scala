package typings.reactTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UseColumnOrderState[D /* <: js.Object */] extends js.Object {
  var columnOrder: js.Array[IdType[D]]
}

object UseColumnOrderState {
  @scala.inline
  def apply[D /* <: js.Object */](columnOrder: js.Array[IdType[D]]): UseColumnOrderState[D] = {
    val __obj = js.Dynamic.literal(columnOrder = columnOrder.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UseColumnOrderState[D]]
  }
}

