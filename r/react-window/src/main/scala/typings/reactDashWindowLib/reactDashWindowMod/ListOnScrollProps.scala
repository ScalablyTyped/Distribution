package typings
package reactDashWindowLib.reactDashWindowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListOnScrollProps extends js.Object {
  var scrollDirection: ScrollDirection
  var scrollOffset: scala.Double
  var scrollUpdateWasRequested: scala.Boolean
}

object ListOnScrollProps {
  @scala.inline
  def apply(
    scrollDirection: ScrollDirection,
    scrollOffset: scala.Double,
    scrollUpdateWasRequested: scala.Boolean
  ): ListOnScrollProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("scrollDirection")(scrollDirection)
    __obj.updateDynamic("scrollOffset")(scrollOffset)
    __obj.updateDynamic("scrollUpdateWasRequested")(scrollUpdateWasRequested)
    __obj.asInstanceOf[ListOnScrollProps]
  }
}

