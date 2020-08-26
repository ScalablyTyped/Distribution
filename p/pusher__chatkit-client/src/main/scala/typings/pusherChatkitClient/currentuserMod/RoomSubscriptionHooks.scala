package typings.pusherChatkitClient.currentuserMod

import typings.pusherChatkitClient.hooksMod.ReadCursorHook
import typings.pusherChatkitClient.hooksMod.UserHook
import typings.pusherChatkitClient.hooksMod.UserPresenceHook
import typings.pusherChatkitClient.hooksMod.UserPresenceState
import typings.pusherChatkitClient.messageMod.PusherMessage
import typings.pusherChatkitClient.roomMod.PusherReadCursor
import typings.pusherChatkitClient.userMod.PusherUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RoomSubscriptionHooks extends js.Object {
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
  implicit class RoomSubscriptionHooksOps[Self <: RoomSubscriptionHooks] (val x: Self) extends AnyVal {
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
    def setOnMessage(value: /* message */ PusherMessage => Unit): Self = this.set("onMessage", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMessage: Self = this.set("onMessage", js.undefined)
    @scala.inline
    def setOnMessageDeleted(value: /* messageId */ Double => Unit): Self = this.set("onMessageDeleted", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMessageDeleted: Self = this.set("onMessageDeleted", js.undefined)
    @scala.inline
    def setOnNewReadCursor(value: /* cursor */ PusherReadCursor => Unit): Self = this.set("onNewReadCursor", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnNewReadCursor: Self = this.set("onNewReadCursor", js.undefined)
    @scala.inline
    def setOnPresenceChanged(value: (/* state */ UserPresenceState, /* user */ PusherUser) => Unit): Self = this.set("onPresenceChanged", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnPresenceChanged: Self = this.set("onPresenceChanged", js.undefined)
    @scala.inline
    def setOnUserJoined(value: /* room */ PusherUser => Unit): Self = this.set("onUserJoined", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnUserJoined: Self = this.set("onUserJoined", js.undefined)
    @scala.inline
    def setOnUserLeft(value: /* room */ PusherUser => Unit): Self = this.set("onUserLeft", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnUserLeft: Self = this.set("onUserLeft", js.undefined)
    @scala.inline
    def setOnUserStartedTyping(value: /* room */ PusherUser => Unit): Self = this.set("onUserStartedTyping", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnUserStartedTyping: Self = this.set("onUserStartedTyping", js.undefined)
    @scala.inline
    def setOnUserStoppedTyping(value: /* room */ PusherUser => Unit): Self = this.set("onUserStoppedTyping", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnUserStoppedTyping: Self = this.set("onUserStoppedTyping", js.undefined)
  }
  
}

