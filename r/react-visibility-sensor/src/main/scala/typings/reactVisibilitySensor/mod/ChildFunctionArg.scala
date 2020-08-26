package typings.reactVisibilitySensor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChildFunctionArg extends js.Object {
  var isVisible: Boolean | Null = js.native
  var visibilityRect: Shape = js.native
}

object ChildFunctionArg {
  @scala.inline
  def apply(visibilityRect: Shape): ChildFunctionArg = {
    val __obj = js.Dynamic.literal(visibilityRect = visibilityRect.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChildFunctionArg]
  }
  @scala.inline
  implicit class ChildFunctionArgOps[Self <: ChildFunctionArg] (val x: Self) extends AnyVal {
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
    def setVisibilityRect(value: Shape): Self = this.set("visibilityRect", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsVisible(value: Boolean): Self = this.set("isVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsVisibleNull: Self = this.set("isVisible", null)
  }
  
}

