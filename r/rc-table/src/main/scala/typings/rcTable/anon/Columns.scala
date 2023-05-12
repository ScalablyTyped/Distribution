package typings.rcTable.anon

import typings.rcTable.libFooterSummaryContextMod.FlattenColumns
import typings.rcTable.libInterfaceMod.ColumnGroupType
import typings.rcTable.libInterfaceMod.ColumnType
import typings.rcTable.libInterfaceMod.ColumnsType
import typings.rcTable.libInterfaceMod.StickyOffsets
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Columns extends StObject {
  
  var columns: js.UndefOr[ColumnsType[Any]] = js.undefined
  
  var flattenColumns: js.UndefOr[FlattenColumns[Any]] = js.undefined
  
  var scrollColumnIndex: js.UndefOr[Double] = js.undefined
  
  var stickyOffsets: js.UndefOr[StickyOffsets] = js.undefined
}
object Columns {
  
  inline def apply(): Columns = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Columns]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Columns] (val x: Self) extends AnyVal {
    
    inline def setColumns(value: ColumnsType[Any]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    inline def setColumnsVarargs(value: (ColumnGroupType[Any] | ColumnType[Any])*): Self = StObject.set(x, "columns", js.Array(value*))
    
    inline def setFlattenColumns(value: FlattenColumns[Any]): Self = StObject.set(x, "flattenColumns", value.asInstanceOf[js.Any])
    
    inline def setFlattenColumnsUndefined: Self = StObject.set(x, "flattenColumns", js.undefined)
    
    inline def setFlattenColumnsVarargs(value: (ColumnType[Any] & Scrollbar)*): Self = StObject.set(x, "flattenColumns", js.Array(value*))
    
    inline def setScrollColumnIndex(value: Double): Self = StObject.set(x, "scrollColumnIndex", value.asInstanceOf[js.Any])
    
    inline def setScrollColumnIndexUndefined: Self = StObject.set(x, "scrollColumnIndex", js.undefined)
    
    inline def setStickyOffsets(value: StickyOffsets): Self = StObject.set(x, "stickyOffsets", value.asInstanceOf[js.Any])
    
    inline def setStickyOffsetsUndefined: Self = StObject.set(x, "stickyOffsets", js.undefined)
  }
}
