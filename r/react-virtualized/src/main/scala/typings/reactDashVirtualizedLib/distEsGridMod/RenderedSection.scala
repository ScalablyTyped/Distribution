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
    val __obj = js.Dynamic.literal(columnOverscanStartIndex = columnOverscanStartIndex, columnOverscanStopIndex = columnOverscanStopIndex, columnStartIndex = columnStartIndex, columnStopIndex = columnStopIndex, rowOverscanStartIndex = rowOverscanStartIndex, rowOverscanStopIndex = rowOverscanStopIndex, rowStartIndex = rowStartIndex, rowStopIndex = rowStopIndex)
  
    __obj.asInstanceOf[RenderedSection]
  }
}

