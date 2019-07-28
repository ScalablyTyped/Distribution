package typings.atPulumiAws.budgetsBudgetMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.Anon_ComparisonOperator
import typings.atPulumiAws.Anon_IncludeCredit
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/budgets/budget", "Budget")
@js.native
class Budget protected () extends CustomResource {
  /**
    * Create a Budget resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: BudgetArgs) = this()
  def this(name: String, args: BudgetArgs, opts: CustomResourceOptions) = this()
  /**
    * The ID of the target account for budget. Will use current user's account_id by default if omitted.
    */
  val accountId: Output[String] = js.native
  /**
    * Whether this budget tracks monetary cost or usage.
    */
  val budgetType: Output[String] = js.native
  /**
    * Map of CostFilters key/value pairs to apply to the budget.
    */
  val costFilters: Output[StringDictionary[_]] = js.native
  /**
    * Object containing CostTypes The types of cost included in a budget, such as tax and subscriptions..
    */
  val costTypes: Output[Anon_IncludeCredit] = js.native
  /**
    * The amount of cost or usage being measured for a budget.
    */
  val limitAmount: Output[String] = js.native
  /**
    * The unit of measurement used for the budget forecast, actual spend, or budget threshold, such as dollars or GB. See [Spend](http://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/data-type-spend.html) documentation.
    */
  val limitUnit: Output[String] = js.native
  /**
    * The name of a budget. Unique within accounts.
    */
  val name: Output[String] = js.native
  /**
    * The prefix of the name of a budget. Unique within accounts.
    */
  val namePrefix: Output[String] = js.native
  /**
    * Object containing Budget Notifications. Can be used multiple times to define more than one budget notification
    */
  val notifications: Output[js.UndefOr[js.Array[Anon_ComparisonOperator]]] = js.native
  /**
    * The end of the time period covered by the budget. There are no restrictions on the end date. Format: `2017-01-01_12:00`.
    */
  val timePeriodEnd: Output[js.UndefOr[String]] = js.native
  /**
    * The start of the time period covered by the budget. The start date must come before the end date. Format: `2017-01-01_12:00`.
    */
  val timePeriodStart: Output[String] = js.native
  /**
    * The length of time until a budget resets the actual and forecasted spend. Valid values: `MONTHLY`, `QUARTERLY`, `ANNUALLY`.
    */
  val timeUnit: Output[String] = js.native
}

/* static members */
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
  def get(name: String, id: Input[ID]): Budget = js.native
  def get(name: String, id: Input[ID], state: BudgetState): Budget = js.native
  def get(name: String, id: Input[ID], state: BudgetState, opts: CustomResourceOptions): Budget = js.native
  /**
    * Returns true if the given object is an instance of Budget.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/budgets/budget.Budget */ Boolean = js.native
}

