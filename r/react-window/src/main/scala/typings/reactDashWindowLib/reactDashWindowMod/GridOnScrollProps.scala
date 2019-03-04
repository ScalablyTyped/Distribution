package typings
package reactDashWindowLib.reactDashWindowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridOnScrollProps extends js.Object {
  var horizontalScrollDirection: ScrollDirection
  var scrollLeft: scala.Double
  var scrollTop: scala.Double
  var scrollUpdateWasRequested: scala.Boolean
  var verticalScrollDirection: ScrollDirection
}

object GridOnScrollProps {
  @scala.inline
  def apply(
    horizontalScrollDirection: ScrollDirection,
    scrollLeft: scala.Double,
    scrollTop: scala.Double,
    scrollUpdateWasRequested: scala.Boolean,
    verticalScrollDirection: ScrollDirection
  ): GridOnScrollProps = {
    val __obj = js.Dynamic.literal(horizontalScrollDirection = horizontalScrollDirection, scrollLeft = scrollLeft, scrollTop = scrollTop, scrollUpdateWasRequested = scrollUpdateWasRequested, verticalScrollDirection = verticalScrollDirection)
  
    __obj.asInstanceOf[GridOnScrollProps]
  }
}

