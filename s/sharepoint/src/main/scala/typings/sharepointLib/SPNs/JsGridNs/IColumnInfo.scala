package typings
package sharepointLib.SPNs.JsGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line: interface-name
trait IColumnInfo extends js.Object {
  /** Column identifier */
  var columnKey: java.lang.String
  /** Column identifier */
  var fieldKey: java.lang.String
  /** Field keys of the fields, that are displayed in this column */
  var fieldKeys: js.Array[java.lang.String]
  /** Column image URL.
    If not null, the column header cell will show the image instead of title text.
    If the title is defined at the same time as the imgSrc, the title will be shown as a tooltip. */
  var imgSrc: js.UndefOr[java.lang.String] = js.undefined
  /** true by default */
  var isAutoFilterable: js.UndefOr[scala.Boolean] = js.undefined
  /** false by default */
  var isFooter: js.UndefOr[scala.Boolean] = js.undefined
  /** true by default */
  var isHidable: js.UndefOr[scala.Boolean] = js.undefined
  /** true by default */
  var isResizable: js.UndefOr[scala.Boolean] = js.undefined
  /** true by default */
  var isSortable: js.UndefOr[scala.Boolean] = js.undefined
  /** true by default */
  var isVisible: js.UndefOr[scala.Boolean] = js.undefined
  /** Column title */
  var name: java.lang.String
  /** Width of the column */
  var width: scala.Double
}

object IColumnInfo {
  @scala.inline
  def apply(
    columnKey: java.lang.String,
    fieldKey: java.lang.String,
    fieldKeys: js.Array[java.lang.String],
    name: java.lang.String,
    width: scala.Double,
    imgSrc: java.lang.String = null,
    isAutoFilterable: js.UndefOr[scala.Boolean] = js.undefined,
    isFooter: js.UndefOr[scala.Boolean] = js.undefined,
    isHidable: js.UndefOr[scala.Boolean] = js.undefined,
    isResizable: js.UndefOr[scala.Boolean] = js.undefined,
    isSortable: js.UndefOr[scala.Boolean] = js.undefined,
    isVisible: js.UndefOr[scala.Boolean] = js.undefined
  ): IColumnInfo = {
    val __obj = js.Dynamic.literal(columnKey = columnKey, fieldKey = fieldKey, fieldKeys = fieldKeys, name = name, width = width)
    if (imgSrc != null) __obj.updateDynamic("imgSrc")(imgSrc)
    if (!js.isUndefined(isAutoFilterable)) __obj.updateDynamic("isAutoFilterable")(isAutoFilterable)
    if (!js.isUndefined(isFooter)) __obj.updateDynamic("isFooter")(isFooter)
    if (!js.isUndefined(isHidable)) __obj.updateDynamic("isHidable")(isHidable)
    if (!js.isUndefined(isResizable)) __obj.updateDynamic("isResizable")(isResizable)
    if (!js.isUndefined(isSortable)) __obj.updateDynamic("isSortable")(isSortable)
    if (!js.isUndefined(isVisible)) __obj.updateDynamic("isVisible")(isVisible)
    __obj.asInstanceOf[IColumnInfo]
  }
}

