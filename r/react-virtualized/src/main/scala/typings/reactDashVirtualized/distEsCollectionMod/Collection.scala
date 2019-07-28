package typings.reactDashVirtualized.distEsCollectionMod

import typings.react.reactMod.PureComponent
import typings.react.reactMod.ReactNode
import typings.reactDashVirtualized.Anon_Align
import typings.reactDashVirtualized.Anon_Arialabel
import typings.reactDashVirtualized.Anon_ArialabelCellGroupRenderer
import typings.reactDashVirtualized.Anon_IsScrolling
import typings.reactDashVirtualized.reactDashVirtualizedMod.ScrollPosition
import typings.reactDashVirtualized.reactDashVirtualizedMod.SizeInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-virtualized/dist/es/Collection", "Collection")
@js.native
class Collection ()
  extends PureComponent[CollectionProps, js.Object, js.Any] {
  /** CellLayoutManager interface */
  def calculateSizeAndPositionData(): Unit = js.native
  def cellRenderers(params: Anon_IsScrolling with SizeInfo): js.Array[ReactNode] = js.native
  /**
    * Returns the most recently rendered set of cell indices.
    */
  def getLastRenderedIndices(): js.Array[Double] = js.native
  /**
    * Calculates the minimum amount of change from the current scroll position to ensure the specified cell is (fully) visible.
    */
  def getScrollPositionForCell(params: Anon_Align): ScrollPosition = js.native
  def getTotalSize(): SizeInfo = js.native
  /** See Collection#recomputeCellSizesAndPositions */
  def recomputeCellSizesAndPositions(): Unit = js.native
}

/* static members */
@JSImport("react-virtualized/dist/es/Collection", "Collection")
@js.native
object Collection extends js.Object {
  var defaultProps: Anon_ArialabelCellGroupRenderer = js.native
  var propTypes: Anon_Arialabel = js.native
}

