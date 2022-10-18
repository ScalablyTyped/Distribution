package typings.pubnub.mod

import typings.pubnub.anon.DataCustom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetMembershipEvent[MembershipCustom /* <: ObjectCustom */]
  extends StObject
     with BaseObjectsEvent
     with ObjectsEvent[Any, Any, MembershipCustom] {
  
  @JSName("message")
  var message_SetMembershipEvent: DataCustom[MembershipCustom]
}
object SetMembershipEvent {
  
  inline def apply[MembershipCustom /* <: ObjectCustom */](channel: String, message: DataCustom[MembershipCustom], timetoken: Double): SetMembershipEvent[MembershipCustom] = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], timetoken = timetoken.asInstanceOf[js.Any], subscription = null)
    __obj.asInstanceOf[SetMembershipEvent[MembershipCustom]]
  }
  
  extension [Self <: SetMembershipEvent[?], MembershipCustom /* <: ObjectCustom */](x: Self & SetMembershipEvent[MembershipCustom]) {
    
    inline def setMessage(value: DataCustom[MembershipCustom]): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
