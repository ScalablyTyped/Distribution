package typings.reactNative.mod

import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
Instantiable1[/* subscriber */ EventSubscriptionVendor, EventSubscription] {
  var eventType: String = js.native
  var key: Double = js.native
  var subscriber: EventSubscriptionVendor = js.native
  /**
    * Removes this subscription from the subscriber that controls it.
    */
  def remove(): Unit = js.native
}

