package typings.pubnub.pubnubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// addListener
trait ListenerParameters extends js.Object {
  var membership: js.UndefOr[js.Function1[/* membershipEvent */ MembershipEvent, Unit]] = js.undefined
  var message: js.UndefOr[js.Function1[/* messageEvent */ MessageEvent, Unit]] = js.undefined
  var messageAction: js.UndefOr[js.Function1[/* messageActionEvent */ MessageActionEvent, Unit]] = js.undefined
  var presence: js.UndefOr[js.Function1[/* presenceEvent */ PresenceEvent, Unit]] = js.undefined
  var signal: js.UndefOr[js.Function1[/* signalEvent */ SignalEvent, Unit]] = js.undefined
  var space: js.UndefOr[js.Function1[/* spaceEvent */ SpaceEvent, Unit]] = js.undefined
  var status: js.UndefOr[js.Function1[/* statusEvent */ StatusEvent, Unit]] = js.undefined
  var user: js.UndefOr[js.Function1[/* userEvent */ UserEvent, Unit]] = js.undefined
}

object ListenerParameters {
  @scala.inline
  def apply(
    membership: /* membershipEvent */ MembershipEvent => Unit = null,
    message: /* messageEvent */ MessageEvent => Unit = null,
    messageAction: /* messageActionEvent */ MessageActionEvent => Unit = null,
    presence: /* presenceEvent */ PresenceEvent => Unit = null,
    signal: /* signalEvent */ SignalEvent => Unit = null,
    space: /* spaceEvent */ SpaceEvent => Unit = null,
    status: /* statusEvent */ StatusEvent => Unit = null,
    user: /* userEvent */ UserEvent => Unit = null
  ): ListenerParameters = {
    val __obj = js.Dynamic.literal()
    if (membership != null) __obj.updateDynamic("membership")(js.Any.fromFunction1(membership))
    if (message != null) __obj.updateDynamic("message")(js.Any.fromFunction1(message))
    if (messageAction != null) __obj.updateDynamic("messageAction")(js.Any.fromFunction1(messageAction))
    if (presence != null) __obj.updateDynamic("presence")(js.Any.fromFunction1(presence))
    if (signal != null) __obj.updateDynamic("signal")(js.Any.fromFunction1(signal))
    if (space != null) __obj.updateDynamic("space")(js.Any.fromFunction1(space))
    if (status != null) __obj.updateDynamic("status")(js.Any.fromFunction1(status))
    if (user != null) __obj.updateDynamic("user")(js.Any.fromFunction1(user))
    __obj.asInstanceOf[ListenerParameters]
  }
}

