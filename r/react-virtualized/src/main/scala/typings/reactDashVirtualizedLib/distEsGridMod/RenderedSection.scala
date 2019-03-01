package typings
package reactDashVirtualizedLib.distEsGridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderedSection extends js.Object {
  var columnOverscanStartIndex: scala.Double
  var columnOverscanStopIndex: scala.Double
  var columnStartIndex: scala.Double
  var columnStopIndex: scala.Double
  var rowOverscanStartIndex: scala.Double
  var rowOverscanStopIndex: scala.Double
  var rowStartIndex: scala.Double
  var rowStopIndex: scala.Double
}

object RenderedSection {
  @scala.inline
  def apply(
    columnOverscanStartIndex: scala.Double,
    columnOverscanStopIndex: scala.Double,
    columnStartIndex: scala.Double,
    columnStopIndex: scala.Double,
    rowOverscanStartIndex: scala.Double,
    rowOverscanStopIndex: scala.Double,
    rowStartIndex: scala.Double,
    rowStopIndex: scala.Double
  ): RenderedSection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("columnOverscanStartIndex")(columnOverscanStartIndex)
    __obj.updateDynamic("columnOverscanStopIndex")(columnOverscanStopIndex)
    __obj.updateDynamic("columnStartIndex")(columnStartIndex)
    __obj.updateDynamic("columnStopIndex")(columnStopIndex)
    __obj.updateDynamic("rowOverscanStartIndex")(rowOverscanStartIndex)
    __obj.updateDynamic("rowOverscanStopIndex")(rowOverscanStopIndex)
    __obj.updateDynamic("rowStartIndex")(rowStartIndex)
    __obj.updateDynamic("rowStopIndex")(rowStopIndex)
    __obj.asInstanceOf[RenderedSection]
  }
}

