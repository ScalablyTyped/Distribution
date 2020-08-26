package typings.reactSelect.indicatorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SeparatorState extends js.Object {
  var isDisabled: Boolean = js.native
}

object SeparatorState {
  @scala.inline
  def apply(isDisabled: Boolean): SeparatorState = {
    val __obj = js.Dynamic.literal(isDisabled = isDisabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeparatorState]
  }
  @scala.inline
  implicit class SeparatorStateOps[Self <: SeparatorState] (val x: Self) extends AnyVal {
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
    def setIsDisabled(value: Boolean): Self = this.set("isDisabled", value.asInstanceOf[js.Any])
  }
  
}

