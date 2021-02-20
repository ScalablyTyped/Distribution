package typings.rcTable.interfaceMod

import typings.react.mod.HTMLAttributes
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColumnSharedType[RecordType] extends StObject {
  
  var align: js.UndefOr[AlignType] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var ellipsis: js.UndefOr[CellEllipsisType] = js.native
  
  var fixed: js.UndefOr[FixedType] = js.native
  
  var key: js.UndefOr[Key] = js.native
  
  var onHeaderCell: js.UndefOr[
    GetComponentProps[
      /* import warning: importer.ImportType#apply Failed type conversion: rc-table.rc-table/lib/interface.ColumnsType<RecordType>[number] */ js.Any
    ]
  ] = js.native
  
  var title: js.UndefOr[ReactNode] = js.native
}
object ColumnSharedType {
  
  @scala.inline
  def apply[RecordType](): ColumnSharedType[RecordType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnSharedType[RecordType]]
  }
  
  @scala.inline
  implicit class ColumnSharedTypeMutableBuilder[Self <: ColumnSharedType[_], RecordType] (val x: Self with ColumnSharedType[RecordType]) extends AnyVal {
    
    @scala.inline
    def setAlign(value: AlignType): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setEllipsis(value: CellEllipsisType): Self = StObject.set(x, "ellipsis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEllipsisUndefined: Self = StObject.set(x, "ellipsis", js.undefined)
    
    @scala.inline
    def setFixed(value: FixedType): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFixedUndefined: Self = StObject.set(x, "fixed", js.undefined)
    
    @scala.inline
    def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setOnHeaderCell(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: rc-table.rc-table/lib/interface.ColumnsType<RecordType>[number] */ js.Any, /* index */ js.UndefOr[Double]) => HTMLAttributes[HTMLElement]
    ): Self = StObject.set(x, "onHeaderCell", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnHeaderCellUndefined: Self = StObject.set(x, "onHeaderCell", js.undefined)
    
    @scala.inline
    def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
