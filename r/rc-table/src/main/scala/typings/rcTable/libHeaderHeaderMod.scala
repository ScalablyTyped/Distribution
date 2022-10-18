package typings.rcTable

import typings.rcTable.libInterfaceMod.ColumnGroupType
import typings.rcTable.libInterfaceMod.ColumnType
import typings.rcTable.libInterfaceMod.ColumnsType
import typings.rcTable.libInterfaceMod.GetComponentProps
import typings.rcTable.libInterfaceMod.StickyOffsets
import typings.react.mod.HTMLAttributes
import typings.react.mod.ReactElement
import typings.react.mod.TdHTMLAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHeaderHeaderMod {
  
  @JSImport("rc-table/lib/Header/Header", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[RecordType](hasStickyOffsetsColumnsFlattenColumnsOnHeaderRow: HeaderProps[RecordType]): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasStickyOffsetsColumnsFlattenColumnsOnHeaderRow.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  trait HeaderProps[RecordType] extends StObject {
    
    var columns: ColumnsType[RecordType]
    
    var flattenColumns: js.Array[ColumnType[RecordType]]
    
    var onHeaderRow: GetComponentProps[js.Array[ColumnType[RecordType]]]
    
    var stickyOffsets: StickyOffsets
  }
  object HeaderProps {
    
    inline def apply[RecordType](
      columns: ColumnsType[RecordType],
      flattenColumns: js.Array[ColumnType[RecordType]],
      onHeaderRow: (js.Array[ColumnType[RecordType]], /* index */ js.UndefOr[Double]) => HTMLAttributes[Any] | TdHTMLAttributes[Any],
      stickyOffsets: StickyOffsets
    ): HeaderProps[RecordType] = {
      val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], flattenColumns = flattenColumns.asInstanceOf[js.Any], onHeaderRow = js.Any.fromFunction2(onHeaderRow), stickyOffsets = stickyOffsets.asInstanceOf[js.Any])
      __obj.asInstanceOf[HeaderProps[RecordType]]
    }
    
    extension [Self <: HeaderProps[?], RecordType](x: Self & HeaderProps[RecordType]) {
      
      inline def setColumns(value: ColumnsType[RecordType]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsVarargs(value: (ColumnGroupType[RecordType] | ColumnType[RecordType])*): Self = StObject.set(x, "columns", js.Array(value*))
      
      inline def setFlattenColumns(value: js.Array[ColumnType[RecordType]]): Self = StObject.set(x, "flattenColumns", value.asInstanceOf[js.Any])
      
      inline def setFlattenColumnsVarargs(value: ColumnType[RecordType]*): Self = StObject.set(x, "flattenColumns", js.Array(value*))
      
      inline def setOnHeaderRow(
        value: (js.Array[ColumnType[RecordType]], /* index */ js.UndefOr[Double]) => HTMLAttributes[Any] | TdHTMLAttributes[Any]
      ): Self = StObject.set(x, "onHeaderRow", js.Any.fromFunction2(value))
      
      inline def setStickyOffsets(value: StickyOffsets): Self = StObject.set(x, "stickyOffsets", value.asInstanceOf[js.Any])
    }
  }
}
