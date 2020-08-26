package typings.reactVirtualized.anon

import typings.reactVirtualized.reactVirtualizedBooleans.`false`
import typings.reactVirtualized.reactVirtualizedNumbers.`0`
import typings.reactVirtualized.reactVirtualizedStrings.edges
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Disabled extends js.Object {
  var disabled: `false` = js.native
  var isControlled: `false` = js.native
  var mode: edges = js.native
  var scrollToColumn: `0` = js.native
  var scrollToRow: `0` = js.native
}

object Disabled {
  @scala.inline
  def apply(disabled: `false`, isControlled: `false`, mode: edges, scrollToColumn: `0`, scrollToRow: `0`): Disabled = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], isControlled = isControlled.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], scrollToColumn = scrollToColumn.asInstanceOf[js.Any], scrollToRow = scrollToRow.asInstanceOf[js.Any])
    __obj.asInstanceOf[Disabled]
  }
  @scala.inline
  implicit class DisabledOps[Self <: Disabled] (val x: Self) extends AnyVal {
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
    def setDisabled(value: `false`): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsControlled(value: `false`): Self = this.set("isControlled", value.asInstanceOf[js.Any])
    @scala.inline
    def setMode(value: edges): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def setScrollToColumn(value: `0`): Self = this.set("scrollToColumn", value.asInstanceOf[js.Any])
    @scala.inline
    def setScrollToRow(value: `0`): Self = this.set("scrollToRow", value.asInstanceOf[js.Any])
  }
  
}

