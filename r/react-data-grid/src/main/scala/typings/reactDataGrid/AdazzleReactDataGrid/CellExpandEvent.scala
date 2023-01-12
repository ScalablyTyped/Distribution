package typings.reactDataGrid.AdazzleReactDataGrid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *   Information about a cell expanded.
  */
trait CellExpandEvent[T] extends StObject {
  
  /**
    * Expand data.
    */
  var expandArgs: Any
  
  /**
    * The column index where the cell is being expanded.
    */
  var idx: Double
  
  /**
    * The values of the row.
    */
  var rowData: T
  
  /**
    * The row index where the cell is being expanded.
    */
  var rowIdx: Double
}
object CellExpandEvent {
  
  inline def apply[T](expandArgs: Any, idx: Double, rowData: T, rowIdx: Double): CellExpandEvent[T] = {
    val __obj = js.Dynamic.literal(expandArgs = expandArgs.asInstanceOf[js.Any], idx = idx.asInstanceOf[js.Any], rowData = rowData.asInstanceOf[js.Any], rowIdx = rowIdx.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellExpandEvent[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CellExpandEvent[?], T] (val x: Self & CellExpandEvent[T]) extends AnyVal {
    
    inline def setExpandArgs(value: Any): Self = StObject.set(x, "expandArgs", value.asInstanceOf[js.Any])
    
    inline def setIdx(value: Double): Self = StObject.set(x, "idx", value.asInstanceOf[js.Any])
    
    inline def setRowData(value: T): Self = StObject.set(x, "rowData", value.asInstanceOf[js.Any])
    
    inline def setRowIdx(value: Double): Self = StObject.set(x, "rowIdx", value.asInstanceOf[js.Any])
  }
}
