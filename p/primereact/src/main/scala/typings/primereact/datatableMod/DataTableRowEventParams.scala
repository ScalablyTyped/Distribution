package typings.primereact.datatableMod

import typings.react.mod.SyntheticEvent
import typings.std.Element
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataTableRowEventParams extends StObject {
  
  var data: Any
  
  var originalEvent: SyntheticEvent[Element, Event]
}
object DataTableRowEventParams {
  
  inline def apply(data: Any, originalEvent: SyntheticEvent[Element, Event]): DataTableRowEventParams = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTableRowEventParams]
  }
  
  extension [Self <: DataTableRowEventParams](x: Self) {
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setOriginalEvent(value: SyntheticEvent[Element, Event]): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
  }
}
