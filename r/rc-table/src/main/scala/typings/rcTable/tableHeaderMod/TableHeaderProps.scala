package typings.rcTable.tableHeaderMod

import typings.rcTable.interfaceMod.ColumnType
import typings.rcTable.interfaceMod.DefaultValueType
import typings.rcTable.interfaceMod.Expander
import typings.rcTable.interfaceMod.FixedType
import typings.rcTable.interfaceMod.GetComponentProps
import typings.react.mod.HTMLAttributes
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableHeaderProps extends js.Object {
  var columns: js.Array[ColumnType[DefaultValueType]]
  var expander: Expander[DefaultValueType]
  var fixed: js.UndefOr[FixedType] = js.undefined
  var onHeaderRow: js.UndefOr[GetComponentProps[js.Array[ColumnType[DefaultValueType]]]] = js.undefined
}

object TableHeaderProps {
  @scala.inline
  def apply(
    columns: js.Array[ColumnType[DefaultValueType]],
    expander: Expander[DefaultValueType],
    fixed: FixedType = null,
    onHeaderRow: (js.Array[ColumnType[DefaultValueType]], /* index */ js.UndefOr[Double]) => HTMLAttributes[HTMLElement] = null
  ): TableHeaderProps = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], expander = expander.asInstanceOf[js.Any])
    if (fixed != null) __obj.updateDynamic("fixed")(fixed.asInstanceOf[js.Any])
    if (onHeaderRow != null) __obj.updateDynamic("onHeaderRow")(js.Any.fromFunction2(onHeaderRow))
    __obj.asInstanceOf[TableHeaderProps]
  }
}

