package typings.primereact.datatableMod

import typings.react.mod.SyntheticEvent
import typings.std.Element
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataTableSelectParams extends StObject {
  
  var data: Any
  
  var originalEvent: SyntheticEvent[Element, Event]
  
  var `type`: DataTableSelectType
}
object DataTableSelectParams {
  
  inline def apply(data: Any, originalEvent: SyntheticEvent[Element, Event], `type`: DataTableSelectType): DataTableSelectParams = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTableSelectParams]
  }
  
  extension [Self <: DataTableSelectParams](x: Self) {
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setOriginalEvent(value: SyntheticEvent[Element, Event]): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
    
    inline def setType(value: DataTableSelectType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
