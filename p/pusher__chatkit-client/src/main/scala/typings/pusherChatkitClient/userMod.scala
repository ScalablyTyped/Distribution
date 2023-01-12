package typings.pusherChatkitClient

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object userMod {
  
  trait PusherUser extends StObject {
    
    var avatarURL: js.UndefOr[String] = js.undefined
    
    var createdAt: String
    
    var customData: js.UndefOr[Any] = js.undefined
    
    var id: String
    
    var name: String
    
    var presence: PusherUserPresence
    
    var updatedAt: String
  }
  object PusherUser {
    
    inline def apply(createdAt: String, id: String, name: String, presence: PusherUserPresence, updatedAt: String): PusherUser = {
      val __obj = js.Dynamic.literal(createdAt = createdAt.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], presence = presence.asInstanceOf[js.Any], updatedAt = updatedAt.asInstanceOf[js.Any])
      __obj.asInstanceOf[PusherUser]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PusherUser] (val x: Self) extends AnyVal {
      
      inline def setAvatarURL(value: String): Self = StObject.set(x, "avatarURL", value.asInstanceOf[js.Any])
      
      inline def setAvatarURLUndefined: Self = StObject.set(x, "avatarURL", js.undefined)
      
      inline def setCreatedAt(value: String): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
      
      inline def setCustomData(value: Any): Self = StObject.set(x, "customData", value.asInstanceOf[js.Any])
      
      inline def setCustomDataUndefined: Self = StObject.set(x, "customData", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPresence(value: PusherUserPresence): Self = StObject.set(x, "presence", value.asInstanceOf[js.Any])
      
      inline def setUpdatedAt(value: String): Self = StObject.set(x, "updatedAt", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.pusherChatkitClient.pusherChatkitClientStrings.online
    - typings.pusherChatkitClient.pusherChatkitClientStrings.offline
    - typings.pusherChatkitClient.pusherChatkitClientStrings.unknown
  */
  trait PusherUserPresence extends StObject
  object PusherUserPresence {
    
    inline def offline: typings.pusherChatkitClient.pusherChatkitClientStrings.offline = "offline".asInstanceOf[typings.pusherChatkitClient.pusherChatkitClientStrings.offline]
    
    inline def online: typings.pusherChatkitClient.pusherChatkitClientStrings.online = "online".asInstanceOf[typings.pusherChatkitClient.pusherChatkitClientStrings.online]
    
    inline def unknown: typings.pusherChatkitClient.pusherChatkitClientStrings.unknown = "unknown".asInstanceOf[typings.pusherChatkitClient.pusherChatkitClientStrings.unknown]
  }
}
