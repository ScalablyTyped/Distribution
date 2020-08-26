package typings.reactVirtualized.anon

import typings.react.mod.ReactNode
import typings.reactVirtualized.esCollectionMod.CollectionCellGroupRenderer
import typings.reactVirtualized.esCollectionMod.CollectionCellGroupRendererParams
import typings.reactVirtualized.reactVirtualizedStrings.grid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CellGroupRenderer extends js.Object {
  var `aria-label`: grid = js.native
  var cellGroupRenderer: CollectionCellGroupRenderer = js.native
}

object CellGroupRenderer {
  @scala.inline
  def apply(
    `aria-label`: grid,
    cellGroupRenderer: /* params */ CollectionCellGroupRendererParams => js.Array[ReactNode]
  ): CellGroupRenderer = {
    val __obj = js.Dynamic.literal(cellGroupRenderer = js.Any.fromFunction1(cellGroupRenderer))
    __obj.updateDynamic("aria-label")(`aria-label`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellGroupRenderer]
  }
  @scala.inline
  implicit class CellGroupRendererOps[Self <: CellGroupRenderer] (val x: Self) extends AnyVal {
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
    def `setAria-label`(value: grid): Self = this.set("aria-label", value.asInstanceOf[js.Any])
    @scala.inline
    def setCellGroupRenderer(value: /* params */ CollectionCellGroupRendererParams => js.Array[ReactNode]): Self = this.set("cellGroupRenderer", js.Any.fromFunction1(value))
  }
  
}

