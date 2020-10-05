package typings.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def addSubscription(eventType: String, subscription: EventSubscription): EventSubscription = js.native
  /**
    * Returns the array of subscriptions that are currently registered for the
    * given event type.
    *
    * Note: This array can be potentially sparse as subscriptions are deleted
    * from it when they are removed.
    *
    */
  def getSubscriptionsForType(eventType: String): js.Array[EventSubscription] = js.native
  /**
    * Removes a bulk set of the subscriptions.
    *
    * @param eventType - Optional name of the event type whose
    *   registered supscriptions to remove, if null remove all subscriptions.
    */
  def removeAllSubscriptions(): Unit = js.native
  def removeAllSubscriptions(eventType: String): Unit = js.native
  /**
    * Removes a specific subscription. Instead of calling this function, call
    * `subscription.remove()` directly.
    *
    */
  def removeSubscription(subscription: js.Any): Unit = js.native
}

