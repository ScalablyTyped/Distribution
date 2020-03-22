package typings.reactVirtualized

import typings.react.mod.ReactNode
import typings.reactVirtualized.esCollectionMod.CollectionCellGroupRenderer
import typings.reactVirtualized.esCollectionMod.CollectionCellGroupRendererParams
import typings.reactVirtualized.reactVirtualizedStrings.grid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCellGroupRenderer extends js.Object {
  var `aria-label`: grid
  var cellGroupRenderer: CollectionCellGroupRenderer
}

object AnonCellGroupRenderer {
  @scala.inline
  def apply(
    `aria-label`: grid,
    cellGroupRenderer: /* params */ CollectionCellGroupRendererParams => js.Array[ReactNode]
  ): AnonCellGroupRenderer = {
    val __obj = js.Dynamic.literal(cellGroupRenderer = js.Any.fromFunction1(cellGroupRenderer))
    __obj.updateDynamic("aria-label")(`aria-label`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCellGroupRenderer]
  }
}

