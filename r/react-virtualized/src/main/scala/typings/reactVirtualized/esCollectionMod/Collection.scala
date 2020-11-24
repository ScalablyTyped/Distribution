package typings.reactVirtualized.esCollectionMod

import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.reactVirtualized.anon.Align
import typings.reactVirtualized.anon.Arialabel
import typings.reactVirtualized.anon.CellGroupRenderer
import typings.reactVirtualized.anon.isScrollingbooleanSizeInf
import typings.reactVirtualized.mod.ScrollPosition
import typings.reactVirtualized.mod.SizeInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-virtualized/dist/es/Collection", "Collection")
@js.native
class Collection ()
  extends Component[CollectionProps, js.Object, js.Any] {
  
  /** CellLayoutManager interface */
  def calculateSizeAndPositionData(): Unit = js.native
  
  def cellRenderers(params: isScrollingbooleanSizeInf): js.Array[ReactNode] = js.native
  
  /**
    * Returns the most recently rendered set of cell indices.
    */
  def getLastRenderedIndices(): js.Array[Double] = js.native
  
  /**
    * Calculates the minimum amount of change from the current scroll position to ensure the specified cell is (fully) visible.
    */
  def getScrollPositionForCell(params: Align): ScrollPosition = js.native
  
  def getTotalSize(): SizeInfo = js.native
  
  /** See Collection#recomputeCellSizesAndPositions */
  def recomputeCellSizesAndPositions(): Unit = js.native
}
/* static members */
@JSImport("react-virtualized/dist/es/Collection", "Collection")
@js.native
object Collection extends js.Object {
  
  var defaultProps: CellGroupRenderer = js.native
  
  var propTypes: Arialabel = js.native
}
