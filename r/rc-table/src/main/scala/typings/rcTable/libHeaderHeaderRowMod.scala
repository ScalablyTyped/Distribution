package typings.rcTable

import typings.rcTable.libInterfaceMod.CellType
import typings.rcTable.libInterfaceMod.ColumnType
import typings.rcTable.libInterfaceMod.CustomizeComponent
import typings.rcTable.libInterfaceMod.GetComponentProps
import typings.rcTable.libInterfaceMod.StickyOffsets
import typings.react.mod.HTMLAttributes
import typings.react.mod.TdHTMLAttributes
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHeaderHeaderRowMod {
  
  object default {
    
    inline def apply[RecordType](param0: RowProps[RecordType]): Element = ^.asInstanceOf[js.Dynamic].apply(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("rc-table/lib/Header/HeaderRow", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rc-table/lib/Header/HeaderRow", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  trait RowProps[RecordType] extends StObject {
    
    var cellComponent: CustomizeComponent
    
    var cells: js.Array[CellType[RecordType]]
    
    var flattenColumns: js.Array[ColumnType[RecordType]]
    
    var index: Double
    
    var onHeaderRow: GetComponentProps[js.Array[ColumnType[RecordType]]]
    
    var rowComponent: CustomizeComponent
    
    var stickyOffsets: StickyOffsets
    
    var tdCellComponent: CustomizeComponent
  }
  object RowProps {
    
    inline def apply[RecordType](
      cellComponent: CustomizeComponent,
      cells: js.Array[CellType[RecordType]],
      flattenColumns: js.Array[ColumnType[RecordType]],
      index: Double,
      onHeaderRow: (js.Array[ColumnType[RecordType]], /* index */ js.UndefOr[Double]) => HTMLAttributes[Any] | TdHTMLAttributes[Any],
      rowComponent: CustomizeComponent,
      stickyOffsets: StickyOffsets,
      tdCellComponent: CustomizeComponent
    ): RowProps[RecordType] = {
      val __obj = js.Dynamic.literal(cellComponent = cellComponent.asInstanceOf[js.Any], cells = cells.asInstanceOf[js.Any], flattenColumns = flattenColumns.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], onHeaderRow = js.Any.fromFunction2(onHeaderRow), rowComponent = rowComponent.asInstanceOf[js.Any], stickyOffsets = stickyOffsets.asInstanceOf[js.Any], tdCellComponent = tdCellComponent.asInstanceOf[js.Any])
      __obj.asInstanceOf[RowProps[RecordType]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RowProps[?], RecordType] (val x: Self & RowProps[RecordType]) extends AnyVal {
      
      inline def setCellComponent(value: CustomizeComponent): Self = StObject.set(x, "cellComponent", value.asInstanceOf[js.Any])
      
      inline def setCells(value: js.Array[CellType[RecordType]]): Self = StObject.set(x, "cells", value.asInstanceOf[js.Any])
      
      inline def setCellsVarargs(value: CellType[RecordType]*): Self = StObject.set(x, "cells", js.Array(value*))
      
      inline def setFlattenColumns(value: js.Array[ColumnType[RecordType]]): Self = StObject.set(x, "flattenColumns", value.asInstanceOf[js.Any])
      
      inline def setFlattenColumnsVarargs(value: ColumnType[RecordType]*): Self = StObject.set(x, "flattenColumns", js.Array(value*))
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setOnHeaderRow(
        value: (js.Array[ColumnType[RecordType]], /* index */ js.UndefOr[Double]) => HTMLAttributes[Any] | TdHTMLAttributes[Any]
      ): Self = StObject.set(x, "onHeaderRow", js.Any.fromFunction2(value))
      
      inline def setRowComponent(value: CustomizeComponent): Self = StObject.set(x, "rowComponent", value.asInstanceOf[js.Any])
      
      inline def setStickyOffsets(value: StickyOffsets): Self = StObject.set(x, "stickyOffsets", value.asInstanceOf[js.Any])
      
      inline def setTdCellComponent(value: CustomizeComponent): Self = StObject.set(x, "tdCellComponent", value.asInstanceOf[js.Any])
    }
  }
}
