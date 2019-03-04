package typings
package reactDashWindowLib.reactDashWindowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListOnItemsRenderedProps extends js.Object {
  var overscanStartIndex: scala.Double
  var overscanStopIndex: scala.Double
  var visibleStartIndex: scala.Double
  var visibleStopIndex: scala.Double
}

object ListOnItemsRenderedProps {
  @scala.inline
  def apply(
    overscanStartIndex: scala.Double,
    overscanStopIndex: scala.Double,
    visibleStartIndex: scala.Double,
    visibleStopIndex: scala.Double
  ): ListOnItemsRenderedProps = {
    val __obj = js.Dynamic.literal(overscanStartIndex = overscanStartIndex, overscanStopIndex = overscanStopIndex, visibleStartIndex = visibleStartIndex, visibleStopIndex = visibleStopIndex)
  
    __obj.asInstanceOf[ListOnItemsRenderedProps]
  }
}

