package typings.rcTable.headerMod

import typings.rcTable.interfaceMod.ColumnGroupType
import typings.rcTable.interfaceMod.ColumnType
import typings.rcTable.interfaceMod.ColumnsType
import typings.rcTable.interfaceMod.GetComponentProps
import typings.rcTable.interfaceMod.StickyOffsets
import typings.react.mod.HTMLAttributes
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HeaderProps[RecordType] extends js.Object {
  
  var columns: ColumnsType[RecordType] = js.native
  
  var flattenColumns: js.Array[ColumnType[RecordType]] = js.native
  
  var onHeaderRow: GetComponentProps[js.Array[ColumnType[RecordType]]] = js.native
  
  var stickyOffsets: StickyOffsets = js.native
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
  
  @scala.inline
  implicit class HeaderPropsOps[Self <: HeaderProps[_], RecordType] (val x: Self with HeaderProps[RecordType]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setColumnsVarargs(value: (ColumnGroupType[RecordType] | ColumnType[RecordType])*): Self = this.set("columns", js.Array(value :_*))
    
    @scala.inline
    def setColumns(value: ColumnsType[RecordType]): Self = this.set("columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlattenColumnsVarargs(value: ColumnType[RecordType]*): Self = this.set("flattenColumns", js.Array(value :_*))
    
    @scala.inline
    def setFlattenColumns(value: js.Array[ColumnType[RecordType]]): Self = this.set("flattenColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnHeaderRow(
      value: (js.Array[ColumnType[RecordType]], /* index */ js.UndefOr[Double]) => HTMLAttributes[HTMLElement]
    ): Self = this.set("onHeaderRow", js.Any.fromFunction2(value))
    
    @scala.inline
    def setStickyOffsets(value: StickyOffsets): Self = this.set("stickyOffsets", value.asInstanceOf[js.Any])
  }
}
