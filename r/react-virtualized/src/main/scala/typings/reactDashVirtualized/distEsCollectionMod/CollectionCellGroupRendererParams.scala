package typings.reactDashVirtualized.distEsCollectionMod

import typings.react.reactMod.ReactNode
import typings.reactDashVirtualized.reactDashVirtualizedMod.Index
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
    cellRenderer: /* params */ CollectionCellRendererParams => ReactNode,
    cellSizeAndPositionGetter: /* params */ Index => CollectionCellSizeAndPosition,
    indices: js.Array[Double]
  ): CollectionCellGroupRendererParams = {
    val __obj = js.Dynamic.literal(cellRenderer = js.Any.fromFunction1(cellRenderer), cellSizeAndPositionGetter = js.Any.fromFunction1(cellSizeAndPositionGetter), indices = indices)
  
    __obj.asInstanceOf[CollectionCellGroupRendererParams]
  }
}

