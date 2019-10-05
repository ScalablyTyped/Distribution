package typings.reactDashVirtualized

import typings.react.reactMod.ReactNode
import typings.reactDashVirtualized.distEsTableMod.TableCellDataGetter
import typings.reactDashVirtualized.distEsTableMod.TableCellDataGetterParams
import typings.reactDashVirtualized.distEsTableMod.TableCellProps
import typings.reactDashVirtualized.distEsTableMod.TableCellRenderer
import typings.reactDashVirtualized.distEsTableMod.TableHeaderProps
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
    cellDataGetter: /* params */ TableCellDataGetterParams => js.Any,
    cellRenderer: /* props */ TableCellProps => ReactNode,
    flexGrow: `0`,
    flexShrink: `1`,
    headerRenderer: /* props */ TableHeaderProps => ReactNode
  ): Anon_01CellDataGetter = {
    val __obj = js.Dynamic.literal(cellDataGetter = js.Any.fromFunction1(cellDataGetter), cellRenderer = js.Any.fromFunction1(cellRenderer), flexGrow = flexGrow, flexShrink = flexShrink, headerRenderer = js.Any.fromFunction1(headerRenderer))
  
    __obj.asInstanceOf[Anon_01CellDataGetter]
  }
}

