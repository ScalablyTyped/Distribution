package typings.reactDashVirtualized

import typings.react.reactMod.CSSProperties
import typings.react.reactMod.Requireable
import typings.react.reactMod.Validator
import typings.reactDashVirtualized.distEsTableMod.TableCellDataGetter
import typings.reactDashVirtualized.distEsTableMod.TableCellRenderer
import typings.reactDashVirtualized.distEsTableMod.TableHeaderRowRenderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArialabelCellDataGetter extends js.Object {
  var `aria-label`: Requireable[String]
  var cellDataGetter: Requireable[TableCellDataGetter]
  var cellRenderer: Requireable[TableCellRenderer]
  var className: Requireable[String]
  var columnData: Requireable[js.Object]
  var dataKey: Validator[String]
  var disableSort: Requireable[Boolean]
  var flexGrow: Requireable[Double]
  var flexShrink: Requireable[Double]
  var headerClassName: Requireable[String]
  var headerRenderer: Validator[TableHeaderRowRenderer]
  var id: Requireable[String]
  var label: Requireable[String]
  var maxWidth: Requireable[Double]
  var minWidth: Requireable[Double]
  var style: Requireable[CSSProperties]
  var width: Validator[Double]
}

object Anon_ArialabelCellDataGetter {
  @scala.inline
  def apply(
    `aria-label`: Requireable[String],
    cellDataGetter: Requireable[TableCellDataGetter],
    cellRenderer: Requireable[TableCellRenderer],
    className: Requireable[String],
    columnData: Requireable[js.Object],
    dataKey: Validator[String],
    disableSort: Requireable[Boolean],
    flexGrow: Requireable[Double],
    flexShrink: Requireable[Double],
    headerClassName: Requireable[String],
    headerRenderer: Validator[TableHeaderRowRenderer],
    id: Requireable[String],
    label: Requireable[String],
    maxWidth: Requireable[Double],
    minWidth: Requireable[Double],
    style: Requireable[CSSProperties],
    width: Validator[Double]
  ): Anon_ArialabelCellDataGetter = {
    val __obj = js.Dynamic.literal(cellDataGetter = cellDataGetter, cellRenderer = cellRenderer, className = className, columnData = columnData, dataKey = dataKey, disableSort = disableSort, flexGrow = flexGrow, flexShrink = flexShrink, headerClassName = headerClassName, headerRenderer = headerRenderer, id = id, label = label, maxWidth = maxWidth, minWidth = minWidth, style = style, width = width)
    __obj.updateDynamic("aria-label")(`aria-label`)
    __obj.asInstanceOf[Anon_ArialabelCellDataGetter]
  }
}

