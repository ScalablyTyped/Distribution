package typings.pubnub.anon

import typings.pubnub.mod.ObjectCustom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Channel[MembershipCustom /* <: ObjectCustom */] extends StObject {
  
  var channel: IdString
  
  var custom: MembershipCustom | Null
  
  var eTag: String
  
  var updated: String
  
  var uuid: IdString
}
object Channel {
  
  inline def apply[MembershipCustom /* <: ObjectCustom */](channel: IdString, eTag: String, updated: String, uuid: IdString): Channel[MembershipCustom] = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], eTag = eTag.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any], custom = null)
    __obj.asInstanceOf[Channel[MembershipCustom]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Channel[?], MembershipCustom /* <: ObjectCustom */] (val x: Self & Channel[MembershipCustom]) extends AnyVal {
    
    inline def setChannel(value: IdString): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    inline def setCustom(value: MembershipCustom): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    
    inline def setCustomNull: Self = StObject.set(x, "custom", null)
    
    inline def setETag(value: String): Self = StObject.set(x, "eTag", value.asInstanceOf[js.Any])
    
    inline def setUpdated(value: String): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    
    inline def setUuid(value: IdString): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
  }
}
