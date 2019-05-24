package typings
package sipDotJsLib.libCoreUserDashAgentDashCoreUserDashAgentDashCoreDashDelegateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserAgentCoreDelegate extends js.Object {
  /**
    * Receive INVITE request.
    * @param request Incoming INVITE request.
    */
  var onInvite: js.UndefOr[
    js.Function1[
      /* request */ sipDotJsLib.libCoreMessagesMethodsInviteMod.IncomingInviteRequest, 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Receive MESSAGE request.
    * @param request Incoming MESSAGE request.
    */
  var onMessage: js.UndefOr[
    js.Function1[
      /* request */ sipDotJsLib.libCoreMessagesMethodsMessageMod.IncomingMessageRequest, 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * DEPRECATED. Receive NOTIFY request.
    * @param message Incoming NOTIFY request.
    */
  var onNotify: js.UndefOr[
    js.Function1[
      /* request */ sipDotJsLib.libCoreMessagesMethodsNotifyMod.IncomingNotifyRequest, 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Receive REFER request.
    * @param request Incoming REFER request.
    */
  var onRefer: js.UndefOr[
    js.Function1[
      /* request */ sipDotJsLib.libCoreMessagesMethodsReferMod.IncomingReferRequest, 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Receive SUBSCRIBE request.
    * @param request Incoming SUBSCRIBE request.
    */
  var onSubscribe: js.UndefOr[
    js.Function1[
      /* request */ sipDotJsLib.libCoreMessagesMethodsSubscribeMod.IncomingSubscribeRequest, 
      scala.Unit
    ]
  ] = js.undefined
}

object UserAgentCoreDelegate {
  @scala.inline
  def apply(
    onInvite: /* request */ sipDotJsLib.libCoreMessagesMethodsInviteMod.IncomingInviteRequest => scala.Unit = null,
    onMessage: /* request */ sipDotJsLib.libCoreMessagesMethodsMessageMod.IncomingMessageRequest => scala.Unit = null,
    onNotify: /* request */ sipDotJsLib.libCoreMessagesMethodsNotifyMod.IncomingNotifyRequest => scala.Unit = null,
    onRefer: /* request */ sipDotJsLib.libCoreMessagesMethodsReferMod.IncomingReferRequest => scala.Unit = null,
    onSubscribe: /* request */ sipDotJsLib.libCoreMessagesMethodsSubscribeMod.IncomingSubscribeRequest => scala.Unit = null
  ): UserAgentCoreDelegate = {
    val __obj = js.Dynamic.literal()
    if (onInvite != null) __obj.updateDynamic("onInvite")(js.Any.fromFunction1(onInvite))
    if (onMessage != null) __obj.updateDynamic("onMessage")(js.Any.fromFunction1(onMessage))
    if (onNotify != null) __obj.updateDynamic("onNotify")(js.Any.fromFunction1(onNotify))
    if (onRefer != null) __obj.updateDynamic("onRefer")(js.Any.fromFunction1(onRefer))
    if (onSubscribe != null) __obj.updateDynamic("onSubscribe")(js.Any.fromFunction1(onSubscribe))
    __obj.asInstanceOf[UserAgentCoreDelegate]
  }
}

