package typings.reactToolbox.tableRowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableRowTheme extends js.Object {
  /**
    * Modifier for cells that include a select checkbox.
    */
  var checkboxCell: js.UndefOr[String] = js.native
  /**
    * Added to each row in the table except for the header.
    */
  var row: js.UndefOr[String] = js.native
  /**
    * Modifier for rows that are selected.
    */
  var selected: js.UndefOr[String] = js.native
}

object TableRowTheme {
  @scala.inline
  def apply(): TableRowTheme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableRowTheme]
  }
  @scala.inline
  implicit class TableRowThemeOps[Self <: TableRowTheme] (val x: Self) extends AnyVal {
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
    def setCheckboxCell(value: String): Self = this.set("checkboxCell", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCheckboxCell: Self = this.set("checkboxCell", js.undefined)
    @scala.inline
    def setRow(value: String): Self = this.set("row", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRow: Self = this.set("row", js.undefined)
    @scala.inline
    def setSelected(value: String): Self = this.set("selected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelected: Self = this.set("selected", js.undefined)
  }
  
}

