package typings.reactBootstrapTable.mod

import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExpandColumnOptions extends js.Object {
  /**
    * set the width of indicator column.
    */
  var columnWidth: js.UndefOr[Double | String] = js.native
  /**
    * If both an indicator column and a selection column are displaying, this specifies whether the indicator column
    * should be shown first. Default is true, false will move the expand indicator column after selection column.
    */
  var expandColumnBeforeSelectColumn: js.UndefOr[Boolean] = js.native
  /**
    * a callback function to customize the appearance of the indicator column.
    */
  var expandColumnComponent: js.UndefOr[js.Function1[/* props */ ExpandColumnComponentProps, String | ReactElement]] = js.native
  /**
    * Will enable an indicator column at first column if true. Default is false.
    */
  var expandColumnVisible: js.UndefOr[Boolean] = js.native
  /**
    * a callback function to customise the header column
    */
  var expandedColumnHeaderComponent: js.UndefOr[js.Function1[/* props */ ExpandedColumnHeaderProps, String | ReactElement]] = js.native
}

object ExpandColumnOptions {
  @scala.inline
  def apply(): ExpandColumnOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExpandColumnOptions]
  }
  @scala.inline
  implicit class ExpandColumnOptionsOps[Self <: ExpandColumnOptions] (val x: Self) extends AnyVal {
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
    def setColumnWidth(value: Double | String): Self = this.set("columnWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnWidth: Self = this.set("columnWidth", js.undefined)
    @scala.inline
    def setExpandColumnBeforeSelectColumn(value: Boolean): Self = this.set("expandColumnBeforeSelectColumn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpandColumnBeforeSelectColumn: Self = this.set("expandColumnBeforeSelectColumn", js.undefined)
    @scala.inline
    def setExpandColumnComponent(value: /* props */ ExpandColumnComponentProps => String | ReactElement): Self = this.set("expandColumnComponent", js.Any.fromFunction1(value))
    @scala.inline
    def deleteExpandColumnComponent: Self = this.set("expandColumnComponent", js.undefined)
    @scala.inline
    def setExpandColumnVisible(value: Boolean): Self = this.set("expandColumnVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpandColumnVisible: Self = this.set("expandColumnVisible", js.undefined)
    @scala.inline
    def setExpandedColumnHeaderComponent(value: /* props */ ExpandedColumnHeaderProps => String | ReactElement): Self = this.set("expandedColumnHeaderComponent", js.Any.fromFunction1(value))
    @scala.inline
    def deleteExpandedColumnHeaderComponent: Self = this.set("expandedColumnHeaderComponent", js.undefined)
  }
  
}

