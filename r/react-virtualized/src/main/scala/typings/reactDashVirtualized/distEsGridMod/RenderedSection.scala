package typings.reactDashVirtualized.distEsGridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderedSection extends js.Object {
  var columnOverscanStartIndex: Double
  var columnOverscanStopIndex: Double
  var columnStartIndex: Double
  var columnStopIndex: Double
  var rowOverscanStartIndex: Double
  var rowOverscanStopIndex: Double
  var rowStartIndex: Double
  var rowStopIndex: Double
}

object RenderedSection {
  @scala.inline
  def apply(
    columnOverscanStartIndex: Double,
    columnOverscanStopIndex: Double,
    columnStartIndex: Double,
    columnStopIndex: Double,
    rowOverscanStartIndex: Double,
    rowOverscanStopIndex: Double,
    rowStartIndex: Double,
    rowStopIndex: Double
  ): RenderedSection = {
    val __obj = js.Dynamic.literal(columnOverscanStartIndex = columnOverscanStartIndex, columnOverscanStopIndex = columnOverscanStopIndex, columnStartIndex = columnStartIndex, columnStopIndex = columnStopIndex, rowOverscanStartIndex = rowOverscanStartIndex, rowOverscanStopIndex = rowOverscanStopIndex, rowStartIndex = rowStartIndex, rowStopIndex = rowStopIndex)
  
    __obj.asInstanceOf[RenderedSection]
  }
}

