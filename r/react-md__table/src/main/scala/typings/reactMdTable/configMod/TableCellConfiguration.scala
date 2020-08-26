package typings.reactMdTable.configMod

import typings.reactMdTable.reactMdTableStrings.padded
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableCellConfiguration extends js.Object {
  /**
    * The horizontal alignment for the content within a cell.
    *
    * Note: Table default behavior is to align to the left.
    */
  var hAlign: js.UndefOr[TableCellHorizontalAlignment] = js.native
  /**
    * Boolean if the `<td>` and `<th>` cells should support line wrapping. This
    * is disabled by default since you _normally_ don't want line wrapping in
    * tables unless it provides additional descriptions or other content.
    *
    * If this is set to the string `"padded"`, line wrapping will be enabled
    * along with adding some additional vertical padding to each cell.
    */
  var lineWrap: js.UndefOr[Boolean | padded] = js.native
  /**
    * The vertical alignment for the content within a cell.
    *
    * Note: When this is set to `"top"` or `"bottom"`, `padding-top` or
    * `padding-bottom` will also be applied due to how styling tables work. This
    * padding can be configured with the `$rmd-table-cell-vertical-padding` or
    * `$rmd-table-cell-vertical-alignments` variables.
    */
  var vAlign: js.UndefOr[TableCellVerticalAlignment] = js.native
}

object TableCellConfiguration {
  @scala.inline
  def apply(): TableCellConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableCellConfiguration]
  }
  @scala.inline
  implicit class TableCellConfigurationOps[Self <: TableCellConfiguration] (val x: Self) extends AnyVal {
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
    def setHAlign(value: TableCellHorizontalAlignment): Self = this.set("hAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHAlign: Self = this.set("hAlign", js.undefined)
    @scala.inline
    def setLineWrap(value: Boolean | padded): Self = this.set("lineWrap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineWrap: Self = this.set("lineWrap", js.undefined)
    @scala.inline
    def setVAlign(value: TableCellVerticalAlignment): Self = this.set("vAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVAlign: Self = this.set("vAlign", js.undefined)
  }
  
}

