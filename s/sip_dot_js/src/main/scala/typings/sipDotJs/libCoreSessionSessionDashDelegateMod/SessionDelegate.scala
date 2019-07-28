package typings.sipDotJs.libCoreSessionSessionDashDelegateMod

import typings.sipDotJs.libCoreMessagesMethodsAckMod.IncomingAckRequest
import typings.sipDotJs.libCoreMessagesMethodsByeMod.IncomingByeRequest
import typings.sipDotJs.libCoreMessagesMethodsInfoMod.IncomingInfoRequest
import typings.sipDotJs.libCoreMessagesMethodsInviteMod.IncomingInviteRequest
import typings.sipDotJs.libCoreMessagesMethodsNotifyMod.IncomingNotifyRequest
import typings.sipDotJs.libCoreMessagesMethodsPrackMod.IncomingPrackRequest
import typings.sipDotJs.libCoreMessagesMethodsReferMod.IncomingReferRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SessionDelegate extends js.Object {
  /**
    * Receive ACK request.
    * @param request Incoming ACK request.
    */
  var onAck: js.UndefOr[js.Function1[/* request */ IncomingAckRequest, Unit]] = js.undefined
  /**
    * Timeout waiting for ACK request.
    * If no handler is provided the Session will terminated with a BYE.
    * https://tools.ietf.org/html/rfc3261#section-13.3.1.4
    */
  var onAckTimeout: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Receive BYE request.
    * https://tools.ietf.org/html/rfc3261#section-15.1.2
    * @param request Incoming BYE request.
    */
  var onBye: js.UndefOr[js.Function1[/* request */ IncomingByeRequest, Unit]] = js.undefined
  /**
    * Receive INFO request.
    * @param request Incoming INFO request.
    */
  var onInfo: js.UndefOr[js.Function1[/* request */ IncomingInfoRequest, Unit]] = js.undefined
  /**
    * Receive re-INVITE request.
    * https://tools.ietf.org/html/rfc3261#section-14.2
    * @param request Incoming INVITE request.
    */
  var onInvite: js.UndefOr[js.Function1[/* request */ IncomingInviteRequest, Unit]] = js.undefined
  /**
    * Receive NOTIFY request.
    * https://tools.ietf.org/html/rfc6665#section-4.1.3
    * @param request Incoming NOTIFY request.
    */
  var onNotify: js.UndefOr[js.Function1[/* request */ IncomingNotifyRequest, Unit]] = js.undefined
  /**
    * Receive PRACK request.
    * https://tools.ietf.org/html/rfc3262#section-3
    * @param request Incoming PRACK request.
    */
  var onPrack: js.UndefOr[js.Function1[/* request */ IncomingPrackRequest, Unit]] = js.undefined
  /**
    * Receive REFER request.
    * https://tools.ietf.org/html/rfc3515#section-2.4.2
    * @param request Incoming REFER request.
    */
  var onRefer: js.UndefOr[js.Function1[/* request */ IncomingReferRequest, Unit]] = js.undefined
}

object SessionDelegate {
  @scala.inline
  def apply(
    onAck: /* request */ IncomingAckRequest => Unit = null,
    onAckTimeout: () => Unit = null,
    onBye: /* request */ IncomingByeRequest => Unit = null,
    onInfo: /* request */ IncomingInfoRequest => Unit = null,
    onInvite: /* request */ IncomingInviteRequest => Unit = null,
    onNotify: /* request */ IncomingNotifyRequest => Unit = null,
    onPrack: /* request */ IncomingPrackRequest => Unit = null,
    onRefer: /* request */ IncomingReferRequest => Unit = null
  ): SessionDelegate = {
    val __obj = js.Dynamic.literal()
    if (onAck != null) __obj.updateDynamic("onAck")(js.Any.fromFunction1(onAck))
    if (onAckTimeout != null) __obj.updateDynamic("onAckTimeout")(js.Any.fromFunction0(onAckTimeout))
    if (onBye != null) __obj.updateDynamic("onBye")(js.Any.fromFunction1(onBye))
    if (onInfo != null) __obj.updateDynamic("onInfo")(js.Any.fromFunction1(onInfo))
    if (onInvite != null) __obj.updateDynamic("onInvite")(js.Any.fromFunction1(onInvite))
    if (onNotify != null) __obj.updateDynamic("onNotify")(js.Any.fromFunction1(onNotify))
    if (onPrack != null) __obj.updateDynamic("onPrack")(js.Any.fromFunction1(onPrack))
    if (onRefer != null) __obj.updateDynamic("onRefer")(js.Any.fromFunction1(onRefer))
    __obj.asInstanceOf[SessionDelegate]
  }
}

