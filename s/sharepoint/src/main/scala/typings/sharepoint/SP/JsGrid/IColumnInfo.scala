package typings.sharepoint.SP.JsGrid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IColumnInfo extends StObject {
  
  /** Column identifier */
  var columnKey: String = js.native
  
  /** Column identifier */
  var fieldKey: String = js.native
  
  /** Field keys of the fields, that are displayed in this column */
  var fieldKeys: js.Array[String] = js.native
  
  /** Column image URL.
    If not null, the column header cell will show the image instead of title text.
    If the title is defined at the same time as the imgSrc, the title will be shown as a tooltip. */
  var imgSrc: js.UndefOr[String] = js.native
  
  /** true by default */
  var isAutoFilterable: js.UndefOr[Boolean] = js.native
  
  /** false by default */
  var isFooter: js.UndefOr[Boolean] = js.native
  
  /** true by default */
  var isHidable: js.UndefOr[Boolean] = js.native
  
  /** true by default */
  var isResizable: js.UndefOr[Boolean] = js.native
  
  /** true by default */
  var isSortable: js.UndefOr[Boolean] = js.native
  
  /** true by default */
  var isVisible: js.UndefOr[Boolean] = js.native
  
  /** Column title */
  var name: String = js.native
  
  /** Width of the column */
  var width: Double = js.native
}
object IColumnInfo {
  
  @scala.inline
  def apply(columnKey: String, fieldKey: String, fieldKeys: js.Array[String], name: String, width: Double): IColumnInfo = {
    val __obj = js.Dynamic.literal(columnKey = columnKey.asInstanceOf[js.Any], fieldKey = fieldKey.asInstanceOf[js.Any], fieldKeys = fieldKeys.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IColumnInfo]
  }
  
  @scala.inline
  implicit class IColumnInfoMutableBuilder[Self <: IColumnInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumnKey(value: String): Self = StObject.set(x, "columnKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldKey(value: String): Self = StObject.set(x, "fieldKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldKeys(value: js.Array[String]): Self = StObject.set(x, "fieldKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldKeysVarargs(value: String*): Self = StObject.set(x, "fieldKeys", js.Array(value :_*))
    
    @scala.inline
    def setImgSrc(value: String): Self = StObject.set(x, "imgSrc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImgSrcUndefined: Self = StObject.set(x, "imgSrc", js.undefined)
    
    @scala.inline
    def setIsAutoFilterable(value: Boolean): Self = StObject.set(x, "isAutoFilterable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsAutoFilterableUndefined: Self = StObject.set(x, "isAutoFilterable", js.undefined)
    
    @scala.inline
    def setIsFooter(value: Boolean): Self = StObject.set(x, "isFooter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFooterUndefined: Self = StObject.set(x, "isFooter", js.undefined)
    
    @scala.inline
    def setIsHidable(value: Boolean): Self = StObject.set(x, "isHidable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsHidableUndefined: Self = StObject.set(x, "isHidable", js.undefined)
    
    @scala.inline
    def setIsResizable(value: Boolean): Self = StObject.set(x, "isResizable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsResizableUndefined: Self = StObject.set(x, "isResizable", js.undefined)
    
    @scala.inline
    def setIsSortable(value: Boolean): Self = StObject.set(x, "isSortable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSortableUndefined: Self = StObject.set(x, "isSortable", js.undefined)
    
    @scala.inline
    def setIsVisible(value: Boolean): Self = StObject.set(x, "isVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsVisibleUndefined: Self = StObject.set(x, "isVisible", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
