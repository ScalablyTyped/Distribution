package typings.reactDashVirtualized

import typings.reactDashVirtualized.distEsTableMod.TableCellDataGetter
import typings.reactDashVirtualized.distEsTableMod.TableCellRenderer
import typings.reactDashVirtualized.distEsTableMod.TableHeaderRenderer
import typings.reactDashVirtualized.reactDashVirtualizedNumbers.`0`
import typings.reactDashVirtualized.reactDashVirtualizedNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_01CellDataGetter extends js.Object {
  var cellDataGetter: TableCellDataGetter
  var cellRenderer: TableCellRenderer
  var flexGrow: `0`
  var flexShrink: `1`
  var headerRenderer: TableHeaderRenderer
}

object Anon_01CellDataGetter {
  @scala.inline
  def apply(
    cellDataGetter: TableCellDataGetter,
    cellRenderer: TableCellRenderer,
    flexGrow: `0`,
    flexShrink: `1`,
    headerRenderer: TableHeaderRenderer
  ): Anon_01CellDataGetter = {
    val __obj = js.Dynamic.literal(cellDataGetter = cellDataGetter, cellRenderer = cellRenderer, flexGrow = flexGrow, flexShrink = flexShrink, headerRenderer = headerRenderer)
  
    __obj.asInstanceOf[Anon_01CellDataGetter]
  }
}

