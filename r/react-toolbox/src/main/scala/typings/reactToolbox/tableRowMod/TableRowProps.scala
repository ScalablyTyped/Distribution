package typings.reactToolbox.tableRowMod

import typings.reactToolbox.mod.ReactToolbox.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableRowProps extends Props {
  /**
    * The index of the row.
    */
  var idx: js.UndefOr[Double] = js.native
  /**
    * Handle the select state change of the checkbox in the ow.
    */
  var onSelect: js.UndefOr[js.Function] = js.native
  /**
    * If true, each row will display a checkbox to allow the user to select that one row.
    * @default true
    */
  var selectable: js.UndefOr[Boolean] = js.native
  /**
    * If true, the row will be considered as selected so the row will display a selected style with the selection control activated. This property is used by `Table` to figure out the selection when you interact with the Table.
    */
  var selected: js.UndefOr[Boolean] = js.native
  /**
    * Classnames object defining the component style.
    */
  var theme: js.UndefOr[TableRowTheme] = js.native
}

object TableRowProps {
  @scala.inline
  def apply(): TableRowProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableRowProps]
  }
  @scala.inline
  implicit class TableRowPropsOps[Self <: TableRowProps] (val x: Self) extends AnyVal {
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
    def setIdx(value: Double): Self = this.set("idx", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdx: Self = this.set("idx", js.undefined)
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
    def setTheme(value: TableRowTheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
  
}

