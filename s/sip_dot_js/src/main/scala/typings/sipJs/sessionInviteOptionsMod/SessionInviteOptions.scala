package typings.sipJs.sessionInviteOptionsMod

import typings.sipJs.apiSessionDescriptionHandlerMod.SessionDescriptionHandlerModifier
import typings.sipJs.apiSessionDescriptionHandlerMod.SessionDescriptionHandlerOptions
import typings.sipJs.outgoingRequestMod.OutgoingRequestDelegate
import typings.sipJs.outgoingRequestMod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SessionInviteOptions extends js.Object {
  /** See `core` API. */
  var requestDelegate: js.UndefOr[OutgoingRequestDelegate] = js.undefined
  /** See `core` API. */
  var requestOptions: js.UndefOr[RequestOptions] = js.undefined
  var sessionDescriptionHandlerModifiers: js.UndefOr[js.Array[SessionDescriptionHandlerModifier]] = js.undefined
  var sessionDescriptionHandlerOptions: js.UndefOr[SessionDescriptionHandlerOptions] = js.undefined
  /** If true, send INVITE without SDP. Default is false. */
  var withoutSdp: js.UndefOr[Boolean] = js.undefined
}

object SessionInviteOptions {
  @scala.inline
  def apply(
    requestDelegate: OutgoingRequestDelegate = null,
    requestOptions: RequestOptions = null,
    sessionDescriptionHandlerModifiers: js.Array[SessionDescriptionHandlerModifier] = null,
    sessionDescriptionHandlerOptions: SessionDescriptionHandlerOptions = null,
    withoutSdp: js.UndefOr[Boolean] = js.undefined
  ): SessionInviteOptions = {
    val __obj = js.Dynamic.literal()
    if (requestDelegate != null) __obj.updateDynamic("requestDelegate")(requestDelegate.asInstanceOf[js.Any])
    if (requestOptions != null) __obj.updateDynamic("requestOptions")(requestOptions.asInstanceOf[js.Any])
    if (sessionDescriptionHandlerModifiers != null) __obj.updateDynamic("sessionDescriptionHandlerModifiers")(sessionDescriptionHandlerModifiers.asInstanceOf[js.Any])
    if (sessionDescriptionHandlerOptions != null) __obj.updateDynamic("sessionDescriptionHandlerOptions")(sessionDescriptionHandlerOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(withoutSdp)) __obj.updateDynamic("withoutSdp")(withoutSdp.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionInviteOptions]
  }
}

