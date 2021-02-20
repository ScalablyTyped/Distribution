package typings.pubnub.anon

import typings.pubnub.mod.ObjectCustom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Channel[MembershipCustom /* <: ObjectCustom */] extends StObject {
  
  var channel: Id = js.native
  
  var custom: MembershipCustom | Null = js.native
  
  var eTag: String = js.native
  
  var updated: String = js.native
  
  var uuid: Id = js.native
}
object Channel {
  
  @scala.inline
  def apply[MembershipCustom /* <: ObjectCustom */](channel: Id, eTag: String, updated: String, uuid: Id): Channel[MembershipCustom] = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], eTag = eTag.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Channel[MembershipCustom]]
  }
  
  @scala.inline
  implicit class ChannelMutableBuilder[Self <: Channel[_], MembershipCustom /* <: ObjectCustom */] (val x: Self with Channel[MembershipCustom]) extends AnyVal {
    
    @scala.inline
    def setChannel(value: Id): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustom(value: MembershipCustom): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomNull: Self = StObject.set(x, "custom", null)
    
    @scala.inline
    def setETag(value: String): Self = StObject.set(x, "eTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdated(value: String): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUuid(value: Id): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
  }
}
