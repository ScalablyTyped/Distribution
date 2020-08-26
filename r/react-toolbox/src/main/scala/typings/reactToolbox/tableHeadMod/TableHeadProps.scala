package typings.reactToolbox.tableHeadMod

import typings.reactToolbox.mod.ReactToolbox.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableHeadProps extends Props {
  /**
    * If true, a checkbox will be displayed to select every row. In case the table is not multi-selectable, it will be disabled though.
    * @default true
    */
  var displaySelect: js.UndefOr[Boolean] = js.native
  /**
    * If true, the header and each row will display a checkbox to allow the user to select multiple rows.
    * @default true
    */
  var multiSelectable: js.UndefOr[Boolean] = js.native
  /**
    * Handle the select state change of the checkbox in the header row.
    */
  var onSelect: js.UndefOr[js.Function] = js.native
  /**
    * If true, each row will display a checkbox to allow the user to select that one row.
    * @default true
    */
  var selectable: js.UndefOr[Boolean] = js.native
  /**
    * If selectable, controls the selected state of the checkbox in the header row.
    */
  var selected: js.UndefOr[Boolean] = js.native
  /**
    * Classnames object defining the component style.
    */
  var theme: js.UndefOr[TableHeadTheme] = js.native
}

object TableHeadProps {
  @scala.inline
  def apply(): TableHeadProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableHeadProps]
  }
  @scala.inline
  implicit class TableHeadPropsOps[Self <: TableHeadProps] (val x: Self) extends AnyVal {
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
    def setDisplaySelect(value: Boolean): Self = this.set("displaySelect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplaySelect: Self = this.set("displaySelect", js.undefined)
    @scala.inline
    def setMultiSelectable(value: Boolean): Self = this.set("multiSelectable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiSelectable: Self = this.set("multiSelectable", js.undefined)
    @scala.inline
    def setOnSelect(value: js.Function): Self = this.set("onSelect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnSelect: Self = this.set("onSelect", js.undefined)
    @scala.inline
    def setSelectable(value: Boolean): Self = this.set("selectable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectable: Self = this.set("selectable", js.undefined)
    @scala.inline
    def setSelected(value: Boolean): Self = this.set("selected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelected: Self = this.set("selected", js.undefined)
    @scala.inline
    def setTheme(value: TableHeadTheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
  
}

