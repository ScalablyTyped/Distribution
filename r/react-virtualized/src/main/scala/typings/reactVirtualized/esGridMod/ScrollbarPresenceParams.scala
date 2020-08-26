package typings.reactVirtualized.esGridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScrollbarPresenceParams extends js.Object {
  var horizontal: Boolean = js.native
  var size: Double = js.native
  var vertical: Boolean = js.native
}

object ScrollbarPresenceParams {
  @scala.inline
  def apply(horizontal: Boolean, size: Double, vertical: Boolean): ScrollbarPresenceParams = {
    val __obj = js.Dynamic.literal(horizontal = horizontal.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], vertical = vertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollbarPresenceParams]
  }
  @scala.inline
  implicit class ScrollbarPresenceParamsOps[Self <: ScrollbarPresenceParams] (val x: Self) extends AnyVal {
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
    def setHorizontal(value: Boolean): Self = this.set("horizontal", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def setVertical(value: Boolean): Self = this.set("vertical", value.asInstanceOf[js.Any])
  }
  
}

