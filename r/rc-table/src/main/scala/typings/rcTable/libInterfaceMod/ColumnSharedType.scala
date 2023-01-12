package typings.rcTable.libInterfaceMod

import typings.react.mod.HTMLAttributes
import typings.react.mod.ReactNode
import typings.react.mod.TdHTMLAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnSharedType[RecordType] extends StObject {
  
  var align: js.UndefOr[AlignType] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  var ellipsis: js.UndefOr[CellEllipsisType] = js.undefined
  
  var fixed: js.UndefOr[FixedType] = js.undefined
  
  var key: js.UndefOr[Key] = js.undefined
  
  var onHeaderCell: js.UndefOr[
    GetComponentProps[
      /* import warning: importer.ImportType#apply Failed type conversion: rc-table.rc-table/lib/interface.ColumnsType<RecordType>[number] */ js.Any
    ]
  ] = js.undefined
  
  var rowScope: js.UndefOr[RowScopeType] = js.undefined
  
  var title: js.UndefOr[ReactNode] = js.undefined
}
object ColumnSharedType {
  
  inline def apply[RecordType](): ColumnSharedType[RecordType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnSharedType[RecordType]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ColumnSharedType[?], RecordType] (val x: Self & ColumnSharedType[RecordType]) extends AnyVal {
    
    inline def setAlign(value: AlignType): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setEllipsis(value: CellEllipsisType): Self = StObject.set(x, "ellipsis", value.asInstanceOf[js.Any])
    
    inline def setEllipsisUndefined: Self = StObject.set(x, "ellipsis", js.undefined)
    
    inline def setFixed(value: FixedType): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
    
    inline def setFixedUndefined: Self = StObject.set(x, "fixed", js.undefined)
    
    inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setOnHeaderCell(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: rc-table.rc-table/lib/interface.ColumnsType<RecordType>[number] */ js.Any, /* index */ js.UndefOr[Double]) => HTMLAttributes[Any] | TdHTMLAttributes[Any]
    ): Self = StObject.set(x, "onHeaderCell", js.Any.fromFunction2(value))
    
    inline def setOnHeaderCellUndefined: Self = StObject.set(x, "onHeaderCell", js.undefined)
    
    inline def setRowScope(value: RowScopeType): Self = StObject.set(x, "rowScope", value.asInstanceOf[js.Any])
    
    inline def setRowScopeUndefined: Self = StObject.set(x, "rowScope", js.undefined)
    
    inline def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
