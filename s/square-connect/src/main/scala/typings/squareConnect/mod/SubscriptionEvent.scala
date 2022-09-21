package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "SubscriptionEvent")
@js.native
open class SubscriptionEvent () extends StObject {
  
  /**
    * The date, in YYYY-MM-DD format (for example, 2013-01-15), when the subscription event went into effect.
    */
  var effective_date: String = js.native
  
  /**
    * The ID of the subscription event.
    */
  var id: String = js.native
  
  /**
    * The ID of the subscription plan associated with the subscription.
    */
  var plan_id: String = js.native
  
  /**
    * Type of the subscription event.
    * See [SubscriptionEventSubscriptionEventType](#type-subscriptioneventsubscriptioneventtype) for possible values.
    */
  var subscription_event_type: String = js.native
}
