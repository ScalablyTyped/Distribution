package typings.atPusherChatkitDashClient.currentuserMod

import typings.atPusherChatkitDashClient.hooksMod.ReadCursorHook
import typings.atPusherChatkitDashClient.hooksMod.UserHook
import typings.atPusherChatkitDashClient.hooksMod.UserPresenceHook
import typings.atPusherChatkitDashClient.hooksMod.UserPresenceState
import typings.atPusherChatkitDashClient.messageMod.PusherMessage
import typings.atPusherChatkitDashClient.roomMod.PusherReadCursor
import typings.atPusherChatkitDashClient.userMod.PusherUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoomSubscriptionHooks extends js.Object {
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
  @scala.inline
  def apply(
    onMessage: /* message */ PusherMessage => Unit = null,
    onMessageDeleted: /* messageId */ Double => Unit = null,
    onNewReadCursor: /* cursor */ PusherReadCursor => Unit = null,
    onPresenceChanged: (/* state */ UserPresenceState, /* user */ PusherUser) => Unit = null,
    onUserJoined: /* room */ PusherUser => Unit = null,
    onUserLeft: /* room */ PusherUser => Unit = null,
    onUserStartedTyping: /* room */ PusherUser => Unit = null,
    onUserStoppedTyping: /* room */ PusherUser => Unit = null
  ): RoomSubscriptionHooks = {
    val __obj = js.Dynamic.literal()
    if (onMessage != null) __obj.updateDynamic("onMessage")(js.Any.fromFunction1(onMessage))
    if (onMessageDeleted != null) __obj.updateDynamic("onMessageDeleted")(js.Any.fromFunction1(onMessageDeleted))
    if (onNewReadCursor != null) __obj.updateDynamic("onNewReadCursor")(js.Any.fromFunction1(onNewReadCursor))
    if (onPresenceChanged != null) __obj.updateDynamic("onPresenceChanged")(js.Any.fromFunction2(onPresenceChanged))
    if (onUserJoined != null) __obj.updateDynamic("onUserJoined")(js.Any.fromFunction1(onUserJoined))
    if (onUserLeft != null) __obj.updateDynamic("onUserLeft")(js.Any.fromFunction1(onUserLeft))
    if (onUserStartedTyping != null) __obj.updateDynamic("onUserStartedTyping")(js.Any.fromFunction1(onUserStartedTyping))
    if (onUserStoppedTyping != null) __obj.updateDynamic("onUserStoppedTyping")(js.Any.fromFunction1(onUserStoppedTyping))
    __obj.asInstanceOf[RoomSubscriptionHooks]
  }
}

