package typings.pusherChatkitClient

import typings.pusherChatkitClient.roomMod.PusherReadCursor
import typings.pusherChatkitClient.roomMod.PusherRoom
import typings.pusherChatkitClient.userMod.PusherUser
import typings.pusherChatkitClient.userMod.PusherUserPresence
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hooksMod {
  
  type ReadCursorHook = js.Function1[/* cursor */ PusherReadCursor, Unit]
  
  type RoomHook = js.Function1[/* room */ PusherRoom, Unit]
  
  trait RoomParams extends StObject {
    
    var roomId: String
  }
  object RoomParams {
    
    @scala.inline
    def apply(roomId: String): RoomParams = {
      val __obj = js.Dynamic.literal(roomId = roomId.asInstanceOf[js.Any])
      __obj.asInstanceOf[RoomParams]
    }
    
    @scala.inline
    implicit class RoomParamsMutableBuilder[Self <: RoomParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRoomId(value: String): Self = StObject.set(x, "roomId", value.asInstanceOf[js.Any])
    }
  }
  
  type RoomUserHook = js.Function2[/* room */ PusherRoom, /* user */ PusherUser, Unit]
  
  trait UserAndRoomParams
    extends StObject
       with RoomParams {
    
    var userId: String
  }
  object UserAndRoomParams {
    
    @scala.inline
    def apply(roomId: String, userId: String): UserAndRoomParams = {
      val __obj = js.Dynamic.literal(roomId = roomId.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserAndRoomParams]
    }
    
    @scala.inline
    implicit class UserAndRoomParamsMutableBuilder[Self <: UserAndRoomParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    }
  }
  
  type UserHook = js.Function1[/* room */ PusherUser, Unit]
  
  trait UserParams extends StObject {
    
    var userId: String
  }
  object UserParams {
    
    @scala.inline
    def apply(userId: String): UserParams = {
      val __obj = js.Dynamic.literal(userId = userId.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserParams]
    }
    
    @scala.inline
    implicit class UserParamsMutableBuilder[Self <: UserParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    }
  }
  
  type UserPresenceHook = js.Function2[/* state */ UserPresenceState, /* user */ PusherUser, Unit]
  
  trait UserPresenceState extends StObject {
    
    var current: PusherUserPresence
    
    var previous: PusherUserPresence
  }
  object UserPresenceState {
    
    @scala.inline
    def apply(current: PusherUserPresence, previous: PusherUserPresence): UserPresenceState = {
      val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], previous = previous.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserPresenceState]
    }
    
    @scala.inline
    implicit class UserPresenceStateMutableBuilder[Self <: UserPresenceState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrent(value: PusherUserPresence): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevious(value: PusherUserPresence): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
    }
  }
}
