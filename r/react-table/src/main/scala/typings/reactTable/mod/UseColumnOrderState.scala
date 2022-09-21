package typings.reactTable.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UseColumnOrderState[D /* <: js.Object */] extends StObject {
  
  var columnOrder: js.Array[IdType[D]]
}
object UseColumnOrderState {
  
  inline def apply[D /* <: js.Object */](columnOrder: js.Array[IdType[D]]): UseColumnOrderState[D] = {
    val __obj = js.Dynamic.literal(columnOrder = columnOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseColumnOrderState[D]]
  }
  
  extension [Self <: UseColumnOrderState[?], D /* <: js.Object */](x: Self & UseColumnOrderState[D]) {
    
    inline def setColumnOrder(value: js.Array[IdType[D]]): Self = StObject.set(x, "columnOrder", value.asInstanceOf[js.Any])
    
    inline def setColumnOrderVarargs(value: IdType[D]*): Self = StObject.set(x, "columnOrder", js.Array(value*))
  }
}
