package typings.pubnub.anon

import typings.pubnub.pubnubStrings.channel
import typings.pubnub.pubnubStrings.delete
import typings.pubnub.pubnubStrings.membership
import typings.pubnub.pubnubStrings.set
import typings.pubnub.pubnubStrings.uuid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventType extends StObject {
  
  var data: js.Object = js.native
  
  var event: set | delete = js.native
  
  var `type`: uuid | channel | membership = js.native
}
object EventType {
  
  @scala.inline
  def apply(data: js.Object, event: set | delete, `type`: uuid | channel | membership): EventType = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventType]
  }
  
  @scala.inline
  implicit class EventTypeMutableBuilder[Self <: EventType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvent(value: set | delete): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: uuid | channel | membership): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
