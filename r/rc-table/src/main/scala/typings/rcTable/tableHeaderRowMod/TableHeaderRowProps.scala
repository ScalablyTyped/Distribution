package typings.rcTable.tableHeaderRowMod

import typings.rcTable.interfaceMod.Cell
import typings.rcTable.interfaceMod.ColumnType
import typings.rcTable.interfaceMod.DefaultValueType
import typings.rcTable.interfaceMod.FixedType
import typings.rcTable.interfaceMod.GetComponentProps
import typings.rcTable.interfaceMod.TableComponents
import typings.react.mod.HTMLAttributes
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableHeaderRowProps extends js.Object {
  var columns: js.Array[ColumnType[DefaultValueType]]
  var components: TableComponents
  var fixed: FixedType
  var height: String | Double
  var index: Double
  var onHeaderRow: GetComponentProps[js.Array[ColumnType[DefaultValueType]]]
  var prefixCls: String
  var row: js.Array[Cell]
  var rows: js.Array[Cell]
}

object TableHeaderRowProps {
  @scala.inline
  def apply(
    columns: js.Array[ColumnType[DefaultValueType]],
    components: TableComponents,
    fixed: FixedType,
    height: String | Double,
    index: Double,
    onHeaderRow: (js.Array[ColumnType[DefaultValueType]], /* index */ js.UndefOr[Double]) => HTMLAttributes[HTMLElement],
    prefixCls: String,
    row: js.Array[Cell],
    rows: js.Array[Cell]
  ): TableHeaderRowProps = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], components = components.asInstanceOf[js.Any], fixed = fixed.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], onHeaderRow = js.Any.fromFunction2(onHeaderRow), prefixCls = prefixCls.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TableHeaderRowProps]
  }
}

