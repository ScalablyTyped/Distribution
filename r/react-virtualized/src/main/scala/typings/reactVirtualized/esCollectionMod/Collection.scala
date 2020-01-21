package typings.reactVirtualized.esCollectionMod

import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.reactVirtualized.AnonAlign
import typings.reactVirtualized.AnonArialabel
import typings.reactVirtualized.AnonArialabelCellGroupRenderer
import typings.reactVirtualized.AnonIsScrolling
import typings.reactVirtualized.mod.ScrollPosition
import typings.reactVirtualized.mod.SizeInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-virtualized/dist/es/Collection", "Collection")
@js.native
class Collection ()
  extends Component[CollectionProps, js.Object, js.Any] {
  /** CellLayoutManager interface */
  def calculateSizeAndPositionData(): Unit = js.native
  def cellRenderers(params: AnonIsScrolling with SizeInfo): js.Array[ReactNode] = js.native
  /**
    * Returns the most recently rendered set of cell indices.
    */
  def getLastRenderedIndices(): js.Array[Double] = js.native
  /**
    * Calculates the minimum amount of change from the current scroll position to ensure the specified cell is (fully) visible.
    */
  def getScrollPositionForCell(params: AnonAlign): ScrollPosition = js.native
  def getTotalSize(): SizeInfo = js.native
  /** See Collection#recomputeCellSizesAndPositions */
  def recomputeCellSizesAndPositions(): Unit = js.native
}

/* static members */
@JSImport("react-virtualized/dist/es/Collection", "Collection")
@js.native
object Collection extends js.Object {
  var defaultProps: AnonArialabelCellGroupRenderer = js.native
  var propTypes: AnonArialabel = js.native
}

