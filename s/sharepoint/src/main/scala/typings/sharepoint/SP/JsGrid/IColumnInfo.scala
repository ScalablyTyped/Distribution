package typings.sharepoint.SP.JsGrid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IColumnInfo extends StObject {
  
  /** Column identifier */
  var columnKey: String
  
  /** Column identifier */
  var fieldKey: String
  
  /** Field keys of the fields, that are displayed in this column */
  var fieldKeys: js.Array[String]
  
  /** Column image URL.
    If not null, the column header cell will show the image instead of title text.
    If the title is defined at the same time as the imgSrc, the title will be shown as a tooltip. */
  var imgSrc: js.UndefOr[String] = js.undefined
  
  /** true by default */
  var isAutoFilterable: js.UndefOr[Boolean] = js.undefined
  
  /** false by default */
  var isFooter: js.UndefOr[Boolean] = js.undefined
  
  /** true by default */
  var isHidable: js.UndefOr[Boolean] = js.undefined
  
  /** true by default */
  var isResizable: js.UndefOr[Boolean] = js.undefined
  
  /** true by default */
  var isSortable: js.UndefOr[Boolean] = js.undefined
  
  /** true by default */
  var isVisible: js.UndefOr[Boolean] = js.undefined
  
  /** Column title */
  var name: String
  
  /** Width of the column */
  var width: Double
}
object IColumnInfo {
  
  inline def apply(columnKey: String, fieldKey: String, fieldKeys: js.Array[String], name: String, width: Double): IColumnInfo = {
    val __obj = js.Dynamic.literal(columnKey = columnKey.asInstanceOf[js.Any], fieldKey = fieldKey.asInstanceOf[js.Any], fieldKeys = fieldKeys.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IColumnInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IColumnInfo] (val x: Self) extends AnyVal {
    
    inline def setColumnKey(value: String): Self = StObject.set(x, "columnKey", value.asInstanceOf[js.Any])
    
    inline def setFieldKey(value: String): Self = StObject.set(x, "fieldKey", value.asInstanceOf[js.Any])
    
    inline def setFieldKeys(value: js.Array[String]): Self = StObject.set(x, "fieldKeys", value.asInstanceOf[js.Any])
    
    inline def setFieldKeysVarargs(value: String*): Self = StObject.set(x, "fieldKeys", js.Array(value*))
    
    inline def setImgSrc(value: String): Self = StObject.set(x, "imgSrc", value.asInstanceOf[js.Any])
    
    inline def setImgSrcUndefined: Self = StObject.set(x, "imgSrc", js.undefined)
    
    inline def setIsAutoFilterable(value: Boolean): Self = StObject.set(x, "isAutoFilterable", value.asInstanceOf[js.Any])
    
    inline def setIsAutoFilterableUndefined: Self = StObject.set(x, "isAutoFilterable", js.undefined)
    
    inline def setIsFooter(value: Boolean): Self = StObject.set(x, "isFooter", value.asInstanceOf[js.Any])
    
    inline def setIsFooterUndefined: Self = StObject.set(x, "isFooter", js.undefined)
    
    inline def setIsHidable(value: Boolean): Self = StObject.set(x, "isHidable", value.asInstanceOf[js.Any])
    
    inline def setIsHidableUndefined: Self = StObject.set(x, "isHidable", js.undefined)
    
    inline def setIsResizable(value: Boolean): Self = StObject.set(x, "isResizable", value.asInstanceOf[js.Any])
    
    inline def setIsResizableUndefined: Self = StObject.set(x, "isResizable", js.undefined)
    
    inline def setIsSortable(value: Boolean): Self = StObject.set(x, "isSortable", value.asInstanceOf[js.Any])
    
    inline def setIsSortableUndefined: Self = StObject.set(x, "isSortable", js.undefined)
    
    inline def setIsVisible(value: Boolean): Self = StObject.set(x, "isVisible", value.asInstanceOf[js.Any])
    
    inline def setIsVisibleUndefined: Self = StObject.set(x, "isVisible", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
