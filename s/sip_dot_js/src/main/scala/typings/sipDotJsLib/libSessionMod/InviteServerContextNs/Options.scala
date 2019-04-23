package typings
package sipDotJsLib.libSessionMod.InviteServerContextNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var body: js.UndefOr[js.Any] = js.undefined
  /** Array of extra headers added to the INVITE. */
  var extraHeaders: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var modifiers: js.UndefOr[
    sipDotJsLib.libSessionDashDescriptionDashHandlerMod.SessionDescriptionHandlerModifiers
  ] = js.undefined
  var onInfo: js.UndefOr[
    js.Function1[/* request */ sipDotJsLib.libSIPMessageMod.IncomingRequest, scala.Unit]
  ] = js.undefined
  var reasonPhrase: js.UndefOr[java.lang.String] = js.undefined
  var rel100: js.UndefOr[scala.Boolean] = js.undefined
  /** Options to pass to SessionDescriptionHandler's getDescription() and setDescription(). */
  var sessionDescriptionHandlerOptions: js.UndefOr[
    sipDotJsLib.libSessionDashDescriptionDashHandlerMod.SessionDescriptionHandlerOptions
  ] = js.undefined
  var statusCode: js.UndefOr[scala.Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    body: js.Any = null,
    extraHeaders: js.Array[java.lang.String] = null,
    modifiers: sipDotJsLib.libSessionDashDescriptionDashHandlerMod.SessionDescriptionHandlerModifiers = null,
    onInfo: /* request */ sipDotJsLib.libSIPMessageMod.IncomingRequest => scala.Unit = null,
    reasonPhrase: java.lang.String = null,
    rel100: js.UndefOr[scala.Boolean] = js.undefined,
    sessionDescriptionHandlerOptions: sipDotJsLib.libSessionDashDescriptionDashHandlerMod.SessionDescriptionHandlerOptions = null,
    statusCode: scala.Int | scala.Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body)
    if (extraHeaders != null) __obj.updateDynamic("extraHeaders")(extraHeaders)
    if (modifiers != null) __obj.updateDynamic("modifiers")(modifiers)
    if (onInfo != null) __obj.updateDynamic("onInfo")(js.Any.fromFunction1(onInfo))
    if (reasonPhrase != null) __obj.updateDynamic("reasonPhrase")(reasonPhrase)
    if (!js.isUndefined(rel100)) __obj.updateDynamic("rel100")(rel100)
    if (sessionDescriptionHandlerOptions != null) __obj.updateDynamic("sessionDescriptionHandlerOptions")(sessionDescriptionHandlerOptions)
    if (statusCode != null) __obj.updateDynamic("statusCode")(statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

