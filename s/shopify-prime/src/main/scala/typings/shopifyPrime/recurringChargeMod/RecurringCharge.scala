package typings.shopifyPrime.recurringChargeMod

import typings.shopifyPrime.chargeMod.Charge
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecurringCharge extends Charge {
  /**
    * The date and time the customer activated the charge. Will be null if the charge has not been activated.
    */
  var activated_on: js.UndefOr[String] = js.native
  /**
    * When using usage charges, this value indicates the remaining balance until the capped_amount is reached.
    */
  var balance_remaining: js.UndefOr[Double] = js.native
  /**
    * When using usage charges, this value indicates the total usage charges accrued during the current billing period.
    */
  var balance_used: js.UndefOr[Double] = js.native
  /**
    * The date and time the customer will be billed. Will be null if the charge has not been activated.
    */
  var billing_on: js.UndefOr[String] = js.native
  /**
    * The date and time the customer cancelled their recurring charge. Will be null if the charge has not been cancelled.
    */
  var cancelled_on: js.UndefOr[String] = js.native
  /**
    * The capped amount is the limit a customer can be charged for usage based billing. Note that Shopify returns this value as a string.
    */
  var capped_amount: js.UndefOr[Double | String] = js.native
  /**
    * tates the terms and conditions of usage based billing charges. Must be present in order to create usage charges. These are presented to the merchant when they approve the usage charges for your app.
    */
  var terms: js.UndefOr[String] = js.native
  /**
    * Number of days the customer is eligible for a free trial.
    */
  var trial_days: Double = js.native
  /**
    * The date and time the customer's free trial ends. Will be null if the charge has not been activated.
    */
  var trial_ends_on: js.UndefOr[String] = js.native
}

object RecurringCharge {
  @scala.inline
  def apply(name: String, trial_days: Double): RecurringCharge = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], trial_days = trial_days.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecurringCharge]
  }
  @scala.inline
  implicit class RecurringChargeOps[Self <: RecurringCharge] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTrial_days(value: Double): Self = this.set("trial_days", value.asInstanceOf[js.Any])
    @scala.inline
    def setActivated_on(value: String): Self = this.set("activated_on", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActivated_on: Self = this.set("activated_on", js.undefined)
    @scala.inline
    def setBalance_remaining(value: Double): Self = this.set("balance_remaining", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBalance_remaining: Self = this.set("balance_remaining", js.undefined)
    @scala.inline
    def setBalance_used(value: Double): Self = this.set("balance_used", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBalance_used: Self = this.set("balance_used", js.undefined)
    @scala.inline
    def setBilling_on(value: String): Self = this.set("billing_on", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBilling_on: Self = this.set("billing_on", js.undefined)
    @scala.inline
    def setCancelled_on(value: String): Self = this.set("cancelled_on", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCancelled_on: Self = this.set("cancelled_on", js.undefined)
    @scala.inline
    def setCapped_amount(value: Double | String): Self = this.set("capped_amount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCapped_amount: Self = this.set("capped_amount", js.undefined)
    @scala.inline
    def setTerms(value: String): Self = this.set("terms", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTerms: Self = this.set("terms", js.undefined)
    @scala.inline
    def setTrial_ends_on(value: String): Self = this.set("trial_ends_on", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrial_ends_on: Self = this.set("trial_ends_on", js.undefined)
  }
  
}

