package typings
package sipDotJsLib.libCoreSubscriptionSubscriptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Subscription extends js.Object {
  /** If true, refresh subscription prior to expiration. Default is false. */
  var autoRefresh: scala.Boolean = js.native
  /** Subscription delegate. */
  var delegate: js.UndefOr[sipDotJsLib.libCoreSubscriptionSubscriptionDashDelegateMod.SubscriptionDelegate] = js.native
  /** The subscription id. */
  val id: java.lang.String = js.native
  /** Subscription expires. Number of seconds until the subscription expires. */
  val subscriptionExpires: scala.Double = js.native
  /** Subscription state. */
  val subscriptionState: SubscriptionState = js.native
  /**
    * Destroy subscription.
    */
  def dispose(): scala.Unit = js.native
  /**
    * 4.1.2.2.  Refreshing of Subscriptions
    * https://tools.ietf.org/html/rfc6665#section-4.1.2.2
    */
  def refresh(): sipDotJsLib.libCoreMessagesMethodsSubscribeMod.OutgoingSubscribeRequest = js.native
  /**
    * Send re-SUBSCRIBE request.
    * Refreshing a subscription and unsubscribing.
    * https://tools.ietf.org/html/rfc6665#section-4.1.2.2
    * @param delegate Request delegate.
    * @param options Options bucket
    */
  def subscribe(): sipDotJsLib.libCoreMessagesMethodsSubscribeMod.OutgoingSubscribeRequest = js.native
  def subscribe(delegate: sipDotJsLib.libCoreMessagesMethodsSubscribeMod.OutgoingSubscribeRequestDelegate): sipDotJsLib.libCoreMessagesMethodsSubscribeMod.OutgoingSubscribeRequest = js.native
  def subscribe(
    delegate: sipDotJsLib.libCoreMessagesMethodsSubscribeMod.OutgoingSubscribeRequestDelegate,
    options: sipDotJsLib.libCoreMessagesOutgoingDashRequestMod.RequestOptions
  ): sipDotJsLib.libCoreMessagesMethodsSubscribeMod.OutgoingSubscribeRequest = js.native
  /**
    * 4.1.2.3.  Unsubscribing
    * https://tools.ietf.org/html/rfc6665#section-4.1.2.3
    */
  def unsubscribe(): sipDotJsLib.libCoreMessagesMethodsSubscribeMod.OutgoingSubscribeRequest = js.native
}

