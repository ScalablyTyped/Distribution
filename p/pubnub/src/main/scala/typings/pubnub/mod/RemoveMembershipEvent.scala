package typings.pubnub.mod

import typings.pubnub.anon.DataEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveMembershipEvent
  extends StObject
     with BaseObjectsEvent
     with ObjectsEvent[Any, Any, Any] {
  
  @JSName("message")
  var message_RemoveMembershipEvent: DataEvent
}
object RemoveMembershipEvent {
  
  inline def apply(channel: String, message: DataEvent, timetoken: Double): RemoveMembershipEvent = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], timetoken = timetoken.asInstanceOf[js.Any], subscription = null)
    __obj.asInstanceOf[RemoveMembershipEvent]
  }
  
  extension [Self <: RemoveMembershipEvent](x: Self) {
    
    inline def setMessage(value: DataEvent): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
