package typings.pubnub.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetChannelMembersParameters[Custom /* <: ObjectCustom */] extends UUIDMembersParameters {
  
  var channel: String = js.native
  
  var uuids: js.Array[String | SetCustom[Custom]] = js.native
}
object SetChannelMembersParameters {
  
  @scala.inline
  def apply[Custom /* <: ObjectCustom */](channel: String, uuids: js.Array[String | SetCustom[Custom]]): SetChannelMembersParameters[Custom] = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], uuids = uuids.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetChannelMembersParameters[Custom]]
  }
  
  @scala.inline
  implicit class SetChannelMembersParametersMutableBuilder[Self <: SetChannelMembersParameters[_], Custom /* <: ObjectCustom */] (val x: Self with SetChannelMembersParameters[Custom]) extends AnyVal {
    
    @scala.inline
    def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUuids(value: js.Array[String | SetCustom[Custom]]): Self = StObject.set(x, "uuids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUuidsVarargs(value: (String | SetCustom[Custom])*): Self = StObject.set(x, "uuids", js.Array(value :_*))
  }
}
