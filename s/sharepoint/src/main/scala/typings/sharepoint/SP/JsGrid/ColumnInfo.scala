package typings.sharepoint.SP.JsGrid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnInfo extends StObject {
  
  /** always returns 'column' */
  def ColumnType(): String
  
  var bOpenMenuOnContentClick: Boolean
  
  /** Column identifier */
  var columnKey: String
  
  /** Field keys of the fields, that are displayed in this column */
  var fieldKeys: js.Array[String]
  
  /** this is used when you need to make some of the cells in the column readonly, but at the same time keep others editable */
  def fnGetCellEditMode(record: IRecord, fieldKey: String): EditMode
  
  /** this function should return id of the style for the given cell in the column
    styles and their ids are registered for a JsGridControl via jsGridParams.styleManager.RegisterCellStyle method */
  def fnGetCellStyleId(record: IRecord, fieldKey: String, dataValue: Any): String
  
  /** this function should return name of the display control for the given cell in the column
    the name should be previously associated with the display control via SP.JsGrid.PropertyType.Utils.RegisterDisplayControl method */
  def fnGetDisplayControlName(record: IRecord, fieldKey: String): String
  
  /** this function should return name of the edit control for the given cell in the column
    the name should be previously associated with the edit control via SP.JsGrid.PropertyType.Utils.RegisterEditControl method */
  def fnGetEditControlName(record: IRecord, fieldKey: String): String
  
  /** set custom tooltip for the given cell in the column. by default, localized value is displayed as the tooltip */
  def fnGetSingleValueTooltip(record: IRecord, fieldKey: String, dataValue: Any, localizedValue: Any): String
  
  /** set widget control names for a particular cell
    widgets are basically in-cell buttons with associated popup controls, e.g. date selector or address book button
    standard widget ids are defined in the SP.JsGrid.WidgetControl.Type enumeration
    it is also possible to create your own widgets
    usually this function is not used, and instead, widget control names are determined via PropertyType
    */
  def fnGetWidgetControlNames(record: IRecord, fieldKey: String): js.Array[String]
  
  /** determine whether the cells in this column should be clickable */
  def fnShouldLinkSingleValue(record: IRecord, fieldKey: String, dataValue: Any, localizedValue: Any): Boolean
  
  /** if a particular cell is determined as clickable by fnShouldLinkSingleValue, this function will be called when the cell is clicked */
  def fnSingleValueClicked(record: IRecord, fieldKey: String, dataValue: Any, localizedValue: Any): Unit
  
  /** Custom image HTML.
    If you define this in addition to the imgSrc attribute, then instead of standard img tag
    the custom HTML defined by this field will be used. */
  var imgRawSrc: String
  
  /** Column image URL.
    If not null, the column header cell will show the image instead of title text.
    If the title is defined at the same time as the imgSrc, the title will be shown as a tooltip. */
  var imgSrc: String
  
  /** true by default */
  var isAutoFilterable: Boolean
  
  /** false by default */
  var isFooter: Boolean
  
  /** true by default */
  var isHidable: Boolean
  
  /** true by default */
  var isResizable: Boolean
  
  /** true by default */
  var isSortable: Boolean
  
  /** true by default */
  var isVisible: Boolean
  
  /** Column title */
  var name: String
  
  /** Width of the column */
  var width: Double
}
object ColumnInfo {
  
  inline def apply(
    ColumnType: () => String,
    bOpenMenuOnContentClick: Boolean,
    columnKey: String,
    fieldKeys: js.Array[String],
    fnGetCellEditMode: (IRecord, String) => EditMode,
    fnGetCellStyleId: (IRecord, String, Any) => String,
    fnGetDisplayControlName: (IRecord, String) => String,
    fnGetEditControlName: (IRecord, String) => String,
    fnGetSingleValueTooltip: (IRecord, String, Any, Any) => String,
    fnGetWidgetControlNames: (IRecord, String) => js.Array[String],
    fnShouldLinkSingleValue: (IRecord, String, Any, Any) => Boolean,
    fnSingleValueClicked: (IRecord, String, Any, Any) => Unit,
    imgRawSrc: String,
    imgSrc: String,
    isAutoFilterable: Boolean,
    isFooter: Boolean,
    isHidable: Boolean,
    isResizable: Boolean,
    isSortable: Boolean,
    isVisible: Boolean,
    name: String,
    width: Double
  ): ColumnInfo = {
    val __obj = js.Dynamic.literal(ColumnType = js.Any.fromFunction0(ColumnType), bOpenMenuOnContentClick = bOpenMenuOnContentClick.asInstanceOf[js.Any], columnKey = columnKey.asInstanceOf[js.Any], fieldKeys = fieldKeys.asInstanceOf[js.Any], fnGetCellEditMode = js.Any.fromFunction2(fnGetCellEditMode), fnGetCellStyleId = js.Any.fromFunction3(fnGetCellStyleId), fnGetDisplayControlName = js.Any.fromFunction2(fnGetDisplayControlName), fnGetEditControlName = js.Any.fromFunction2(fnGetEditControlName), fnGetSingleValueTooltip = js.Any.fromFunction4(fnGetSingleValueTooltip), fnGetWidgetControlNames = js.Any.fromFunction2(fnGetWidgetControlNames), fnShouldLinkSingleValue = js.Any.fromFunction4(fnShouldLinkSingleValue), fnSingleValueClicked = js.Any.fromFunction4(fnSingleValueClicked), imgRawSrc = imgRawSrc.asInstanceOf[js.Any], imgSrc = imgSrc.asInstanceOf[js.Any], isAutoFilterable = isAutoFilterable.asInstanceOf[js.Any], isFooter = isFooter.asInstanceOf[js.Any], isHidable = isHidable.asInstanceOf[js.Any], isResizable = isResizable.asInstanceOf[js.Any], isSortable = isSortable.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnInfo]
  }
  
  extension [Self <: ColumnInfo](x: Self) {
    
    inline def setBOpenMenuOnContentClick(value: Boolean): Self = StObject.set(x, "bOpenMenuOnContentClick", value.asInstanceOf[js.Any])
    
    inline def setColumnKey(value: String): Self = StObject.set(x, "columnKey", value.asInstanceOf[js.Any])
    
    inline def setColumnType(value: () => String): Self = StObject.set(x, "ColumnType", js.Any.fromFunction0(value))
    
    inline def setFieldKeys(value: js.Array[String]): Self = StObject.set(x, "fieldKeys", value.asInstanceOf[js.Any])
    
    inline def setFieldKeysVarargs(value: String*): Self = StObject.set(x, "fieldKeys", js.Array(value*))
    
    inline def setFnGetCellEditMode(value: (IRecord, String) => EditMode): Self = StObject.set(x, "fnGetCellEditMode", js.Any.fromFunction2(value))
    
    inline def setFnGetCellStyleId(value: (IRecord, String, Any) => String): Self = StObject.set(x, "fnGetCellStyleId", js.Any.fromFunction3(value))
    
    inline def setFnGetDisplayControlName(value: (IRecord, String) => String): Self = StObject.set(x, "fnGetDisplayControlName", js.Any.fromFunction2(value))
    
    inline def setFnGetEditControlName(value: (IRecord, String) => String): Self = StObject.set(x, "fnGetEditControlName", js.Any.fromFunction2(value))
    
    inline def setFnGetSingleValueTooltip(value: (IRecord, String, Any, Any) => String): Self = StObject.set(x, "fnGetSingleValueTooltip", js.Any.fromFunction4(value))
    
    inline def setFnGetWidgetControlNames(value: (IRecord, String) => js.Array[String]): Self = StObject.set(x, "fnGetWidgetControlNames", js.Any.fromFunction2(value))
    
    inline def setFnShouldLinkSingleValue(value: (IRecord, String, Any, Any) => Boolean): Self = StObject.set(x, "fnShouldLinkSingleValue", js.Any.fromFunction4(value))
    
    inline def setFnSingleValueClicked(value: (IRecord, String, Any, Any) => Unit): Self = StObject.set(x, "fnSingleValueClicked", js.Any.fromFunction4(value))
    
    inline def setImgRawSrc(value: String): Self = StObject.set(x, "imgRawSrc", value.asInstanceOf[js.Any])
    
    inline def setImgSrc(value: String): Self = StObject.set(x, "imgSrc", value.asInstanceOf[js.Any])
    
    inline def setIsAutoFilterable(value: Boolean): Self = StObject.set(x, "isAutoFilterable", value.asInstanceOf[js.Any])
    
    inline def setIsFooter(value: Boolean): Self = StObject.set(x, "isFooter", value.asInstanceOf[js.Any])
    
    inline def setIsHidable(value: Boolean): Self = StObject.set(x, "isHidable", value.asInstanceOf[js.Any])
    
    inline def setIsResizable(value: Boolean): Self = StObject.set(x, "isResizable", value.asInstanceOf[js.Any])
    
    inline def setIsSortable(value: Boolean): Self = StObject.set(x, "isSortable", value.asInstanceOf[js.Any])
    
    inline def setIsVisible(value: Boolean): Self = StObject.set(x, "isVisible", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
