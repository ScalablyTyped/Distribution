package typings.pubnub.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MembershipData extends StObject {
  
  var created: String
  
  var custom: js.UndefOr[js.Object | Null] = js.undefined
  
  var eTag: String
  
  var spaceId: String
  
  var updated: String
  
  var userId: String
}
object MembershipData {
  
  inline def apply(created: String, eTag: String, spaceId: String, updated: String, userId: String): MembershipData = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], eTag = eTag.asInstanceOf[js.Any], spaceId = spaceId.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MembershipData]
  }
  
  extension [Self <: MembershipData](x: Self) {
    
    inline def setCreated(value: String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setCustom(value: js.Object): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    
    inline def setCustomNull: Self = StObject.set(x, "custom", null)
    
    inline def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
    
    inline def setETag(value: String): Self = StObject.set(x, "eTag", value.asInstanceOf[js.Any])
    
    inline def setSpaceId(value: String): Self = StObject.set(x, "spaceId", value.asInstanceOf[js.Any])
    
    inline def setUpdated(value: String): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    
    inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
  }
}
