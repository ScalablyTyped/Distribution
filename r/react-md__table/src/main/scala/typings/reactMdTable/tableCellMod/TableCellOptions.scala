package typings.reactMdTable.tableCellMod

import typings.reactMdTable.configMod.TableCellConfig
import typings.reactMdTable.reactMdTableStrings.`100Percentsign`
import typings.reactMdTable.reactMdTableStrings.`header-cell`
import typings.reactMdTable.reactMdTableStrings.cell
import typings.reactMdTable.reactMdTableStrings.col
import typings.reactMdTable.reactMdTableStrings.colgroup
import typings.reactMdTable.reactMdTableStrings.header
import typings.reactMdTable.reactMdTableStrings.row
import typings.reactMdTable.reactMdTableStrings.rowgroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableCellOptions extends TableCellConfig {
  /**
    * The number of columns that the cell should span. If you would like a cell
    * to span an entire row ignoring the other rows and cells, you can set this
    * value to the number of columns within your table or `"100%"`.
    */
  var colSpan: js.UndefOr[Double | `100Percentsign`] = js.native
  /**
    * This is a bit of a "weird" prop since all it does is apply `width: 100%` to
    * this cell. This will make this specific cell fill the remaining width of
    * the table (if there is any). If no cells have this prop enabled and the
    * `fullWidth` table configuration is enabled, all cells will have an
    * equal-sized width.
    */
  var grow: js.UndefOr[Boolean] = js.native
  /**
    * This prop is only valid when the `header` prop is enabled or the
    * `TableCell` is a child of the `TableHeader` component. This will generally
    * be used with a value of `"row"` if you have table headers that are at the
    * start of each row instead of at the top of the table.
    */
  var scope: js.UndefOr[row | col | rowgroup | colgroup] = js.native
  /**
    * If this is a trueish value, the cell will become a sticky cell that will be
    * fixed while the user scrolls the table. When this is a `boolean` (or
    * inherited from a `TableHeader`) or set to `"header"`, the cell will act as
    * a sticky header that will be visible for vertical scrolling.
    *
    * When this is set to `"cell"`, the cell will be fixed to the left or right
    * for horizontal scrolling.
    *
    * Finally, if this is set to `"header-cell"`, it will be a combination of
    * both vertical and horizontal scrolling. This means that other sticky header
    * cells will scroll beneath this cell.
    */
  var sticky: js.UndefOr[Boolean | header | cell | `header-cell`] = js.native
}

object TableCellOptions {
  @scala.inline
  def apply(): TableCellOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableCellOptions]
  }
  @scala.inline
  implicit class TableCellOptionsOps[Self <: TableCellOptions] (val x: Self) extends AnyVal {
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
    def setColSpan(value: Double | `100Percentsign`): Self = this.set("colSpan", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColSpan: Self = this.set("colSpan", js.undefined)
    @scala.inline
    def setGrow(value: Boolean): Self = this.set("grow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGrow: Self = this.set("grow", js.undefined)
    @scala.inline
    def setScope(value: row | col | rowgroup | colgroup): Self = this.set("scope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
    @scala.inline
    def setSticky(value: Boolean | header | cell | `header-cell`): Self = this.set("sticky", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSticky: Self = this.set("sticky", js.undefined)
  }
  
}

