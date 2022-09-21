package typings.reactVirtualized.esTableMod

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeaderMouseEventHandlerParams extends StObject {
  
  var columnData: Any
  
  var dataKey: String
  
  var event: MouseEvent[Any, NativeMouseEvent]
}
object HeaderMouseEventHandlerParams {
  
  inline def apply(columnData: Any, dataKey: String, event: MouseEvent[Any, NativeMouseEvent]): HeaderMouseEventHandlerParams = {
    val __obj = js.Dynamic.literal(columnData = columnData.asInstanceOf[js.Any], dataKey = dataKey.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeaderMouseEventHandlerParams]
  }
  
  extension [Self <: HeaderMouseEventHandlerParams](x: Self) {
    
    inline def setColumnData(value: Any): Self = StObject.set(x, "columnData", value.asInstanceOf[js.Any])
    
    inline def setDataKey(value: String): Self = StObject.set(x, "dataKey", value.asInstanceOf[js.Any])
    
    inline def setEvent(value: MouseEvent[Any, NativeMouseEvent]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
  }
}
