package typings.primereact.datatableDatatableMod

import typings.react.mod.SyntheticEvent
import typings.std.Element
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataTableSelectAllChangeParams extends StObject {
  
  var checked: Boolean
  
  var originalEvent: SyntheticEvent[Element, Event]
}
object DataTableSelectAllChangeParams {
  
  inline def apply(checked: Boolean, originalEvent: SyntheticEvent[Element, Event]): DataTableSelectAllChangeParams = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTableSelectAllChangeParams]
  }
  
  extension [Self <: DataTableSelectAllChangeParams](x: Self) {
    
    inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    
    inline def setOriginalEvent(value: SyntheticEvent[Element, Event]): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
  }
}
