package typings.atPusherChatkitDashClient.userMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.atPusherChatkitDashClient.atPusherChatkitDashClientStrings.online
  - typings.atPusherChatkitDashClient.atPusherChatkitDashClientStrings.offline
  - typings.atPusherChatkitDashClient.atPusherChatkitDashClientStrings.unknown
*/
trait PusherUserPresence extends js.Object

object PusherUserPresence {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def offline: typings.atPusherChatkitDashClient.atPusherChatkitDashClientStrings.offline = this.cast("offline")
  @scala.inline
  def online: typings.atPusherChatkitDashClient.atPusherChatkitDashClientStrings.online = this.cast("online")
  @scala.inline
  def unknown: typings.atPusherChatkitDashClient.atPusherChatkitDashClientStrings.unknown = this.cast("unknown")
}

