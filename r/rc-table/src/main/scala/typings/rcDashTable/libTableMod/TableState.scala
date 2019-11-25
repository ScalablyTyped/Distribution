package typings.rcDashTable.libTableMod

import typings.rcDashTable.libInterfaceMod.ColumnType
import typings.rcDashTable.libInterfaceMod.DefaultValueType
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableState extends js.Object {
  var children: js.UndefOr[ReactNode] = js.undefined
  var columns: js.UndefOr[js.Array[ColumnType[DefaultValueType]]] = js.undefined
}

object TableState {
  @scala.inline
  def apply(children: ReactNode = null, columns: js.Array[ColumnType[DefaultValueType]] = null): TableState = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableState]
  }
}

