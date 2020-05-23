package typings.sharepoint.SP.JsGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line: interface-name
trait IColumnInfo extends js.Object {
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
  @scala.inline
  def apply(
    columnKey: String,
    fieldKey: String,
    fieldKeys: js.Array[String],
    name: String,
    width: Double,
    imgSrc: String = null,
    isAutoFilterable: js.UndefOr[Boolean] = js.undefined,
    isFooter: js.UndefOr[Boolean] = js.undefined,
    isHidable: js.UndefOr[Boolean] = js.undefined,
    isResizable: js.UndefOr[Boolean] = js.undefined,
    isSortable: js.UndefOr[Boolean] = js.undefined,
    isVisible: js.UndefOr[Boolean] = js.undefined
  ): IColumnInfo = {
    val __obj = js.Dynamic.literal(columnKey = columnKey.asInstanceOf[js.Any], fieldKey = fieldKey.asInstanceOf[js.Any], fieldKeys = fieldKeys.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (imgSrc != null) __obj.updateDynamic("imgSrc")(imgSrc.asInstanceOf[js.Any])
    if (!js.isUndefined(isAutoFilterable)) __obj.updateDynamic("isAutoFilterable")(isAutoFilterable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isFooter)) __obj.updateDynamic("isFooter")(isFooter.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isHidable)) __obj.updateDynamic("isHidable")(isHidable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isResizable)) __obj.updateDynamic("isResizable")(isResizable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isSortable)) __obj.updateDynamic("isSortable")(isSortable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isVisible)) __obj.updateDynamic("isVisible")(isVisible.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IColumnInfo]
  }
}

