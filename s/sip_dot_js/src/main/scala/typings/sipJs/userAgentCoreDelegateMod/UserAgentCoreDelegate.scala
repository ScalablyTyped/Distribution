package typings.sipJs.userAgentCoreDelegateMod

import typings.sipJs.inviteMod.IncomingInviteRequest
import typings.sipJs.methodsMessageMod.IncomingMessageRequest
import typings.sipJs.notifyMod.IncomingNotifyRequest
import typings.sipJs.referMod.IncomingReferRequest
import typings.sipJs.registerMod.IncomingRegisterRequest
import typings.sipJs.subscribeMod.IncomingSubscribeRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserAgentCoreDelegate extends js.Object {
  /**
    * Receive INVITE request.
    * @param request - Incoming INVITE request.
    */
  var onInvite: js.UndefOr[js.Function1[/* request */ IncomingInviteRequest, Unit]] = js.native
  /**
    * Receive MESSAGE request.
    * @param request - Incoming MESSAGE request.
    */
  var onMessage: js.UndefOr[js.Function1[/* request */ IncomingMessageRequest, Unit]] = js.native
  /**
    * DEPRECATED. Receive NOTIFY request.
    * @param message - Incoming NOTIFY request.
    */
  var onNotify: js.UndefOr[js.Function1[/* request */ IncomingNotifyRequest, Unit]] = js.native
  /**
    * Receive REFER request.
    * @param request - Incoming REFER request.
    */
  var onRefer: js.UndefOr[js.Function1[/* request */ IncomingReferRequest, Unit]] = js.native
  /**
    * Receive REGISTER request.
    * @param request - Incoming REGISTER request.
    */
  var onRegister: js.UndefOr[js.Function1[/* request */ IncomingRegisterRequest, Unit]] = js.native
  /**
    * Receive SUBSCRIBE request.
    * @param request - Incoming SUBSCRIBE request.
    */
  var onSubscribe: js.UndefOr[js.Function1[/* request */ IncomingSubscribeRequest, Unit]] = js.native
}

object UserAgentCoreDelegate {
  @scala.inline
  def apply(): UserAgentCoreDelegate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserAgentCoreDelegate]
  }
  @scala.inline
  implicit class UserAgentCoreDelegateOps[Self <: UserAgentCoreDelegate] (val x: Self) extends AnyVal {
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
    def setOnRefer(value: /* request */ IncomingReferRequest => Unit): Self = this.set("onRefer", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnRefer: Self = this.set("onRefer", js.undefined)
    @scala.inline
    def setOnRegister(value: /* request */ IncomingRegisterRequest => Unit): Self = this.set("onRegister", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnRegister: Self = this.set("onRegister", js.undefined)
    @scala.inline
    def setOnSubscribe(value: /* request */ IncomingSubscribeRequest => Unit): Self = this.set("onSubscribe", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSubscribe: Self = this.set("onSubscribe", js.undefined)
  }
  
}

