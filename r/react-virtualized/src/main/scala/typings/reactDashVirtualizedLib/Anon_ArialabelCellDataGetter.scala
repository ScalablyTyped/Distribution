package typings
package reactDashVirtualizedLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArialabelCellDataGetter extends js.Object {
  var `aria-label`: reactLib.reactMod.Requireable[java.lang.String]
  var cellDataGetter: reactLib.reactMod.Requireable[reactDashVirtualizedLib.distEsTableMod.TableCellDataGetter]
  var cellRenderer: reactLib.reactMod.Requireable[reactDashVirtualizedLib.distEsTableMod.TableCellRenderer]
  var className: reactLib.reactMod.Requireable[java.lang.String]
  var columnData: reactLib.reactMod.Requireable[js.Object]
  var dataKey: reactLib.reactMod.Validator[java.lang.String]
  var disableSort: reactLib.reactMod.Requireable[scala.Boolean]
  var flexGrow: reactLib.reactMod.Requireable[scala.Double]
  var flexShrink: reactLib.reactMod.Requireable[scala.Double]
  var headerClassName: reactLib.reactMod.Requireable[java.lang.String]
  var headerRenderer: reactLib.reactMod.Validator[reactDashVirtualizedLib.distEsTableMod.TableHeaderRowRenderer]
  var id: reactLib.reactMod.Requireable[java.lang.String]
  var label: reactLib.reactMod.Requireable[java.lang.String]
  var maxWidth: reactLib.reactMod.Requireable[scala.Double]
  var minWidth: reactLib.reactMod.Requireable[scala.Double]
  var style: reactLib.reactMod.Requireable[reactLib.reactMod.CSSProperties]
  var width: reactLib.reactMod.Validator[scala.Double]
}

object Anon_ArialabelCellDataGetter {
  @scala.inline
  def apply(
    `aria-label`: reactLib.reactMod.Requireable[java.lang.String],
    cellDataGetter: reactLib.reactMod.Requireable[reactDashVirtualizedLib.distEsTableMod.TableCellDataGetter],
    cellRenderer: reactLib.reactMod.Requireable[reactDashVirtualizedLib.distEsTableMod.TableCellRenderer],
    className: reactLib.reactMod.Requireable[java.lang.String],
    columnData: reactLib.reactMod.Requireable[js.Object],
    dataKey: reactLib.reactMod.Validator[java.lang.String],
    disableSort: reactLib.reactMod.Requireable[scala.Boolean],
    flexGrow: reactLib.reactMod.Requireable[scala.Double],
    flexShrink: reactLib.reactMod.Requireable[scala.Double],
    headerClassName: reactLib.reactMod.Requireable[java.lang.String],
    headerRenderer: reactLib.reactMod.Validator[reactDashVirtualizedLib.distEsTableMod.TableHeaderRowRenderer],
    id: reactLib.reactMod.Requireable[java.lang.String],
    label: reactLib.reactMod.Requireable[java.lang.String],
    maxWidth: reactLib.reactMod.Requireable[scala.Double],
    minWidth: reactLib.reactMod.Requireable[scala.Double],
    style: reactLib.reactMod.Requireable[reactLib.reactMod.CSSProperties],
    width: reactLib.reactMod.Validator[scala.Double]
  ): Anon_ArialabelCellDataGetter = {
    val __obj = js.Dynamic.literal(cellDataGetter = cellDataGetter, cellRenderer = cellRenderer, className = className, columnData = columnData, dataKey = dataKey, disableSort = disableSort, flexGrow = flexGrow, flexShrink = flexShrink, headerClassName = headerClassName, headerRenderer = headerRenderer, id = id, label = label, maxWidth = maxWidth, minWidth = minWidth, style = style, width = width)
    __obj.updateDynamic("aria-label")(`aria-label`)
    __obj.asInstanceOf[Anon_ArialabelCellDataGetter]
  }
}

