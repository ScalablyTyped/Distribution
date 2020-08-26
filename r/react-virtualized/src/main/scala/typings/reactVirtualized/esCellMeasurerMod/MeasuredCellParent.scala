package typings.reactVirtualized.esCellMeasurerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MeasuredCellParent extends js.Object {
  var invalidateCellSizeAfterRender: js.UndefOr[js.Function1[/* cell */ CellPosition, Unit]] = js.native
  var recomputeGridSize: js.UndefOr[js.Function1[/* cell */ CellPosition, Unit]] = js.native
}

object MeasuredCellParent {
  @scala.inline
  def apply(): MeasuredCellParent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MeasuredCellParent]
  }
  @scala.inline
  implicit class MeasuredCellParentOps[Self <: MeasuredCellParent] (val x: Self) extends AnyVal {
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
    def setInvalidateCellSizeAfterRender(value: /* cell */ CellPosition => Unit): Self = this.set("invalidateCellSizeAfterRender", js.Any.fromFunction1(value))
    @scala.inline
    def deleteInvalidateCellSizeAfterRender: Self = this.set("invalidateCellSizeAfterRender", js.undefined)
    @scala.inline
    def setRecomputeGridSize(value: /* cell */ CellPosition => Unit): Self = this.set("recomputeGridSize", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRecomputeGridSize: Self = this.set("recomputeGridSize", js.undefined)
  }
  
}

