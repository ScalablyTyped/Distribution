package typings.sipJs.userAgentDelegateMod

import typings.sipJs.invitationMod.Invitation
import typings.sipJs.messageMod.Message
import typings.sipJs.notificationMod.Notification
import typings.sipJs.referMod.IncomingReferRequest
import typings.sipJs.referralMod.Referral
import typings.sipJs.registerMod.IncomingRegisterRequest
import typings.sipJs.subscribeMod.IncomingSubscribeRequest
import typings.sipJs.subscriptionMod.Subscription
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserAgentDelegate extends js.Object {
  /**
    * Called upon transport transitioning to connected state.
    */
  var onConnect: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Called upon transport transitioning from connected state.
    * @param error - An error if disconnect triggered by transport. Otherwise undefined.
    */
  var onDisconnect: js.UndefOr[js.Function1[/* error */ js.UndefOr[Error], Unit]] = js.native
  /**
    * Called upon receipt of an invitation.
    * @remarks
    * Handler for incoming out of dialog INVITE requests.
    * @param invitation - The invitation.
    */
  var onInvite: js.UndefOr[js.Function1[/* invitation */ Invitation, Unit]] = js.native
  /**
    * Called upon receipt of a message.
    * @remarks
    * Handler for incoming out of dialog MESSAGE requests.
    * @param message - The message.
    */
  var onMessage: js.UndefOr[js.Function1[/* message */ Message, Unit]] = js.native
  /**
    * Called upon receipt of a notification.
    * @remarks
    * Handler for incoming out of dialog NOTIFY requests.
    * @param notification - The notification.
    */
  var onNotify: js.UndefOr[js.Function1[/* notification */ Notification, Unit]] = js.native
  /**
    * @alpha
    * Called upon receipt of a referral.
    * @remarks
    * Handler for incoming out of dialog REFER requests.
    * @param referral - The referral.
    */
  var onRefer: js.UndefOr[js.Function1[/* referral */ Referral, Unit]] = js.native
  /**
    * @internal
    * Called upon receipt of an out of dialog REFER. Used by test suite.
    * @param request - The request.
    */
  var onReferRequest: js.UndefOr[js.Function1[/* request */ IncomingReferRequest, Unit]] = js.native
  /**
    * @alpha
    * Called upon receipt of a registration.
    * @remarks
    * Handler for incoming out of dialog REGISTER requests.
    * @param registration - The registration.
    */
  var onRegister: js.UndefOr[js.Function1[/* registration */ js.Any, Unit]] = js.native
  /**
    * @internal
    * Called upon receipt of a REGISTER request. Used by test suite.
    * @param request - The request.
    */
  var onRegisterRequest: js.UndefOr[js.Function1[/* request */ IncomingRegisterRequest, Unit]] = js.native
  /**
    * @alpha
    * Called upon receipt of a subscription.
    * @remarks
    * Handler for incoming out of dialog SUBSCRIBE requests.
    * @param subscription - The subscription.
    */
  var onSubscribe: js.UndefOr[js.Function1[/* subscription */ Subscription, Unit]] = js.native
  /**
    * @internal
    * Called upon receipt of an out of dialog SUBSCRIBE request. Used by test suite.
    * @param request - The request.
    */
  var onSubscribeRequest: js.UndefOr[js.Function1[/* request */ IncomingSubscribeRequest, Unit]] = js.native
}

object UserAgentDelegate {
  @scala.inline
  def apply(): UserAgentDelegate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserAgentDelegate]
  }
  @scala.inline
  implicit class UserAgentDelegateOps[Self <: UserAgentDelegate] (val x: Self) extends AnyVal {
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
    def setOnConnect(value: () => Unit): Self = this.set("onConnect", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnConnect: Self = this.set("onConnect", js.undefined)
    @scala.inline
    def setOnDisconnect(value: /* error */ js.UndefOr[Error] => Unit): Self = this.set("onDisconnect", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDisconnect: Self = this.set("onDisconnect", js.undefined)
    @scala.inline
    def setOnInvite(value: /* invitation */ Invitation => Unit): Self = this.set("onInvite", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnInvite: Self = this.set("onInvite", js.undefined)
    @scala.inline
    def setOnMessage(value: /* message */ Message => Unit): Self = this.set("onMessage", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMessage: Self = this.set("onMessage", js.undefined)
    @scala.inline
    def setOnNotify(value: /* notification */ Notification => Unit): Self = this.set("onNotify", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnNotify: Self = this.set("onNotify", js.undefined)
    @scala.inline
    def setOnRefer(value: /* referral */ Referral => Unit): Self = this.set("onRefer", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnRefer: Self = this.set("onRefer", js.undefined)
    @scala.inline
    def setOnReferRequest(value: /* request */ IncomingReferRequest => Unit): Self = this.set("onReferRequest", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnReferRequest: Self = this.set("onReferRequest", js.undefined)
    @scala.inline
    def setOnRegister(value: /* registration */ js.Any => Unit): Self = this.set("onRegister", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnRegister: Self = this.set("onRegister", js.undefined)
    @scala.inline
    def setOnRegisterRequest(value: /* request */ IncomingRegisterRequest => Unit): Self = this.set("onRegisterRequest", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnRegisterRequest: Self = this.set("onRegisterRequest", js.undefined)
    @scala.inline
    def setOnSubscribe(value: /* subscription */ Subscription => Unit): Self = this.set("onSubscribe", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSubscribe: Self = this.set("onSubscribe", js.undefined)
    @scala.inline
    def setOnSubscribeRequest(value: /* request */ IncomingSubscribeRequest => Unit): Self = this.set("onSubscribeRequest", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSubscribeRequest: Self = this.set("onSubscribeRequest", js.undefined)
  }
  
}

