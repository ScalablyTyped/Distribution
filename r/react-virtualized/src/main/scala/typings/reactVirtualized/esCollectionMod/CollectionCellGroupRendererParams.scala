package typings.reactVirtualized.esCollectionMod

import typings.react.mod.ReactNode
import typings.reactVirtualized.mod.Index
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CollectionCellGroupRendererParams extends js.Object {
  var cellRenderer: CollectionCellRenderer = js.native
  var cellSizeAndPositionGetter: CollectionCellSizeAndPositionGetter = js.native
  var indices: js.Array[Double] = js.native
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
  @scala.inline
  implicit class CollectionCellGroupRendererParamsOps[Self <: CollectionCellGroupRendererParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCellRenderer(value: /* params */ CollectionCellRendererParams => ReactNode): Self = this.set("cellRenderer", js.Any.fromFunction1(value))
    @scala.inline
    def setCellSizeAndPositionGetter(value: /* params */ Index => CollectionCellSizeAndPosition): Self = this.set("cellSizeAndPositionGetter", js.Any.fromFunction1(value))
    @scala.inline
    def setIndicesVarargs(value: Double*): Self = this.set("indices", js.Array(value :_*))
    @scala.inline
    def setIndices(value: js.Array[Double]): Self = this.set("indices", value.asInstanceOf[js.Any])
  }
  
}

