package typings.reactBootstrapTableNext.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Disabled extends js.Object {
  var checked: Boolean = js.native
  var disabled: Boolean = js.native
  var rowIndex: Double = js.native
  var rowKey: String = js.native
}

object Disabled {
  @scala.inline
  def apply(checked: Boolean, disabled: Boolean, rowIndex: Double, rowKey: String): Disabled = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any], rowKey = rowKey.asInstanceOf[js.Any])
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
    def setChecked(value: Boolean): Self = this.set("checked", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setRowIndex(value: Double): Self = this.set("rowIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setRowKey(value: String): Self = this.set("rowKey", value.asInstanceOf[js.Any])
  }
  
}

