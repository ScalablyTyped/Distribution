package typings
package atPulumiAwsLib.budgetsBudgetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/budgets/budget", "Budget")
@js.native
class Budget protected ()
  extends atPulumiPulumiLib.pulumiMod.CustomResource {
  /**
    * Create a Budget resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: BudgetArgs) = this()
  def this(name: java.lang.String, args: BudgetArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * The ID of the target account for budget. Will use current user's account_id by default if omitted.
    */
  val accountId: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * Whether this budget tracks monetary cost or usage.
    */
  val budgetType: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * Map of CostFilters key/value pairs to apply to the budget.
    */
  val costFilters: atPulumiPulumiLib.pulumiMod.Output[org.scalablytyped.runtime.StringDictionary[_]] = js.native
  /**
    * Object containing CostTypes The types of cost included in a budget, such as tax and subscriptions..
    */
  val costTypes: atPulumiPulumiLib.pulumiMod.Output[atPulumiAwsLib.Anon_IncludeRecurringIncludeCredit] = js.native
  /**
    * The amount of cost or usage being measured for a budget.
    */
  val limitAmount: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * The unit of measurement used for the budget forecast, actual spend, or budget threshold, such as dollars or GB. See [Spend](http://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/data-type-spend.html) documentation.
    */
  val limitUnit: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * The name of a budget. Unique within accounts.
    */
  val name: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * The prefix of the name of a budget. Unique within accounts.
    */
  val namePrefix: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * The end of the time period covered by the budget. There are no restrictions on the end date. Format: `2017-01-01_12:00`.
    */
  val timePeriodEnd: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The start of the time period covered by the budget. The start date must come before the end date. Format: `2017-01-01_12:00`.
    */
  val timePeriodStart: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * The length of time until a budget resets the actual and forecasted spend. Valid values: `MONTHLY`, `QUARTERLY`, `ANNUALLY`.
    */
  val timeUnit: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
}

@JSImport("@pulumi/aws/budgets/budget", "Budget")
@js.native
object Budget extends js.Object {
  /**
    * Get an existing Budget resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.budgetsBudgetMod.Budget = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.budgetsBudgetMod.BudgetState
  ): atPulumiAwsLib.budgetsBudgetMod.Budget = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.budgetsBudgetMod.BudgetState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.budgetsBudgetMod.Budget = js.native
}

