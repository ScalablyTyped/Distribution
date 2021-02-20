package typings.sipJs

import typings.sipJs.incomingRequestMod.IncomingRequest
import typings.sipJs.incomingResponseMod.IncomingResponse
import typings.sipJs.notifyMod.IncomingNotifyRequest
import typings.sipJs.outgoingRequestMod.OutgoingRequest
import typings.sipJs.outgoingRequestMod.OutgoingRequestDelegate
import typings.sipJs.subscriptionSubscriptionMod.Subscription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object subscribeMod {
  
  @js.native
  trait IncomingRequestWithSubscription extends StObject {
    
    /** The NOTIFY request which established the subscription. */
    val request: IncomingNotifyRequest = js.native
    
    /** If subscription state is not "terminated", then the subscription. Otherwise undefined. */
    val subscription: js.UndefOr[Subscription] = js.native
  }
  object IncomingRequestWithSubscription {
    
    @scala.inline
    def apply(request: IncomingNotifyRequest): IncomingRequestWithSubscription = {
      val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
      __obj.asInstanceOf[IncomingRequestWithSubscription]
    }
    
    @scala.inline
    implicit class IncomingRequestWithSubscriptionMutableBuilder[Self <: IncomingRequestWithSubscription] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRequest(value: IncomingNotifyRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubscription(value: Subscription): Self = StObject.set(x, "subscription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubscriptionUndefined: Self = StObject.set(x, "subscription", js.undefined)
    }
  }
  
  type IncomingSubscribeRequest = IncomingRequest
  
  type IncomingSubscribeResponse = IncomingResponse
  
  @js.native
  trait OutgoingSubscribeRequest extends OutgoingRequest {
    
    /** Delegate providing custom handling of this outgoing SUBSCRIBE request. */
    @JSName("delegate")
    var delegate_OutgoingSubscribeRequest: js.UndefOr[OutgoingSubscribeRequestDelegate] = js.native
    
    /** Stop waiting for an inital subscription creating NOTIFY. */
    def waitNotifyStop(): Unit = js.native
  }
  
  @js.native
  trait OutgoingSubscribeRequestDelegate extends OutgoingRequestDelegate {
    
    /**
      * Received the initial subscription creating NOTIFY in response to this request.
      * Called for out of dialog SUBSCRIBE requests only (not called for re-SUBSCRIBE requests).
      * @param request - Incoming NOTIFY request (including a Subscription).
      */
    var onNotify: js.UndefOr[js.Function1[/* request */ IncomingRequestWithSubscription, Unit]] = js.native
    
    /**
      * Timed out waiting to receive the initial subscription creating NOTIFY in response to this request.
      * Called for out of dialog SUBSCRIBE requests only (not called for re-SUBSCRIBE requests).
      */
    var onNotifyTimeout: js.UndefOr[js.Function0[Unit]] = js.native
  }
  object OutgoingSubscribeRequestDelegate {
    
    @scala.inline
    def apply(): OutgoingSubscribeRequestDelegate = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OutgoingSubscribeRequestDelegate]
    }
    
    @scala.inline
    implicit class OutgoingSubscribeRequestDelegateMutableBuilder[Self <: OutgoingSubscribeRequestDelegate] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnNotify(value: /* request */ IncomingRequestWithSubscription => Unit): Self = StObject.set(x, "onNotify", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnNotifyTimeout(value: () => Unit): Self = StObject.set(x, "onNotifyTimeout", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnNotifyTimeoutUndefined: Self = StObject.set(x, "onNotifyTimeout", js.undefined)
      
      @scala.inline
      def setOnNotifyUndefined: Self = StObject.set(x, "onNotify", js.undefined)
    }
  }
}
