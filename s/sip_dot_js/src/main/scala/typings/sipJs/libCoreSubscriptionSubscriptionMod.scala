package typings.sipJs

import typings.sipJs.libCoreMessagesMethodsSubscribeMod.OutgoingSubscribeRequest
import typings.sipJs.libCoreMessagesMethodsSubscribeMod.OutgoingSubscribeRequestDelegate
import typings.sipJs.libCoreMessagesOutgoingRequestMod.RequestOptions
import typings.sipJs.libCoreSubscriptionSubscriptionDelegateMod.SubscriptionDelegate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCoreSubscriptionSubscriptionMod {
  
  @js.native
  sealed trait SubscriptionState extends StObject
  @JSImport("sip.js/lib/core/subscription/subscription", "SubscriptionState")
  @js.native
  object SubscriptionState extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[SubscriptionState & String] = js.native
    
    @js.native
    sealed trait Active
      extends StObject
         with SubscriptionState
    /* "Active" */ val Active: typings.sipJs.libCoreSubscriptionSubscriptionMod.SubscriptionState.Active & String = js.native
    
    @js.native
    sealed trait Initial
      extends StObject
         with SubscriptionState
    /* "Initial" */ val Initial: typings.sipJs.libCoreSubscriptionSubscriptionMod.SubscriptionState.Initial & String = js.native
    
    @js.native
    sealed trait NotifyWait
      extends StObject
         with SubscriptionState
    /* "NotifyWait" */ val NotifyWait: typings.sipJs.libCoreSubscriptionSubscriptionMod.SubscriptionState.NotifyWait & String = js.native
    
    @js.native
    sealed trait Pending
      extends StObject
         with SubscriptionState
    /* "Pending" */ val Pending: typings.sipJs.libCoreSubscriptionSubscriptionMod.SubscriptionState.Pending & String = js.native
    
    @js.native
    sealed trait Terminated
      extends StObject
         with SubscriptionState
    /* "Terminated" */ val Terminated: typings.sipJs.libCoreSubscriptionSubscriptionMod.SubscriptionState.Terminated & String = js.native
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
    def subscribe(delegate: Unit, options: RequestOptions): OutgoingSubscribeRequest = js.native
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
