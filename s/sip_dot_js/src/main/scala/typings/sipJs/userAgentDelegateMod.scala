package typings.sipJs

import typings.sipJs.invitationMod.Invitation
import typings.sipJs.messageMod.Message
import typings.sipJs.notificationMod.Notification
import typings.sipJs.referMod.IncomingReferRequest
import typings.sipJs.referralMod.Referral
import typings.sipJs.registerMod.IncomingRegisterRequest
import typings.sipJs.subscribeMod.IncomingSubscribeRequest
import typings.sipJs.subscriptionMod.Subscription
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object userAgentDelegateMod {
  
  trait UserAgentDelegate extends StObject {
    
    /**
      * Called upon transport transitioning to connected state.
      */
    var onConnect: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Called upon transport transitioning from connected state.
      * @param error - An error if disconnect triggered by transport. Otherwise undefined.
      */
    var onDisconnect: js.UndefOr[js.Function1[/* error */ js.UndefOr[Error], Unit]] = js.undefined
    
    /**
      * Called upon receipt of an invitation.
      * @remarks
      * Handler for incoming out of dialog INVITE requests.
      * @param invitation - The invitation.
      */
    var onInvite: js.UndefOr[js.Function1[/* invitation */ Invitation, Unit]] = js.undefined
    
    /**
      * Called upon receipt of a message.
      * @remarks
      * Handler for incoming out of dialog MESSAGE requests.
      * @param message - The message.
      */
    var onMessage: js.UndefOr[js.Function1[/* message */ Message, Unit]] = js.undefined
    
    /**
      * Called upon receipt of a notification.
      * @remarks
      * Handler for incoming out of dialog NOTIFY requests.
      * @param notification - The notification.
      */
    var onNotify: js.UndefOr[js.Function1[/* notification */ Notification, Unit]] = js.undefined
    
    /**
      * @alpha
      * Called upon receipt of a referral.
      * @remarks
      * Handler for incoming out of dialog REFER requests.
      * @param referral - The referral.
      */
    var onRefer: js.UndefOr[js.Function1[/* referral */ Referral, Unit]] = js.undefined
    
    /**
      * @internal
      * Called upon receipt of an out of dialog REFER. Used by test suite.
      * @param request - The request.
      */
    var onReferRequest: js.UndefOr[js.Function1[/* request */ IncomingReferRequest, Unit]] = js.undefined
    
    /**
      * @alpha
      * Called upon receipt of a registration.
      * @remarks
      * Handler for incoming out of dialog REGISTER requests.
      * @param registration - The registration.
      */
    var onRegister: js.UndefOr[js.Function1[/* registration */ js.Any, Unit]] = js.undefined
    
    /**
      * @internal
      * Called upon receipt of a REGISTER request. Used by test suite.
      * @param request - The request.
      */
    var onRegisterRequest: js.UndefOr[js.Function1[/* request */ IncomingRegisterRequest, Unit]] = js.undefined
    
    /**
      * @alpha
      * Called upon receipt of a subscription.
      * @remarks
      * Handler for incoming out of dialog SUBSCRIBE requests.
      * @param subscription - The subscription.
      */
    var onSubscribe: js.UndefOr[js.Function1[/* subscription */ Subscription, Unit]] = js.undefined
    
    /**
      * @internal
      * Called upon receipt of an out of dialog SUBSCRIBE request. Used by test suite.
      * @param request - The request.
      */
    var onSubscribeRequest: js.UndefOr[js.Function1[/* request */ IncomingSubscribeRequest, Unit]] = js.undefined
  }
  object UserAgentDelegate {
    
    inline def apply(): UserAgentDelegate = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UserAgentDelegate]
    }
    
    extension [Self <: UserAgentDelegate](x: Self) {
      
      inline def setOnConnect(value: () => Unit): Self = StObject.set(x, "onConnect", js.Any.fromFunction0(value))
      
      inline def setOnConnectUndefined: Self = StObject.set(x, "onConnect", js.undefined)
      
      inline def setOnDisconnect(value: /* error */ js.UndefOr[Error] => Unit): Self = StObject.set(x, "onDisconnect", js.Any.fromFunction1(value))
      
      inline def setOnDisconnectUndefined: Self = StObject.set(x, "onDisconnect", js.undefined)
      
      inline def setOnInvite(value: /* invitation */ Invitation => Unit): Self = StObject.set(x, "onInvite", js.Any.fromFunction1(value))
      
      inline def setOnInviteUndefined: Self = StObject.set(x, "onInvite", js.undefined)
      
      inline def setOnMessage(value: /* message */ Message => Unit): Self = StObject.set(x, "onMessage", js.Any.fromFunction1(value))
      
      inline def setOnMessageUndefined: Self = StObject.set(x, "onMessage", js.undefined)
      
      inline def setOnNotify(value: /* notification */ Notification => Unit): Self = StObject.set(x, "onNotify", js.Any.fromFunction1(value))
      
      inline def setOnNotifyUndefined: Self = StObject.set(x, "onNotify", js.undefined)
      
      inline def setOnRefer(value: /* referral */ Referral => Unit): Self = StObject.set(x, "onRefer", js.Any.fromFunction1(value))
      
      inline def setOnReferRequest(value: /* request */ IncomingReferRequest => Unit): Self = StObject.set(x, "onReferRequest", js.Any.fromFunction1(value))
      
      inline def setOnReferRequestUndefined: Self = StObject.set(x, "onReferRequest", js.undefined)
      
      inline def setOnReferUndefined: Self = StObject.set(x, "onRefer", js.undefined)
      
      inline def setOnRegister(value: /* registration */ js.Any => Unit): Self = StObject.set(x, "onRegister", js.Any.fromFunction1(value))
      
      inline def setOnRegisterRequest(value: /* request */ IncomingRegisterRequest => Unit): Self = StObject.set(x, "onRegisterRequest", js.Any.fromFunction1(value))
      
      inline def setOnRegisterRequestUndefined: Self = StObject.set(x, "onRegisterRequest", js.undefined)
      
      inline def setOnRegisterUndefined: Self = StObject.set(x, "onRegister", js.undefined)
      
      inline def setOnSubscribe(value: /* subscription */ Subscription => Unit): Self = StObject.set(x, "onSubscribe", js.Any.fromFunction1(value))
      
      inline def setOnSubscribeRequest(value: /* request */ IncomingSubscribeRequest => Unit): Self = StObject.set(x, "onSubscribeRequest", js.Any.fromFunction1(value))
      
      inline def setOnSubscribeRequestUndefined: Self = StObject.set(x, "onSubscribeRequest", js.undefined)
      
      inline def setOnSubscribeUndefined: Self = StObject.set(x, "onSubscribe", js.undefined)
    }
  }
}
