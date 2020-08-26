package typings.pusherChatkitClient.currentuserMod

import typings.pusherChatkitClient.hooksMod.UserAndRoomParams
import typings.pusherChatkitClient.messageMod.PusherMessage
import typings.pusherChatkitClient.roomMod.PusherReadCursor
import typings.pusherChatkitClient.roomMod.PusherRoom
import typings.pusherChatkitClient.userMod.PusherUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CurrentUser extends js.Object {
  var roomSubscriptions: RoomSubscriptions = js.native
  var rooms: js.Array[PusherRoom] = js.native
  var users: js.Array[PusherUser] = js.native
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
  def sendMultipartMessage(params: SendMultipartMessageParams): js.Promise[Double] = js.native
  def sendSimpleMessage(params: SendSimpleMessageParams): js.Promise[Double] = js.native
  def setReadCursor(params: SetReadCursorParams): js.Promise[Unit] = js.native
  def subscribeToRoomMultipart(params: RoomSubcriptionParams): js.Promise[PusherRoom] = js.native
  def updateRoom(params: UpdateRoomParams): js.Promise[PusherRoom] = js.native
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
  implicit class CurrentUserOps[Self <: CurrentUser] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddUserToRoom(value: UserAndRoomParams => js.Promise[Unit]): Self = this.set("addUserToRoom", js.Any.fromFunction1(value))
    @scala.inline
    def setCreateRoom(value: CreateRoomParams => js.Promise[PusherRoom]): Self = this.set("createRoom", js.Any.fromFunction1(value))
    @scala.inline
    def setDeleteRoom(value: RoomIdParams => js.Promise[Unit]): Self = this.set("deleteRoom", js.Any.fromFunction1(value))
    @scala.inline
    def setDisconnect(value: () => js.Promise[Unit]): Self = this.set("disconnect", js.Any.fromFunction0(value))
    @scala.inline
    def setEnablePushNotifications(value: () => js.Promise[Unit]): Self = this.set("enablePushNotifications", js.Any.fromFunction0(value))
    @scala.inline
    def setFetchMultipartMessages(value: FetchMultipartMessagesParams => js.Promise[js.Array[PusherMessage]]): Self = this.set("fetchMultipartMessages", js.Any.fromFunction1(value))
    @scala.inline
    def setGetJoinableRooms(value: () => js.Promise[js.Array[PusherRoom]]): Self = this.set("getJoinableRooms", js.Any.fromFunction0(value))
    @scala.inline
    def setIsTypingIn(value: RoomIdParams => js.Promise[Unit]): Self = this.set("isTypingIn", js.Any.fromFunction1(value))
    @scala.inline
    def setJoinRoom(value: RoomIdParams => js.Promise[PusherRoom]): Self = this.set("joinRoom", js.Any.fromFunction1(value))
    @scala.inline
    def setLeaveRoom(value: RoomIdParams => js.Promise[PusherRoom]): Self = this.set("leaveRoom", js.Any.fromFunction1(value))
    @scala.inline
    def setReadCursor(value: ReadCursorParams => js.Promise[PusherReadCursor]): Self = this.set("readCursor", js.Any.fromFunction1(value))
    @scala.inline
    def setRemoveUserFromRoom(value: UserAndRoomParams => js.Promise[Unit]): Self = this.set("removeUserFromRoom", js.Any.fromFunction1(value))
    @scala.inline
    def setRoomSubscriptions(value: RoomSubscriptions): Self = this.set("roomSubscriptions", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoomsVarargs(value: PusherRoom*): Self = this.set("rooms", js.Array(value :_*))
    @scala.inline
    def setRooms(value: js.Array[PusherRoom]): Self = this.set("rooms", value.asInstanceOf[js.Any])
    @scala.inline
    def setSendMultipartMessage(value: SendMultipartMessageParams => js.Promise[Double]): Self = this.set("sendMultipartMessage", js.Any.fromFunction1(value))
    @scala.inline
    def setSendSimpleMessage(value: SendSimpleMessageParams => js.Promise[Double]): Self = this.set("sendSimpleMessage", js.Any.fromFunction1(value))
    @scala.inline
    def setSetReadCursor(value: SetReadCursorParams => js.Promise[Unit]): Self = this.set("setReadCursor", js.Any.fromFunction1(value))
    @scala.inline
    def setSubscribeToRoomMultipart(value: RoomSubcriptionParams => js.Promise[PusherRoom]): Self = this.set("subscribeToRoomMultipart", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdateRoom(value: UpdateRoomParams => js.Promise[PusherRoom]): Self = this.set("updateRoom", js.Any.fromFunction1(value))
    @scala.inline
    def setUsersVarargs(value: PusherUser*): Self = this.set("users", js.Array(value :_*))
    @scala.inline
    def setUsers(value: js.Array[PusherUser]): Self = this.set("users", value.asInstanceOf[js.Any])
  }
  
}

