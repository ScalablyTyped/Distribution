package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "Subscription")
@js.native
open class Subscription () extends StObject {
  
  /**
    * The subscription cancellation date, in YYYY-MM-DD format (for example, 2013-01-15).
    * On this date, the subscription status changes to `CANCELED` and the subscription billing stops.
    * If you don't set this field, the subscription plan dictates if and  when subscription ends.
    * You cannot update this field, you can only clear it.
    */
  var canceled_date: js.UndefOr[String] = js.native
  
  /**
    * The ID of the `customer](#type-customer) [card` that is charged for the subscription.
    */
  var card_id: js.UndefOr[String] = js.native
  
  /**
    * The timestamp when the subscription was created, in RFC 3339 format.
    */
  var created_at: js.UndefOr[String] = js.native
  
  /**
    * The ID of the associated `customer` profile.
    */
  var customer_id: js.UndefOr[String] = js.native
  
  /**
    * The Square-assigned ID of the subscription.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * The IDs of the `invoices` created for the  subscription, listed in order when the invoices were created (oldest invoices appear first).
    */
  var invoice_ids: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The ID of the location associated with the subscription.
    */
  var location_id: js.UndefOr[String] = js.native
  
  /**
    * The date up to which the customer is invoiced for the subscription, in YYYY-MM-DD format (for example, 2013-01-15).
    * After the invoice is paid for a given billing period, this date will be the last day of the billing period.
    * For example, suppose for the month of May a customer gets an invoice (or charged the card) on May 1.
    * For the monthly billing scenario, this date is then set to May 31.
    */
  var paid_until_date: js.UndefOr[String] = js.native
  
  /**
    * The ID of the associated `subscription plan`.
    */
  var plan_id: js.UndefOr[String] = js.native
  
  /**
    * A custom price to apply for the subscription. If specified, it overrides the price configured by the subscription plan.
    */
  var price_override_money: js.UndefOr[Money] = js.native
  
  /**
    * The start date of the subscription, in YYYY-MM-DD format (for example, 2013-01-15).
    */
  var start_date: js.UndefOr[String] = js.native
  
  /**
    * The current status of the subscription. See [SubscriptionStatus](#type-subscriptionstatus) for possible values.
    */
  var status: js.UndefOr[String] = js.native
  
  /**
    * The tax amount applied when billing the subscription.
    * The percentage is expressed in decimal form, using a `'.'` as the decimal separator and without a `'%'` sign.
    * For example, a value of `7.5` corresponds to 7.5%.
    */
  var tax_percentage: js.UndefOr[String] = js.native
  
  /**
    * Timezone that will be used in date calculations for the subscription.
    * Defaults to the timezone of the location based on `location_id`.
    * Format: the IANA Timezone Database identifier for the location timezone (for example, `America/Los_Angeles`).
    */
  var timezone: js.UndefOr[String] = js.native
  
  /**
    * The version of the object. When updating an object, the version supplied must match the version in the database,
    * otherwise the write will be rejected as conflicting.
    */
  var version: js.UndefOr[Double] = js.native
}
