package typings.sipDotJs.libApiInviterDashOptionsMod

import typings.sipDotJs.Anon_FromDisplayName
import typings.sipDotJs.libApiSessionDashDelegateMod.SessionDelegate
import typings.sipDotJs.libApiSessionDashDescriptionDashHandlerMod.SessionDescriptionHandlerModifier
import typings.sipDotJs.libApiSessionDashDescriptionDashHandlerMod.SessionDescriptionHandlerOptions
import typings.sipDotJs.libApiSessionDashOptionsMod.SessionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InviterOptions extends SessionOptions {
  /** If true, an anonymous call. */
  var anonymous: js.UndefOr[Boolean] = js.undefined
  /** @deprecated TODO: provide alternative. */
  var body: js.UndefOr[String] = js.undefined
  /** @deprecated TODO: provide alternative. */
  var contentType: js.UndefOr[String] = js.undefined
  /**
    * If true, the first answer to the local offer is immediately utilized for media.
    * Requires that the INVITE request MUST NOT fork.
    * Has no effect if `inviteWtihoutSdp` is true.
    * Default is false.
    */
  var earlyMedia: js.UndefOr[Boolean] = js.undefined
  /** Array of extra headers added to the INVITE. */
  var extraHeaders: js.UndefOr[js.Array[String]] = js.undefined
  /** If true, send INVITE without SDP. Default is false. */
  var inviteWithoutSdp: js.UndefOr[Boolean] = js.undefined
  /** @deprecated TODO: provide alternative. */
  var onInfo: js.UndefOr[js.Any] = js.undefined
  /** @deprecated TODO: provide alternative. */
  var params: js.UndefOr[Anon_FromDisplayName] = js.undefined
  /** @deprecated TODO: provide alternative. */
  var renderbody: js.UndefOr[String] = js.undefined
  /** @deprecated TODO: provide alternative. */
  var rendertype: js.UndefOr[String] = js.undefined
  /** Modifiers to pass to SessionDescriptionHandler's getDescription() and setDescription(). */
  var sessionDescriptionHandlerModifiers: js.UndefOr[js.Array[SessionDescriptionHandlerModifier]] = js.undefined
  /** Options to pass to SessionDescriptionHandler's getDescription() and setDescription(). */
  var sessionDescriptionHandlerOptions: js.UndefOr[SessionDescriptionHandlerOptions] = js.undefined
}

object InviterOptions {
  @scala.inline
  def apply(
    anonymous: js.UndefOr[Boolean] = js.undefined,
    body: String = null,
    contentType: String = null,
    delegate: SessionDelegate = null,
    earlyMedia: js.UndefOr[Boolean] = js.undefined,
    extraHeaders: js.Array[String] = null,
    inviteWithoutSdp: js.UndefOr[Boolean] = js.undefined,
    onInfo: js.Any = null,
    params: Anon_FromDisplayName = null,
    renderbody: String = null,
    rendertype: String = null,
    sessionDescriptionHandlerModifiers: js.Array[SessionDescriptionHandlerModifier] = null,
    sessionDescriptionHandlerOptions: SessionDescriptionHandlerOptions = null
  ): InviterOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(anonymous)) __obj.updateDynamic("anonymous")(anonymous.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (delegate != null) __obj.updateDynamic("delegate")(delegate.asInstanceOf[js.Any])
    if (!js.isUndefined(earlyMedia)) __obj.updateDynamic("earlyMedia")(earlyMedia.asInstanceOf[js.Any])
    if (extraHeaders != null) __obj.updateDynamic("extraHeaders")(extraHeaders.asInstanceOf[js.Any])
    if (!js.isUndefined(inviteWithoutSdp)) __obj.updateDynamic("inviteWithoutSdp")(inviteWithoutSdp.asInstanceOf[js.Any])
    if (onInfo != null) __obj.updateDynamic("onInfo")(onInfo.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (renderbody != null) __obj.updateDynamic("renderbody")(renderbody.asInstanceOf[js.Any])
    if (rendertype != null) __obj.updateDynamic("rendertype")(rendertype.asInstanceOf[js.Any])
    if (sessionDescriptionHandlerModifiers != null) __obj.updateDynamic("sessionDescriptionHandlerModifiers")(sessionDescriptionHandlerModifiers.asInstanceOf[js.Any])
    if (sessionDescriptionHandlerOptions != null) __obj.updateDynamic("sessionDescriptionHandlerOptions")(sessionDescriptionHandlerOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[InviterOptions]
  }
}

