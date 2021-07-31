package typings.reactDataGrid.AdazzleReactDataGrid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information about a cell drag
  */
trait CellDragEvent extends StObject {
  
  /**
    * The name of the column that was dragged.
    */
  var cellKey: String
  
  /**
    * The row where the drag began.
    */
  var fromRow: Double
  
  /**
    * The row where the drag ended.
    */
  var toRow: Double
  
  /**
    * The value of the cell that was dragged.
    */
  var value: js.Any
}
object CellDragEvent {
  
  @scala.inline
  def apply(cellKey: String, fromRow: Double, toRow: Double, value: js.Any): CellDragEvent = {
    val __obj = js.Dynamic.literal(cellKey = cellKey.asInstanceOf[js.Any], fromRow = fromRow.asInstanceOf[js.Any], toRow = toRow.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellDragEvent]
  }
  
  @scala.inline
  implicit class CellDragEventMutableBuilder[Self <: CellDragEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCellKey(value: String): Self = StObject.set(x, "cellKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromRow(value: Double): Self = StObject.set(x, "fromRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToRow(value: Double): Self = StObject.set(x, "toRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
