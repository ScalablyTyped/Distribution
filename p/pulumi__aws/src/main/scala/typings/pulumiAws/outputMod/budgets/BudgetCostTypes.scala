package typings.pulumiAws.outputMod.budgets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BudgetCostTypes extends js.Object {
  /**
    * A boolean value whether to include credits in the cost budget. Defaults to `true`
    */
  var includeCredit: js.UndefOr[Boolean] = js.native
  /**
    * Specifies whether a budget includes discounts. Defaults to `true`
    */
  var includeDiscount: js.UndefOr[Boolean] = js.native
  /**
    * A boolean value whether to include other subscription costs in the cost budget. Defaults to `true`
    */
  var includeOtherSubscription: js.UndefOr[Boolean] = js.native
  /**
    * A boolean value whether to include recurring costs in the cost budget. Defaults to `true`
    */
  var includeRecurring: js.UndefOr[Boolean] = js.native
  /**
    * A boolean value whether to include refunds in the cost budget. Defaults to `true`
    */
  var includeRefund: js.UndefOr[Boolean] = js.native
  /**
    * A boolean value whether to include subscriptions in the cost budget. Defaults to `true`
    */
  var includeSubscription: js.UndefOr[Boolean] = js.native
  /**
    * A boolean value whether to include support costs in the cost budget. Defaults to `true`
    */
  var includeSupport: js.UndefOr[Boolean] = js.native
  /**
    * A boolean value whether to include tax in the cost budget. Defaults to `true`
    */
  var includeTax: js.UndefOr[Boolean] = js.native
  /**
    * A boolean value whether to include upfront costs in the cost budget. Defaults to `true`
    */
  var includeUpfront: js.UndefOr[Boolean] = js.native
  /**
    * Specifies whether a budget uses the amortized rate. Defaults to `false`
    */
  var useAmortized: js.UndefOr[Boolean] = js.native
  /**
    * A boolean value whether to use blended costs in the cost budget. Defaults to `false`
    */
  var useBlended: js.UndefOr[Boolean] = js.native
}

object BudgetCostTypes {
  @scala.inline
  def apply(): BudgetCostTypes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BudgetCostTypes]
  }
  @scala.inline
  implicit class BudgetCostTypesOps[Self <: BudgetCostTypes] (val x: Self) extends AnyVal {
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
    def setIncludeCredit(value: Boolean): Self = this.set("includeCredit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeCredit: Self = this.set("includeCredit", js.undefined)
    @scala.inline
    def setIncludeDiscount(value: Boolean): Self = this.set("includeDiscount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeDiscount: Self = this.set("includeDiscount", js.undefined)
    @scala.inline
    def setIncludeOtherSubscription(value: Boolean): Self = this.set("includeOtherSubscription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeOtherSubscription: Self = this.set("includeOtherSubscription", js.undefined)
    @scala.inline
    def setIncludeRecurring(value: Boolean): Self = this.set("includeRecurring", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeRecurring: Self = this.set("includeRecurring", js.undefined)
    @scala.inline
    def setIncludeRefund(value: Boolean): Self = this.set("includeRefund", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeRefund: Self = this.set("includeRefund", js.undefined)
    @scala.inline
    def setIncludeSubscription(value: Boolean): Self = this.set("includeSubscription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeSubscription: Self = this.set("includeSubscription", js.undefined)
    @scala.inline
    def setIncludeSupport(value: Boolean): Self = this.set("includeSupport", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeSupport: Self = this.set("includeSupport", js.undefined)
    @scala.inline
    def setIncludeTax(value: Boolean): Self = this.set("includeTax", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeTax: Self = this.set("includeTax", js.undefined)
    @scala.inline
    def setIncludeUpfront(value: Boolean): Self = this.set("includeUpfront", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeUpfront: Self = this.set("includeUpfront", js.undefined)
    @scala.inline
    def setUseAmortized(value: Boolean): Self = this.set("useAmortized", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseAmortized: Self = this.set("useAmortized", js.undefined)
    @scala.inline
    def setUseBlended(value: Boolean): Self = this.set("useBlended", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseBlended: Self = this.set("useBlended", js.undefined)
  }
  
}

