package typings.reachTooltip.mod

import typings.std.DOMRect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TooltipParams extends js.Object {
  var id: String = js.native
  var isVisible: Boolean = js.native
  var triggerRect: DOMRect = js.native
}

object TooltipParams {
  @scala.inline
  def apply(id: String, isVisible: Boolean, triggerRect: DOMRect): TooltipParams = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], triggerRect = triggerRect.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipParams]
  }
  @scala.inline
  implicit class TooltipParamsOps[Self <: TooltipParams] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsVisible(value: Boolean): Self = this.set("isVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def setTriggerRect(value: DOMRect): Self = this.set("triggerRect", value.asInstanceOf[js.Any])
  }
  
}

