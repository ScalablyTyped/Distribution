package typings.reactWindow.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridOnScrollProps extends js.Object {
  var horizontalScrollDirection: ScrollDirection = js.native
  var scrollLeft: Double = js.native
  var scrollTop: Double = js.native
  var scrollUpdateWasRequested: Boolean = js.native
  var verticalScrollDirection: ScrollDirection = js.native
}

object GridOnScrollProps {
  @scala.inline
  def apply(
    horizontalScrollDirection: ScrollDirection,
    scrollLeft: Double,
    scrollTop: Double,
    scrollUpdateWasRequested: Boolean,
    verticalScrollDirection: ScrollDirection
  ): GridOnScrollProps = {
    val __obj = js.Dynamic.literal(horizontalScrollDirection = horizontalScrollDirection.asInstanceOf[js.Any], scrollLeft = scrollLeft.asInstanceOf[js.Any], scrollTop = scrollTop.asInstanceOf[js.Any], scrollUpdateWasRequested = scrollUpdateWasRequested.asInstanceOf[js.Any], verticalScrollDirection = verticalScrollDirection.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridOnScrollProps]
  }
  @scala.inline
  implicit class GridOnScrollPropsOps[Self <: GridOnScrollProps] (val x: Self) extends AnyVal {
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
    def setHorizontalScrollDirection(value: ScrollDirection): Self = this.set("horizontalScrollDirection", value.asInstanceOf[js.Any])
    @scala.inline
    def setScrollLeft(value: Double): Self = this.set("scrollLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def setScrollTop(value: Double): Self = this.set("scrollTop", value.asInstanceOf[js.Any])
    @scala.inline
    def setScrollUpdateWasRequested(value: Boolean): Self = this.set("scrollUpdateWasRequested", value.asInstanceOf[js.Any])
    @scala.inline
    def setVerticalScrollDirection(value: ScrollDirection): Self = this.set("verticalScrollDirection", value.asInstanceOf[js.Any])
  }
  
}

