package typings.sipJs.inviterOptionsMod

import typings.sipJs.AnonFromDisplayName
import typings.sipJs.apiSessionDescriptionHandlerMod.SessionDescriptionHandlerModifier
import typings.sipJs.apiSessionDescriptionHandlerMod.SessionDescriptionHandlerOptions
import typings.sipJs.sessionDelegateMod.SessionDelegate
import typings.sipJs.sessionOptionsMod.SessionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InviterOptions extends SessionOptions {
  /** If true, an anonymous call. */
  var anonymous: js.UndefOr[Boolean] = js.undefined
  /**
    * If true, the first answer to the local offer is immediately utilized for media.
    * Requires that the INVITE request MUST NOT fork.
    * Has no effect if `inviteWithoutSdp` is true.
    * Default is false.
    */
  var earlyMedia: js.UndefOr[Boolean] = js.undefined
  /** Array of extra headers added to the INVITE. */
  var extraHeaders: js.UndefOr[js.Array[String]] = js.undefined
  /** If true, send INVITE without SDP. Default is false. */
  var inviteWithoutSdp: js.UndefOr[Boolean] = js.undefined
  /** @deprecated TODO: provide alternative. */
  var params: js.UndefOr[AnonFromDisplayName] = js.undefined
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
    delegate: SessionDelegate = null,
    earlyMedia: js.UndefOr[Boolean] = js.undefined,
    extraHeaders: js.Array[String] = null,
    inviteWithoutSdp: js.UndefOr[Boolean] = js.undefined,
    params: AnonFromDisplayName = null,
    renderbody: String = null,
    rendertype: String = null,
    sessionDescriptionHandlerModifiers: js.Array[SessionDescriptionHandlerModifier] = null,
    sessionDescriptionHandlerOptions: SessionDescriptionHandlerOptions = null
  ): InviterOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(anonymous)) __obj.updateDynamic("anonymous")(anonymous.asInstanceOf[js.Any])
    if (delegate != null) __obj.updateDynamic("delegate")(delegate.asInstanceOf[js.Any])
    if (!js.isUndefined(earlyMedia)) __obj.updateDynamic("earlyMedia")(earlyMedia.asInstanceOf[js.Any])
    if (extraHeaders != null) __obj.updateDynamic("extraHeaders")(extraHeaders.asInstanceOf[js.Any])
    if (!js.isUndefined(inviteWithoutSdp)) __obj.updateDynamic("inviteWithoutSdp")(inviteWithoutSdp.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (renderbody != null) __obj.updateDynamic("renderbody")(renderbody.asInstanceOf[js.Any])
    if (rendertype != null) __obj.updateDynamic("rendertype")(rendertype.asInstanceOf[js.Any])
    if (sessionDescriptionHandlerModifiers != null) __obj.updateDynamic("sessionDescriptionHandlerModifiers")(sessionDescriptionHandlerModifiers.asInstanceOf[js.Any])
    if (sessionDescriptionHandlerOptions != null) __obj.updateDynamic("sessionDescriptionHandlerOptions")(sessionDescriptionHandlerOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[InviterOptions]
  }
}

