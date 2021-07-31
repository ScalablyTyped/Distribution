package typings.reactDataGrid.AdazzleReactDataGrid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information about a row update. Generic event type returns untyped row, use parameterized type with the row type as the parameter
  * @default T = any
  */
trait RowUpdateEvent[T] extends StObject {
  
  /**
    * The name of the column that was updated.
    */
  var cellKey: String
  
  /**
    * The name of the key pressed to trigger the event ('Tab', 'Enter', etc.).
    */
  var key: String
  
  /**
    * The index of the updated row.
    */
  var rowIdx: Double
  
  /**
    * The columns that were updated and their values.
    */
  var updated: T
}
object RowUpdateEvent {
  
  @scala.inline
  def apply[T](cellKey: String, key: String, rowIdx: Double, updated: T): RowUpdateEvent[T] = {
    val __obj = js.Dynamic.literal(cellKey = cellKey.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], rowIdx = rowIdx.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowUpdateEvent[T]]
  }
  
  @scala.inline
  implicit class RowUpdateEventMutableBuilder[Self <: RowUpdateEvent[?], T] (val x: Self & RowUpdateEvent[T]) extends AnyVal {
    
    @scala.inline
    def setCellKey(value: String): Self = StObject.set(x, "cellKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowIdx(value: Double): Self = StObject.set(x, "rowIdx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdated(value: T): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
  }
}
