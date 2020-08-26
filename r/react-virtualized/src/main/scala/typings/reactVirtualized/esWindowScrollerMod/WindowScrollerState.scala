package typings.reactVirtualized.esWindowScrollerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WindowScrollerState extends js.Object {
  var height: Double = js.native
  var isScrolling: Boolean = js.native
  var scrollLeft: Double = js.native
  var scrollTop: Double = js.native
  var width: Double = js.native
}

object WindowScrollerState {
  @scala.inline
  def apply(height: Double, isScrolling: Boolean, scrollLeft: Double, scrollTop: Double, width: Double): WindowScrollerState = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], isScrolling = isScrolling.asInstanceOf[js.Any], scrollLeft = scrollLeft.asInstanceOf[js.Any], scrollTop = scrollTop.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowScrollerState]
  }
  @scala.inline
  implicit class WindowScrollerStateOps[Self <: WindowScrollerState] (val x: Self) extends AnyVal {
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
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsScrolling(value: Boolean): Self = this.set("isScrolling", value.asInstanceOf[js.Any])
    @scala.inline
    def setScrollLeft(value: Double): Self = this.set("scrollLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def setScrollTop(value: Double): Self = this.set("scrollTop", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
  
}

