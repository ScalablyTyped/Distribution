package typings.reactDashWindow.reactDashWindowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListOnItemsRenderedProps extends js.Object {
  var overscanStartIndex: Double
  var overscanStopIndex: Double
  var visibleStartIndex: Double
  var visibleStopIndex: Double
}

object ListOnItemsRenderedProps {
  @scala.inline
  def apply(
    overscanStartIndex: Double,
    overscanStopIndex: Double,
    visibleStartIndex: Double,
    visibleStopIndex: Double
  ): ListOnItemsRenderedProps = {
    val __obj = js.Dynamic.literal(overscanStartIndex = overscanStartIndex.asInstanceOf[js.Any], overscanStopIndex = overscanStopIndex.asInstanceOf[js.Any], visibleStartIndex = visibleStartIndex.asInstanceOf[js.Any], visibleStopIndex = visibleStopIndex.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ListOnItemsRenderedProps]
  }
}

