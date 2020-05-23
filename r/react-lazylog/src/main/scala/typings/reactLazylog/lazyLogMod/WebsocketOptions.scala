package typings.reactLazylog.lazyLogMod

import typings.std.CloseEvent
import typings.std.Event
import typings.std.WebSocket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebsocketOptions extends js.Object {
  var formatMessage: js.UndefOr[js.Function1[/* message */ js.Any, String]] = js.undefined
  var onClose: js.UndefOr[js.Function1[/* e */ CloseEvent, Unit]] = js.undefined
  var onError: js.UndefOr[js.Function1[/* e */ Event, Unit]] = js.undefined
  var onOpen: js.UndefOr[js.Function2[/* e */ Event, /* socket */ WebSocket, Unit]] = js.undefined
}

object WebsocketOptions {
  @scala.inline
  def apply(
    formatMessage: /* message */ js.Any => String = null,
    onClose: /* e */ CloseEvent => Unit = null,
    onError: /* e */ Event => Unit = null,
    onOpen: (/* e */ Event, /* socket */ WebSocket) => Unit = null
  ): WebsocketOptions = {
    val __obj = js.Dynamic.literal()
    if (formatMessage != null) __obj.updateDynamic("formatMessage")(js.Any.fromFunction1(formatMessage))
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction1(onClose))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (onOpen != null) __obj.updateDynamic("onOpen")(js.Any.fromFunction2(onOpen))
    __obj.asInstanceOf[WebsocketOptions]
  }
}

