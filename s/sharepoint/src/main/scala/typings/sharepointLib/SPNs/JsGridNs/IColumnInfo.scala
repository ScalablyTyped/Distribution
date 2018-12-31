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

