package typings.pubnub.pubnubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// addListener
trait ListenerParameters extends js.Object {
  var message: js.UndefOr[js.Function1[/* messageEvent */ MessageEvent, Unit]] = js.undefined
  var presence: js.UndefOr[js.Function1[/* presenceEvent */ PresenceEvent, Unit]] = js.undefined
  var status: js.UndefOr[js.Function1[/* statusEvent */ StatusEvent, Unit]] = js.undefined
}

object ListenerParameters {
  @scala.inline
  def apply(
    message: /* messageEvent */ MessageEvent => Unit = null,
    presence: /* presenceEvent */ PresenceEvent => Unit = null,
    status: /* statusEvent */ StatusEvent => Unit = null
  ): ListenerParameters = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(js.Any.fromFunction1(message))
    if (presence != null) __obj.updateDynamic("presence")(js.Any.fromFunction1(presence))
    if (status != null) __obj.updateDynamic("status")(js.Any.fromFunction1(status))
    __obj.asInstanceOf[ListenerParameters]
  }
}

