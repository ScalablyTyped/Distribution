package typings.sipJs

import typings.sipJs.outgoingRequestMod.RequestOptions
import typings.sipJs.subscribeMod.OutgoingSubscribeRequest
import typings.sipJs.subscribeMod.OutgoingSubscribeRequestDelegate
import typings.sipJs.subscriptionSubscriptionDelegateMod.SubscriptionDelegate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object subscriptionSubscriptionMod {
  
  @js.native
  sealed trait SubscriptionState extends StObject
  @JSImport("sip.js/lib/core/subscription/subscription", "SubscriptionState")
  @js.native
  object SubscriptionState extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[SubscriptionState with String] = js.native
    
    @js.native
    sealed trait Active extends SubscriptionState
    /* "Active" */ val Active: typings.sipJs.subscriptionSubscriptionMod.SubscriptionState.Active with String = js.native
    
    @js.native
    sealed trait Initial extends SubscriptionState
    /* "Initial" */ val Initial: typings.sipJs.subscriptionSubscriptionMod.SubscriptionState.Initial with String = js.native
    
    @js.native
    sealed trait NotifyWait extends SubscriptionState
    /* "NotifyWait" */ val NotifyWait: typings.sipJs.subscriptionSubscriptionMod.SubscriptionState.NotifyWait with String = js.native
    
    @js.native
    sealed trait Pending extends SubscriptionState
    /* "Pending" */ val Pending: typings.sipJs.subscriptionSubscriptionMod.SubscriptionState.Pending with String = js.native
    
    @js.native
    sealed trait Terminated extends SubscriptionState
    /* "Terminated" */ val Terminated: typings.sipJs.subscriptionSubscriptionMod.SubscriptionState.Terminated with String = js.native
  }
  
  @js.native
  trait Subscription extends StObject {
    
    /** If true, refresh subscription prior to expiration. Default is false. */
    var autoRefresh: Boolean = js.native
    
    /** Subscription delegate. */
    var delegate: js.UndefOr[SubscriptionDelegate] = js.native
    
    /**
      * Destroy subscription.
      */
    def dispose(): Unit = js.native
    
    /** The subscription id. */
    val id: String = js.native
    
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
    
    /** Subscription expires. Number of seconds until the subscription expires. */
    val subscriptionExpires: Double = js.native
    
    /** Subscription state. */
    val subscriptionState: SubscriptionState = js.native
    
    /**
      * 4.1.2.3.  Unsubscribing
      * https://tools.ietf.org/html/rfc6665#section-4.1.2.3
      */
    def unsubscribe(): OutgoingSubscribeRequest = js.native
  }
}
