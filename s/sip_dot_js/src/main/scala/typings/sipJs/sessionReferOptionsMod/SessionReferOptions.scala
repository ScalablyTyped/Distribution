package typings.sipJs.sessionReferOptionsMod

import typings.sipJs.notificationMod.Notification
import typings.sipJs.outgoingRequestMod.OutgoingRequestDelegate
import typings.sipJs.outgoingRequestMod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SessionReferOptions extends js.Object {
  /** Called upon receiving an incoming NOTIFY associated with a REFER. */
  var onNotify: js.UndefOr[js.Function1[/* notification */ Notification, Unit]] = js.undefined
  /** See `core` API. */
  var requestDelegate: js.UndefOr[OutgoingRequestDelegate] = js.undefined
  /** See `core` API. */
  var requestOptions: js.UndefOr[RequestOptions] = js.undefined
}

object SessionReferOptions {
  @scala.inline
  def apply(
    onNotify: /* notification */ Notification => Unit = null,
    requestDelegate: OutgoingRequestDelegate = null,
    requestOptions: RequestOptions = null
  ): SessionReferOptions = {
    val __obj = js.Dynamic.literal()
    if (onNotify != null) __obj.updateDynamic("onNotify")(js.Any.fromFunction1(onNotify))
    if (requestDelegate != null) __obj.updateDynamic("requestDelegate")(requestDelegate.asInstanceOf[js.Any])
    if (requestOptions != null) __obj.updateDynamic("requestOptions")(requestOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionReferOptions]
  }
}

