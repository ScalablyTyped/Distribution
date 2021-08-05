package typings.primereact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CheckedOriginalEvent extends StObject {
  
  var checked: Boolean
  
  var originalEvent: typings.std.Event
  
  var target: Checked
  
  var value: js.Any
}
object CheckedOriginalEvent {
  
  inline def apply(checked: Boolean, originalEvent: typings.std.Event, target: Checked, value: js.Any): CheckedOriginalEvent = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckedOriginalEvent]
  }
  
  extension [Self <: CheckedOriginalEvent](x: Self) {
    
    inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    
    inline def setOriginalEvent(value: typings.std.Event): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: Checked): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
