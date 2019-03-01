package typings
package sipDotJsLib.typesSessionMod.InviteClientContextNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /** Array of extra headers added to the INVITE. */
  var extraHeaders: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** If true, send INVITE without SDP. */
  var inviteWithoutSdp: js.UndefOr[scala.Boolean] = js.undefined
  /** Deprecated */
  var params: js.UndefOr[sipDotJsLib.Anon_ToDisplayName] = js.undefined
  /** Options to pass to SessionDescriptionHandler's getDescription() and setDescription(). */
  var sessionDescriptionHandlerOptions: js.UndefOr[
    sipDotJsLib.typesSessionDashDescriptionDashHandlerMod.SessionDescriptionHandlerOptions
  ] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    extraHeaders: js.Array[java.lang.String] = null,
    inviteWithoutSdp: js.UndefOr[scala.Boolean] = js.undefined,
    params: sipDotJsLib.Anon_ToDisplayName = null,
    sessionDescriptionHandlerOptions: sipDotJsLib.typesSessionDashDescriptionDashHandlerMod.SessionDescriptionHandlerOptions = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (extraHeaders != null) __obj.updateDynamic("extraHeaders")(extraHeaders)
    if (!js.isUndefined(inviteWithoutSdp)) __obj.updateDynamic("inviteWithoutSdp")(inviteWithoutSdp)
    if (params != null) __obj.updateDynamic("params")(params)
    if (sessionDescriptionHandlerOptions != null) __obj.updateDynamic("sessionDescriptionHandlerOptions")(sessionDescriptionHandlerOptions)
    __obj.asInstanceOf[Options]
  }
}

