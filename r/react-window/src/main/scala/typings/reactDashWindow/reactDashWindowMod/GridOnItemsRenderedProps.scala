package typings.reactDashWindow.reactDashWindowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridOnItemsRenderedProps extends js.Object {
  var overscanColumnStartIndex: Double
  var overscanColumnStopIndex: Double
  var overscanRowStartIndex: Double
  var overscanRowStopIndex: Double
  var visibleColumnStartIndex: Double
  var visibleColumnStopIndex: Double
  var visibleRowStartIndex: Double
  var visibleRowStopIndex: Double
}

object GridOnItemsRenderedProps {
  @scala.inline
  def apply(
    overscanColumnStartIndex: Double,
    overscanColumnStopIndex: Double,
    overscanRowStartIndex: Double,
    overscanRowStopIndex: Double,
    visibleColumnStartIndex: Double,
    visibleColumnStopIndex: Double,
    visibleRowStartIndex: Double,
    visibleRowStopIndex: Double
  ): GridOnItemsRenderedProps = {
    val __obj = js.Dynamic.literal(overscanColumnStartIndex = overscanColumnStartIndex.asInstanceOf[js.Any], overscanColumnStopIndex = overscanColumnStopIndex.asInstanceOf[js.Any], overscanRowStartIndex = overscanRowStartIndex.asInstanceOf[js.Any], overscanRowStopIndex = overscanRowStopIndex.asInstanceOf[js.Any], visibleColumnStartIndex = visibleColumnStartIndex.asInstanceOf[js.Any], visibleColumnStopIndex = visibleColumnStopIndex.asInstanceOf[js.Any], visibleRowStartIndex = visibleRowStartIndex.asInstanceOf[js.Any], visibleRowStopIndex = visibleRowStopIndex.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GridOnItemsRenderedProps]
  }
}

