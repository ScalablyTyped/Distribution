package typings.sharepoint.global.SP.JsGrid

import typings.sharepoint.SP.JsGrid.IRecord
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SP.JsGrid.ColumnInfo")
@js.native
class ColumnInfo protected ()
  extends StObject
     with typings.sharepoint.SP.JsGrid.ColumnInfo {
  def this(name: String, imgSrc: String, key: String, width: Double) = this()
  
  /** always returns 'column' */
  /* CompleteClass */
  override def ColumnType(): String = js.native
  
  /* CompleteClass */
  var bOpenMenuOnContentClick: Boolean = js.native
  
  /** Column identifier */
  /* CompleteClass */
  var columnKey: String = js.native
  
  /** Field keys of the fields, that are displayed in this column */
  /* CompleteClass */
  var fieldKeys: js.Array[String] = js.native
  
  /** this is used when you need to make some of the cells in the column readonly, but at the same time keep others editable */
  /* CompleteClass */
  override def fnGetCellEditMode(record: IRecord, fieldKey: String): typings.sharepoint.SP.JsGrid.EditMode = js.native
  
  /** this function should return id of the style for the given cell in the column
    styles and their ids are registered for a JsGridControl via jsGridParams.styleManager.RegisterCellStyle method */
  /* CompleteClass */
  override def fnGetCellStyleId(record: IRecord, fieldKey: String, dataValue: js.Any): String = js.native
  
  /** this function should return name of the display control for the given cell in the column
    the name should be previously associated with the display control via SP.JsGrid.PropertyType.Utils.RegisterDisplayControl method */
  /* CompleteClass */
  override def fnGetDisplayControlName(record: IRecord, fieldKey: String): String = js.native
  
  /** this function should return name of the edit control for the given cell in the column
    the name should be previously associated with the edit control via SP.JsGrid.PropertyType.Utils.RegisterEditControl method */
  /* CompleteClass */
  override def fnGetEditControlName(record: IRecord, fieldKey: String): String = js.native
  
  /** set custom tooltip for the given cell in the column. by default, localized value is displayed as the tooltip */
  /* CompleteClass */
  override def fnGetSingleValueTooltip(record: IRecord, fieldKey: String, dataValue: js.Any, localizedValue: js.Any): String = js.native
  
  /** set widget control names for a particular cell
    widgets are basically in-cell buttons with associated popup controls, e.g. date selector or address book button
    standard widget ids are defined in the SP.JsGrid.WidgetControl.Type enumeration
    it is also possible to create your own widgets
    usually this function is not used, and instead, widget control names are determined via PropertyType
    */
  /* CompleteClass */
  override def fnGetWidgetControlNames(record: IRecord, fieldKey: String): js.Array[String] = js.native
  
  /** determine whether the cells in this column should be clickable */
  /* CompleteClass */
  override def fnShouldLinkSingleValue(record: IRecord, fieldKey: String, dataValue: js.Any, localizedValue: js.Any): Boolean = js.native
  
  /** if a particular cell is determined as clickable by fnShouldLinkSingleValue, this function will be called when the cell is clicked */
  /* CompleteClass */
  override def fnSingleValueClicked(record: IRecord, fieldKey: String, dataValue: js.Any, localizedValue: js.Any): Unit = js.native
  
  /** Custom image HTML.
    If you define this in addition to the imgSrc attribute, then instead of standard img tag
    the custom HTML defined by this field will be used. */
  /* CompleteClass */
  var imgRawSrc: String = js.native
  
  /** Column image URL.
    If not null, the column header cell will show the image instead of title text.
    If the title is defined at the same time as the imgSrc, the title will be shown as a tooltip. */
  /* CompleteClass */
  var imgSrc: String = js.native
  
  /** true by default */
  /* CompleteClass */
  var isAutoFilterable: Boolean = js.native
  
  /** false by default */
  /* CompleteClass */
  var isFooter: Boolean = js.native
  
  /** true by default */
  /* CompleteClass */
  var isHidable: Boolean = js.native
  
  /** true by default */
  /* CompleteClass */
  var isResizable: Boolean = js.native
  
  /** true by default */
  /* CompleteClass */
  var isSortable: Boolean = js.native
  
  /** true by default */
  /* CompleteClass */
  var isVisible: Boolean = js.native
  
  /** Column title */
  /* CompleteClass */
  var name: String = js.native
  
  /** Width of the column */
  /* CompleteClass */
  var width: Double = js.native
}
