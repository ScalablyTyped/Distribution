package typings
package reactDashVirtualizedLib.distEsGridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridCellRangeProps extends js.Object {
  var cellCache: reactDashVirtualizedLib.reactDashVirtualizedMod.Map[_] = js.native
  @JSName("cellRenderer")
  var cellRenderer_Original: GridCellRenderer = js.native
  var columnSizeAndPositionManager: CellSizeAndPositionManager = js.native
  var columnStartIndex: scala.Double = js.native
  var columnStopIndex: scala.Double = js.native
  var deferredMeasurementCache: reactDashVirtualizedLib.distEsCellMeasurerMod.CellMeasurerCache = js.native
  var horizontalOffsetAdjustment: scala.Double = js.native
  var isScrolling: scala.Boolean = js.native
  var parent: reactDashVirtualizedLib.distEsCellMeasurerMod.MeasuredCellParent = js.native
  var rowSizeAndPositionManager: CellSizeAndPositionManager = js.native
  var rowStartIndex: scala.Double = js.native
  var rowStopIndex: scala.Double = js.native
  var scrollLeft: scala.Double = js.native
  var scrollTop: scala.Double = js.native
  var styleCache: reactDashVirtualizedLib.reactDashVirtualizedMod.Map[reactLib.reactMod.ReactNs.CSSProperties] = js.native
  var verticalOffsetAdjustment: scala.Double = js.native
  var visibleColumnIndices: VisibleCellRange = js.native
  var visibleRowIndices: VisibleCellRange = js.native
  def cellRenderer(props: GridCellProps): reactLib.reactMod.ReactNs.ReactNode = js.native
}

