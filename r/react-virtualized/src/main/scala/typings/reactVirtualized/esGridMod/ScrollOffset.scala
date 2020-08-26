package typings.reactVirtualized.esGridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScrollOffset extends js.Object {
  var scrollLeft: Double = js.native
  var scrollTop: Double = js.native
}

object ScrollOffset {
  @scala.inline
  def apply(scrollLeft: Double, scrollTop: Double): ScrollOffset = {
    val __obj = js.Dynamic.literal(scrollLeft = scrollLeft.asInstanceOf[js.Any], scrollTop = scrollTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollOffset]
  }
  @scala.inline
  implicit class ScrollOffsetOps[Self <: ScrollOffset] (val x: Self) extends AnyVal {
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
    def setScrollLeft(value: Double): Self = this.set("scrollLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def setScrollTop(value: Double): Self = this.set("scrollTop", value.asInstanceOf[js.Any])
  }
  
}

