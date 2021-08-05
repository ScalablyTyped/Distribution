package typings.sipJs

import typings.sipJs.coreMod.URI
import typings.sipJs.incomingResponseMod.IncomingResponse
import typings.sipJs.notifyMod.IncomingNotifyRequest
import typings.sipJs.subscribeMod.OutgoingSubscribeRequest
import typings.sipJs.subscriberOptionsMod.SubscriberOptions
import typings.sipJs.subscriberSubscribeOptionsMod.SubscriberSubscribeOptions
import typings.sipJs.subscriptionMod.Subscription
import typings.sipJs.userAgentMod.UserAgent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object subscriberMod {
  
  @JSImport("sip.js/lib/api/subscriber", "Subscriber")
  @js.native
  class Subscriber protected () extends Subscription {
    /**
      * Constructor.
      * @param userAgent - User agent. See {@link UserAgent} for details.
      * @param targetURI - The request URI identifying the subscribed event.
      * @param eventType - The event type identifying the subscribed event.
      * @param options - Options bucket. See {@link SubscriberOptions} for details.
      */
    def this(userAgent: UserAgent, targetURI: URI, eventType: String) = this()
    def this(userAgent: UserAgent, targetURI: URI, eventType: String, options: SubscriberOptions) = this()
    
    /**
      * Sends a re-SUBSCRIBE request if the subscription is "active".
      * @deprecated Use `subscribe` instead.
      * @internal
      */
    def _refresh(): js.Promise[Unit] = js.native
    
    /* private */ var body: js.Any = js.native
    
    /* private */ var event: js.Any = js.native
    
    /* private */ var expires: js.Any = js.native
    
    /* private */ var extraHeaders: js.Any = js.native
    
    /* private */ var id: js.Any = js.native
    
    /* private */ var initSubscriberRequest: js.Any = js.native
    
    /* private */ var logger: js.Any = js.native
    
    /** @internal */
    /* protected */ def onAccepted(response: IncomingResponse): Unit = js.native
    
    /** @internal */
    /* protected */ def onNotify(request: IncomingNotifyRequest): Unit = js.native
    
    /** @internal */
    /* protected */ def onRefresh(request: OutgoingSubscribeRequest): Unit = js.native
    
    /* private */ var outgoingRequestMessage: js.Any = js.native
    
    /* private */ var retryAfterTimer: js.Any = js.native
    
    def subscribe(options: SubscriberSubscribeOptions): js.Promise[Unit] = js.native
    
    /* private */ var subscriberRequest: js.Any = js.native
    
    /* private */ var targetURI: js.Any = js.native
  }
}
