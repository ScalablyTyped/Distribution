package typings.shopifyPrime.recurringChargeMod

import typings.shopifyPrime.chargeMod.Charge
import typings.shopifyPrime.shopifyPrimeStrings.accepted
import typings.shopifyPrime.shopifyPrimeStrings.active
import typings.shopifyPrime.shopifyPrimeStrings.cancelled
import typings.shopifyPrime.shopifyPrimeStrings.declined
import typings.shopifyPrime.shopifyPrimeStrings.expired
import typings.shopifyPrime.shopifyPrimeStrings.pending
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecurringCharge extends Charge {
  /**
    * The date and time the customer activated the charge. Will be null if the charge has not been activated.
    */
  var activated_on: js.UndefOr[String] = js.undefined
  /**
    * When using usage charges, this value indicates the remaining balance until the capped_amount is reached.
    */
  var balance_remaining: js.UndefOr[Double] = js.undefined
  /**
    * When using usage charges, this value indicates the total usage charges accrued during the current billing period.
    */
  var balance_used: js.UndefOr[Double] = js.undefined
  /**
    * The date and time the customer will be billed. Will be null if the charge has not been activated.
    */
  var billing_on: js.UndefOr[String] = js.undefined
  /**
    * The date and time the customer cancelled their recurring charge. Will be null if the charge has not been cancelled.
    */
  var cancelled_on: js.UndefOr[String] = js.undefined
  /**
    * The capped amount is the limit a customer can be charged for usage based billing. Note that Shopify returns this value as a string.
    */
  var capped_amount: js.UndefOr[Double | String] = js.undefined
  /**
    * tates the terms and conditions of usage based billing charges. Must be present in order to create usage charges. These are presented to the merchant when they approve the usage charges for your app.
    */
  var terms: js.UndefOr[String] = js.undefined
  /**
    * Number of days the customer is eligible for a free trial.
    */
  var trial_days: Double
  /**
    * The date and time the customer's free trial ends. Will be null if the charge has not been activated.
    */
  var trial_ends_on: js.UndefOr[String] = js.undefined
}

object RecurringCharge {
  @scala.inline
  def apply(
    name: String,
    trial_days: Double,
    activated_on: String = null,
    admin_graphql_api_id: String = null,
    balance_remaining: js.UndefOr[Double] = js.undefined,
    balance_used: js.UndefOr[Double] = js.undefined,
    billing_on: String = null,
    cancelled_on: String = null,
    capped_amount: Double | String = null,
    confirmation_url: String = null,
    created_at: String = null,
    id: js.UndefOr[Double] = js.undefined,
    price: String | Double = null,
    return_url: String = null,
    status: pending | accepted | active | cancelled | declined | expired = null,
    terms: String = null,
    test: js.UndefOr[Boolean] = js.undefined,
    trial_ends_on: String = null,
    updated_at: String = null
  ): RecurringCharge = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], trial_days = trial_days.asInstanceOf[js.Any])
    if (activated_on != null) __obj.updateDynamic("activated_on")(activated_on.asInstanceOf[js.Any])
    if (admin_graphql_api_id != null) __obj.updateDynamic("admin_graphql_api_id")(admin_graphql_api_id.asInstanceOf[js.Any])
    if (!js.isUndefined(balance_remaining)) __obj.updateDynamic("balance_remaining")(balance_remaining.get.asInstanceOf[js.Any])
    if (!js.isUndefined(balance_used)) __obj.updateDynamic("balance_used")(balance_used.get.asInstanceOf[js.Any])
    if (billing_on != null) __obj.updateDynamic("billing_on")(billing_on.asInstanceOf[js.Any])
    if (cancelled_on != null) __obj.updateDynamic("cancelled_on")(cancelled_on.asInstanceOf[js.Any])
    if (capped_amount != null) __obj.updateDynamic("capped_amount")(capped_amount.asInstanceOf[js.Any])
    if (confirmation_url != null) __obj.updateDynamic("confirmation_url")(confirmation_url.asInstanceOf[js.Any])
    if (created_at != null) __obj.updateDynamic("created_at")(created_at.asInstanceOf[js.Any])
    if (!js.isUndefined(id)) __obj.updateDynamic("id")(id.get.asInstanceOf[js.Any])
    if (price != null) __obj.updateDynamic("price")(price.asInstanceOf[js.Any])
    if (return_url != null) __obj.updateDynamic("return_url")(return_url.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (terms != null) __obj.updateDynamic("terms")(terms.asInstanceOf[js.Any])
    if (!js.isUndefined(test)) __obj.updateDynamic("test")(test.get.asInstanceOf[js.Any])
    if (trial_ends_on != null) __obj.updateDynamic("trial_ends_on")(trial_ends_on.asInstanceOf[js.Any])
    if (updated_at != null) __obj.updateDynamic("updated_at")(updated_at.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecurringCharge]
  }
}

