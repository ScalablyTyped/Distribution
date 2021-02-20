package typings.pubnub.mod

import typings.pubnub.anon.DataChannel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetMembershipEvent[MembershipCustom /* <: ObjectCustom */]
  extends BaseObjectsEvent
     with ObjectsEvent[js.Any, js.Any, MembershipCustom] {
  
  @JSName("message")
  var message_SetMembershipEvent: DataChannel[MembershipCustom] = js.native
}
object SetMembershipEvent {
  
  @scala.inline
  def apply[MembershipCustom /* <: ObjectCustom */](channel: String, message: DataChannel[MembershipCustom], timetoken: Double): SetMembershipEvent[MembershipCustom] = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], timetoken = timetoken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetMembershipEvent[MembershipCustom]]
  }
  
  @scala.inline
  implicit class SetMembershipEventMutableBuilder[Self <: SetMembershipEvent[_], MembershipCustom /* <: ObjectCustom */] (val x: Self with SetMembershipEvent[MembershipCustom]) extends AnyVal {
    
    @scala.inline
    def setMessage(value: DataChannel[MembershipCustom]): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
