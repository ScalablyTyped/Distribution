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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object currentuserMod {
  
  @js.native
  trait CreateRoomParams extends StObject {
    
    var addUserIds: js.UndefOr[js.Array[String]] = js.native
    
    var customData: js.UndefOr[js.Any] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var name: String = js.native
    
    var `private`: js.UndefOr[Boolean] = js.native
  }
  object CreateRoomParams {
    
    @scala.inline
    def apply(name: String): CreateRoomParams = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateRoomParams]
    }
    
    @scala.inline
    implicit class CreateRoomParamsMutableBuilder[Self <: CreateRoomParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddUserIds(value: js.Array[String]): Self = StObject.set(x, "addUserIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddUserIdsUndefined: Self = StObject.set(x, "addUserIds", js.undefined)
      
      @scala.inline
      def setAddUserIdsVarargs(value: String*): Self = StObject.set(x, "addUserIds", js.Array(value :_*))
      
      @scala.inline
      def setCustomData(value: js.Any): Self = StObject.set(x, "customData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomDataUndefined: Self = StObject.set(x, "customData", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrivate(value: Boolean): Self = StObject.set(x, "private", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrivateUndefined: Self = StObject.set(x, "private", js.undefined)
    }
  }
  
  @js.native
  trait CurrentUser extends StObject {
    
    def addUserToRoom(params: UserAndRoomParams): js.Promise[Unit] = js.native
    
    def createRoom(params: CreateRoomParams): js.Promise[PusherRoom] = js.native
    
    def deleteRoom(params: RoomIdParams): js.Promise[Unit] = js.native
    
    def disconnect(): js.Promise[Unit] = js.native
    
    def enablePushNotifications(): js.Promise[Unit] = js.native
    
    def fetchMultipartMessages(params: FetchMultipartMessagesParams): js.Promise[js.Array[PusherMessage]] = js.native
    
    def getJoinableRooms(): js.Promise[js.Array[PusherRoom]] = js.native
    
    def isTypingIn(params: RoomIdParams): js.Promise[Unit] = js.native
    
    def joinRoom(params: RoomIdParams): js.Promise[PusherRoom] = js.native
    
    def leaveRoom(params: RoomIdParams): js.Promise[PusherRoom] = js.native
    
    def readCursor(params: ReadCursorParams): js.Promise[PusherReadCursor] = js.native
    
    def removeUserFromRoom(params: UserAndRoomParams): js.Promise[Unit] = js.native
    
    var roomSubscriptions: RoomSubscriptions = js.native
    
    var rooms: js.Array[PusherRoom] = js.native
    
    def sendMultipartMessage(params: SendMultipartMessageParams): js.Promise[Double] = js.native
    
    def sendSimpleMessage(params: SendSimpleMessageParams): js.Promise[Double] = js.native
    
    def setReadCursor(params: SetReadCursorParams): js.Promise[Unit] = js.native
    
    def subscribeToRoomMultipart(params: RoomSubcriptionParams): js.Promise[PusherRoom] = js.native
    
    def updateRoom(params: UpdateRoomParams): js.Promise[PusherRoom] = js.native
    
    var users: js.Array[PusherUser] = js.native
  }
  object CurrentUser {
    
    @scala.inline
    def apply(
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
    implicit class CurrentUserMutableBuilder[Self <: CurrentUser] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddUserToRoom(value: UserAndRoomParams => js.Promise[Unit]): Self = StObject.set(x, "addUserToRoom", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCreateRoom(value: CreateRoomParams => js.Promise[PusherRoom]): Self = StObject.set(x, "createRoom", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDeleteRoom(value: RoomIdParams => js.Promise[Unit]): Self = StObject.set(x, "deleteRoom", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDisconnect(value: () => js.Promise[Unit]): Self = StObject.set(x, "disconnect", js.Any.fromFunction0(value))
      
      @scala.inline
      def setEnablePushNotifications(value: () => js.Promise[Unit]): Self = StObject.set(x, "enablePushNotifications", js.Any.fromFunction0(value))
      
      @scala.inline
      def setFetchMultipartMessages(value: FetchMultipartMessagesParams => js.Promise[js.Array[PusherMessage]]): Self = StObject.set(x, "fetchMultipartMessages", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetJoinableRooms(value: () => js.Promise[js.Array[PusherRoom]]): Self = StObject.set(x, "getJoinableRooms", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsTypingIn(value: RoomIdParams => js.Promise[Unit]): Self = StObject.set(x, "isTypingIn", js.Any.fromFunction1(value))
      
      @scala.inline
      def setJoinRoom(value: RoomIdParams => js.Promise[PusherRoom]): Self = StObject.set(x, "joinRoom", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLeaveRoom(value: RoomIdParams => js.Promise[PusherRoom]): Self = StObject.set(x, "leaveRoom", js.Any.fromFunction1(value))
      
      @scala.inline
      def setReadCursor(value: ReadCursorParams => js.Promise[PusherReadCursor]): Self = StObject.set(x, "readCursor", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemoveUserFromRoom(value: UserAndRoomParams => js.Promise[Unit]): Self = StObject.set(x, "removeUserFromRoom", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRoomSubscriptions(value: RoomSubscriptions): Self = StObject.set(x, "roomSubscriptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRooms(value: js.Array[PusherRoom]): Self = StObject.set(x, "rooms", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoomsVarargs(value: PusherRoom*): Self = StObject.set(x, "rooms", js.Array(value :_*))
      
      @scala.inline
      def setSendMultipartMessage(value: SendMultipartMessageParams => js.Promise[Double]): Self = StObject.set(x, "sendMultipartMessage", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSendSimpleMessage(value: SendSimpleMessageParams => js.Promise[Double]): Self = StObject.set(x, "sendSimpleMessage", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetReadCursor(value: SetReadCursorParams => js.Promise[Unit]): Self = StObject.set(x, "setReadCursor", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSubscribeToRoomMultipart(value: RoomSubcriptionParams => js.Promise[PusherRoom]): Self = StObject.set(x, "subscribeToRoomMultipart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUpdateRoom(value: UpdateRoomParams => js.Promise[PusherRoom]): Self = StObject.set(x, "updateRoom", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUsers(value: js.Array[PusherUser]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsersVarargs(value: PusherUser*): Self = StObject.set(x, "users", js.Array(value :_*))
    }
  }
  
  @js.native
  trait FetchMultipartMessagesParams extends StObject {
    
    var direction: js.UndefOr[older | newer] = js.native
    
    var initialId: js.UndefOr[Double] = js.native
    
    var limit: js.UndefOr[Double] = js.native
    
    var roomId: String = js.native
  }
  object FetchMultipartMessagesParams {
    
    @scala.inline
    def apply(roomId: String): FetchMultipartMessagesParams = {
      val __obj = js.Dynamic.literal(roomId = roomId.asInstanceOf[js.Any])
      __obj.asInstanceOf[FetchMultipartMessagesParams]
    }
    
    @scala.inline
    implicit class FetchMultipartMessagesParamsMutableBuilder[Self <: FetchMultipartMessagesParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDirection(value: older | newer): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setInitialId(value: Double): Self = StObject.set(x, "initialId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialIdUndefined: Self = StObject.set(x, "initialId", js.undefined)
      
      @scala.inline
      def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      @scala.inline
      def setRoomId(value: String): Self = StObject.set(x, "roomId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ReadCursorParams extends StObject {
    
    var roomId: String = js.native
    
    var userId: String = js.native
  }
  object ReadCursorParams {
    
    @scala.inline
    def apply(roomId: String, userId: String): ReadCursorParams = {
      val __obj = js.Dynamic.literal(roomId = roomId.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadCursorParams]
    }
    
    @scala.inline
    implicit class ReadCursorParamsMutableBuilder[Self <: ReadCursorParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRoomId(value: String): Self = StObject.set(x, "roomId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RoomIdParams extends StObject {
    
    var roomId: String = js.native
  }
  object RoomIdParams {
    
    @scala.inline
    def apply(roomId: String): RoomIdParams = {
      val __obj = js.Dynamic.literal(roomId = roomId.asInstanceOf[js.Any])
      __obj.asInstanceOf[RoomIdParams]
    }
    
    @scala.inline
    implicit class RoomIdParamsMutableBuilder[Self <: RoomIdParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRoomId(value: String): Self = StObject.set(x, "roomId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RoomSubcriptionParams extends StObject {
    
    var disableCursors: js.UndefOr[Boolean] = js.native
    
    var hooks: js.UndefOr[RoomSubscriptionHooks] = js.native
    
    var messageLimit: js.UndefOr[Double] = js.native
    
    var roomId: String = js.native
  }
  object RoomSubcriptionParams {
    
    @scala.inline
    def apply(roomId: String): RoomSubcriptionParams = {
      val __obj = js.Dynamic.literal(roomId = roomId.asInstanceOf[js.Any])
      __obj.asInstanceOf[RoomSubcriptionParams]
    }
    
    @scala.inline
    implicit class RoomSubcriptionParamsMutableBuilder[Self <: RoomSubcriptionParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisableCursors(value: Boolean): Self = StObject.set(x, "disableCursors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableCursorsUndefined: Self = StObject.set(x, "disableCursors", js.undefined)
      
      @scala.inline
      def setHooks(value: RoomSubscriptionHooks): Self = StObject.set(x, "hooks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHooksUndefined: Self = StObject.set(x, "hooks", js.undefined)
      
      @scala.inline
      def setMessageLimit(value: Double): Self = StObject.set(x, "messageLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageLimitUndefined: Self = StObject.set(x, "messageLimit", js.undefined)
      
      @scala.inline
      def setRoomId(value: String): Self = StObject.set(x, "roomId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RoomSubscription extends StObject {
    
    def cancel(): js.Promise[Unit] = js.native
    
    var disableCursors: Boolean = js.native
    
    var hooks: js.UndefOr[RoomSubscriptionHooks] = js.native
    
    var messageLimit: Double = js.native
    
    var roomId: String = js.native
  }
  object RoomSubscription {
    
    @scala.inline
    def apply(cancel: () => js.Promise[Unit], disableCursors: Boolean, messageLimit: Double, roomId: String): RoomSubscription = {
      val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), disableCursors = disableCursors.asInstanceOf[js.Any], messageLimit = messageLimit.asInstanceOf[js.Any], roomId = roomId.asInstanceOf[js.Any])
      __obj.asInstanceOf[RoomSubscription]
    }
    
    @scala.inline
    implicit class RoomSubscriptionMutableBuilder[Self <: RoomSubscription] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: () => js.Promise[Unit]): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDisableCursors(value: Boolean): Self = StObject.set(x, "disableCursors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHooks(value: RoomSubscriptionHooks): Self = StObject.set(x, "hooks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHooksUndefined: Self = StObject.set(x, "hooks", js.undefined)
      
      @scala.inline
      def setMessageLimit(value: Double): Self = StObject.set(x, "messageLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoomId(value: String): Self = StObject.set(x, "roomId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RoomSubscriptionHooks extends StObject {
    
    var onMessage: js.UndefOr[js.Function1[/* message */ PusherMessage, Unit]] = js.native
    
    var onMessageDeleted: js.UndefOr[js.Function1[/* messageId */ Double, Unit]] = js.native
    
    var onNewReadCursor: js.UndefOr[ReadCursorHook] = js.native
    
    var onPresenceChanged: js.UndefOr[UserPresenceHook] = js.native
    
    var onUserJoined: js.UndefOr[UserHook] = js.native
    
    var onUserLeft: js.UndefOr[UserHook] = js.native
    
    var onUserStartedTyping: js.UndefOr[UserHook] = js.native
    
    var onUserStoppedTyping: js.UndefOr[UserHook] = js.native
  }
  object RoomSubscriptionHooks {
    
    @scala.inline
    def apply(): RoomSubscriptionHooks = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RoomSubscriptionHooks]
    }
    
    @scala.inline
    implicit class RoomSubscriptionHooksMutableBuilder[Self <: RoomSubscriptionHooks] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnMessage(value: /* message */ PusherMessage => Unit): Self = StObject.set(x, "onMessage", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMessageDeleted(value: /* messageId */ Double => Unit): Self = StObject.set(x, "onMessageDeleted", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMessageDeletedUndefined: Self = StObject.set(x, "onMessageDeleted", js.undefined)
      
      @scala.inline
      def setOnMessageUndefined: Self = StObject.set(x, "onMessage", js.undefined)
      
      @scala.inline
      def setOnNewReadCursor(value: /* cursor */ PusherReadCursor => Unit): Self = StObject.set(x, "onNewReadCursor", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnNewReadCursorUndefined: Self = StObject.set(x, "onNewReadCursor", js.undefined)
      
      @scala.inline
      def setOnPresenceChanged(value: (/* state */ UserPresenceState, /* user */ PusherUser) => Unit): Self = StObject.set(x, "onPresenceChanged", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnPresenceChangedUndefined: Self = StObject.set(x, "onPresenceChanged", js.undefined)
      
      @scala.inline
      def setOnUserJoined(value: /* room */ PusherUser => Unit): Self = StObject.set(x, "onUserJoined", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnUserJoinedUndefined: Self = StObject.set(x, "onUserJoined", js.undefined)
      
      @scala.inline
      def setOnUserLeft(value: /* room */ PusherUser => Unit): Self = StObject.set(x, "onUserLeft", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnUserLeftUndefined: Self = StObject.set(x, "onUserLeft", js.undefined)
      
      @scala.inline
      def setOnUserStartedTyping(value: /* room */ PusherUser => Unit): Self = StObject.set(x, "onUserStartedTyping", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnUserStartedTypingUndefined: Self = StObject.set(x, "onUserStartedTyping", js.undefined)
      
      @scala.inline
      def setOnUserStoppedTyping(value: /* room */ PusherUser => Unit): Self = StObject.set(x, "onUserStoppedTyping", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnUserStoppedTypingUndefined: Self = StObject.set(x, "onUserStoppedTyping", js.undefined)
    }
  }
  
  type RoomSubscriptions = StringDictionary[RoomSubscription]
  
  @js.native
  trait SendMultipartMessageParams extends StObject {
    
    var parts: js.Array[SendMessagePayload] = js.native
    
    var roomId: String = js.native
  }
  object SendMultipartMessageParams {
    
    @scala.inline
    def apply(parts: js.Array[SendMessagePayload], roomId: String): SendMultipartMessageParams = {
      val __obj = js.Dynamic.literal(parts = parts.asInstanceOf[js.Any], roomId = roomId.asInstanceOf[js.Any])
      __obj.asInstanceOf[SendMultipartMessageParams]
    }
    
    @scala.inline
    implicit class SendMultipartMessageParamsMutableBuilder[Self <: SendMultipartMessageParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setParts(value: js.Array[SendMessagePayload]): Self = StObject.set(x, "parts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPartsVarargs(value: SendMessagePayload*): Self = StObject.set(x, "parts", js.Array(value :_*))
      
      @scala.inline
      def setRoomId(value: String): Self = StObject.set(x, "roomId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SendSimpleMessageParams extends StObject {
    
    var roomId: String = js.native
    
    var text: String = js.native
  }
  object SendSimpleMessageParams {
    
    @scala.inline
    def apply(roomId: String, text: String): SendSimpleMessageParams = {
      val __obj = js.Dynamic.literal(roomId = roomId.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[SendSimpleMessageParams]
    }
    
    @scala.inline
    implicit class SendSimpleMessageParamsMutableBuilder[Self <: SendSimpleMessageParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRoomId(value: String): Self = StObject.set(x, "roomId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SetReadCursorParams extends StObject {
    
    var position: Double = js.native
    
    var roomId: String = js.native
  }
  object SetReadCursorParams {
    
    @scala.inline
    def apply(position: Double, roomId: String): SetReadCursorParams = {
      val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], roomId = roomId.asInstanceOf[js.Any])
      __obj.asInstanceOf[SetReadCursorParams]
    }
    
    @scala.inline
    implicit class SetReadCursorParamsMutableBuilder[Self <: SetReadCursorParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoomId(value: String): Self = StObject.set(x, "roomId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UpdateRoomParams extends StObject {
    
    var customData: js.UndefOr[js.Any] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var `private`: js.UndefOr[Boolean] = js.native
    
    var roomId: String = js.native
  }
  object UpdateRoomParams {
    
    @scala.inline
    def apply(roomId: String): UpdateRoomParams = {
      val __obj = js.Dynamic.literal(roomId = roomId.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdateRoomParams]
    }
    
    @scala.inline
    implicit class UpdateRoomParamsMutableBuilder[Self <: UpdateRoomParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCustomData(value: js.Any): Self = StObject.set(x, "customData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomDataUndefined: Self = StObject.set(x, "customData", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPrivate(value: Boolean): Self = StObject.set(x, "private", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrivateUndefined: Self = StObject.set(x, "private", js.undefined)
      
      @scala.inline
      def setRoomId(value: String): Self = StObject.set(x, "roomId", value.asInstanceOf[js.Any])
    }
  }
}
