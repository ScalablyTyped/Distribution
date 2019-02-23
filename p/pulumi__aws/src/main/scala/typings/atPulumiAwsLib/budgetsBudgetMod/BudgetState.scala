package typings
package atPulumiAwsLib.budgetsBudgetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BudgetState extends js.Object {
  /**
    * The ID of the target account for budget. Will use current user's account_id by default if omitted.
    */
  val accountId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Whether this budget tracks monetary cost or usage.
    */
  val budgetType: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Map of CostFilters key/value pairs to apply to the budget.
    */
  val costFilters: js.UndefOr[atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]]] = js.undefined
  /**
    * Object containing CostTypes The types of cost included in a budget, such as tax and subscriptions..
    */
  val costTypes: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_IncludeCreditIncludeDiscount]
  ] = js.undefined
  /**
    * The amount of cost or usage being measured for a budget.
    */
  val limitAmount: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The unit of measurement used for the budget forecast, actual spend, or budget threshold, such as dollars or GB. See [Spend](http://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/data-type-spend.html) documentation.
    */
  val limitUnit: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The name of a budget. Unique within accounts.
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The prefix of the name of a budget. Unique within accounts.
    */
  val namePrefix: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The end of the time period covered by the budget. There are no restrictions on the end date. Format: `2017-01-01_12:00`.
    */
  val timePeriodEnd: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The start of the time period covered by the budget. The start date must come before the end date. Format: `2017-01-01_12:00`.
    */
  val timePeriodStart: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The length of time until a budget resets the actual and forecasted spend. Valid values: `MONTHLY`, `QUARTERLY`, `ANNUALLY`.
    */
  val timeUnit: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

