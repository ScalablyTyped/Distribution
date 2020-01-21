package typings.pusherChatkitClient.userMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.pusherChatkitClient.pusherChatkitClientStrings.online
  - typings.pusherChatkitClient.pusherChatkitClientStrings.offline
  - typings.pusherChatkitClient.pusherChatkitClientStrings.unknown
*/
trait PusherUserPresence extends js.Object

object PusherUserPresence {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def offline: typings.pusherChatkitClient.pusherChatkitClientStrings.offline = this.cast("offline")
  @scala.inline
  def online: typings.pusherChatkitClient.pusherChatkitClientStrings.online = this.cast("online")
  @scala.inline
  def unknown: typings.pusherChatkitClient.pusherChatkitClientStrings.unknown = this.cast("unknown")
}

