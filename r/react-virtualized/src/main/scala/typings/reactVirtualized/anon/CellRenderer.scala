package typings.reactVirtualized.anon

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

@js.native
trait CellRenderer extends js.Object {
  var cellDataGetter: TableCellDataGetter = js.native
  var cellRenderer: TableCellRenderer = js.native
  var flexGrow: `0` = js.native
  var flexShrink: `1` = js.native
  var headerRenderer: TableHeaderRenderer = js.native
}

object CellRenderer {
  @scala.inline
  def apply(
    cellDataGetter: /* params */ TableCellDataGetterParams => js.Any,
    cellRenderer: /* props */ TableCellProps => ReactNode,
    flexGrow: `0`,
    flexShrink: `1`,
    headerRenderer: /* props */ TableHeaderProps => ReactNode
  ): CellRenderer = {
    val __obj = js.Dynamic.literal(cellDataGetter = js.Any.fromFunction1(cellDataGetter), cellRenderer = js.Any.fromFunction1(cellRenderer), flexGrow = flexGrow.asInstanceOf[js.Any], flexShrink = flexShrink.asInstanceOf[js.Any], headerRenderer = js.Any.fromFunction1(headerRenderer))
    __obj.asInstanceOf[CellRenderer]
  }
  @scala.inline
  implicit class CellRendererOps[Self <: CellRenderer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCellDataGetter(value: /* params */ TableCellDataGetterParams => js.Any): Self = this.set("cellDataGetter", js.Any.fromFunction1(value))
    @scala.inline
    def setCellRenderer(value: /* props */ TableCellProps => ReactNode): Self = this.set("cellRenderer", js.Any.fromFunction1(value))
    @scala.inline
    def setFlexGrow(value: `0`): Self = this.set("flexGrow", value.asInstanceOf[js.Any])
    @scala.inline
    def setFlexShrink(value: `1`): Self = this.set("flexShrink", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeaderRenderer(value: /* props */ TableHeaderProps => ReactNode): Self = this.set("headerRenderer", js.Any.fromFunction1(value))
  }
  
}

