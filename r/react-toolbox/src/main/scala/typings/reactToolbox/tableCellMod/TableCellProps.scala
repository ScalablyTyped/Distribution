package typings.reactToolbox.tableCellMod

import typings.reactToolbox.mod.ReactToolbox.Props
import typings.reactToolbox.reactToolboxStrings.asc
import typings.reactToolbox.reactToolboxStrings.desc
import typings.reactToolbox.reactToolboxStrings.td
import typings.reactToolbox.reactToolboxStrings.th
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableCellProps extends Props {
  /**
    * The column number of this cell.
    */
  var column: js.UndefOr[Double] = js.native
  /**
    * If true the cell is considered as numeric and the content will be displayed aligned to right.
    * @default false
    */
  var numeric: js.UndefOr[Boolean] = js.native
  /**
    * The row number of the cell.
    */
  var row: js.UndefOr[Double] = js.native
  /**
    * If you provide a value the cell will show an arrow pointing down or up depending on the value to indicate it is a sorted element. Useful only for columns.
    */
  var sorted: js.UndefOr[asc | desc] = js.native
  /**
    * The element tag, either `td` or `th`.
    * @default 'td'
    */
  var tagName: js.UndefOr[td | th] = js.native
  /**
    * Classnames object defining the component style.
    */
  var theme: js.UndefOr[TableCellTheme] = js.native
}

object TableCellProps {
  @scala.inline
  def apply(): TableCellProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableCellProps]
  }
  @scala.inline
  implicit class TableCellPropsOps[Self <: TableCellProps] (val x: Self) extends AnyVal {
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
    def setColumn(value: Double): Self = this.set("column", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumn: Self = this.set("column", js.undefined)
    @scala.inline
    def setNumeric(value: Boolean): Self = this.set("numeric", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumeric: Self = this.set("numeric", js.undefined)
    @scala.inline
    def setRow(value: Double): Self = this.set("row", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRow: Self = this.set("row", js.undefined)
    @scala.inline
    def setSorted(value: asc | desc): Self = this.set("sorted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSorted: Self = this.set("sorted", js.undefined)
    @scala.inline
    def setTagName(value: td | th): Self = this.set("tagName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTagName: Self = this.set("tagName", js.undefined)
    @scala.inline
    def setTheme(value: TableCellTheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
  
}

