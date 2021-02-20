package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.budgets.BudgetCostTypes
import typings.pulumiAws.outputMod.budgets.BudgetNotification
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object budgetMod {
  
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
  object Budget {
    
    /**
      * Get an existing Budget resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/budgets/budget", "Budget.get")
    @js.native
    def get(name: String, id: Input[ID]): Budget = js.native
    @JSImport("@pulumi/aws/budgets/budget", "Budget.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Budget = js.native
    @JSImport("@pulumi/aws/budgets/budget", "Budget.get")
    @js.native
    def get(name: String, id: Input[ID], state: BudgetState): Budget = js.native
    @JSImport("@pulumi/aws/budgets/budget", "Budget.get")
    @js.native
    def get(name: String, id: Input[ID], state: BudgetState, opts: CustomResourceOptions): Budget = js.native
    
    /**
      * Returns true if the given object is an instance of Budget.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/budgets/budget", "Budget.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/budgets/budget.Budget */ Boolean = js.native
  }
  
  @js.native
  trait BudgetArgs extends StObject {
    
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
    val costTypes: js.UndefOr[Input[typings.pulumiAws.inputMod.budgets.BudgetCostTypes]] = js.native
    
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
    val notifications: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.budgets.BudgetNotification]]]] = js.native
    
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
    implicit class BudgetArgsMutableBuilder[Self <: BudgetArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccountId(value: Input[String]): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
      
      @scala.inline
      def setBudgetType(value: Input[String]): Self = StObject.set(x, "budgetType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCostFilters(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "costFilters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCostFiltersUndefined: Self = StObject.set(x, "costFilters", js.undefined)
      
      @scala.inline
      def setCostTypes(value: Input[typings.pulumiAws.inputMod.budgets.BudgetCostTypes]): Self = StObject.set(x, "costTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCostTypesUndefined: Self = StObject.set(x, "costTypes", js.undefined)
      
      @scala.inline
      def setLimitAmount(value: Input[String]): Self = StObject.set(x, "limitAmount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimitUnit(value: Input[String]): Self = StObject.set(x, "limitUnit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamePrefix(value: Input[String]): Self = StObject.set(x, "namePrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamePrefixUndefined: Self = StObject.set(x, "namePrefix", js.undefined)
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setNotifications(value: Input[js.Array[Input[typings.pulumiAws.inputMod.budgets.BudgetNotification]]]): Self = StObject.set(x, "notifications", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotificationsUndefined: Self = StObject.set(x, "notifications", js.undefined)
      
      @scala.inline
      def setNotificationsVarargs(value: Input[typings.pulumiAws.inputMod.budgets.BudgetNotification]*): Self = StObject.set(x, "notifications", js.Array(value :_*))
      
      @scala.inline
      def setTimePeriodEnd(value: Input[String]): Self = StObject.set(x, "timePeriodEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimePeriodEndUndefined: Self = StObject.set(x, "timePeriodEnd", js.undefined)
      
      @scala.inline
      def setTimePeriodStart(value: Input[String]): Self = StObject.set(x, "timePeriodStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeUnit(value: Input[String]): Self = StObject.set(x, "timeUnit", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait BudgetState extends StObject {
    
    /**
      * The ID of the target account for budget. Will use current user's accountId by default if omitted.
      */
    val accountId: js.UndefOr[Input[String]] = js.native
    
    /**
      * Whether this budget tracks monetary cost or usage.
      */
    val budgetType: js.UndefOr[Input[String]] = js.native
    
    /**
      * Map of CostFilters key/value pairs to apply to the budget.
      */
    val costFilters: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * Object containing CostTypes The types of cost included in a budget, such as tax and subscriptions..
      */
    val costTypes: js.UndefOr[Input[typings.pulumiAws.inputMod.budgets.BudgetCostTypes]] = js.native
    
    /**
      * The amount of cost or usage being measured for a budget.
      */
    val limitAmount: js.UndefOr[Input[String]] = js.native
    
    /**
      * The unit of measurement used for the budget forecast, actual spend, or budget threshold, such as dollars or GB. See [Spend](http://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/data-type-spend.html) documentation.
      */
    val limitUnit: js.UndefOr[Input[String]] = js.native
    
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
    val notifications: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.budgets.BudgetNotification]]]] = js.native
    
    /**
      * The end of the time period covered by the budget. There are no restrictions on the end date. Format: `2017-01-01_12:00`.
      */
    val timePeriodEnd: js.UndefOr[Input[String]] = js.native
    
    /**
      * The start of the time period covered by the budget. The start date must come before the end date. Format: `2017-01-01_12:00`.
      */
    val timePeriodStart: js.UndefOr[Input[String]] = js.native
    
    /**
      * The length of time until a budget resets the actual and forecasted spend. Valid values: `MONTHLY`, `QUARTERLY`, `ANNUALLY`.
      */
    val timeUnit: js.UndefOr[Input[String]] = js.native
  }
  object BudgetState {
    
    @scala.inline
    def apply(): BudgetState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BudgetState]
    }
    
    @scala.inline
    implicit class BudgetStateMutableBuilder[Self <: BudgetState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccountId(value: Input[String]): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
      
      @scala.inline
      def setBudgetType(value: Input[String]): Self = StObject.set(x, "budgetType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBudgetTypeUndefined: Self = StObject.set(x, "budgetType", js.undefined)
      
      @scala.inline
      def setCostFilters(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "costFilters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCostFiltersUndefined: Self = StObject.set(x, "costFilters", js.undefined)
      
      @scala.inline
      def setCostTypes(value: Input[typings.pulumiAws.inputMod.budgets.BudgetCostTypes]): Self = StObject.set(x, "costTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCostTypesUndefined: Self = StObject.set(x, "costTypes", js.undefined)
      
      @scala.inline
      def setLimitAmount(value: Input[String]): Self = StObject.set(x, "limitAmount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimitAmountUndefined: Self = StObject.set(x, "limitAmount", js.undefined)
      
      @scala.inline
      def setLimitUnit(value: Input[String]): Self = StObject.set(x, "limitUnit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimitUnitUndefined: Self = StObject.set(x, "limitUnit", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamePrefix(value: Input[String]): Self = StObject.set(x, "namePrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamePrefixUndefined: Self = StObject.set(x, "namePrefix", js.undefined)
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setNotifications(value: Input[js.Array[Input[typings.pulumiAws.inputMod.budgets.BudgetNotification]]]): Self = StObject.set(x, "notifications", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotificationsUndefined: Self = StObject.set(x, "notifications", js.undefined)
      
      @scala.inline
      def setNotificationsVarargs(value: Input[typings.pulumiAws.inputMod.budgets.BudgetNotification]*): Self = StObject.set(x, "notifications", js.Array(value :_*))
      
      @scala.inline
      def setTimePeriodEnd(value: Input[String]): Self = StObject.set(x, "timePeriodEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimePeriodEndUndefined: Self = StObject.set(x, "timePeriodEnd", js.undefined)
      
      @scala.inline
      def setTimePeriodStart(value: Input[String]): Self = StObject.set(x, "timePeriodStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimePeriodStartUndefined: Self = StObject.set(x, "timePeriodStart", js.undefined)
      
      @scala.inline
      def setTimeUnit(value: Input[String]): Self = StObject.set(x, "timeUnit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeUnitUndefined: Self = StObject.set(x, "timeUnit", js.undefined)
    }
  }
}
