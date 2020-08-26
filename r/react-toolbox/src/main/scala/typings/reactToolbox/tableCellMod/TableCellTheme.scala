package typings.reactToolbox.tableCellMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableCellTheme extends js.Object {
  /**
    * Modifier for the icon in case the order is ascendent.
    */
  var asc: js.UndefOr[String] = js.native
  /**
    * Added to each cell displayed in the head.
    */
  var headCell: js.UndefOr[String] = js.native
  /**
    * Modifier for cells that are numeric.
    */
  var numeric: js.UndefOr[String] = js.native
  /**
    * Added to each cell displayed in the table body.
    */
  var rowCell: js.UndefOr[String] = js.native
  /**
    * Used for the sort icon included in sorted cells.
    */
  var sortIcon: js.UndefOr[String] = js.native
  /**
    * Modifier for cells that are sorted asc or desc.
    */
  var sorted: js.UndefOr[String] = js.native
  /**
    * Applied to the root element of the cell.
    */
  var tableCell: js.UndefOr[String] = js.native
}

object TableCellTheme {
  @scala.inline
  def apply(): TableCellTheme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableCellTheme]
  }
  @scala.inline
  implicit class TableCellThemeOps[Self <: TableCellTheme] (val x: Self) extends AnyVal {
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
    def setAsc(value: String): Self = this.set("asc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAsc: Self = this.set("asc", js.undefined)
    @scala.inline
    def setHeadCell(value: String): Self = this.set("headCell", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeadCell: Self = this.set("headCell", js.undefined)
    @scala.inline
    def setNumeric(value: String): Self = this.set("numeric", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumeric: Self = this.set("numeric", js.undefined)
    @scala.inline
    def setRowCell(value: String): Self = this.set("rowCell", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowCell: Self = this.set("rowCell", js.undefined)
    @scala.inline
    def setSortIcon(value: String): Self = this.set("sortIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortIcon: Self = this.set("sortIcon", js.undefined)
    @scala.inline
    def setSorted(value: String): Self = this.set("sorted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSorted: Self = this.set("sorted", js.undefined)
    @scala.inline
    def setTableCell(value: String): Self = this.set("tableCell", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTableCell: Self = this.set("tableCell", js.undefined)
  }
  
}

