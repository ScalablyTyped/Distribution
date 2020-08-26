package typings.sipJs.sessionSessionDelegateMod

import typings.sipJs.ackMod.IncomingAckRequest
import typings.sipJs.inviteMod.IncomingInviteRequest
import typings.sipJs.methodsByeMod.IncomingByeRequest
import typings.sipJs.methodsInfoMod.IncomingInfoRequest
import typings.sipJs.methodsMessageMod.IncomingMessageRequest
import typings.sipJs.notifyMod.IncomingNotifyRequest
import typings.sipJs.prackMod.IncomingPrackRequest
import typings.sipJs.referMod.IncomingReferRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SessionDelegate extends js.Object {
  /**
    * Receive ACK request.
    * @param request - Incoming ACK request.
    * @returns
    * The callback MUST return a promise if it asynchronously handles answers.
    * For example, an ACK with an answer (offer in the 200 Ok) may require
    * asynchronous processing in which case the callback MUST return a Promise
    * which resolves when the answer handling is complete.
    * @privateRemarks
    * Unlike INVITE handling where we can rely on the generation of a response
    * to indicate when offer/answer processing has been completed, ACK handling
    * requires some indication from the handler that answer processing is complete
    * so that we can avoid some race conditions (see comments in code for more details).
    * Having the handler return a Promise provides said indication.
    */
  var onAck: js.UndefOr[js.Function1[/* request */ IncomingAckRequest, js.Promise[Unit] | Unit]] = js.native
  /**
    * Timeout waiting for ACK request.
    * If no handler is provided the Session will terminated with a BYE.
    * https://tools.ietf.org/html/rfc3261#section-13.3.1.4
    */
  var onAckTimeout: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Receive BYE request.
    * https://tools.ietf.org/html/rfc3261#section-15.1.2
    * @param request - Incoming BYE request.
    */
  var onBye: js.UndefOr[js.Function1[/* request */ IncomingByeRequest, Unit]] = js.native
  /**
    * Receive INFO request.
    * @param request - Incoming INFO request.
    */
  var onInfo: js.UndefOr[js.Function1[/* request */ IncomingInfoRequest, Unit]] = js.native
  /**
    * Receive re-INVITE request.
    * https://tools.ietf.org/html/rfc3261#section-14.2
    * @param request - Incoming INVITE request.
    */
  var onInvite: js.UndefOr[js.Function1[/* request */ IncomingInviteRequest, Unit]] = js.native
  /**
    * Receive MESSAGE request.
    * https://tools.ietf.org/html/rfc3428#section-7
    * @param request - Incoming MESSAGE request.
    */
  var onMessage: js.UndefOr[js.Function1[/* request */ IncomingMessageRequest, Unit]] = js.native
  /**
    * Receive NOTIFY request.
    * https://tools.ietf.org/html/rfc6665#section-4.1.3
    * @param request - Incoming NOTIFY request.
    */
  var onNotify: js.UndefOr[js.Function1[/* request */ IncomingNotifyRequest, Unit]] = js.native
  /**
    * Receive PRACK request.
    * https://tools.ietf.org/html/rfc3262#section-3
    * @param request - Incoming PRACK request.
    */
  var onPrack: js.UndefOr[js.Function1[/* request */ IncomingPrackRequest, Unit]] = js.native
  /**
    * Receive REFER request.
    * https://tools.ietf.org/html/rfc3515#section-2.4.2
    * @param request - Incoming REFER request.
    */
  var onRefer: js.UndefOr[js.Function1[/* request */ IncomingReferRequest, Unit]] = js.native
}

object SessionDelegate {
  @scala.inline
  def apply(): SessionDelegate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SessionDelegate]
  }
  @scala.inline
  implicit class SessionDelegateOps[Self <: SessionDelegate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOnAck(value: /* request */ IncomingAckRequest => js.Promise[Unit] | Unit): Self = this.set("onAck", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnAck: Self = this.set("onAck", js.undefined)
    @scala.inline
    def setOnAckTimeout(value: () => Unit): Self = this.set("onAckTimeout", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnAckTimeout: Self = this.set("onAckTimeout", js.undefined)
    @scala.inline
    def setOnBye(value: /* request */ IncomingByeRequest => Unit): Self = this.set("onBye", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnBye: Self = this.set("onBye", js.undefined)
    @scala.inline
    def setOnInfo(value: /* request */ IncomingInfoRequest => Unit): Self = this.set("onInfo", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnInfo: Self = this.set("onInfo", js.undefined)
    @scala.inline
    def setOnInvite(value: /* request */ IncomingInviteRequest => Unit): Self = this.set("onInvite", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnInvite: Self = this.set("onInvite", js.undefined)
    @scala.inline
    def setOnMessage(value: /* request */ IncomingMessageRequest => Unit): Self = this.set("onMessage", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMessage: Self = this.set("onMessage", js.undefined)
    @scala.inline
    def setOnNotify(value: /* request */ IncomingNotifyRequest => Unit): Self = this.set("onNotify", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnNotify: Self = this.set("onNotify", js.undefined)
    @scala.inline
    def setOnPrack(value: /* request */ IncomingPrackRequest => Unit): Self = this.set("onPrack", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPrack: Self = this.set("onPrack", js.undefined)
    @scala.inline
    def setOnRefer(value: /* request */ IncomingReferRequest => Unit): Self = this.set("onRefer", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnRefer: Self = this.set("onRefer", js.undefined)
  }
  
}

