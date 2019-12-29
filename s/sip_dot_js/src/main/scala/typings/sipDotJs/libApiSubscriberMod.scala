package typings.sipDotJs

import typings.sipDotJs.libApiSubscriberDashOptionsMod.SubscriberOptions
import typings.sipDotJs.libApiSubscriberDashSubscribeDashOptionsMod.SubscriberSubscribeOptions
import typings.sipDotJs.libApiSubscriptionMod.Subscription
import typings.sipDotJs.libApiUserDashAgentMod.UserAgent
import typings.sipDotJs.libCoreMessagesIncomingDashResponseMod.IncomingResponse
import typings.sipDotJs.libCoreMessagesMethodsNotifyMod.IncomingNotifyRequest
import typings.sipDotJs.libCoreMessagesMethodsSubscribeMod.OutgoingSubscribeRequest
import typings.sipDotJs.libCoreMod.URI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/api/subscriber", JSImport.Namespace)
@js.native
object libApiSubscriberMod extends js.Object {
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
    var body: js.Any = js.native
    var event: js.Any = js.native
    var expires: js.Any = js.native
    var extraHeaders: js.Any = js.native
    var id: js.Any = js.native
    var initSubscriberRequest: js.Any = js.native
    var logger: js.Any = js.native
    var outgoingRequestMessage: js.Any = js.native
    var retryAfterTimer: js.Any = js.native
    var subscriberRequest: js.Any = js.native
    var targetURI: js.Any = js.native
    /**
      * Sends a re-SUBSCRIBE request if the subscription is "active".
      * @deprecated Use `subscribe` instead.
      * @internal
      */
    def _refresh(): js.Promise[Unit] = js.native
    /** @internal */
    /* protected */ def onAccepted(response: IncomingResponse): Unit = js.native
    /** @internal */
    /* protected */ def onNotify(request: IncomingNotifyRequest): Unit = js.native
    /** @internal */
    /* protected */ def onRefresh(request: OutgoingSubscribeRequest): Unit = js.native
    def subscribe(options: SubscriberSubscribeOptions): js.Promise[Unit] = js.native
  }
  
}

