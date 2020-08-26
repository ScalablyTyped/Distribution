package typings.pusherChatkitClient.hooksMod

import typings.pusherChatkitClient.userMod.PusherUserPresence
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserPresenceState extends js.Object {
  var current: PusherUserPresence = js.native
  var previous: PusherUserPresence = js.native
}

object UserPresenceState {
  @scala.inline
  def apply(current: PusherUserPresence, previous: PusherUserPresence): UserPresenceState = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], previous = previous.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserPresenceState]
  }
  @scala.inline
  implicit class UserPresenceStateOps[Self <: UserPresenceState] (val x: Self) extends AnyVal {
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
    def setCurrent(value: PusherUserPresence): Self = this.set("current", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrevious(value: PusherUserPresence): Self = this.set("previous", value.asInstanceOf[js.Any])
  }
  
}

