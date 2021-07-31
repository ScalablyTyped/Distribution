package typings.rcTable

import typings.rcTable.interfaceMod.ColumnGroupType
import typings.rcTable.interfaceMod.ColumnType
import typings.rcTable.interfaceMod.ColumnsType
import typings.rcTable.interfaceMod.GetComponentProps
import typings.rcTable.interfaceMod.StickyOffsets
import typings.react.mod.HTMLAttributes
import typings.react.mod.ReactElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object headerMod {
  
  @JSImport("rc-table/lib/Header/Header", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[RecordType](hasStickyOffsetsColumnsFlattenColumnsOnHeaderRow: HeaderProps[RecordType]): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasStickyOffsetsColumnsFlattenColumnsOnHeaderRow.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  trait HeaderProps[RecordType] extends StObject {
    
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
    
    @scala.inline
    implicit class HeaderPropsMutableBuilder[Self <: HeaderProps[?], RecordType] (val x: Self & HeaderProps[RecordType]) extends AnyVal {
      
      @scala.inline
      def setColumns(value: ColumnsType[RecordType]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnsVarargs(value: (ColumnGroupType[RecordType] | ColumnType[RecordType])*): Self = StObject.set(x, "columns", js.Array(value :_*))
      
      @scala.inline
      def setFlattenColumns(value: js.Array[ColumnType[RecordType]]): Self = StObject.set(x, "flattenColumns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlattenColumnsVarargs(value: ColumnType[RecordType]*): Self = StObject.set(x, "flattenColumns", js.Array(value :_*))
      
      @scala.inline
      def setOnHeaderRow(
        value: (js.Array[ColumnType[RecordType]], /* index */ js.UndefOr[Double]) => HTMLAttributes[HTMLElement]
      ): Self = StObject.set(x, "onHeaderRow", js.Any.fromFunction2(value))
      
      @scala.inline
      def setStickyOffsets(value: StickyOffsets): Self = StObject.set(x, "stickyOffsets", value.asInstanceOf[js.Any])
    }
  }
}
