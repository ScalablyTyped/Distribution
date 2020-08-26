package typings.reactMdTable.anon

import typings.reactMdTable.configMod.TableCellHorizontalAlignment
import typings.reactMdTable.configMod.TableCellVerticalAlignment
import typings.reactMdTable.reactMdTableStrings.padded
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Required<@react-md/table.@react-md/table/types/config.TableConfig> */
@js.native
trait RequiredTableConfig extends js.Object {
  var disableBorders: Boolean = js.native
  var disableHover: Boolean = js.native
  var hAlign: TableCellHorizontalAlignment = js.native
  var header: Boolean = js.native
  var lineWrap: Boolean | padded = js.native
  var vAlign: TableCellVerticalAlignment = js.native
}

object RequiredTableConfig {
  @scala.inline
  def apply(
    disableBorders: Boolean,
    disableHover: Boolean,
    hAlign: TableCellHorizontalAlignment,
    header: Boolean,
    lineWrap: Boolean | padded,
    vAlign: TableCellVerticalAlignment
  ): RequiredTableConfig = {
    val __obj = js.Dynamic.literal(disableBorders = disableBorders.asInstanceOf[js.Any], disableHover = disableHover.asInstanceOf[js.Any], hAlign = hAlign.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], lineWrap = lineWrap.asInstanceOf[js.Any], vAlign = vAlign.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredTableConfig]
  }
  @scala.inline
  implicit class RequiredTableConfigOps[Self <: RequiredTableConfig] (val x: Self) extends AnyVal {
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
    def setDisableHover(value: Boolean): Self = this.set("disableHover", value.asInstanceOf[js.Any])
    @scala.inline
    def setHAlign(value: TableCellHorizontalAlignment): Self = this.set("hAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeader(value: Boolean): Self = this.set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def setLineWrap(value: Boolean | padded): Self = this.set("lineWrap", value.asInstanceOf[js.Any])
    @scala.inline
    def setVAlign(value: TableCellVerticalAlignment): Self = this.set("vAlign", value.asInstanceOf[js.Any])
  }
  
}

