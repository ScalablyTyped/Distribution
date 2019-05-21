package typings
package reactDashVirtualizedLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArialabelCellGroupRenderer extends js.Object {
  var `aria-label`: reactDashVirtualizedLib.reactDashVirtualizedLibStrings.grid
  var cellGroupRenderer: reactDashVirtualizedLib.distEsCollectionMod.CollectionCellGroupRenderer
}

object Anon_ArialabelCellGroupRenderer {
  @scala.inline
  def apply(
    `aria-label`: reactDashVirtualizedLib.reactDashVirtualizedLibStrings.grid,
    cellGroupRenderer: reactDashVirtualizedLib.distEsCollectionMod.CollectionCellGroupRenderer
  ): Anon_ArialabelCellGroupRenderer = {
    val __obj = js.Dynamic.literal(cellGroupRenderer = cellGroupRenderer)
    __obj.updateDynamic("aria-label")(`aria-label`)
    __obj.asInstanceOf[Anon_ArialabelCellGroupRenderer]
  }
}

