package typings.rcTable.interfaceMod

import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CellType[RecordType] extends StObject {
  
  var children: js.UndefOr[ReactNode] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var colEnd: js.UndefOr[Double] = js.native
  
  var colSpan: js.UndefOr[Double] = js.native
  
  var colStart: js.UndefOr[Double] = js.native
  
  var column: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: rc-table.rc-table/lib/interface.ColumnsType<RecordType>[number] */ js.Any
  ] = js.native
  
  /** Only used for table header */
  var hasSubColumns: js.UndefOr[Boolean] = js.native
  
  var key: js.UndefOr[Key] = js.native
  
  var rowSpan: js.UndefOr[Double] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
}
object CellType {
  
  @scala.inline
  def apply[RecordType](): CellType[RecordType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CellType[RecordType]]
  }
  
  @scala.inline
  implicit class CellTypeMutableBuilder[Self <: CellType[_], RecordType] (val x: Self with CellType[RecordType]) extends AnyVal {
    
    @scala.inline
    def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setColEnd(value: Double): Self = StObject.set(x, "colEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColEndUndefined: Self = StObject.set(x, "colEnd", js.undefined)
    
    @scala.inline
    def setColSpan(value: Double): Self = StObject.set(x, "colSpan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColSpanUndefined: Self = StObject.set(x, "colSpan", js.undefined)
    
    @scala.inline
    def setColStart(value: Double): Self = StObject.set(x, "colStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColStartUndefined: Self = StObject.set(x, "colStart", js.undefined)
    
    @scala.inline
    def setColumn(
      value: /* import warning: importer.ImportType#apply Failed type conversion: rc-table.rc-table/lib/interface.ColumnsType<RecordType>[number] */ js.Any
    ): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
    
    @scala.inline
    def setHasSubColumns(value: Boolean): Self = StObject.set(x, "hasSubColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasSubColumnsUndefined: Self = StObject.set(x, "hasSubColumns", js.undefined)
    
    @scala.inline
    def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setRowSpan(value: Double): Self = StObject.set(x, "rowSpan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowSpanUndefined: Self = StObject.set(x, "rowSpan", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
