package typings.reactVirtualized.anon

import typings.react.mod.ReactNode
import typings.reactVirtualized.esCollectionMod.CollectionCellGroupRenderer
import typings.reactVirtualized.esCollectionMod.CollectionCellGroupRendererParams
import typings.reactVirtualized.reactVirtualizedStrings.grid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CellGroupRenderer extends StObject {
  
  var `aria-label`: grid
  
  var cellGroupRenderer: CollectionCellGroupRenderer
}
object CellGroupRenderer {
  
  inline def apply(cellGroupRenderer: /* params */ CollectionCellGroupRendererParams => js.Array[ReactNode]): CellGroupRenderer = {
    val __obj = js.Dynamic.literal(cellGroupRenderer = js.Any.fromFunction1(cellGroupRenderer))
    __obj.updateDynamic("aria-label")("grid")
    __obj.asInstanceOf[CellGroupRenderer]
  }
  
  extension [Self <: CellGroupRenderer](x: Self) {
    
    inline def `setAria-label`(value: grid): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
    
    inline def setCellGroupRenderer(value: /* params */ CollectionCellGroupRendererParams => js.Array[ReactNode]): Self = StObject.set(x, "cellGroupRenderer", js.Any.fromFunction1(value))
  }
}
