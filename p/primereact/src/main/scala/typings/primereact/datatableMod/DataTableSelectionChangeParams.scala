package typings.primereact.datatableMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.SyntheticEvent
import typings.std.Element
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataTableSelectionChangeParams
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var originalEvent: SyntheticEvent[Element, Event]
  
  var `type`: js.UndefOr[String] = js.undefined
  
  var value: Any
}
object DataTableSelectionChangeParams {
  
  inline def apply(originalEvent: SyntheticEvent[Element, Event], value: Any): DataTableSelectionChangeParams = {
    val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTableSelectionChangeParams]
  }
  
  extension [Self <: DataTableSelectionChangeParams](x: Self) {
    
    inline def setOriginalEvent(value: SyntheticEvent[Element, Event]): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
