package typings
package reactDashVirtualizedLib.distEsCollectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-virtualized/dist/es/Collection", "Collection")
@js.native
class Collection ()
  extends reactLib.reactMod.PureComponent[CollectionProps, js.Object, js.Any] {
  /** CellLayoutManager interface */
  def calculateSizeAndPositionData(): scala.Unit = js.native
  def cellRenderers(
    params: reactDashVirtualizedLib.Anon_IsScrolling with reactDashVirtualizedLib.reactDashVirtualizedMod.SizeInfo
  ): js.Array[reactLib.reactMod.ReactNode] = js.native
  /**
    * Returns the most recently rendered set of cell indices.
    */
  def getLastRenderedIndices(): js.Array[scala.Double] = js.native
  /**
    * Calculates the minimum amount of change from the current scroll position to ensure the specified cell is (fully) visible.
    */
  def getScrollPositionForCell(params: reactDashVirtualizedLib.Anon_Align): reactDashVirtualizedLib.reactDashVirtualizedMod.ScrollPosition = js.native
  def getTotalSize(): reactDashVirtualizedLib.reactDashVirtualizedMod.SizeInfo = js.native
  /** See Collection#recomputeCellSizesAndPositions */
  def recomputeCellSizesAndPositions(): scala.Unit = js.native
}

/* static members */
@JSImport("react-virtualized/dist/es/Collection", "Collection")
@js.native
object Collection extends js.Object {
  var defaultProps: reactDashVirtualizedLib.Anon_ArialabelCellGroupRenderer = js.native
  var propTypes: reactDashVirtualizedLib.Anon_Arialabel = js.native
}

