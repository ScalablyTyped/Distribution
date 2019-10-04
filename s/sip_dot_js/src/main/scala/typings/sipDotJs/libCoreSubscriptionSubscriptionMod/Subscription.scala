package typings.sipDotJs.libCoreSubscriptionSubscriptionMod

import typings.sipDotJs.libCoreMessagesMethodsSubscribeMod.OutgoingSubscribeRequest
import typings.sipDotJs.libCoreMessagesMethodsSubscribeMod.OutgoingSubscribeRequestDelegate
import typings.sipDotJs.libCoreMessagesOutgoingDashRequestMod.RequestOptions
import typings.sipDotJs.libCoreSubscriptionSubscriptionDashDelegateMod.SubscriptionDelegate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def subscribe(delegate: OutgoingSubscribeRequestDelegate): OutgoingSubscribeRequest = js.native
  def subscribe(delegate: OutgoingSubscribeRequestDelegate, options: RequestOptions): OutgoingSubscribeRequest = js.native
  /**
    * 4.1.2.3.  Unsubscribing
    * https://tools.ietf.org/html/rfc6665#section-4.1.2.3
    */
  def unsubscribe(): OutgoingSubscribeRequest = js.native
}

