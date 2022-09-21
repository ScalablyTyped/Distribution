package typings.reactDataGrid.AdazzleReactDataGrid

import typings.react.mod.SyntheticEvent
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information about a drag handle double click. Generic event type returns untyped row, use parameterized type with the row type as the parameter
  * @default T = any
  */
trait DragHandleDoubleClickEvent[T] extends StObject {
  
  /**
    * The double click event.
    */
  var e: SyntheticEvent[Any, Event]
  
  /**
    * The column where the double click occurred.
    */
  var idx: Double
  
  /**
    * The values of the row.
    */
  var rowData: T
  
  /**
    * The row where the double click occurred.
    */
  var rowIdx: Double
}
object DragHandleDoubleClickEvent {
  
  inline def apply[T](e: SyntheticEvent[Any, Event], idx: Double, rowData: T, rowIdx: Double): DragHandleDoubleClickEvent[T] = {
    val __obj = js.Dynamic.literal(e = e.asInstanceOf[js.Any], idx = idx.asInstanceOf[js.Any], rowData = rowData.asInstanceOf[js.Any], rowIdx = rowIdx.asInstanceOf[js.Any])
    __obj.asInstanceOf[DragHandleDoubleClickEvent[T]]
  }
  
  extension [Self <: DragHandleDoubleClickEvent[?], T](x: Self & DragHandleDoubleClickEvent[T]) {
    
    inline def setE(value: SyntheticEvent[Any, Event]): Self = StObject.set(x, "e", value.asInstanceOf[js.Any])
    
    inline def setIdx(value: Double): Self = StObject.set(x, "idx", value.asInstanceOf[js.Any])
    
    inline def setRowData(value: T): Self = StObject.set(x, "rowData", value.asInstanceOf[js.Any])
    
    inline def setRowIdx(value: Double): Self = StObject.set(x, "rowIdx", value.asInstanceOf[js.Any])
  }
}
