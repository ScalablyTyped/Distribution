package typings.pubnub.mod

import typings.pubnub.anon.Id
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Omit<pubnub.pubnub.v2ObjectData<MembershipCustom>, 'id'> */
@js.native
trait ChannelMembershipObject[MembershipCustom /* <: ObjectCustom */, ChannelCustom /* <: ObjectCustom */] extends StObject {
  
  var channel: ChannelMetadataObject[ChannelCustom] | Id = js.native
  
  var custom: js.UndefOr[MembershipCustom | Null] = js.native
  
  var eTag: String = js.native
  
  var updated: String = js.native
}
object ChannelMembershipObject {
  
  @scala.inline
  def apply[MembershipCustom /* <: ObjectCustom */, ChannelCustom /* <: ObjectCustom */](channel: ChannelMetadataObject[ChannelCustom] | Id, eTag: String, updated: String): ChannelMembershipObject[MembershipCustom, ChannelCustom] = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], eTag = eTag.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelMembershipObject[MembershipCustom, ChannelCustom]]
  }
  
  @scala.inline
  implicit class ChannelMembershipObjectMutableBuilder[Self <: ChannelMembershipObject[_, _], MembershipCustom /* <: ObjectCustom */, ChannelCustom /* <: ObjectCustom */] (val x: Self with (ChannelMembershipObject[MembershipCustom, ChannelCustom])) extends AnyVal {
    
    @scala.inline
    def setChannel(value: ChannelMetadataObject[ChannelCustom] | Id): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustom(value: MembershipCustom): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomNull: Self = StObject.set(x, "custom", null)
    
    @scala.inline
    def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
    
    @scala.inline
    def setETag(value: String): Self = StObject.set(x, "eTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdated(value: String): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
  }
}
