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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("horizontalScrollDirection")(horizontalScrollDirection)
    __obj.updateDynamic("scrollLeft")(scrollLeft)
    __obj.updateDynamic("scrollTop")(scrollTop)
    __obj.updateDynamic("scrollUpdateWasRequested")(scrollUpdateWasRequested)
    __obj.updateDynamic("verticalScrollDirection")(verticalScrollDirection)
    __obj.asInstanceOf[GridOnScrollProps]
  }
}

