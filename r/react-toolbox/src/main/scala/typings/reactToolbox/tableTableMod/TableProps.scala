package typings.reactToolbox.tableTableMod

import typings.reactToolbox.mod.ReactToolbox.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableProps extends Props {
  /**
    * If true, the header and each row will display a checkbox to allow the user to select multiple rows.
    * @default true
    */
  var multiSelectable: js.UndefOr[Boolean] = js.native
  /**
    * Will be called when the row selection changes. It passes an array of selected indexes as first parameter so you can figure out changes in your local state.
    */
  var onRowSelect: js.UndefOr[js.Function] = js.native
  /**
    * If true, each row will display a checkbox to allow the user to select that one row.
    * @default true
    */
  var selectable: js.UndefOr[Boolean] = js.native
  /**
    * Classnames object defining the component style.
    */
  var theme: js.UndefOr[TableTheme] = js.native
}

object TableProps {
  @scala.inline
  def apply(): TableProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableProps]
  }
  @scala.inline
  implicit class TablePropsOps[Self <: TableProps] (val x: Self) extends AnyVal {
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
    def setMultiSelectable(value: Boolean): Self = this.set("multiSelectable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiSelectable: Self = this.set("multiSelectable", js.undefined)
    @scala.inline
    def setOnRowSelect(value: js.Function): Self = this.set("onRowSelect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnRowSelect: Self = this.set("onRowSelect", js.undefined)
    @scala.inline
    def setSelectable(value: Boolean): Self = this.set("selectable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectable: Self = this.set("selectable", js.undefined)
    @scala.inline
    def setTheme(value: TableTheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
  
}

