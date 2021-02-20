package typings.pubnub.mod

import typings.pubnub.anon.Id
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Memberships
/* Inlined parent std.Omit<pubnub.pubnub.v2ObjectData<MembershipCustom>, 'id'> */
@js.native
trait UUIDMembershipObject[MembershipCustom /* <: ObjectCustom */, UUIDCustom /* <: ObjectCustom */] extends StObject {
  
  var custom: js.UndefOr[MembershipCustom | Null] = js.native
  
  var eTag: String = js.native
  
  var updated: String = js.native
  
  var uuid: UUIDMetadataObject[UUIDCustom] | Id = js.native
}
object UUIDMembershipObject {
  
  @scala.inline
  def apply[MembershipCustom /* <: ObjectCustom */, UUIDCustom /* <: ObjectCustom */](eTag: String, updated: String, uuid: UUIDMetadataObject[UUIDCustom] | Id): UUIDMembershipObject[MembershipCustom, UUIDCustom] = {
    val __obj = js.Dynamic.literal(eTag = eTag.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[UUIDMembershipObject[MembershipCustom, UUIDCustom]]
  }
  
  @scala.inline
  implicit class UUIDMembershipObjectMutableBuilder[Self <: UUIDMembershipObject[_, _], MembershipCustom /* <: ObjectCustom */, UUIDCustom /* <: ObjectCustom */] (val x: Self with (UUIDMembershipObject[MembershipCustom, UUIDCustom])) extends AnyVal {
    
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
    
    @scala.inline
    def setUuid(value: UUIDMetadataObject[UUIDCustom] | Id): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
  }
}
