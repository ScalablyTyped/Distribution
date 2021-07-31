package typings.primereact.anon

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OriginalEventValue extends StObject {
  
  var originalEvent: typings.std.Event
  
  var value: Date
}
object OriginalEventValue {
  
  @scala.inline
  def apply(originalEvent: typings.std.Event, value: Date): OriginalEventValue = {
    val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[OriginalEventValue]
  }
  
  @scala.inline
  implicit class OriginalEventValueMutableBuilder[Self <: OriginalEventValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOriginalEvent(value: typings.std.Event): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Date): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
