package typings
package shopifyDashPrimeLib.distModelsRecurringUnderscoreChargeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecurringCharge
  extends shopifyDashPrimeLib.distModelsChargeMod.Charge {
  /**
    * The date and time the customer activated the charge. Will be null if the charge has not been activated.
    */
  var activated_on: js.UndefOr[java.lang.String] = js.undefined
  /**
    * When using usage charges, this value indicates the remaining balance until the capped_amount is reached.
    */
  var balance_remaining: js.UndefOr[scala.Double] = js.undefined
  /**
    * When using usage charges, this value indicates the total usage charges accrued during the current billing period.
    */
  var balance_used: js.UndefOr[scala.Double] = js.undefined
  /**
    * The date and time the customer will be billed. Will be null if the charge has not been activated.
    */
  var billing_on: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The date and time the customer cancelled their recurring charge. Will be null if the charge has not been cancelled.
    */
  var cancelled_on: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The capped amount is the limit a customer can be charged for usage based billing. Note that Shopify returns this value as a string.
    */
  var capped_amount: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
    * tates the terms and conditions of usage based billing charges. Must be present in order to create usage charges. These are presented to the merchant when they approve the usage charges for your app.
    */
  var terms: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Number of days the customer is eligible for a free trial.
    */
  var trial_days: scala.Double
  /**
    * The date and time the customer's free trial ends. Will be null if the charge has not been activated.
    */
  var trial_ends_on: js.UndefOr[java.lang.String] = js.undefined
}

object RecurringCharge {
  @scala.inline
  def apply(
    name: java.lang.String,
    trial_days: scala.Double,
    activated_on: java.lang.String = null,
    admin_graphql_api_id: java.lang.String = null,
    balance_remaining: scala.Int | scala.Double = null,
    balance_used: scala.Int | scala.Double = null,
    billing_on: java.lang.String = null,
    cancelled_on: java.lang.String = null,
    capped_amount: scala.Double | java.lang.String = null,
    confirmation_url: java.lang.String = null,
    created_at: java.lang.String = null,
    id: scala.Int | scala.Double = null,
    price: java.lang.String | scala.Double = null,
    return_url: java.lang.String = null,
    status: shopifyDashPrimeLib.shopifyDashPrimeLibStrings.pending | shopifyDashPrimeLib.shopifyDashPrimeLibStrings.accepted | shopifyDashPrimeLib.shopifyDashPrimeLibStrings.active | shopifyDashPrimeLib.shopifyDashPrimeLibStrings.cancelled | shopifyDashPrimeLib.shopifyDashPrimeLibStrings.declined | shopifyDashPrimeLib.shopifyDashPrimeLibStrings.expired = null,
    terms: java.lang.String = null,
    test: js.UndefOr[scala.Boolean] = js.undefined,
    trial_ends_on: java.lang.String = null,
    updated_at: java.lang.String = null
  ): RecurringCharge = {
    val __obj = js.Dynamic.literal(name = name, trial_days = trial_days)
    if (activated_on != null) __obj.updateDynamic("activated_on")(activated_on)
    if (admin_graphql_api_id != null) __obj.updateDynamic("admin_graphql_api_id")(admin_graphql_api_id)
    if (balance_remaining != null) __obj.updateDynamic("balance_remaining")(balance_remaining.asInstanceOf[js.Any])
    if (balance_used != null) __obj.updateDynamic("balance_used")(balance_used.asInstanceOf[js.Any])
    if (billing_on != null) __obj.updateDynamic("billing_on")(billing_on)
    if (cancelled_on != null) __obj.updateDynamic("cancelled_on")(cancelled_on)
    if (capped_amount != null) __obj.updateDynamic("capped_amount")(capped_amount.asInstanceOf[js.Any])
    if (confirmation_url != null) __obj.updateDynamic("confirmation_url")(confirmation_url)
    if (created_at != null) __obj.updateDynamic("created_at")(created_at)
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (price != null) __obj.updateDynamic("price")(price.asInstanceOf[js.Any])
    if (return_url != null) __obj.updateDynamic("return_url")(return_url)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (terms != null) __obj.updateDynamic("terms")(terms)
    if (!js.isUndefined(test)) __obj.updateDynamic("test")(test)
    if (trial_ends_on != null) __obj.updateDynamic("trial_ends_on")(trial_ends_on)
    if (updated_at != null) __obj.updateDynamic("updated_at")(updated_at)
    __obj.asInstanceOf[RecurringCharge]
  }
}

