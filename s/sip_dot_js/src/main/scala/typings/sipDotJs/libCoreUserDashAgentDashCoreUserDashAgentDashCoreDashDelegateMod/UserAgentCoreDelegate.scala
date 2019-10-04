package typings.sipDotJs.libCoreUserDashAgentDashCoreUserDashAgentDashCoreDashDelegateMod

import typings.sipDotJs.libCoreMessagesMethodsInviteMod.IncomingInviteRequest
import typings.sipDotJs.libCoreMessagesMethodsMessageMod.IncomingMessageRequest
import typings.sipDotJs.libCoreMessagesMethodsNotifyMod.IncomingNotifyRequest
import typings.sipDotJs.libCoreMessagesMethodsReferMod.IncomingReferRequest
import typings.sipDotJs.libCoreMessagesMethodsRegisterMod.IncomingRegisterRequest
import typings.sipDotJs.libCoreMessagesMethodsSubscribeMod.IncomingSubscribeRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserAgentCoreDelegate extends js.Object {
  /**
    * Receive INVITE request.
    * @param request - Incoming INVITE request.
    */
  var onInvite: js.UndefOr[js.Function1[/* request */ IncomingInviteRequest, Unit]] = js.undefined
  /**
    * Receive MESSAGE request.
    * @param request - Incoming MESSAGE request.
    */
  var onMessage: js.UndefOr[js.Function1[/* request */ IncomingMessageRequest, Unit]] = js.undefined
  /**
    * DEPRECATED. Receive NOTIFY request.
    * @param message - Incoming NOTIFY request.
    */
  var onNotify: js.UndefOr[js.Function1[/* request */ IncomingNotifyRequest, Unit]] = js.undefined
  /**
    * Receive REFER request.
    * @param request - Incoming REFER request.
    */
  var onRefer: js.UndefOr[js.Function1[/* request */ IncomingReferRequest, Unit]] = js.undefined
  /**
    * Receive REGISTER request.
    * @param request - Incoming REGISTER request.
    */
  var onRegister: js.UndefOr[js.Function1[/* request */ IncomingRegisterRequest, Unit]] = js.undefined
  /**
    * Receive SUBSCRIBE request.
    * @param request - Incoming SUBSCRIBE request.
    */
  var onSubscribe: js.UndefOr[js.Function1[/* request */ IncomingSubscribeRequest, Unit]] = js.undefined
}

object UserAgentCoreDelegate {
  @scala.inline
  def apply(
    onInvite: /* request */ IncomingInviteRequest => Unit = null,
    onMessage: /* request */ IncomingMessageRequest => Unit = null,
    onNotify: /* request */ IncomingNotifyRequest => Unit = null,
    onRefer: /* request */ IncomingReferRequest => Unit = null,
    onRegister: /* request */ IncomingRegisterRequest => Unit = null,
    onSubscribe: /* request */ IncomingSubscribeRequest => Unit = null
  ): UserAgentCoreDelegate = {
    val __obj = js.Dynamic.literal()
    if (onInvite != null) __obj.updateDynamic("onInvite")(js.Any.fromFunction1(onInvite))
    if (onMessage != null) __obj.updateDynamic("onMessage")(js.Any.fromFunction1(onMessage))
    if (onNotify != null) __obj.updateDynamic("onNotify")(js.Any.fromFunction1(onNotify))
    if (onRefer != null) __obj.updateDynamic("onRefer")(js.Any.fromFunction1(onRefer))
    if (onRegister != null) __obj.updateDynamic("onRegister")(js.Any.fromFunction1(onRegister))
    if (onSubscribe != null) __obj.updateDynamic("onSubscribe")(js.Any.fromFunction1(onSubscribe))
    __obj.asInstanceOf[UserAgentCoreDelegate]
  }
}

