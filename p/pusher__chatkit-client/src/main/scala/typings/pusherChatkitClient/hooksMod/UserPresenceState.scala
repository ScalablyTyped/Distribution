package typings.pusherChatkitClient.hooksMod

import typings.pusherChatkitClient.userMod.PusherUserPresence
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserPresenceState extends js.Object {
  var current: PusherUserPresence
  var previous: PusherUserPresence
}

object UserPresenceState {
  @scala.inline
  def apply(current: PusherUserPresence, previous: PusherUserPresence): UserPresenceState = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], previous = previous.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UserPresenceState]
  }
}

