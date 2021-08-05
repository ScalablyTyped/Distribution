package typings.sipJs

import typings.sipJs.apiSessionDescriptionHandlerMod.SessionDescriptionHandler
import typings.sipJs.byeMod.Bye
import typings.sipJs.coreMod.IncomingRequestMessage
import typings.sipJs.infoMod.Info
import typings.sipJs.messageMod.Message
import typings.sipJs.notificationMod.Notification
import typings.sipJs.referralMod.Referral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sessionDelegateMod {
  
  trait SessionDelegate extends StObject {
    
    /**
      * Called upon receiving an incoming in dialog BYE request.
      * @param bye - The bye.
      */
    var onBye: js.UndefOr[js.Function1[/* bye */ Bye, Unit]] = js.undefined
    
    /**
      * Called upon receiving an incoming in dialog INFO request.
      * @param info - The info.
      */
    var onInfo: js.UndefOr[js.Function1[/* info */ Info, Unit]] = js.undefined
    
    /**
      * Called upon receiving an incoming in dialog INVITE request.
      * @param invite - The invite.
      */
    var onInvite: js.UndefOr[
        js.Function3[
          /* request */ IncomingRequestMessage, 
          /* response */ String, 
          /* statusCode */ Double, 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Called upon receiving an incoming in dialog MESSAGE request.
      * @param message - The message.
      */
    var onMessage: js.UndefOr[js.Function1[/* message */ Message, Unit]] = js.undefined
    
    /**
      * Called upon receiving an incoming in dialog NOTIFY request.
      *
      * @remarks
      * If a refer is in progress notifications are delivered to the referrers delegate.
      *
      * @param notification - The notification.
      */
    var onNotify: js.UndefOr[js.Function1[/* notification */ Notification, Unit]] = js.undefined
    
    /**
      * Called upon receiving an incoming in dialog REFER request.
      * @param referral - The referral.
      */
    var onRefer: js.UndefOr[js.Function1[/* referral */ Referral, Unit]] = js.undefined
    
    /**
      * Called upon creating a SessionDescriptionHandler.
      *
      * @remarks
      * It's recommended that the SessionDescriptionHandler be accessed via the `Session.sessionDescriptionHandler` property.
      * However there are use cases where one needs access immediately after it is constructed and before it is utilized.
      * Thus this callback.
      *
      * In most scenarios a single SessionDescriptionHandler will be created per Session
      * in which case this callback will be called at most once and `provisional` will be `false`.
      *
      * However if reliable provisional responses are being supported and an INVITE is sent without SDP,
      * one or more session description handlers will be created if remote offers are received in reliable provisional responses.
      * When remote offers are received in reliable provisional responses, the `provisional` parameter will be `true`.
      * When the `provisional` paramter is `true`, this callback may (or may not) be called again.
      * If the session is ultimately established using a SessionDescriptionHandler which was not created provisionally,
      * this callback will be called again and the `provisional` parameter will be `false`.
      * If the session is ultimately established using a SessionDescriptionHandler which was created provisionally,
      * this callback will not be called again.
      * Note that if the session is ultimately established using a SessionDescriptionHandler which was created provisionally,
      * the provisional SessionDescriptionHandler being utilized will be available via the `Session.sessionDescriptionHandler` property.
      *
      * @param sessionDescriptionHandler - The handler.
      * @param provisional - True if created provisionally.
      */
    var onSessionDescriptionHandler: js.UndefOr[
        js.Function2[
          /* sessionDescriptionHandler */ SessionDescriptionHandler, 
          /* provisional */ Boolean, 
          Unit
        ]
      ] = js.undefined
  }
  object SessionDelegate {
    
    inline def apply(): SessionDelegate = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SessionDelegate]
    }
    
    extension [Self <: SessionDelegate](x: Self) {
      
      inline def setOnBye(value: /* bye */ Bye => Unit): Self = StObject.set(x, "onBye", js.Any.fromFunction1(value))
      
      inline def setOnByeUndefined: Self = StObject.set(x, "onBye", js.undefined)
      
      inline def setOnInfo(value: /* info */ Info => Unit): Self = StObject.set(x, "onInfo", js.Any.fromFunction1(value))
      
      inline def setOnInfoUndefined: Self = StObject.set(x, "onInfo", js.undefined)
      
      inline def setOnInvite(
        value: (/* request */ IncomingRequestMessage, /* response */ String, /* statusCode */ Double) => Unit
      ): Self = StObject.set(x, "onInvite", js.Any.fromFunction3(value))
      
      inline def setOnInviteUndefined: Self = StObject.set(x, "onInvite", js.undefined)
      
      inline def setOnMessage(value: /* message */ Message => Unit): Self = StObject.set(x, "onMessage", js.Any.fromFunction1(value))
      
      inline def setOnMessageUndefined: Self = StObject.set(x, "onMessage", js.undefined)
      
      inline def setOnNotify(value: /* notification */ Notification => Unit): Self = StObject.set(x, "onNotify", js.Any.fromFunction1(value))
      
      inline def setOnNotifyUndefined: Self = StObject.set(x, "onNotify", js.undefined)
      
      inline def setOnRefer(value: /* referral */ Referral => Unit): Self = StObject.set(x, "onRefer", js.Any.fromFunction1(value))
      
      inline def setOnReferUndefined: Self = StObject.set(x, "onRefer", js.undefined)
      
      inline def setOnSessionDescriptionHandler(
        value: (/* sessionDescriptionHandler */ SessionDescriptionHandler, /* provisional */ Boolean) => Unit
      ): Self = StObject.set(x, "onSessionDescriptionHandler", js.Any.fromFunction2(value))
      
      inline def setOnSessionDescriptionHandlerUndefined: Self = StObject.set(x, "onSessionDescriptionHandler", js.undefined)
    }
  }
}
