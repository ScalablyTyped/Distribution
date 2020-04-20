package typings.reactVirtualized

import typings.react.mod.ReactNode
import typings.reactVirtualized.esTableMod.TableCellDataGetter
import typings.reactVirtualized.esTableMod.TableCellDataGetterParams
import typings.reactVirtualized.esTableMod.TableCellProps
import typings.reactVirtualized.esTableMod.TableCellRenderer
import typings.reactVirtualized.esTableMod.TableHeaderProps
import typings.reactVirtualized.esTableMod.TableHeaderRenderer
import typings.reactVirtualized.reactVirtualizedNumbers.`0`
import typings.reactVirtualized.reactVirtualizedNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCellRenderer extends js.Object {
  var cellDataGetter: TableCellDataGetter
  var cellRenderer: TableCellRenderer
  var flexGrow: `0`
  var flexShrink: `1`
  var headerRenderer: TableHeaderRenderer
}

object AnonCellRenderer {
  @scala.inline
  def apply(
    cellDataGetter: /* params */ TableCellDataGetterParams => js.Any,
    cellRenderer: /* props */ TableCellProps => ReactNode,
    flexGrow: `0`,
    flexShrink: `1`,
    headerRenderer: /* props */ TableHeaderProps => ReactNode
  ): AnonCellRenderer = {
    val __obj = js.Dynamic.literal(cellDataGetter = js.Any.fromFunction1(cellDataGetter), cellRenderer = js.Any.fromFunction1(cellRenderer), flexGrow = flexGrow.asInstanceOf[js.Any], flexShrink = flexShrink.asInstanceOf[js.Any], headerRenderer = js.Any.fromFunction1(headerRenderer))
    __obj.asInstanceOf[AnonCellRenderer]
  }
}

