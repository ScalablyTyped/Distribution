package typings.reactMdTable.configMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableRowConfiguration extends js.Object {
  /**
    * Boolean if the table should no longer have a border-bottom applied to each
    * row within the `<tbody>`.
    */
  var disableBorders: js.UndefOr[Boolean] = js.native
  /**
    * Boolean if the rows should no longer applied a different background color
    * when hovered.
    */
  var disableHover: js.UndefOr[Boolean] = js.native
}

object TableRowConfiguration {
  @scala.inline
  def apply(): TableRowConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableRowConfiguration]
  }
  @scala.inline
  implicit class TableRowConfigurationOps[Self <: TableRowConfiguration] (val x: Self) extends AnyVal {
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
    def setDisableBorders(value: Boolean): Self = this.set("disableBorders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableBorders: Self = this.set("disableBorders", js.undefined)
    @scala.inline
    def setDisableHover(value: Boolean): Self = this.set("disableHover", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableHover: Self = this.set("disableHover", js.undefined)
  }
  
}

