package typings.reactDashWindow.reactDashWindowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridOnScrollProps extends js.Object {
  var horizontalScrollDirection: ScrollDirection
  var scrollLeft: Double
  var scrollTop: Double
  var scrollUpdateWasRequested: Boolean
  var verticalScrollDirection: ScrollDirection
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
    val __obj = js.Dynamic.literal(horizontalScrollDirection = horizontalScrollDirection, scrollLeft = scrollLeft, scrollTop = scrollTop, scrollUpdateWasRequested = scrollUpdateWasRequested, verticalScrollDirection = verticalScrollDirection)
  
    __obj.asInstanceOf[GridOnScrollProps]
  }
}

