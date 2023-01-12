package typings.pubnub.mod

import typings.pubnub.anon.IdString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Omit<pubnub.pubnub.v2ObjectData<MembershipCustom>, 'id'> */
trait ChannelMembershipObject[MembershipCustom /* <: ObjectCustom */, ChannelCustom /* <: ObjectCustom */] extends StObject {
  
  var channel: ChannelMetadataObject[ChannelCustom] | IdString
  
  var custom: js.UndefOr[MembershipCustom | Null] = js.undefined
  
  var eTag: String
  
  var updated: String
}
object ChannelMembershipObject {
  
  inline def apply[MembershipCustom /* <: ObjectCustom */, ChannelCustom /* <: ObjectCustom */](channel: ChannelMetadataObject[ChannelCustom] | IdString, eTag: String, updated: String): ChannelMembershipObject[MembershipCustom, ChannelCustom] = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], eTag = eTag.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelMembershipObject[MembershipCustom, ChannelCustom]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChannelMembershipObject[?, ?], MembershipCustom /* <: ObjectCustom */, ChannelCustom /* <: ObjectCustom */] (val x: Self & (ChannelMembershipObject[MembershipCustom, ChannelCustom])) extends AnyVal {
    
    inline def setChannel(value: ChannelMetadataObject[ChannelCustom] | IdString): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    inline def setCustom(value: MembershipCustom): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    
    inline def setCustomNull: Self = StObject.set(x, "custom", null)
    
    inline def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
    
    inline def setETag(value: String): Self = StObject.set(x, "eTag", value.asInstanceOf[js.Any])
    
    inline def setUpdated(value: String): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
  }
}
