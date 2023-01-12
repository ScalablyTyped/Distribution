package typings.pubnub.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetChannelMembersParameters[Custom /* <: ObjectCustom */]
  extends StObject
     with UUIDMembersParameters {
  
  var channel: String
  
  var uuids: js.Array[String | SetCustom[Custom]]
}
object SetChannelMembersParameters {
  
  inline def apply[Custom /* <: ObjectCustom */](channel: String, uuids: js.Array[String | SetCustom[Custom]]): SetChannelMembersParameters[Custom] = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], uuids = uuids.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetChannelMembersParameters[Custom]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SetChannelMembersParameters[?], Custom /* <: ObjectCustom */] (val x: Self & SetChannelMembersParameters[Custom]) extends AnyVal {
    
    inline def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    inline def setUuids(value: js.Array[String | SetCustom[Custom]]): Self = StObject.set(x, "uuids", value.asInstanceOf[js.Any])
    
    inline def setUuidsVarargs(value: (String | SetCustom[Custom])*): Self = StObject.set(x, "uuids", js.Array(value*))
  }
}
