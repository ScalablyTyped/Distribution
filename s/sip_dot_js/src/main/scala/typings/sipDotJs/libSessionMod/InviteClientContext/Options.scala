package typings.sipDotJs.libSessionMod.InviteClientContext

import typings.sipDotJs.Anon_FromDisplayName
import typings.sipDotJs.libSessionDashDescriptionDashHandlerMod.SessionDescriptionHandlerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /** Anonymous call if true. */
  var anonymous: js.UndefOr[Boolean] = js.undefined
  /** Deprecated. */
  var body: js.UndefOr[String] = js.undefined
  /** Deprecated. */
  var contentType: js.UndefOr[String] = js.undefined
  /** Array of extra headers added to the INVITE. */
  var extraHeaders: js.UndefOr[js.Array[String]] = js.undefined
  /** If true, send INVITE without SDP. */
  var inviteWithoutSdp: js.UndefOr[Boolean] = js.undefined
  /** Deprecated. */
  var onInfo: js.UndefOr[js.Any] = js.undefined
  /** Deprecated. */
  var params: js.UndefOr[Anon_FromDisplayName] = js.undefined
  /** Deprecated. */
  var renderbody: js.UndefOr[String] = js.undefined
  /** Deprecated. */
  var rendertype: js.UndefOr[String] = js.undefined
  /** Options to pass to SessionDescriptionHandler's getDescription() and setDescription(). */
  var sessionDescriptionHandlerOptions: js.UndefOr[SessionDescriptionHandlerOptions] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    anonymous: js.UndefOr[Boolean] = js.undefined,
    body: String = null,
    contentType: String = null,
    extraHeaders: js.Array[String] = null,
    inviteWithoutSdp: js.UndefOr[Boolean] = js.undefined,
    onInfo: js.Any = null,
    params: Anon_FromDisplayName = null,
    renderbody: String = null,
    rendertype: String = null,
    sessionDescriptionHandlerOptions: SessionDescriptionHandlerOptions = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(anonymous)) __obj.updateDynamic("anonymous")(anonymous)
    if (body != null) __obj.updateDynamic("body")(body)
    if (contentType != null) __obj.updateDynamic("contentType")(contentType)
    if (extraHeaders != null) __obj.updateDynamic("extraHeaders")(extraHeaders)
    if (!js.isUndefined(inviteWithoutSdp)) __obj.updateDynamic("inviteWithoutSdp")(inviteWithoutSdp)
    if (onInfo != null) __obj.updateDynamic("onInfo")(onInfo)
    if (params != null) __obj.updateDynamic("params")(params)
    if (renderbody != null) __obj.updateDynamic("renderbody")(renderbody)
    if (rendertype != null) __obj.updateDynamic("rendertype")(rendertype)
    if (sessionDescriptionHandlerOptions != null) __obj.updateDynamic("sessionDescriptionHandlerOptions")(sessionDescriptionHandlerOptions)
    __obj.asInstanceOf[Options]
  }
}

