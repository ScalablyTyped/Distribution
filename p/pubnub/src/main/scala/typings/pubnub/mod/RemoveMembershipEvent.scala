package typings.pubnub.mod

import typings.pubnub.anon.DataUuid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveMembershipEvent
  extends StObject
     with BaseObjectsEvent
     with ObjectsEvent[Any, Any, Any] {
  
  @JSName("message")
  var message_RemoveMembershipEvent: DataUuid
}
object RemoveMembershipEvent {
  
  inline def apply(channel: String, message: DataUuid, timetoken: Double): RemoveMembershipEvent = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], timetoken = timetoken.asInstanceOf[js.Any], subscription = null)
    __obj.asInstanceOf[RemoveMembershipEvent]
  }
  
  extension [Self <: RemoveMembershipEvent](x: Self) {
    
    inline def setMessage(value: DataUuid): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
