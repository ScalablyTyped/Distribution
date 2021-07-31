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
  
  @scala.inline
  def apply(): PartialCellPosition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCellPosition]
  }
  
  @scala.inline
  implicit class PartialCellPositionMutableBuilder[Self <: PartialCellPosition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnIndexUndefined: Self = StObject.set(x, "columnIndex", js.undefined)
    
    @scala.inline
    def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowIndexUndefined: Self = StObject.set(x, "rowIndex", js.undefined)
  }
}
