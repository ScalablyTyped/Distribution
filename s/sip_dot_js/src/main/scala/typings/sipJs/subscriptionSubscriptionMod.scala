package typings.sipJs

import org.scalablytyped.runtime.TopLevel
import typings.sipJs.outgoingRequestMod.RequestOptions
import typings.sipJs.subscribeMod.OutgoingSubscribeRequest
import typings.sipJs.subscribeMod.OutgoingSubscribeRequestDelegate
import typings.sipJs.subscriptionSubscriptionDelegateMod.SubscriptionDelegate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/subscription/subscription", JSImport.Namespace)
@js.native
object subscriptionSubscriptionMod extends js.Object {
  @js.native
  trait Subscription extends js.Object {
    /** If true, refresh subscription prior to expiration. Default is false. */
    var autoRefresh: Boolean = js.native
    /** Subscription delegate. */
    var delegate: js.UndefOr[SubscriptionDelegate] = js.native
    /** The subscription id. */
    val id: String = js.native
    /** Subscription expires. Number of seconds until the subscription expires. */
    val subscriptionExpires: Double = js.native
    /** Subscription state. */
    val subscriptionState: SubscriptionState = js.native
    /**
      * Destroy subscription.
      */
    def dispose(): Unit = js.native
    /**
      * 4.1.2.2.  Refreshing of Subscriptions
      * https://tools.ietf.org/html/rfc6665#section-4.1.2.2
      */
    def refresh(): OutgoingSubscribeRequest = js.native
    /**
      * Send re-SUBSCRIBE request.
      * Refreshing a subscription and unsubscribing.
      * https://tools.ietf.org/html/rfc6665#section-4.1.2.2
      * @param delegate - Request delegate.
      * @param options - Options bucket
      */
    def subscribe(): OutgoingSubscribeRequest = js.native
    def subscribe(delegate: js.UndefOr[scala.Nothing], options: RequestOptions): OutgoingSubscribeRequest = js.native
    def subscribe(delegate: OutgoingSubscribeRequestDelegate): OutgoingSubscribeRequest = js.native
    def subscribe(delegate: OutgoingSubscribeRequestDelegate, options: RequestOptions): OutgoingSubscribeRequest = js.native
    /**
      * 4.1.2.3.  Unsubscribing
      * https://tools.ietf.org/html/rfc6665#section-4.1.2.3
      */
    def unsubscribe(): OutgoingSubscribeRequest = js.native
  }
  
  @js.native
  sealed trait SubscriptionState extends js.Object
  
  @js.native
  object SubscriptionState extends js.Object {
    @js.native
    sealed trait Active extends SubscriptionState
    
    @js.native
    sealed trait Initial extends SubscriptionState
    
    @js.native
    sealed trait NotifyWait extends SubscriptionState
    
    @js.native
    sealed trait Pending extends SubscriptionState
    
    @js.native
    sealed trait Terminated extends SubscriptionState
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[SubscriptionState with String] = js.native
    /* "Active" */ @js.native
    object Active extends TopLevel[Active with String]
    
    /* "Initial" */ @js.native
    object Initial extends TopLevel[Initial with String]
    
    /* "NotifyWait" */ @js.native
    object NotifyWait extends TopLevel[NotifyWait with String]
    
    /* "Pending" */ @js.native
    object Pending extends TopLevel[Pending with String]
    
    /* "Terminated" */ @js.native
    object Terminated extends TopLevel[Terminated with String]
    
  }
  
}

