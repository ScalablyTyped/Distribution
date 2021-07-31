package typings.primereact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventValue extends StObject {
  
  var event: typings.std.Event
  
  var value: js.Any
}
object EventValue {
  
  @scala.inline
  def apply(event: typings.std.Event, value: js.Any): EventValue = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventValue]
  }
  
  @scala.inline
  implicit class EventValueMutableBuilder[Self <: EventValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvent(value: typings.std.Event): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
