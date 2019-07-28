package typings.reactDashVirtualized.distEsCollectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollectionCellGroupRendererParams extends js.Object {
  var cellRenderer: CollectionCellRenderer
  var cellSizeAndPositionGetter: CollectionCellSizeAndPositionGetter
  var indices: js.Array[Double]
}

object CollectionCellGroupRendererParams {
  @scala.inline
  def apply(
    cellRenderer: CollectionCellRenderer,
    cellSizeAndPositionGetter: CollectionCellSizeAndPositionGetter,
    indices: js.Array[Double]
  ): CollectionCellGroupRendererParams = {
    val __obj = js.Dynamic.literal(cellRenderer = cellRenderer, cellSizeAndPositionGetter = cellSizeAndPositionGetter, indices = indices)
  
    __obj.asInstanceOf[CollectionCellGroupRendererParams]
  }
}

