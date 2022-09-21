package typings.pusherChatkitClient

import typings.pusherChatkitClient.userMod.PusherUser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object roomMod {
  
  trait PusherReadCursor extends StObject {
    
    var position: Double
    
    var room: PusherRoom
    
    var `type`: Double
    
    var updatedAt: String
    
    var user: PusherUser
  }
  object PusherReadCursor {
    
    inline def apply(position: Double, room: PusherRoom, `type`: Double, updatedAt: String, user: PusherUser): PusherReadCursor = {
      val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any], updatedAt = updatedAt.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[PusherReadCursor]
    }
    
    extension [Self <: PusherReadCursor](x: Self) {
      
      inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setRoom(value: PusherRoom): Self = StObject.set(x, "room", value.asInstanceOf[js.Any])
      
      inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUpdatedAt(value: String): Self = StObject.set(x, "updatedAt", value.asInstanceOf[js.Any])
      
      inline def setUser(value: PusherUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    }
  }
  
  trait PusherRoom extends StObject {
    
    var createdAt: String
    
    var createdByUserId: String
    
    var customData: js.UndefOr[Any] = js.undefined
    
    var id: String
    
    var isPrivate: Boolean
    
    var lastMessageAt: String
    
    var name: String
    
    var unreadCount: Double
    
    var updatedAt: String
    
    var users: js.Array[PusherUser]
  }
  object PusherRoom {
    
    inline def apply(
      createdAt: String,
      createdByUserId: String,
      id: String,
      isPrivate: Boolean,
      lastMessageAt: String,
      name: String,
      unreadCount: Double,
      updatedAt: String,
      users: js.Array[PusherUser]
    ): PusherRoom = {
      val __obj = js.Dynamic.literal(createdAt = createdAt.asInstanceOf[js.Any], createdByUserId = createdByUserId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isPrivate = isPrivate.asInstanceOf[js.Any], lastMessageAt = lastMessageAt.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], unreadCount = unreadCount.asInstanceOf[js.Any], updatedAt = updatedAt.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
      __obj.asInstanceOf[PusherRoom]
    }
    
    extension [Self <: PusherRoom](x: Self) {
      
      inline def setCreatedAt(value: String): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
      
      inline def setCreatedByUserId(value: String): Self = StObject.set(x, "createdByUserId", value.asInstanceOf[js.Any])
      
      inline def setCustomData(value: Any): Self = StObject.set(x, "customData", value.asInstanceOf[js.Any])
      
      inline def setCustomDataUndefined: Self = StObject.set(x, "customData", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIsPrivate(value: Boolean): Self = StObject.set(x, "isPrivate", value.asInstanceOf[js.Any])
      
      inline def setLastMessageAt(value: String): Self = StObject.set(x, "lastMessageAt", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setUnreadCount(value: Double): Self = StObject.set(x, "unreadCount", value.asInstanceOf[js.Any])
      
      inline def setUpdatedAt(value: String): Self = StObject.set(x, "updatedAt", value.asInstanceOf[js.Any])
      
      inline def setUsers(value: js.Array[PusherUser]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
      
      inline def setUsersVarargs(value: PusherUser*): Self = StObject.set(x, "users", js.Array(value*))
    }
  }
}
