package typings.primereact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionOriginalEvent extends StObject {
  
  var option: js.Any
  
  var originalEvent: typings.std.Event
}
object OptionOriginalEvent {
  
  inline def apply(option: js.Any, originalEvent: typings.std.Event): OptionOriginalEvent = {
    val __obj = js.Dynamic.literal(option = option.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionOriginalEvent]
  }
  
  extension [Self <: OptionOriginalEvent](x: Self) {
    
    inline def setOption(value: js.Any): Self = StObject.set(x, "option", value.asInstanceOf[js.Any])
    
    inline def setOriginalEvent(value: typings.std.Event): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
  }
}
