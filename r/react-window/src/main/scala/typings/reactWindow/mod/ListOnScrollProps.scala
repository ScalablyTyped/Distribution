package typings.reactWindow.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListOnScrollProps extends js.Object {
  var scrollDirection: ScrollDirection = js.native
  var scrollOffset: Double = js.native
  var scrollUpdateWasRequested: Boolean = js.native
}

object ListOnScrollProps {
  @scala.inline
  def apply(scrollDirection: ScrollDirection, scrollOffset: Double, scrollUpdateWasRequested: Boolean): ListOnScrollProps = {
    val __obj = js.Dynamic.literal(scrollDirection = scrollDirection.asInstanceOf[js.Any], scrollOffset = scrollOffset.asInstanceOf[js.Any], scrollUpdateWasRequested = scrollUpdateWasRequested.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListOnScrollProps]
  }
  @scala.inline
  implicit class ListOnScrollPropsOps[Self <: ListOnScrollProps] (val x: Self) extends AnyVal {
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
    def setScrollDirection(value: ScrollDirection): Self = this.set("scrollDirection", value.asInstanceOf[js.Any])
    @scala.inline
    def setScrollOffset(value: Double): Self = this.set("scrollOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def setScrollUpdateWasRequested(value: Boolean): Self = this.set("scrollUpdateWasRequested", value.asInstanceOf[js.Any])
  }
  
}

