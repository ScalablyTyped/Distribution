package typings.primereact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OriginalEvent extends StObject {
  
  var originalEvent: typings.std.Event
  
  var query: String
}
object OriginalEvent {
  
  @scala.inline
  def apply(originalEvent: typings.std.Event, query: String): OriginalEvent = {
    val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[OriginalEvent]
  }
  
  @scala.inline
  implicit class OriginalEventMutableBuilder[Self <: OriginalEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOriginalEvent(value: typings.std.Event): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
