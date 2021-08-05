package typings.reactVirtualized.esTableMod

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RowMouseEventHandlerParams extends StObject {
  
  var event: MouseEvent[js.Any, NativeMouseEvent]
  
  var index: Double
  
  var rowData: js.Any
}
object RowMouseEventHandlerParams {
  
  inline def apply(event: MouseEvent[js.Any, NativeMouseEvent], index: Double, rowData: js.Any): RowMouseEventHandlerParams = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], rowData = rowData.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowMouseEventHandlerParams]
  }
  
  extension [Self <: RowMouseEventHandlerParams](x: Self) {
    
    inline def setEvent(value: MouseEvent[js.Any, NativeMouseEvent]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setRowData(value: js.Any): Self = StObject.set(x, "rowData", value.asInstanceOf[js.Any])
  }
}
