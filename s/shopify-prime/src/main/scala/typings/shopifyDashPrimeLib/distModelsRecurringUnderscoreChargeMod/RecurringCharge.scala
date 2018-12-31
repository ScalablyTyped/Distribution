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

