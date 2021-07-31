package typings.pubnub.anon

import typings.pubnub.pubnubStrings.channel
import typings.pubnub.pubnubStrings.delete
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataIdEvent extends StObject {
  
  var data: Id
  
  var event: delete
  
  var `type`: channel
}
object DataIdEvent {
  
  @scala.inline
  def apply(data: Id): DataIdEvent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], event = "delete")
    __obj.updateDynamic("type")("channel")
    __obj.asInstanceOf[DataIdEvent]
  }
  
  @scala.inline
  implicit class DataIdEventMutableBuilder[Self <: DataIdEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: Id): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvent(value: delete): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: channel): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
