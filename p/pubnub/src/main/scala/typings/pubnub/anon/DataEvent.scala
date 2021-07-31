package typings.pubnub.anon

import typings.pubnub.mod.MessageAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataEvent extends StObject {
  
  var data: MessageAction
  
  var event: String
}
object DataEvent {
  
  @scala.inline
  def apply(data: MessageAction, event: String): DataEvent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataEvent]
  }
  
  @scala.inline
  implicit class DataEventMutableBuilder[Self <: DataEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: MessageAction): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvent(value: String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
  }
}
