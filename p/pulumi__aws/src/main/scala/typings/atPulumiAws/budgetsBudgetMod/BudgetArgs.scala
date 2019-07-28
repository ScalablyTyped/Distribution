package typings.atPulumiAws.budgetsBudgetMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.Anon_ComparisonOperatorNotificationType
import typings.atPulumiAws.Anon_IncludeCreditIncludeDiscount
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BudgetArgs extends js.Object {
  /**
    * The ID of the target account for budget. Will use current user's account_id by default if omitted.
    */
  val accountId: js.UndefOr[Input[String]] = js.undefined
  /**
    * Whether this budget tracks monetary cost or usage.
    */
  val budgetType: Input[String]
  /**
    * Map of CostFilters key/value pairs to apply to the budget.
    */
  val costFilters: js.UndefOr[Input[StringDictionary[_]]] = js.undefined
  /**
    * Object containing CostTypes The types of cost included in a budget, such as tax and subscriptions..
    */
  val costTypes: js.UndefOr[Input[Anon_IncludeCreditIncludeDiscount]] = js.undefined
  /**
    * The amount of cost or usage being measured for a budget.
    */
  val limitAmount: Input[String]
  /**
    * The unit of measurement used for the budget forecast, actual spend, or budget threshold, such as dollars or GB. See [Spend](http://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/data-type-spend.html) documentation.
    */
  val limitUnit: Input[String]
  /**
    * The name of a budget. Unique within accounts.
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  /**
    * The prefix of the name of a budget. Unique within accounts.
    */
  val namePrefix: js.UndefOr[Input[String]] = js.undefined
  /**
    * Object containing Budget Notifications. Can be used multiple times to define more than one budget notification
    */
  val notifications: js.UndefOr[Input[js.Array[Input[Anon_ComparisonOperatorNotificationType]]]] = js.undefined
  /**
    * The end of the time period covered by the budget. There are no restrictions on the end date. Format: `2017-01-01_12:00`.
    */
  val timePeriodEnd: js.UndefOr[Input[String]] = js.undefined
  /**
    * The start of the time period covered by the budget. The start date must come before the end date. Format: `2017-01-01_12:00`.
    */
  val timePeriodStart: Input[String]
  /**
    * The length of time until a budget resets the actual and forecasted spend. Valid values: `MONTHLY`, `QUARTERLY`, `ANNUALLY`.
    */
  val timeUnit: Input[String]
}

object BudgetArgs {
  @scala.inline
  def apply(
    budgetType: Input[String],
    limitAmount: Input[String],
    limitUnit: Input[String],
    timePeriodStart: Input[String],
    timeUnit: Input[String],
    accountId: Input[String] = null,
    costFilters: Input[StringDictionary[_]] = null,
    costTypes: Input[Anon_IncludeCreditIncludeDiscount] = null,
    name: Input[String] = null,
    namePrefix: Input[String] = null,
    notifications: Input[js.Array[Input[Anon_ComparisonOperatorNotificationType]]] = null,
    timePeriodEnd: Input[String] = null
  ): BudgetArgs = {
    val __obj = js.Dynamic.literal(budgetType = budgetType.asInstanceOf[js.Any], limitAmount = limitAmount.asInstanceOf[js.Any], limitUnit = limitUnit.asInstanceOf[js.Any], timePeriodStart = timePeriodStart.asInstanceOf[js.Any], timeUnit = timeUnit.asInstanceOf[js.Any])
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (costFilters != null) __obj.updateDynamic("costFilters")(costFilters.asInstanceOf[js.Any])
    if (costTypes != null) __obj.updateDynamic("costTypes")(costTypes.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (namePrefix != null) __obj.updateDynamic("namePrefix")(namePrefix.asInstanceOf[js.Any])
    if (notifications != null) __obj.updateDynamic("notifications")(notifications.asInstanceOf[js.Any])
    if (timePeriodEnd != null) __obj.updateDynamic("timePeriodEnd")(timePeriodEnd.asInstanceOf[js.Any])
    __obj.asInstanceOf[BudgetArgs]
  }
}

