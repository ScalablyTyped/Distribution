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
    val __obj = js.Dynamic.literal(horizontalScrollDirection = horizontalScrollDirection.asInstanceOf[js.Any], scrollLeft = scrollLeft.asInstanceOf[js.Any], scrollTop = scrollTop.asInstanceOf[js.Any], scrollUpdateWasRequested = scrollUpdateWasRequested.asInstanceOf[js.Any], verticalScrollDirection = verticalScrollDirection.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GridOnScrollProps]
  }
}

