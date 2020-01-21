package typings.reactVirtualized.esGridMod

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
    val __obj = js.Dynamic.literal(columnOverscanStartIndex = columnOverscanStartIndex.asInstanceOf[js.Any], columnOverscanStopIndex = columnOverscanStopIndex.asInstanceOf[js.Any], columnStartIndex = columnStartIndex.asInstanceOf[js.Any], columnStopIndex = columnStopIndex.asInstanceOf[js.Any], rowOverscanStartIndex = rowOverscanStartIndex.asInstanceOf[js.Any], rowOverscanStopIndex = rowOverscanStopIndex.asInstanceOf[js.Any], rowStartIndex = rowStartIndex.asInstanceOf[js.Any], rowStopIndex = rowStopIndex.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RenderedSection]
  }
}

