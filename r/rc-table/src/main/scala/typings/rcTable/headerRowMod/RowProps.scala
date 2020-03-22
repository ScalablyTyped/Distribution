package typings.rcTable.headerRowMod

import typings.rcTable.interfaceMod.CellType
import typings.rcTable.interfaceMod.ColumnType
import typings.rcTable.interfaceMod.CustomizeComponent
import typings.rcTable.interfaceMod.GetComponentProps
import typings.rcTable.interfaceMod.StickyOffsets
import typings.react.mod.HTMLAttributes
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowProps[RecordType] extends js.Object {
  var cellComponent: CustomizeComponent[HTMLAttributes[HTMLElement]]
  var cells: js.Array[CellType[RecordType]]
  var flattenColumns: js.Array[ColumnType[RecordType]]
  var index: Double
  var onHeaderRow: GetComponentProps[js.Array[ColumnType[RecordType]]]
  var rowComponent: CustomizeComponent[HTMLAttributes[HTMLElement]]
  var stickyOffsets: StickyOffsets
}

object RowProps {
  @scala.inline
  def apply[RecordType](
    cellComponent: CustomizeComponent[HTMLAttributes[HTMLElement]],
    cells: js.Array[CellType[RecordType]],
    flattenColumns: js.Array[ColumnType[RecordType]],
    index: Double,
    onHeaderRow: (js.Array[ColumnType[RecordType]], /* index */ js.UndefOr[Double]) => HTMLAttributes[HTMLElement],
    rowComponent: CustomizeComponent[HTMLAttributes[HTMLElement]],
    stickyOffsets: StickyOffsets
  ): RowProps[RecordType] = {
    val __obj = js.Dynamic.literal(cellComponent = cellComponent.asInstanceOf[js.Any], cells = cells.asInstanceOf[js.Any], flattenColumns = flattenColumns.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], onHeaderRow = js.Any.fromFunction2(onHeaderRow), rowComponent = rowComponent.asInstanceOf[js.Any], stickyOffsets = stickyOffsets.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RowProps[RecordType]]
  }
}

