package typings.sipJs.libSessionMod.InviteServerContext

import typings.sipJs.coreMod.IncomingRequestMessage
import typings.sipJs.libSessionDescriptionHandlerMod.SessionDescriptionHandlerModifiers
import typings.sipJs.libSessionDescriptionHandlerMod.SessionDescriptionHandlerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var body: js.UndefOr[js.Any] = js.undefined
  /** Array of extra headers added to the INVITE. */
  var extraHeaders: js.UndefOr[js.Array[String]] = js.undefined
  var modifiers: js.UndefOr[SessionDescriptionHandlerModifiers] = js.undefined
  var onInfo: js.UndefOr[js.Function1[/* request */ IncomingRequestMessage, Unit]] = js.undefined
  var reasonPhrase: js.UndefOr[String] = js.undefined
  var rel100: js.UndefOr[Boolean] = js.undefined
  /** Options to pass to SessionDescriptionHandler's getDescription() and setDescription(). */
  var sessionDescriptionHandlerOptions: js.UndefOr[SessionDescriptionHandlerOptions] = js.undefined
  var statusCode: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    body: js.Any = null,
    extraHeaders: js.Array[String] = null,
    modifiers: SessionDescriptionHandlerModifiers = null,
    onInfo: /* request */ IncomingRequestMessage => Unit = null,
    reasonPhrase: String = null,
    rel100: js.UndefOr[Boolean] = js.undefined,
    sessionDescriptionHandlerOptions: SessionDescriptionHandlerOptions = null,
    statusCode: Int | Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (extraHeaders != null) __obj.updateDynamic("extraHeaders")(extraHeaders.asInstanceOf[js.Any])
    if (modifiers != null) __obj.updateDynamic("modifiers")(modifiers.asInstanceOf[js.Any])
    if (onInfo != null) __obj.updateDynamic("onInfo")(js.Any.fromFunction1(onInfo))
    if (reasonPhrase != null) __obj.updateDynamic("reasonPhrase")(reasonPhrase.asInstanceOf[js.Any])
    if (!js.isUndefined(rel100)) __obj.updateDynamic("rel100")(rel100.asInstanceOf[js.Any])
    if (sessionDescriptionHandlerOptions != null) __obj.updateDynamic("sessionDescriptionHandlerOptions")(sessionDescriptionHandlerOptions.asInstanceOf[js.Any])
    if (statusCode != null) __obj.updateDynamic("statusCode")(statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

