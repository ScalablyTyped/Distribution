package typings.reactVirtualized.esGridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridState extends js.Object {
  var isScrolling: Boolean = js.native
  var scrollDirectionHorizontal: ScrollDirection = js.native
  var scrollDirectionVertical: ScrollDirection = js.native
  var scrollLeft: Double = js.native
  var scrollTop: Double = js.native
}

object GridState {
  @scala.inline
  def apply(
    isScrolling: Boolean,
    scrollDirectionHorizontal: ScrollDirection,
    scrollDirectionVertical: ScrollDirection,
    scrollLeft: Double,
    scrollTop: Double
  ): GridState = {
    val __obj = js.Dynamic.literal(isScrolling = isScrolling.asInstanceOf[js.Any], scrollDirectionHorizontal = scrollDirectionHorizontal.asInstanceOf[js.Any], scrollDirectionVertical = scrollDirectionVertical.asInstanceOf[js.Any], scrollLeft = scrollLeft.asInstanceOf[js.Any], scrollTop = scrollTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridState]
  }
  @scala.inline
  implicit class GridStateOps[Self <: GridState] (val x: Self) extends AnyVal {
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
    def setIsScrolling(value: Boolean): Self = this.set("isScrolling", value.asInstanceOf[js.Any])
    @scala.inline
    def setScrollDirectionHorizontal(value: ScrollDirection): Self = this.set("scrollDirectionHorizontal", value.asInstanceOf[js.Any])
    @scala.inline
    def setScrollDirectionVertical(value: ScrollDirection): Self = this.set("scrollDirectionVertical", value.asInstanceOf[js.Any])
    @scala.inline
    def setScrollLeft(value: Double): Self = this.set("scrollLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def setScrollTop(value: Double): Self = this.set("scrollTop", value.asInstanceOf[js.Any])
  }
  
}

