package typings.sipJs

import typings.sipJs.ackMod.OutgoingAckRequest
import typings.sipJs.incomingRequestMod.IncomingRequest
import typings.sipJs.incomingResponseMod.IncomingResponse
import typings.sipJs.outgoingRequestMod.OutgoingRequest
import typings.sipJs.outgoingRequestMod.OutgoingRequestDelegate
import typings.sipJs.outgoingRequestMod.RequestOptions
import typings.sipJs.outgoingResponseMod.OutgoingResponse
import typings.sipJs.prackMod.OutgoingPrackRequest
import typings.sipJs.sessionSessionMod.Session
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inviteMod {
  
  @js.native
  trait AckableIncomingResponseWithSession extends IncomingResponse {
    
    /**
      * Send an ACK to acknowledge this response.
      * @param options - Request options bucket.
      */
    def ack(): OutgoingAckRequest = js.native
    def ack(options: RequestOptions): OutgoingAckRequest = js.native
    
    /** Session associated with outgoing request acceptance. */
    val session: Session = js.native
  }
  
  @js.native
  trait IncomingInviteRequest extends IncomingRequest
  
  @js.native
  trait OutgoingInviteRequest extends OutgoingRequest {
    
    /** Delegate providing custom handling of this outgoing INVITE request. */
    @JSName("delegate")
    var delegate_OutgoingInviteRequest: js.UndefOr[OutgoingInviteRequestDelegate] = js.native
  }
  
  @js.native
  trait OutgoingInviteRequestDelegate extends OutgoingRequestDelegate {
    
    /**
      * Received a 2xx positive final response to this request.
      * @param response - Incoming response (including a confirmed Session).
      */
    @JSName("onAccept")
    var onAccept_OutgoingInviteRequestDelegate: js.UndefOr[js.Function1[/* response */ AckableIncomingResponseWithSession, Unit]] = js.native
    
    /**
      * Received a 1xx provisional response to this request. Excluding 100 responses.
      * @param response - Incoming response (including an early Session).
      */
    @JSName("onProgress")
    var onProgress_OutgoingInviteRequestDelegate: js.UndefOr[js.Function1[/* response */ PrackableIncomingResponseWithSession, Unit]] = js.native
  }
  object OutgoingInviteRequestDelegate {
    
    @scala.inline
    def apply(): OutgoingInviteRequestDelegate = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OutgoingInviteRequestDelegate]
    }
    
    @scala.inline
    implicit class OutgoingInviteRequestDelegateMutableBuilder[Self <: OutgoingInviteRequestDelegate] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnAccept(value: /* response */ AckableIncomingResponseWithSession => Unit): Self = StObject.set(x, "onAccept", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAcceptUndefined: Self = StObject.set(x, "onAccept", js.undefined)
      
      @scala.inline
      def setOnProgress(value: /* response */ PrackableIncomingResponseWithSession => Unit): Self = StObject.set(x, "onProgress", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
    }
  }
  
  @js.native
  trait OutgoingResponseWithSession extends OutgoingResponse {
    
    /**
      * Session associated with incoming request acceptance, or
      * Session associated with incoming request progress (if an out of dialog request, an early dialog).
      */
    val session: Session = js.native
  }
  object OutgoingResponseWithSession {
    
    @scala.inline
    def apply(message: String, session: Session): OutgoingResponseWithSession = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any])
      __obj.asInstanceOf[OutgoingResponseWithSession]
    }
    
    @scala.inline
    implicit class OutgoingResponseWithSessionMutableBuilder[Self <: OutgoingResponseWithSession] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSession(value: Session): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PrackableIncomingResponseWithSession extends IncomingResponse {
    
    /**
      * Send an PRACK to acknowledge this response.
      * @param options - Request options bucket.
      */
    def prack(): OutgoingPrackRequest = js.native
    def prack(options: RequestOptions): OutgoingPrackRequest = js.native
    
    /** Session associated with outgoing request progress. If out of dialog request, an early dialog. */
    val session: Session = js.native
  }
}
