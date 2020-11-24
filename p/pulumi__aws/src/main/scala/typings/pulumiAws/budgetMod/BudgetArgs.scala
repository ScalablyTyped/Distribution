package typings.pulumiAws.budgetMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.budgets.BudgetCostTypes
import typings.pulumiAws.inputMod.budgets.BudgetNotification
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BudgetArgs extends js.Object {
  
  /**
    * The ID of the target account for budget. Will use current user's accountId by default if omitted.
    */
  val accountId: js.UndefOr[Input[String]] = js.native
  
  /**
    * Whether this budget tracks monetary cost or usage.
    */
  val budgetType: Input[String] = js.native
  
  /**
    * Map of CostFilters key/value pairs to apply to the budget.
    */
  val costFilters: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  
  /**
    * Object containing CostTypes The types of cost included in a budget, such as tax and subscriptions..
    */
  val costTypes: js.UndefOr[Input[BudgetCostTypes]] = js.native
  
  /**
    * The amount of cost or usage being measured for a budget.
    */
  val limitAmount: Input[String] = js.native
  
  /**
    * The unit of measurement used for the budget forecast, actual spend, or budget threshold, such as dollars or GB. See [Spend](http://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/data-type-spend.html) documentation.
    */
  val limitUnit: Input[String] = js.native
  
  /**
    * The name of a budget. Unique within accounts.
    */
  val name: js.UndefOr[Input[String]] = js.native
  
  /**
    * The prefix of the name of a budget. Unique within accounts.
    */
  val namePrefix: js.UndefOr[Input[String]] = js.native
  
  /**
    * Object containing Budget Notifications. Can be used multiple times to define more than one budget notification
    */
  val notifications: js.UndefOr[Input[js.Array[Input[BudgetNotification]]]] = js.native
  
  /**
    * The end of the time period covered by the budget. There are no restrictions on the end date. Format: `2017-01-01_12:00`.
    */
  val timePeriodEnd: js.UndefOr[Input[String]] = js.native
  
  /**
    * The start of the time period covered by the budget. The start date must come before the end date. Format: `2017-01-01_12:00`.
    */
  val timePeriodStart: Input[String] = js.native
  
  /**
    * The length of time until a budget resets the actual and forecasted spend. Valid values: `MONTHLY`, `QUARTERLY`, `ANNUALLY`.
    */
  val timeUnit: Input[String] = js.native
}
object BudgetArgs {
  
  @scala.inline
  def apply(
    budgetType: Input[String],
    limitAmount: Input[String],
    limitUnit: Input[String],
    timePeriodStart: Input[String],
    timeUnit: Input[String]
  ): BudgetArgs = {
    val __obj = js.Dynamic.literal(budgetType = budgetType.asInstanceOf[js.Any], limitAmount = limitAmount.asInstanceOf[js.Any], limitUnit = limitUnit.asInstanceOf[js.Any], timePeriodStart = timePeriodStart.asInstanceOf[js.Any], timeUnit = timeUnit.asInstanceOf[js.Any])
    __obj.asInstanceOf[BudgetArgs]
  }
  
  @scala.inline
  implicit class BudgetArgsOps[Self <: BudgetArgs] (val x: Self) extends AnyVal {
    
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
    def setBudgetType(value: Input[String]): Self = this.set("budgetType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitAmount(value: Input[String]): Self = this.set("limitAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUnit(value: Input[String]): Self = this.set("limitUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimePeriodStart(value: Input[String]): Self = this.set("timePeriodStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeUnit(value: Input[String]): Self = this.set("timeUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountId(value: Input[String]): Self = this.set("accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountId: Self = this.set("accountId", js.undefined)
    
    @scala.inline
    def setCostFilters(value: Input[StringDictionary[Input[String]]]): Self = this.set("costFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCostFilters: Self = this.set("costFilters", js.undefined)
    
    @scala.inline
    def setCostTypes(value: Input[BudgetCostTypes]): Self = this.set("costTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCostTypes: Self = this.set("costTypes", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNamePrefix(value: Input[String]): Self = this.set("namePrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNamePrefix: Self = this.set("namePrefix", js.undefined)
    
    @scala.inline
    def setNotificationsVarargs(value: Input[BudgetNotification]*): Self = this.set("notifications", js.Array(value :_*))
    
    @scala.inline
    def setNotifications(value: Input[js.Array[Input[BudgetNotification]]]): Self = this.set("notifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotifications: Self = this.set("notifications", js.undefined)
    
    @scala.inline
    def setTimePeriodEnd(value: Input[String]): Self = this.set("timePeriodEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimePeriodEnd: Self = this.set("timePeriodEnd", js.undefined)
  }
}
