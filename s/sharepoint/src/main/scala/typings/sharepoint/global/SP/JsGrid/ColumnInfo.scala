package typings.sharepoint.global.SP.JsGrid

import typings.sharepoint.SP.JsGrid.IRecord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.JsGrid.ColumnInfo")
@js.native
class ColumnInfo protected ()
  extends typings.sharepoint.SP.JsGrid.ColumnInfo {
  def this(name: String, imgSrc: String, key: String, width: Double) = this()
  /* CompleteClass */
  override var bOpenMenuOnContentClick: Boolean = js.native
  /** Column identifier */
  /* CompleteClass */
  override var columnKey: String = js.native
  /** Field keys of the fields, that are displayed in this column */
  /* CompleteClass */
  override var fieldKeys: js.Array[String] = js.native
  /** Custom image HTML.
    If you define this in addition to the imgSrc attribute, then instead of standard img tag
    the custom HTML defined by this field will be used. */
  /* CompleteClass */
  override var imgRawSrc: String = js.native
  /** Column image URL.
    If not null, the column header cell will show the image instead of title text.
    If the title is defined at the same time as the imgSrc, the title will be shown as a tooltip. */
  /* CompleteClass */
  override var imgSrc: String = js.native
  /** true by default */
  /* CompleteClass */
  override var isAutoFilterable: Boolean = js.native
  /** false by default */
  /* CompleteClass */
  override var isFooter: Boolean = js.native
  /** true by default */
  /* CompleteClass */
  override var isHidable: Boolean = js.native
  /** true by default */
  /* CompleteClass */
  override var isResizable: Boolean = js.native
  /** true by default */
  /* CompleteClass */
  override var isSortable: Boolean = js.native
  /** true by default */
  /* CompleteClass */
  override var isVisible: Boolean = js.native
  /** Column title */
  /* CompleteClass */
  override var name: String = js.native
  /** Width of the column */
  /* CompleteClass */
  override var width: Double = js.native
  /** always returns 'column' */
  /* CompleteClass */
  override def ColumnType(): String = js.native
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
}

