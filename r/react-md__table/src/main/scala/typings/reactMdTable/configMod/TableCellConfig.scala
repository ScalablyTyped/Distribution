package typings.reactMdTable.configMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableCellConfig extends TableCellConfiguration {
  /**
    * Boolean if all the `TableCell` components should be rendered as a `<th>`
    * instead of a `<td>`. This is really just a convenience prop for the
    * `TableHeader` component so the user of `react-md` doesn't need to keep
    * setting the `type="th"` fot the `TableCell` if using the low-level
    * components.
    *
    * @private
    */
  var header: js.UndefOr[Boolean] = js.native
}

object TableCellConfig {
  @scala.inline
  def apply(): TableCellConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableCellConfig]
  }
  @scala.inline
  implicit class TableCellConfigOps[Self <: TableCellConfig] (val x: Self) extends AnyVal {
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
    def setHeader(value: Boolean): Self = this.set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
  }
  
}

