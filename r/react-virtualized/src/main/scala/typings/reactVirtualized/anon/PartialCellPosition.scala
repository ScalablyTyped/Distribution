package typings.reactVirtualized.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<react-virtualized.react-virtualized/dist/es/CellMeasurer.CellPosition> */
trait PartialCellPosition extends StObject {
  
  var columnIndex: js.UndefOr[Double] = js.undefined
  
  var rowIndex: js.UndefOr[Double] = js.undefined
}
object PartialCellPosition {
  
  inline def apply(): PartialCellPosition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCellPosition]
  }
  
  extension [Self <: PartialCellPosition](x: Self) {
    
    inline def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
    
    inline def setColumnIndexUndefined: Self = StObject.set(x, "columnIndex", js.undefined)
    
    inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
    
    inline def setRowIndexUndefined: Self = StObject.set(x, "rowIndex", js.undefined)
  }
}
