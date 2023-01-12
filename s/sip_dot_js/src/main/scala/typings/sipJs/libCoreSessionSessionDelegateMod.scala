package typings.sipJs

import typings.sipJs.libCoreMessagesMethodsAckMod.IncomingAckRequest
import typings.sipJs.libCoreMessagesMethodsByeMod.IncomingByeRequest
import typings.sipJs.libCoreMessagesMethodsInfoMod.IncomingInfoRequest
import typings.sipJs.libCoreMessagesMethodsInviteMod.IncomingInviteRequest
import typings.sipJs.libCoreMessagesMethodsMessageMod.IncomingMessageRequest
import typings.sipJs.libCoreMessagesMethodsNotifyMod.IncomingNotifyRequest
import typings.sipJs.libCoreMessagesMethodsPrackMod.IncomingPrackRequest
import typings.sipJs.libCoreMessagesMethodsReferMod.IncomingReferRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCoreSessionSessionDelegateMod {
  
  trait SessionDelegate extends StObject {
    
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
    var onAck: js.UndefOr[js.Function1[/* request */ IncomingAckRequest, js.Promise[Unit] | Unit]] = js.undefined
    
    /**
      * Timeout waiting for ACK request.
      * If no handler is provided the Session will terminated with a BYE.
      * https://tools.ietf.org/html/rfc3261#section-13.3.1.4
      */
    var onAckTimeout: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Receive BYE request.
      * https://tools.ietf.org/html/rfc3261#section-15.1.2
      * @param request - Incoming BYE request.
      */
    var onBye: js.UndefOr[js.Function1[/* request */ IncomingByeRequest, Unit]] = js.undefined
    
    /**
      * Receive INFO request.
      * @param request - Incoming INFO request.
      */
    var onInfo: js.UndefOr[js.Function1[/* request */ IncomingInfoRequest, Unit]] = js.undefined
    
    /**
      * Receive re-INVITE request.
      * https://tools.ietf.org/html/rfc3261#section-14.2
      * @param request - Incoming INVITE request.
      */
    var onInvite: js.UndefOr[js.Function1[/* request */ IncomingInviteRequest, Unit]] = js.undefined
    
    /**
      * Receive MESSAGE request.
      * https://tools.ietf.org/html/rfc3428#section-7
      * @param request - Incoming MESSAGE request.
      */
    var onMessage: js.UndefOr[js.Function1[/* request */ IncomingMessageRequest, Unit]] = js.undefined
    
    /**
      * Receive NOTIFY request.
      * https://tools.ietf.org/html/rfc6665#section-4.1.3
      * @param request - Incoming NOTIFY request.
      */
    var onNotify: js.UndefOr[js.Function1[/* request */ IncomingNotifyRequest, Unit]] = js.undefined
    
    /**
      * Receive PRACK request.
      * https://tools.ietf.org/html/rfc3262#section-3
      * @param request - Incoming PRACK request.
      */
    var onPrack: js.UndefOr[js.Function1[/* request */ IncomingPrackRequest, Unit]] = js.undefined
    
    /**
      * Receive REFER request.
      * https://tools.ietf.org/html/rfc3515#section-2.4.2
      * @param request - Incoming REFER request.
      */
    var onRefer: js.UndefOr[js.Function1[/* request */ IncomingReferRequest, Unit]] = js.undefined
  }
  object SessionDelegate {
    
    inline def apply(): SessionDelegate = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SessionDelegate]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SessionDelegate] (val x: Self) extends AnyVal {
      
      inline def setOnAck(value: /* request */ IncomingAckRequest => js.Promise[Unit] | Unit): Self = StObject.set(x, "onAck", js.Any.fromFunction1(value))
      
      inline def setOnAckTimeout(value: () => Unit): Self = StObject.set(x, "onAckTimeout", js.Any.fromFunction0(value))
      
      inline def setOnAckTimeoutUndefined: Self = StObject.set(x, "onAckTimeout", js.undefined)
      
      inline def setOnAckUndefined: Self = StObject.set(x, "onAck", js.undefined)
      
      inline def setOnBye(value: /* request */ IncomingByeRequest => Unit): Self = StObject.set(x, "onBye", js.Any.fromFunction1(value))
      
      inline def setOnByeUndefined: Self = StObject.set(x, "onBye", js.undefined)
      
      inline def setOnInfo(value: /* request */ IncomingInfoRequest => Unit): Self = StObject.set(x, "onInfo", js.Any.fromFunction1(value))
      
      inline def setOnInfoUndefined: Self = StObject.set(x, "onInfo", js.undefined)
      
      inline def setOnInvite(value: /* request */ IncomingInviteRequest => Unit): Self = StObject.set(x, "onInvite", js.Any.fromFunction1(value))
      
      inline def setOnInviteUndefined: Self = StObject.set(x, "onInvite", js.undefined)
      
      inline def setOnMessage(value: /* request */ IncomingMessageRequest => Unit): Self = StObject.set(x, "onMessage", js.Any.fromFunction1(value))
      
      inline def setOnMessageUndefined: Self = StObject.set(x, "onMessage", js.undefined)
      
      inline def setOnNotify(value: /* request */ IncomingNotifyRequest => Unit): Self = StObject.set(x, "onNotify", js.Any.fromFunction1(value))
      
      inline def setOnNotifyUndefined: Self = StObject.set(x, "onNotify", js.undefined)
      
      inline def setOnPrack(value: /* request */ IncomingPrackRequest => Unit): Self = StObject.set(x, "onPrack", js.Any.fromFunction1(value))
      
      inline def setOnPrackUndefined: Self = StObject.set(x, "onPrack", js.undefined)
      
      inline def setOnRefer(value: /* request */ IncomingReferRequest => Unit): Self = StObject.set(x, "onRefer", js.Any.fromFunction1(value))
      
      inline def setOnReferUndefined: Self = StObject.set(x, "onRefer", js.undefined)
    }
  }
}
