package typings.sharepoint.SP.JsGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColumnInfo extends js.Object {
  
  /** always returns 'column' */
  def ColumnType(): String = js.native
  
  var bOpenMenuOnContentClick: Boolean = js.native
  
  /** Column identifier */
  var columnKey: String = js.native
  
  /** Field keys of the fields, that are displayed in this column */
  var fieldKeys: js.Array[String] = js.native
  
  /** this is used when you need to make some of the cells in the column readonly, but at the same time keep others editable */
  def fnGetCellEditMode(record: IRecord, fieldKey: String): EditMode = js.native
  
  /** this function should return id of the style for the given cell in the column
    styles and their ids are registered for a JsGridControl via jsGridParams.styleManager.RegisterCellStyle method */
  def fnGetCellStyleId(record: IRecord, fieldKey: String, dataValue: js.Any): String = js.native
  
  /** this function should return name of the display control for the given cell in the column
    the name should be previously associated with the display control via SP.JsGrid.PropertyType.Utils.RegisterDisplayControl method */
  def fnGetDisplayControlName(record: IRecord, fieldKey: String): String = js.native
  
  /** this function should return name of the edit control for the given cell in the column
    the name should be previously associated with the edit control via SP.JsGrid.PropertyType.Utils.RegisterEditControl method */
  def fnGetEditControlName(record: IRecord, fieldKey: String): String = js.native
  
  /** set custom tooltip for the given cell in the column. by default, localized value is displayed as the tooltip */
  def fnGetSingleValueTooltip(record: IRecord, fieldKey: String, dataValue: js.Any, localizedValue: js.Any): String = js.native
  
  /** set widget control names for a particular cell
    widgets are basically in-cell buttons with associated popup controls, e.g. date selector or address book button
    standard widget ids are defined in the SP.JsGrid.WidgetControl.Type enumeration
    it is also possible to create your own widgets
    usually this function is not used, and instead, widget control names are determined via PropertyType
    */
  def fnGetWidgetControlNames(record: IRecord, fieldKey: String): js.Array[String] = js.native
  
  /** determine whether the cells in this column should be clickable */
  def fnShouldLinkSingleValue(record: IRecord, fieldKey: String, dataValue: js.Any, localizedValue: js.Any): Boolean = js.native
  
  /** if a particular cell is determined as clickable by fnShouldLinkSingleValue, this function will be called when the cell is clicked */
  def fnSingleValueClicked(record: IRecord, fieldKey: String, dataValue: js.Any, localizedValue: js.Any): Unit = js.native
  
  /** Custom image HTML.
    If you define this in addition to the imgSrc attribute, then instead of standard img tag
    the custom HTML defined by this field will be used. */
  var imgRawSrc: String = js.native
  
  /** Column image URL.
    If not null, the column header cell will show the image instead of title text.
    If the title is defined at the same time as the imgSrc, the title will be shown as a tooltip. */
  var imgSrc: String = js.native
  
  /** true by default */
  var isAutoFilterable: Boolean = js.native
  
  /** false by default */
  var isFooter: Boolean = js.native
  
  /** true by default */
  var isHidable: Boolean = js.native
  
  /** true by default */
  var isResizable: Boolean = js.native
  
  /** true by default */
  var isSortable: Boolean = js.native
  
  /** true by default */
  var isVisible: Boolean = js.native
  
  /** Column title */
  var name: String = js.native
  
  /** Width of the column */
  var width: Double = js.native
}
object ColumnInfo {
  
  @scala.inline
  def apply(
    ColumnType: () => String,
    bOpenMenuOnContentClick: Boolean,
    columnKey: String,
    fieldKeys: js.Array[String],
    fnGetCellEditMode: (IRecord, String) => EditMode,
    fnGetCellStyleId: (IRecord, String, js.Any) => String,
    fnGetDisplayControlName: (IRecord, String) => String,
    fnGetEditControlName: (IRecord, String) => String,
    fnGetSingleValueTooltip: (IRecord, String, js.Any, js.Any) => String,
    fnGetWidgetControlNames: (IRecord, String) => js.Array[String],
    fnShouldLinkSingleValue: (IRecord, String, js.Any, js.Any) => Boolean,
    fnSingleValueClicked: (IRecord, String, js.Any, js.Any) => Unit,
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
  
  @scala.inline
  implicit class ColumnInfoOps[Self <: ColumnInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setColumnType(value: () => String): Self = this.set("ColumnType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setBOpenMenuOnContentClick(value: Boolean): Self = this.set("bOpenMenuOnContentClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnKey(value: String): Self = this.set("columnKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldKeysVarargs(value: String*): Self = this.set("fieldKeys", js.Array(value :_*))
    
    @scala.inline
    def setFieldKeys(value: js.Array[String]): Self = this.set("fieldKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFnGetCellEditMode(value: (IRecord, String) => EditMode): Self = this.set("fnGetCellEditMode", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFnGetCellStyleId(value: (IRecord, String, js.Any) => String): Self = this.set("fnGetCellStyleId", js.Any.fromFunction3(value))
    
    @scala.inline
    def setFnGetDisplayControlName(value: (IRecord, String) => String): Self = this.set("fnGetDisplayControlName", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFnGetEditControlName(value: (IRecord, String) => String): Self = this.set("fnGetEditControlName", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFnGetSingleValueTooltip(value: (IRecord, String, js.Any, js.Any) => String): Self = this.set("fnGetSingleValueTooltip", js.Any.fromFunction4(value))
    
    @scala.inline
    def setFnGetWidgetControlNames(value: (IRecord, String) => js.Array[String]): Self = this.set("fnGetWidgetControlNames", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFnShouldLinkSingleValue(value: (IRecord, String, js.Any, js.Any) => Boolean): Self = this.set("fnShouldLinkSingleValue", js.Any.fromFunction4(value))
    
    @scala.inline
    def setFnSingleValueClicked(value: (IRecord, String, js.Any, js.Any) => Unit): Self = this.set("fnSingleValueClicked", js.Any.fromFunction4(value))
    
    @scala.inline
    def setImgRawSrc(value: String): Self = this.set("imgRawSrc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImgSrc(value: String): Self = this.set("imgSrc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsAutoFilterable(value: Boolean): Self = this.set("isAutoFilterable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFooter(value: Boolean): Self = this.set("isFooter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsHidable(value: Boolean): Self = this.set("isHidable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsResizable(value: Boolean): Self = this.set("isResizable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSortable(value: Boolean): Self = this.set("isSortable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsVisible(value: Boolean): Self = this.set("isVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
}
