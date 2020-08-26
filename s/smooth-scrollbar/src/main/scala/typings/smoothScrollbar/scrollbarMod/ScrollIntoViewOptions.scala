package typings.smoothScrollbar.scrollbarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScrollIntoViewOptions extends js.Object {
  var alignToTop: Boolean = js.native
  var offsetBottom: Double = js.native
  var offsetLeft: Double = js.native
  var offsetTop: Double = js.native
  var onlyScrollIfNeeded: Boolean = js.native
}

object ScrollIntoViewOptions {
  @scala.inline
  def apply(
    alignToTop: Boolean,
    offsetBottom: Double,
    offsetLeft: Double,
    offsetTop: Double,
    onlyScrollIfNeeded: Boolean
  ): ScrollIntoViewOptions = {
    val __obj = js.Dynamic.literal(alignToTop = alignToTop.asInstanceOf[js.Any], offsetBottom = offsetBottom.asInstanceOf[js.Any], offsetLeft = offsetLeft.asInstanceOf[js.Any], offsetTop = offsetTop.asInstanceOf[js.Any], onlyScrollIfNeeded = onlyScrollIfNeeded.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollIntoViewOptions]
  }
  @scala.inline
  implicit class ScrollIntoViewOptionsOps[Self <: ScrollIntoViewOptions] (val x: Self) extends AnyVal {
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
    def setAlignToTop(value: Boolean): Self = this.set("alignToTop", value.asInstanceOf[js.Any])
    @scala.inline
    def setOffsetBottom(value: Double): Self = this.set("offsetBottom", value.asInstanceOf[js.Any])
    @scala.inline
    def setOffsetLeft(value: Double): Self = this.set("offsetLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def setOffsetTop(value: Double): Self = this.set("offsetTop", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnlyScrollIfNeeded(value: Boolean): Self = this.set("onlyScrollIfNeeded", value.asInstanceOf[js.Any])
  }
  
}

