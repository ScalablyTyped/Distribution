package typings.atPulumiAws.typesInputMod.budgets

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BudgetCostTypes extends js.Object {
  /**
    * A boolean value whether to include credits in the cost budget. Defaults to `true`
    */
  var includeCredit: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * Specifies whether a budget includes discounts. Defaults to `true`
    */
  var includeDiscount: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * A boolean value whether to include other subscription costs in the cost budget. Defaults to `true`
    */
  var includeOtherSubscription: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * A boolean value whether to include recurring costs in the cost budget. Defaults to `true`
    */
  var includeRecurring: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * A boolean value whether to include refunds in the cost budget. Defaults to `true`
    */
  var includeRefund: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * A boolean value whether to include subscriptions in the cost budget. Defaults to `true`
    */
  var includeSubscription: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * A boolean value whether to include support costs in the cost budget. Defaults to `true`
    */
  var includeSupport: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * A boolean value whether to include tax in the cost budget. Defaults to `true`
    */
  var includeTax: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * A boolean value whether to include upfront costs in the cost budget. Defaults to `true`
    */
  var includeUpfront: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * Specifies whether a budget uses the amortized rate. Defaults to `false`
    */
  var useAmortized: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * A boolean value whether to use blended costs in the cost budget. Defaults to `false`
    */
  var useBlended: js.UndefOr[Input[Boolean]] = js.undefined
}

object BudgetCostTypes {
  @scala.inline
  def apply(
    includeCredit: Input[Boolean] = null,
    includeDiscount: Input[Boolean] = null,
    includeOtherSubscription: Input[Boolean] = null,
    includeRecurring: Input[Boolean] = null,
    includeRefund: Input[Boolean] = null,
    includeSubscription: Input[Boolean] = null,
    includeSupport: Input[Boolean] = null,
    includeTax: Input[Boolean] = null,
    includeUpfront: Input[Boolean] = null,
    useAmortized: Input[Boolean] = null,
    useBlended: Input[Boolean] = null
  ): BudgetCostTypes = {
    val __obj = js.Dynamic.literal()
    if (includeCredit != null) __obj.updateDynamic("includeCredit")(includeCredit.asInstanceOf[js.Any])
    if (includeDiscount != null) __obj.updateDynamic("includeDiscount")(includeDiscount.asInstanceOf[js.Any])
    if (includeOtherSubscription != null) __obj.updateDynamic("includeOtherSubscription")(includeOtherSubscription.asInstanceOf[js.Any])
    if (includeRecurring != null) __obj.updateDynamic("includeRecurring")(includeRecurring.asInstanceOf[js.Any])
    if (includeRefund != null) __obj.updateDynamic("includeRefund")(includeRefund.asInstanceOf[js.Any])
    if (includeSubscription != null) __obj.updateDynamic("includeSubscription")(includeSubscription.asInstanceOf[js.Any])
    if (includeSupport != null) __obj.updateDynamic("includeSupport")(includeSupport.asInstanceOf[js.Any])
    if (includeTax != null) __obj.updateDynamic("includeTax")(includeTax.asInstanceOf[js.Any])
    if (includeUpfront != null) __obj.updateDynamic("includeUpfront")(includeUpfront.asInstanceOf[js.Any])
    if (useAmortized != null) __obj.updateDynamic("useAmortized")(useAmortized.asInstanceOf[js.Any])
    if (useBlended != null) __obj.updateDynamic("useBlended")(useBlended.asInstanceOf[js.Any])
    __obj.asInstanceOf[BudgetCostTypes]
  }
}

