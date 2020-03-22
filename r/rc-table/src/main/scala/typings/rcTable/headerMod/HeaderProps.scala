package typings.rcTable.headerMod

import typings.rcTable.interfaceMod.ColumnType
import typings.rcTable.interfaceMod.ColumnsType
import typings.rcTable.interfaceMod.GetComponentProps
import typings.rcTable.interfaceMod.StickyOffsets
import typings.react.mod.HTMLAttributes
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeaderProps[RecordType] extends js.Object {
  var columns: ColumnsType[RecordType]
  var flattenColumns: js.Array[ColumnType[RecordType]]
  var onHeaderRow: GetComponentProps[js.Array[ColumnType[RecordType]]]
  var stickyOffsets: StickyOffsets
}

object HeaderProps {
  @scala.inline
  def apply[RecordType](
    columns: ColumnsType[RecordType],
    flattenColumns: js.Array[ColumnType[RecordType]],
    onHeaderRow: (js.Array[ColumnType[RecordType]], /* index */ js.UndefOr[Double]) => HTMLAttributes[HTMLElement],
    stickyOffsets: StickyOffsets
  ): HeaderProps[RecordType] = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], flattenColumns = flattenColumns.asInstanceOf[js.Any], onHeaderRow = js.Any.fromFunction2(onHeaderRow), stickyOffsets = stickyOffsets.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HeaderProps[RecordType]]
  }
}

