package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * EventSubscriptionVendor stores a set of EventSubscriptions that are
 * subscribed to a particular event type.
 */
@js.native
trait EventSubscriptionVendor extends js.Object {
  /**
       * Adds a subscription keyed by an event type.
       *
       */
  def addSubscription(eventType: java.lang.String, subscription: EventSubscription): EventSubscription = js.native
  /**
       * Returns the array of subscriptions that are currently registered for the
       * given event type.
       *
       * Note: This array can be potentially sparse as subscriptions are deleted
       * from it when they are removed.
       *
       */
  def getSubscriptionsForType(eventType: java.lang.String): js.Array[EventSubscription] = js.native
  /**
       * Removes a bulk set of the subscriptions.
       *
       * @param eventType - Optional name of the event type whose
       *   registered supscriptions to remove, if null remove all subscriptions.
       */
  def removeAllSubscriptions(): scala.Unit = js.native
  /**
       * Removes a bulk set of the subscriptions.
       *
       * @param eventType - Optional name of the event type whose
       *   registered supscriptions to remove, if null remove all subscriptions.
       */
  def removeAllSubscriptions(eventType: java.lang.String): scala.Unit = js.native
  /**
       * Removes a specific subscription. Instead of calling this function, call
       * `subscription.remove()` directly.
       *
       */
  def removeSubscription(subscription: js.Any): scala.Unit = js.native
}

