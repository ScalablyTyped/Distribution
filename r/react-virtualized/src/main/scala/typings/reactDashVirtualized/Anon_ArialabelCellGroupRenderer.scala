package typings.reactDashVirtualized

import typings.reactDashVirtualized.distEsCollectionMod.CollectionCellGroupRenderer
import typings.reactDashVirtualized.reactDashVirtualizedStrings.grid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArialabelCellGroupRenderer extends js.Object {
  var `aria-label`: grid
  var cellGroupRenderer: CollectionCellGroupRenderer
}

object Anon_ArialabelCellGroupRenderer {
  @scala.inline
  def apply(`aria-label`: grid, cellGroupRenderer: CollectionCellGroupRenderer): Anon_ArialabelCellGroupRenderer = {
    val __obj = js.Dynamic.literal(cellGroupRenderer = cellGroupRenderer)
    __obj.updateDynamic("aria-label")(`aria-label`)
    __obj.asInstanceOf[Anon_ArialabelCellGroupRenderer]
  }
}

