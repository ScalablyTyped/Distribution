package typings.atPulumiAws.typesOutputMod.budgets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BudgetCostTypes extends js.Object {
  /**
    * A boolean value whether to include credits in the cost budget. Defaults to `true`
    */
  var includeCredit: js.UndefOr[Boolean] = js.undefined
  /**
    * Specifies whether a budget includes discounts. Defaults to `true`
    */
  var includeDiscount: js.UndefOr[Boolean] = js.undefined
  /**
    * A boolean value whether to include other subscription costs in the cost budget. Defaults to `true`
    */
  var includeOtherSubscription: js.UndefOr[Boolean] = js.undefined
  /**
    * A boolean value whether to include recurring costs in the cost budget. Defaults to `true`
    */
  var includeRecurring: js.UndefOr[Boolean] = js.undefined
  /**
    * A boolean value whether to include refunds in the cost budget. Defaults to `true`
    */
  var includeRefund: js.UndefOr[Boolean] = js.undefined
  /**
    * A boolean value whether to include subscriptions in the cost budget. Defaults to `true`
    */
  var includeSubscription: js.UndefOr[Boolean] = js.undefined
  /**
    * A boolean value whether to include support costs in the cost budget. Defaults to `true`
    */
  var includeSupport: js.UndefOr[Boolean] = js.undefined
  /**
    * A boolean value whether to include tax in the cost budget. Defaults to `true`
    */
  var includeTax: js.UndefOr[Boolean] = js.undefined
  /**
    * A boolean value whether to include upfront costs in the cost budget. Defaults to `true`
    */
  var includeUpfront: js.UndefOr[Boolean] = js.undefined
  /**
    * Specifies whether a budget uses the amortized rate. Defaults to `false`
    */
  var useAmortized: js.UndefOr[Boolean] = js.undefined
  /**
    * A boolean value whether to use blended costs in the cost budget. Defaults to `false`
    */
  var useBlended: js.UndefOr[Boolean] = js.undefined
}

object BudgetCostTypes {
  @scala.inline
  def apply(
    includeCredit: js.UndefOr[Boolean] = js.undefined,
    includeDiscount: js.UndefOr[Boolean] = js.undefined,
    includeOtherSubscription: js.UndefOr[Boolean] = js.undefined,
    includeRecurring: js.UndefOr[Boolean] = js.undefined,
    includeRefund: js.UndefOr[Boolean] = js.undefined,
    includeSubscription: js.UndefOr[Boolean] = js.undefined,
    includeSupport: js.UndefOr[Boolean] = js.undefined,
    includeTax: js.UndefOr[Boolean] = js.undefined,
    includeUpfront: js.UndefOr[Boolean] = js.undefined,
    useAmortized: js.UndefOr[Boolean] = js.undefined,
    useBlended: js.UndefOr[Boolean] = js.undefined
  ): BudgetCostTypes = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(includeCredit)) __obj.updateDynamic("includeCredit")(includeCredit)
    if (!js.isUndefined(includeDiscount)) __obj.updateDynamic("includeDiscount")(includeDiscount)
    if (!js.isUndefined(includeOtherSubscription)) __obj.updateDynamic("includeOtherSubscription")(includeOtherSubscription)
    if (!js.isUndefined(includeRecurring)) __obj.updateDynamic("includeRecurring")(includeRecurring)
    if (!js.isUndefined(includeRefund)) __obj.updateDynamic("includeRefund")(includeRefund)
    if (!js.isUndefined(includeSubscription)) __obj.updateDynamic("includeSubscription")(includeSubscription)
    if (!js.isUndefined(includeSupport)) __obj.updateDynamic("includeSupport")(includeSupport)
    if (!js.isUndefined(includeTax)) __obj.updateDynamic("includeTax")(includeTax)
    if (!js.isUndefined(includeUpfront)) __obj.updateDynamic("includeUpfront")(includeUpfront)
    if (!js.isUndefined(useAmortized)) __obj.updateDynamic("useAmortized")(useAmortized)
    if (!js.isUndefined(useBlended)) __obj.updateDynamic("useBlended")(useBlended)
    __obj.asInstanceOf[BudgetCostTypes]
  }
}

