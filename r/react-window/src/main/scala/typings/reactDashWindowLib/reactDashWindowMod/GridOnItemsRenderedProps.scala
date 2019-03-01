package typings
package reactDashWindowLib.reactDashWindowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridOnItemsRenderedProps extends js.Object {
  var overscanColumnStartIndex: scala.Double
  var overscanColumnStopIndex: scala.Double
  var overscanRowStartIndex: scala.Double
  var overscanRowStopIndex: scala.Double
  var visibleColumnStartIndex: scala.Double
  var visibleColumnStopIndex: scala.Double
  var visibleRowStartIndex: scala.Double
  var visibleRowStopIndex: scala.Double
}

object GridOnItemsRenderedProps {
  @scala.inline
  def apply(
    overscanColumnStartIndex: scala.Double,
    overscanColumnStopIndex: scala.Double,
    overscanRowStartIndex: scala.Double,
    overscanRowStopIndex: scala.Double,
    visibleColumnStartIndex: scala.Double,
    visibleColumnStopIndex: scala.Double,
    visibleRowStartIndex: scala.Double,
    visibleRowStopIndex: scala.Double
  ): GridOnItemsRenderedProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("overscanColumnStartIndex")(overscanColumnStartIndex)
    __obj.updateDynamic("overscanColumnStopIndex")(overscanColumnStopIndex)
    __obj.updateDynamic("overscanRowStartIndex")(overscanRowStartIndex)
    __obj.updateDynamic("overscanRowStopIndex")(overscanRowStopIndex)
    __obj.updateDynamic("visibleColumnStartIndex")(visibleColumnStartIndex)
    __obj.updateDynamic("visibleColumnStopIndex")(visibleColumnStopIndex)
    __obj.updateDynamic("visibleRowStartIndex")(visibleRowStartIndex)
    __obj.updateDynamic("visibleRowStopIndex")(visibleRowStopIndex)
    __obj.asInstanceOf[GridOnItemsRenderedProps]
  }
}

