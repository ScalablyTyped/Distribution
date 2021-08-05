package typings.reactDataGrid.AdazzleReactDataGrid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information about a copy paste
  */
trait CellCopyPasteEvent extends StObject {
  
  /**
    * The key of the column where the copy paste occurred.
    */
  var cellKey: String
  
  /**
    * The row that was copied from.
    */
  var fromRow: Double
  
  /**
    * The row that was pasted to.
    */
  var rowIdx: Double
  
  /**
    * The row that was pasted to.
    */
  var toRow: Double
  
  /**
    * The value that was pasted.
    */
  var value: js.Any
}
object CellCopyPasteEvent {
  
  inline def apply(cellKey: String, fromRow: Double, rowIdx: Double, toRow: Double, value: js.Any): CellCopyPasteEvent = {
    val __obj = js.Dynamic.literal(cellKey = cellKey.asInstanceOf[js.Any], fromRow = fromRow.asInstanceOf[js.Any], rowIdx = rowIdx.asInstanceOf[js.Any], toRow = toRow.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellCopyPasteEvent]
  }
  
  extension [Self <: CellCopyPasteEvent](x: Self) {
    
    inline def setCellKey(value: String): Self = StObject.set(x, "cellKey", value.asInstanceOf[js.Any])
    
    inline def setFromRow(value: Double): Self = StObject.set(x, "fromRow", value.asInstanceOf[js.Any])
    
    inline def setRowIdx(value: Double): Self = StObject.set(x, "rowIdx", value.asInstanceOf[js.Any])
    
    inline def setToRow(value: Double): Self = StObject.set(x, "toRow", value.asInstanceOf[js.Any])
    
    inline def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
