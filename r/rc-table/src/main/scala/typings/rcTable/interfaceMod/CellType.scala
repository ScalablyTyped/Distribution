package typings.rcTable.interfaceMod

import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CellType[RecordType] extends StObject {
  
  var children: js.UndefOr[ReactNode] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  var colEnd: js.UndefOr[Double] = js.undefined
  
  var colSpan: js.UndefOr[Double] = js.undefined
  
  var colStart: js.UndefOr[Double] = js.undefined
  
  var column: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: rc-table.rc-table/lib/interface.ColumnsType<RecordType>[number] */ js.Any
  ] = js.undefined
  
  /** Only used for table header */
  var hasSubColumns: js.UndefOr[Boolean] = js.undefined
  
  var key: js.UndefOr[Key] = js.undefined
  
  var rowSpan: js.UndefOr[Double] = js.undefined
  
  var style: js.UndefOr[CSSProperties] = js.undefined
}
object CellType {
  
  inline def apply[RecordType](): CellType[RecordType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CellType[RecordType]]
  }
  
  extension [Self <: CellType[?], RecordType](x: Self & CellType[RecordType]) {
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setColEnd(value: Double): Self = StObject.set(x, "colEnd", value.asInstanceOf[js.Any])
    
    inline def setColEndUndefined: Self = StObject.set(x, "colEnd", js.undefined)
    
    inline def setColSpan(value: Double): Self = StObject.set(x, "colSpan", value.asInstanceOf[js.Any])
    
    inline def setColSpanUndefined: Self = StObject.set(x, "colSpan", js.undefined)
    
    inline def setColStart(value: Double): Self = StObject.set(x, "colStart", value.asInstanceOf[js.Any])
    
    inline def setColStartUndefined: Self = StObject.set(x, "colStart", js.undefined)
    
    inline def setColumn(
      value: /* import warning: importer.ImportType#apply Failed type conversion: rc-table.rc-table/lib/interface.ColumnsType<RecordType>[number] */ js.Any
    ): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
    
    inline def setHasSubColumns(value: Boolean): Self = StObject.set(x, "hasSubColumns", value.asInstanceOf[js.Any])
    
    inline def setHasSubColumnsUndefined: Self = StObject.set(x, "hasSubColumns", js.undefined)
    
    inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setRowSpan(value: Double): Self = StObject.set(x, "rowSpan", value.asInstanceOf[js.Any])
    
    inline def setRowSpanUndefined: Self = StObject.set(x, "rowSpan", js.undefined)
    
    inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
