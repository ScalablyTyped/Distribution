package typings.reactTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnInterfaceBasedOnValue[D /* <: js.Object */, V] extends js.Object {
  var Cell: js.UndefOr[Renderer[CellProps[D, V]]] = js.undefined
}

object ColumnInterfaceBasedOnValue {
  @scala.inline
  def apply[D /* <: js.Object */, V](Cell: Renderer[CellProps[D, V]] = null): ColumnInterfaceBasedOnValue[D, V] = {
    val __obj = js.Dynamic.literal()
    if (Cell != null) __obj.updateDynamic("Cell")(Cell.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnInterfaceBasedOnValue[D, V]]
  }
}

