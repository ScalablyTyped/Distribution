package typings.reactVirtualized.anon

import typings.react.mod.ReactNode
import typings.reactVirtualized.esCollectionMod.CollectionCellGroupRenderer
import typings.reactVirtualized.esCollectionMod.CollectionCellGroupRendererParams
import typings.reactVirtualized.reactVirtualizedStrings.grid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CellGroupRenderer extends StObject {
  
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
  implicit class CellGroupRendererMutableBuilder[Self <: CellGroupRenderer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setAria-label`(value: grid): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellGroupRenderer(value: /* params */ CollectionCellGroupRendererParams => js.Array[ReactNode]): Self = StObject.set(x, "cellGroupRenderer", js.Any.fromFunction1(value))
  }
}
