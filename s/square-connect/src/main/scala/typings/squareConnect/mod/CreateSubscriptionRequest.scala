package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "CreateSubscriptionRequest")
@js.native
class CreateSubscriptionRequest () extends StObject {
  
  /**
    * The date when the subscription should be canceled, in YYYY-MM-DD format (for example, 2025-02-29).
    * This overrides the plan configuration if it comes before the date the subscription would otherwise end.
    */
  var canceled_date: js.UndefOr[String] = js.native
  
  /**
    * The ID of the `customer](#type-customer) [card` to charge. If not specified, Square sends an invoice via email.
    * For an example to create a customer and add a card on file, see [Subscriptions Walkthrough](https://developer.squareup.com/docs/docs/subscriptions-api/walkthrough).
    */
  var card_id: js.UndefOr[String] = js.native
  
  /**
    * The ID of the `customer` profile.
    */
  var customer_id: String = js.native
  
  /**
    * A unique string that identifies this `CreateSubscription` request.
    * If you do not provide a unique string (or provide an empty string as the value), the endpoint treats each request as independent.
    * For more information, see [Idempotency keys](https://developer.squareup.com/docs/docs/working-with-apis/idempotency).
    */
  var idempotency_key: String = js.native
  
  /**
    * The ID of the location the subscription is associated with.
    */
  var location_id: String = js.native
  
  /**
    * The ID of the subscription plan.
    * For more information, see [Subscription Plan Overview](https://developer.squareup.com/docs/docs/subscriptions/overview).
    */
  var plan_id: String = js.native
  
  /**
    * A custom price to apply for the subscription. If specified, it overrides the price configured by the subscription plan.
    */
  var price_override_money: js.UndefOr[Money] = js.native
  
  /**
    * The start date of the subscription, in YYYY-MM-DD format. For example, 2013-01-15.
    * If the start date is left empty, the subscription begins immediately.
    */
  var start_date: js.UndefOr[String] = js.native
  
  /**
    * The tax to add when billing the subscription.
    * The percentage is expressed in decimal form, using a `'.'` as the decimal separator and without a `'%'` sign.
    * For example, a value of 7.5 corresponds to 7.5%.
    */
  var tax_percentage: js.UndefOr[String] = js.native
  
  /**
    * The timezone that is used in date calculations for the subscription. If unset, defaults to the location timezone.
    * If a timezone is not configured for the location, defaults to \"America/New_York\".
    * Format: the IANA Timezone Database identifier for the location timezone.
    * For a list of time zones, see [List of tz database time zones](https://en.wikipedia.org/wiki/List_of_tz_database_time_zones).
    */
  var timezone: js.UndefOr[String] = js.native
}
