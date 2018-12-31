package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * EventSubscription represents a subscription to a particular event. It can
  * remove its own subscription.
  */
@js.native
trait EventSubscription
  extends /**
  * @param subscriber the subscriber that controls
  *   this subscription.
  */
org.scalablytyped.runtime.Instantiable1[/* subscriber */ EventSubscriptionVendor, EventSubscription] {
  var eventType: java.lang.String = js.native
  var key: scala.Double = js.native
  var subscriber: EventSubscriptionVendor = js.native
  /**
    * Removes this subscription from the subscriber that controls it.
    */
  def remove(): scala.Unit = js.native
}

