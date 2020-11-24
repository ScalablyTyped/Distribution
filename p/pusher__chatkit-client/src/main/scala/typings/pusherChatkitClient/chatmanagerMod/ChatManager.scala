package typings.pusherChatkitClient.chatmanagerMod

import org.scalablytyped.runtime.TopLevel
import typings.pusherChatkitClient.currentuserMod.CurrentUser
import typings.pusherChatkitClient.hooksMod.RoomParams
import typings.pusherChatkitClient.hooksMod.UserParams
import typings.pusherChatkitClient.roomMod.PusherRoom
import typings.pusherChatkitClient.userMod.PusherUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChatManager extends js.Object {
  
  def connect(): js.Promise[CurrentUser] = js.native
  def connect(hooks: GlobalHooks): js.Promise[CurrentUser] = js.native
  
  def disablePushNotifications(): js.Promise[Unit] = js.native
  
  def getRoom(params: RoomParams): js.Promise[PusherRoom] = js.native
  
  def getUser(params: UserParams): js.Promise[PusherUser] = js.native
}
@JSImport("@pusher/chatkit-client/chatmanager", "ChatManager")
@js.native
object ChatManager extends TopLevel[ChatManagerConstructor]
