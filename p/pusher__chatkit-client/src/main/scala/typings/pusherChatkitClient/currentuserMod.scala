package typings.pusherChatkitClient

import org.scalablytyped.runtime.StringDictionary
import typings.pusherChatkitClient.hooksMod.ReadCursorHook
import typings.pusherChatkitClient.hooksMod.UserAndRoomParams
import typings.pusherChatkitClient.hooksMod.UserHook
import typings.pusherChatkitClient.hooksMod.UserPresenceHook
import typings.pusherChatkitClient.hooksMod.UserPresenceState
import typings.pusherChatkitClient.messageMod.PusherMessage
import typings.pusherChatkitClient.messageMod.SendMessagePayload
import typings.pusherChatkitClient.pusherChatkitClientStrings.newer
import typings.pusherChatkitClient.pusherChatkitClientStrings.older
import typings.pusherChatkitClient.roomMod.PusherReadCursor
import typings.pusherChatkitClient.roomMod.PusherRoom
import typings.pusherChatkitClient.userMod.PusherUser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object currentuserMod {
  
  trait CreateRoomParams extends StObject {
    
    var addUserIds: js.UndefOr[js.Array[String]] = js.undefined
    
    var customData: js.UndefOr[Any] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var name: String
    
    var `private`: js.UndefOr[Boolean] = js.undefined
  }
  object CreateRoomParams {
    
    inline def apply(name: String): CreateRoomParams = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateRoomParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CreateRoomParams] (val x: Self) extends AnyVal {
      
      inline def setAddUserIds(value: js.Array[String]): Self = StObject.set(x, "addUserIds", value.asInstanceOf[js.Any])
      
      inline def setAddUserIdsUndefined: Self = StObject.set(x, "addUserIds", js.undefined)
      
      inline def setAddUserIdsVarargs(value: String*): Self = StObject.set(x, "addUserIds", js.Array(value*))
      
      inline def setCustomData(value: Any): Self = StObject.set(x, "customData", value.asInstanceOf[js.Any])
      
      inline def setCustomDataUndefined: Self = StObject.set(x, "customData", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPrivate(value: Boolean): Self = StObject.set(x, "private", value.asInstanceOf[js.Any])
      
      inline def setPrivateUndefined: Self = StObject.set(x, "private", js.undefined)
    }
  }
  
  trait CurrentUser extends StObject {
    
    def addUserToRoom(params: UserAndRoomParams): js.Promise[Unit]
    
    def createRoom(params: CreateRoomParams): js.Promise[PusherRoom]
    
    def deleteRoom(params: RoomIdParams): js.Promise[Unit]
    
    def disconnect(): js.Promise[Unit]
    
    def enablePushNotifications(): js.Promise[Unit]
    
    def fetchMultipartMessages(params: FetchMultipartMessagesParams): js.Promise[js.Array[PusherMessage]]
    
    def getJoinableRooms(): js.Promise[js.Array[PusherRoom]]
    
    def isTypingIn(params: RoomIdParams): js.Promise[Unit]
    
    def joinRoom(params: RoomIdParams): js.Promise[PusherRoom]
    
    def leaveRoom(params: RoomIdParams): js.Promise[PusherRoom]
    
    def readCursor(params: ReadCursorParams): js.Promise[PusherReadCursor]
    
    def removeUserFromRoom(params: UserAndRoomParams): js.Promise[Unit]
    
    var roomSubscriptions: RoomSubscriptions
    
    var rooms: js.Array[PusherRoom]
    
    def sendMultipartMessage(params: SendMultipartMessageParams): js.Promise[Double]
    
    def sendSimpleMessage(params: SendSimpleMessageParams): js.Promise[Double]
    
    def setReadCursor(params: SetReadCursorParams): js.Promise[Unit]
    
    def subscribeToRoomMultipart(params: RoomSubcriptionParams): js.Promise[PusherRoom]
    
    def updateRoom(params: UpdateRoomParams): js.Promise[PusherRoom]
    
    var users: js.Array[PusherUser]
  }
  object CurrentUser {
    
    inline def apply(
      addUserToRoom: UserAndRoomParams => js.Promise[Unit],
      createRoom: CreateRoomParams => js.Promise[PusherRoom],
      deleteRoom: RoomIdParams => js.Promise[Unit],
      disconnect: () => js.Promise[Unit],
      enablePushNotifications: () => js.Promise[Unit],
      fetchMultipartMessages: FetchMultipartMessagesParams => js.Promise[js.Array[PusherMessage]],
      getJoinableRooms: () => js.Promise[js.Array[PusherRoom]],
      isTypingIn: RoomIdParams => js.Promise[Unit],
      joinRoom: RoomIdParams => js.Promise[PusherRoom],
      leaveRoom: RoomIdParams => js.Promise[PusherRoom],
      readCursor: ReadCursorParams => js.Promise[PusherReadCursor],
      removeUserFromRoom: UserAndRoomParams => js.Promise[Unit],
      roomSubscriptions: RoomSubscriptions,
      rooms: js.Array[PusherRoom],
      sendMultipartMessage: SendMultipartMessageParams => js.Promise[Double],
      sendSimpleMessage: SendSimpleMessageParams => js.Promise[Double],
      setReadCursor: SetReadCursorParams => js.Promise[Unit],
      subscribeToRoomMultipart: RoomSubcriptionParams => js.Promise[PusherRoom],
      updateRoom: UpdateRoomParams => js.Promise[PusherRoom],
      users: js.Array[PusherUser]
    ): CurrentUser = {
      val __obj = js.Dynamic.literal(addUserToRoom = js.Any.fromFunction1(addUserToRoom), createRoom = js.Any.fromFunction1(createRoom), deleteRoom = js.Any.fromFunction1(deleteRoom), disconnect = js.Any.fromFunction0(disconnect), enablePushNotifications = js.Any.fromFunction0(enablePushNotifications), fetchMultipartMessages = js.Any.fromFunction1(fetchMultipartMessages), getJoinableRooms = js.Any.fromFunction0(getJoinableRooms), isTypingIn = js.Any.fromFunction1(isTypingIn), joinRoom = js.Any.fromFunction1(joinRoom), leaveRoom = js.Any.fromFunction1(leaveRoom), readCursor = js.Any.fromFunction1(readCursor), removeUserFromRoom = js.Any.fromFunction1(removeUserFromRoom), roomSubscriptions = roomSubscriptions.asInstanceOf[js.Any], rooms = rooms.asInstanceOf[js.Any], sendMultipartMessage = js.Any.fromFunction1(sendMultipartMessage), sendSimpleMessage = js.Any.fromFunction1(sendSimpleMessage), setReadCursor = js.Any.fromFunction1(setReadCursor), subscribeToRoomMultipart = js.Any.fromFunction1(subscribeToRoomMultipart), updateRoom = js.Any.fromFunction1(updateRoom), users = users.asInstanceOf[js.Any])
      __obj.asInstanceOf[CurrentUser]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CurrentUser] (val x: Self) extends AnyVal {
      
      inline def setAddUserToRoom(value: UserAndRoomParams => js.Promise[Unit]): Self = StObject.set(x, "addUserToRoom", js.Any.fromFunction1(value))
      
      inline def setCreateRoom(value: CreateRoomParams => js.Promise[PusherRoom]): Self = StObject.set(x, "createRoom", js.Any.fromFunction1(value))
      
      inline def setDeleteRoom(value: RoomIdParams => js.Promise[Unit]): Self = StObject.set(x, "deleteRoom", js.Any.fromFunction1(value))
      
      inline def setDisconnect(value: () => js.Promise[Unit]): Self = StObject.set(x, "disconnect", js.Any.fromFunction0(value))
      
      inline def setEnablePushNotifications(value: () => js.Promise[Unit]): Self = StObject.set(x, "enablePushNotifications", js.Any.fromFunction0(value))
      
      inline def setFetchMultipartMessages(value: FetchMultipartMessagesParams => js.Promise[js.Array[PusherMessage]]): Self = StObject.set(x, "fetchMultipartMessages", js.Any.fromFunction1(value))
      
      inline def setGetJoinableRooms(value: () => js.Promise[js.Array[PusherRoom]]): Self = StObject.set(x, "getJoinableRooms", js.Any.fromFunction0(value))
      
      inline def setIsTypingIn(value: RoomIdParams => js.Promise[Unit]): Self = StObject.set(x, "isTypingIn", js.Any.fromFunction1(value))
      
      inline def setJoinRoom(value: RoomIdParams => js.Promise[PusherRoom]): Self = StObject.set(x, "joinRoom", js.Any.fromFunction1(value))
      
      inline def setLeaveRoom(value: RoomIdParams => js.Promise[PusherRoom]): Self = StObject.set(x, "leaveRoom", js.Any.fromFunction1(value))
      
      inline def setReadCursor(value: ReadCursorParams => js.Promise[PusherReadCursor]): Self = StObject.set(x, "readCursor", js.Any.fromFunction1(value))
      
      inline def setRemoveUserFromRoom(value: UserAndRoomParams => js.Promise[Unit]): Self = StObject.set(x, "removeUserFromRoom", js.Any.fromFunction1(value))
      
      inline def setRoomSubscriptions(value: RoomSubscriptions): Self = StObject.set(x, "roomSubscriptions", value.asInstanceOf[js.Any])
      
      inline def setRooms(value: js.Array[PusherRoom]): Self = StObject.set(x, "rooms", value.asInstanceOf[js.Any])
      
      inline def setRoomsVarargs(value: PusherRoom*): Self = StObject.set(x, "rooms", js.Array(value*))
      
      inline def setSendMultipartMessage(value: SendMultipartMessageParams => js.Promise[Double]): Self = StObject.set(x, "sendMultipartMessage", js.Any.fromFunction1(value))
      
      inline def setSendSimpleMessage(value: SendSimpleMessageParams => js.Promise[Double]): Self = StObject.set(x, "sendSimpleMessage", js.Any.fromFunction1(value))
      
      inline def setSetReadCursor(value: SetReadCursorParams => js.Promise[Unit]): Self = StObject.set(x, "setReadCursor", js.Any.fromFunction1(value))
      
      inline def setSubscribeToRoomMultipart(value: RoomSubcriptionParams => js.Promise[PusherRoom]): Self = StObject.set(x, "subscribeToRoomMultipart", js.Any.fromFunction1(value))
      
      inline def setUpdateRoom(value: UpdateRoomParams => js.Promise[PusherRoom]): Self = StObject.set(x, "updateRoom", js.Any.fromFunction1(value))
      
      inline def setUsers(value: js.Array[PusherUser]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
      
      inline def setUsersVarargs(value: PusherUser*): Self = StObject.set(x, "users", js.Array(value*))
    }
  }
  
  trait FetchMultipartMessagesParams extends StObject {
    
    var direction: js.UndefOr[older | newer] = js.undefined
    
    var initialId: js.UndefOr[Double] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var roomId: String
  }
  object FetchMultipartMessagesParams {
    
    inline def apply(roomId: String): FetchMultipartMessagesParams = {
      val __obj = js.Dynamic.literal(roomId = roomId.asInstanceOf[js.Any])
      __obj.asInstanceOf[FetchMultipartMessagesParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FetchMultipartMessagesParams] (val x: Self) extends AnyVal {
      
      inline def setDirection(value: older | newer): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setInitialId(value: Double): Self = StObject.set(x, "initialId", value.asInstanceOf[js.Any])
      
      inline def setInitialIdUndefined: Self = StObject.set(x, "initialId", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setRoomId(value: String): Self = StObject.set(x, "roomId", value.asInstanceOf[js.Any])
    }
  }
  
  trait ReadCursorParams extends StObject {
    
    var roomId: String
    
    var userId: String
  }
  object ReadCursorParams {
    
    inline def apply(roomId: String, userId: String): ReadCursorParams = {
      val __obj = js.Dynamic.literal(roomId = roomId.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadCursorParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReadCursorParams] (val x: Self) extends AnyVal {
      
      inline def setRoomId(value: String): Self = StObject.set(x, "roomId", value.asInstanceOf[js.Any])
      
      inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    }
  }
  
  trait RoomIdParams extends StObject {
    
    var roomId: String
  }
  object RoomIdParams {
    
    inline def apply(roomId: String): RoomIdParams = {
      val __obj = js.Dynamic.literal(roomId = roomId.asInstanceOf[js.Any])
      __obj.asInstanceOf[RoomIdParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RoomIdParams] (val x: Self) extends AnyVal {
      
      inline def setRoomId(value: String): Self = StObject.set(x, "roomId", value.asInstanceOf[js.Any])
    }
  }
  
  trait RoomSubcriptionParams extends StObject {
    
    var disableCursors: js.UndefOr[Boolean] = js.undefined
    
    var hooks: js.UndefOr[RoomSubscriptionHooks] = js.undefined
    
    var messageLimit: js.UndefOr[Double] = js.undefined
    
    var roomId: String
  }
  object RoomSubcriptionParams {
    
    inline def apply(roomId: String): RoomSubcriptionParams = {
      val __obj = js.Dynamic.literal(roomId = roomId.asInstanceOf[js.Any])
      __obj.asInstanceOf[RoomSubcriptionParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RoomSubcriptionParams] (val x: Self) extends AnyVal {
      
      inline def setDisableCursors(value: Boolean): Self = StObject.set(x, "disableCursors", value.asInstanceOf[js.Any])
      
      inline def setDisableCursorsUndefined: Self = StObject.set(x, "disableCursors", js.undefined)
      
      inline def setHooks(value: RoomSubscriptionHooks): Self = StObject.set(x, "hooks", value.asInstanceOf[js.Any])
      
      inline def setHooksUndefined: Self = StObject.set(x, "hooks", js.undefined)
      
      inline def setMessageLimit(value: Double): Self = StObject.set(x, "messageLimit", value.asInstanceOf[js.Any])
      
      inline def setMessageLimitUndefined: Self = StObject.set(x, "messageLimit", js.undefined)
      
      inline def setRoomId(value: String): Self = StObject.set(x, "roomId", value.asInstanceOf[js.Any])
    }
  }
  
  trait RoomSubscription extends StObject {
    
    def cancel(): js.Promise[Unit]
    
    var disableCursors: Boolean
    
    var hooks: js.UndefOr[RoomSubscriptionHooks] = js.undefined
    
    var messageLimit: Double
    
    var roomId: String
  }
  object RoomSubscription {
    
    inline def apply(cancel: () => js.Promise[Unit], disableCursors: Boolean, messageLimit: Double, roomId: String): RoomSubscription = {
      val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), disableCursors = disableCursors.asInstanceOf[js.Any], messageLimit = messageLimit.asInstanceOf[js.Any], roomId = roomId.asInstanceOf[js.Any])
      __obj.asInstanceOf[RoomSubscription]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RoomSubscription] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: () => js.Promise[Unit]): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
      
      inline def setDisableCursors(value: Boolean): Self = StObject.set(x, "disableCursors", value.asInstanceOf[js.Any])
      
      inline def setHooks(value: RoomSubscriptionHooks): Self = StObject.set(x, "hooks", value.asInstanceOf[js.Any])
      
      inline def setHooksUndefined: Self = StObject.set(x, "hooks", js.undefined)
      
      inline def setMessageLimit(value: Double): Self = StObject.set(x, "messageLimit", value.asInstanceOf[js.Any])
      
      inline def setRoomId(value: String): Self = StObject.set(x, "roomId", value.asInstanceOf[js.Any])
    }
  }
  
  trait RoomSubscriptionHooks extends StObject {
    
    var onMessage: js.UndefOr[js.Function1[/* message */ PusherMessage, Unit]] = js.undefined
    
    var onMessageDeleted: js.UndefOr[js.Function1[/* messageId */ Double, Unit]] = js.undefined
    
    var onNewReadCursor: js.UndefOr[ReadCursorHook] = js.undefined
    
    var onPresenceChanged: js.UndefOr[UserPresenceHook] = js.undefined
    
    var onUserJoined: js.UndefOr[UserHook] = js.undefined
    
    var onUserLeft: js.UndefOr[UserHook] = js.undefined
    
    var onUserStartedTyping: js.UndefOr[UserHook] = js.undefined
    
    var onUserStoppedTyping: js.UndefOr[UserHook] = js.undefined
  }
  object RoomSubscriptionHooks {
    
    inline def apply(): RoomSubscriptionHooks = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RoomSubscriptionHooks]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RoomSubscriptionHooks] (val x: Self) extends AnyVal {
      
      inline def setOnMessage(value: /* message */ PusherMessage => Unit): Self = StObject.set(x, "onMessage", js.Any.fromFunction1(value))
      
      inline def setOnMessageDeleted(value: /* messageId */ Double => Unit): Self = StObject.set(x, "onMessageDeleted", js.Any.fromFunction1(value))
      
      inline def setOnMessageDeletedUndefined: Self = StObject.set(x, "onMessageDeleted", js.undefined)
      
      inline def setOnMessageUndefined: Self = StObject.set(x, "onMessage", js.undefined)
      
      inline def setOnNewReadCursor(value: /* cursor */ PusherReadCursor => Unit): Self = StObject.set(x, "onNewReadCursor", js.Any.fromFunction1(value))
      
      inline def setOnNewReadCursorUndefined: Self = StObject.set(x, "onNewReadCursor", js.undefined)
      
      inline def setOnPresenceChanged(value: (/* state */ UserPresenceState, /* user */ PusherUser) => Unit): Self = StObject.set(x, "onPresenceChanged", js.Any.fromFunction2(value))
      
      inline def setOnPresenceChangedUndefined: Self = StObject.set(x, "onPresenceChanged", js.undefined)
      
      inline def setOnUserJoined(value: /* room */ PusherUser => Unit): Self = StObject.set(x, "onUserJoined", js.Any.fromFunction1(value))
      
      inline def setOnUserJoinedUndefined: Self = StObject.set(x, "onUserJoined", js.undefined)
      
      inline def setOnUserLeft(value: /* room */ PusherUser => Unit): Self = StObject.set(x, "onUserLeft", js.Any.fromFunction1(value))
      
      inline def setOnUserLeftUndefined: Self = StObject.set(x, "onUserLeft", js.undefined)
      
      inline def setOnUserStartedTyping(value: /* room */ PusherUser => Unit): Self = StObject.set(x, "onUserStartedTyping", js.Any.fromFunction1(value))
      
      inline def setOnUserStartedTypingUndefined: Self = StObject.set(x, "onUserStartedTyping", js.undefined)
      
      inline def setOnUserStoppedTyping(value: /* room */ PusherUser => Unit): Self = StObject.set(x, "onUserStoppedTyping", js.Any.fromFunction1(value))
      
      inline def setOnUserStoppedTypingUndefined: Self = StObject.set(x, "onUserStoppedTyping", js.undefined)
    }
  }
  
  type RoomSubscriptions = StringDictionary[RoomSubscription]
  
  trait SendMultipartMessageParams extends StObject {
    
    var parts: js.Array[SendMessagePayload]
    
    var roomId: String
  }
  object SendMultipartMessageParams {
    
    inline def apply(parts: js.Array[SendMessagePayload], roomId: String): SendMultipartMessageParams = {
      val __obj = js.Dynamic.literal(parts = parts.asInstanceOf[js.Any], roomId = roomId.asInstanceOf[js.Any])
      __obj.asInstanceOf[SendMultipartMessageParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SendMultipartMessageParams] (val x: Self) extends AnyVal {
      
      inline def setParts(value: js.Array[SendMessagePayload]): Self = StObject.set(x, "parts", value.asInstanceOf[js.Any])
      
      inline def setPartsVarargs(value: SendMessagePayload*): Self = StObject.set(x, "parts", js.Array(value*))
      
      inline def setRoomId(value: String): Self = StObject.set(x, "roomId", value.asInstanceOf[js.Any])
    }
  }
  
  trait SendSimpleMessageParams extends StObject {
    
    var roomId: String
    
    var text: String
  }
  object SendSimpleMessageParams {
    
    inline def apply(roomId: String, text: String): SendSimpleMessageParams = {
      val __obj = js.Dynamic.literal(roomId = roomId.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[SendSimpleMessageParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SendSimpleMessageParams] (val x: Self) extends AnyVal {
      
      inline def setRoomId(value: String): Self = StObject.set(x, "roomId", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  trait SetReadCursorParams extends StObject {
    
    var position: Double
    
    var roomId: String
  }
  object SetReadCursorParams {
    
    inline def apply(position: Double, roomId: String): SetReadCursorParams = {
      val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], roomId = roomId.asInstanceOf[js.Any])
      __obj.asInstanceOf[SetReadCursorParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SetReadCursorParams] (val x: Self) extends AnyVal {
      
      inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setRoomId(value: String): Self = StObject.set(x, "roomId", value.asInstanceOf[js.Any])
    }
  }
  
  trait UpdateRoomParams extends StObject {
    
    var customData: js.UndefOr[Any] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var `private`: js.UndefOr[Boolean] = js.undefined
    
    var roomId: String
  }
  object UpdateRoomParams {
    
    inline def apply(roomId: String): UpdateRoomParams = {
      val __obj = js.Dynamic.literal(roomId = roomId.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdateRoomParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UpdateRoomParams] (val x: Self) extends AnyVal {
      
      inline def setCustomData(value: Any): Self = StObject.set(x, "customData", value.asInstanceOf[js.Any])
      
      inline def setCustomDataUndefined: Self = StObject.set(x, "customData", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPrivate(value: Boolean): Self = StObject.set(x, "private", value.asInstanceOf[js.Any])
      
      inline def setPrivateUndefined: Self = StObject.set(x, "private", js.undefined)
      
      inline def setRoomId(value: String): Self = StObject.set(x, "roomId", value.asInstanceOf[js.Any])
    }
  }
}
