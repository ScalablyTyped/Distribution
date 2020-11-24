package typings.pulumiAws.budgetMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.budgets.BudgetCostTypes
import typings.pulumiAws.outputMod.budgets.BudgetNotification
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    * The ID of the target account for budget. Will use current user's accountId by default if omitted.
    */
  val accountId: Output_[String] = js.native
  
  /**
    * Whether this budget tracks monetary cost or usage.
    */
  val budgetType: Output_[String] = js.native
  
  /**
    * Map of CostFilters key/value pairs to apply to the budget.
    */
  val costFilters: Output_[StringDictionary[String]] = js.native
  
  /**
    * Object containing CostTypes The types of cost included in a budget, such as tax and subscriptions..
    */
  val costTypes: Output_[BudgetCostTypes] = js.native
  
  /**
    * The amount of cost or usage being measured for a budget.
    */
  val limitAmount: Output_[String] = js.native
  
  /**
    * The unit of measurement used for the budget forecast, actual spend, or budget threshold, such as dollars or GB. See [Spend](http://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/data-type-spend.html) documentation.
    */
  val limitUnit: Output_[String] = js.native
  
  /**
    * The name of a budget. Unique within accounts.
    */
  val name: Output_[String] = js.native
  
  /**
    * The prefix of the name of a budget. Unique within accounts.
    */
  val namePrefix: Output_[String] = js.native
  
  /**
    * Object containing Budget Notifications. Can be used multiple times to define more than one budget notification
    */
  val notifications: Output_[js.UndefOr[js.Array[BudgetNotification]]] = js.native
  
  /**
    * The end of the time period covered by the budget. There are no restrictions on the end date. Format: `2017-01-01_12:00`.
    */
  val timePeriodEnd: Output_[js.UndefOr[String]] = js.native
  
  /**
    * The start of the time period covered by the budget. The start date must come before the end date. Format: `2017-01-01_12:00`.
    */
  val timePeriodStart: Output_[String] = js.native
  
  /**
    * The length of time until a budget resets the actual and forecasted spend. Valid values: `MONTHLY`, `QUARTERLY`, `ANNUALLY`.
    */
  val timeUnit: Output_[String] = js.native
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
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): Budget = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Budget = js.native
  def get(name: String, id: Input[ID], state: BudgetState): Budget = js.native
  def get(name: String, id: Input[ID], state: BudgetState, opts: CustomResourceOptions): Budget = js.native
  
  /**
    * Returns true if the given object is an instance of Budget.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/budgets/budget.Budget */ Boolean = js.native
}
