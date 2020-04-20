package typings.reactVirtualized.esCollectionMod

import typings.react.mod.ReactNode
import typings.reactVirtualized.mod.Index
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
    val __obj = js.Dynamic.literal(cellRenderer = js.Any.fromFunction1(cellRenderer), cellSizeAndPositionGetter = js.Any.fromFunction1(cellSizeAndPositionGetter), indices = indices.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollectionCellGroupRendererParams]
  }
}

