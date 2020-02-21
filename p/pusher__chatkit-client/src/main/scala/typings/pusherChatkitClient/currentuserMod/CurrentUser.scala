package typings.pusherChatkitClient.currentuserMod

import typings.pusherChatkitClient.hooksMod.UserAndRoomParams
import typings.pusherChatkitClient.messageMod.PusherMessage
import typings.pusherChatkitClient.roomMod.PusherReadCursor
import typings.pusherChatkitClient.roomMod.PusherRoom
import typings.pusherChatkitClient.userMod.PusherUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CurrentUser extends js.Object {
  var roomSubscriptions: RoomSubscriptions
  var rooms: js.Array[PusherRoom]
  var users: js.Array[PusherUser]
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
  def sendMultipartMessage(params: SendMultipartMessageParams): js.Promise[Double]
  def sendSimpleMessage(params: SendSimpleMessageParams): js.Promise[Double]
  def setReadCursor(params: SetReadCursorParams): js.Promise[Unit]
  def subscribeToRoomMultipart(params: RoomSubcriptionParams): js.Promise[PusherRoom]
  def updateRoom(params: UpdateRoomParams): js.Promise[PusherRoom]
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
}

