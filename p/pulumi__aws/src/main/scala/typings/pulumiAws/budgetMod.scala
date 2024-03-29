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
    
    @JSImport("@pulumi/aws/budgets/budget", "Budget")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Budget resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): Budget = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Budget]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): Budget = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Budget]
    inline def get(name: String, id: Input[ID], state: BudgetState): Budget = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Budget]
    inline def get(name: String, id: Input[ID], state: BudgetState, opts: CustomResourceOptions): Budget = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Budget]
    
    /**
      * Returns true if the given object is an instance of Budget.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/budgets/budget.Budget */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/budgets/budget.Budget */ Boolean]
  }
  
  trait BudgetArgs extends StObject {
    
    /**
      * The ID of the target account for budget. Will use current user's accountId by default if omitted.
      */
    val accountId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Whether this budget tracks monetary cost or usage.
      */
    val budgetType: Input[String]
    
    /**
      * Map of CostFilters key/value pairs to apply to the budget.
      */
    val costFilters: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * Object containing CostTypes The types of cost included in a budget, such as tax and subscriptions..
      */
    val costTypes: js.UndefOr[Input[typings.pulumiAws.inputMod.budgets.BudgetCostTypes]] = js.undefined
    
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
    val notifications: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.budgets.BudgetNotification]]]] = js.undefined
    
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
    
    inline def apply(
      budgetType: Input[String],
      limitAmount: Input[String],
      limitUnit: Input[String],
      timePeriodStart: Input[String],
      timeUnit: Input[String]
    ): BudgetArgs = {
      val __obj = js.Dynamic.literal(budgetType = budgetType.asInstanceOf[js.Any], limitAmount = limitAmount.asInstanceOf[js.Any], limitUnit = limitUnit.asInstanceOf[js.Any], timePeriodStart = timePeriodStart.asInstanceOf[js.Any], timeUnit = timeUnit.asInstanceOf[js.Any])
      __obj.asInstanceOf[BudgetArgs]
    }
    
    extension [Self <: BudgetArgs](x: Self) {
      
      inline def setAccountId(value: Input[String]): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
      
      inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
      
      inline def setBudgetType(value: Input[String]): Self = StObject.set(x, "budgetType", value.asInstanceOf[js.Any])
      
      inline def setCostFilters(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "costFilters", value.asInstanceOf[js.Any])
      
      inline def setCostFiltersUndefined: Self = StObject.set(x, "costFilters", js.undefined)
      
      inline def setCostTypes(value: Input[typings.pulumiAws.inputMod.budgets.BudgetCostTypes]): Self = StObject.set(x, "costTypes", value.asInstanceOf[js.Any])
      
      inline def setCostTypesUndefined: Self = StObject.set(x, "costTypes", js.undefined)
      
      inline def setLimitAmount(value: Input[String]): Self = StObject.set(x, "limitAmount", value.asInstanceOf[js.Any])
      
      inline def setLimitUnit(value: Input[String]): Self = StObject.set(x, "limitUnit", value.asInstanceOf[js.Any])
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNamePrefix(value: Input[String]): Self = StObject.set(x, "namePrefix", value.asInstanceOf[js.Any])
      
      inline def setNamePrefixUndefined: Self = StObject.set(x, "namePrefix", js.undefined)
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setNotifications(value: Input[js.Array[Input[typings.pulumiAws.inputMod.budgets.BudgetNotification]]]): Self = StObject.set(x, "notifications", value.asInstanceOf[js.Any])
      
      inline def setNotificationsUndefined: Self = StObject.set(x, "notifications", js.undefined)
      
      inline def setNotificationsVarargs(value: Input[typings.pulumiAws.inputMod.budgets.BudgetNotification]*): Self = StObject.set(x, "notifications", js.Array(value :_*))
      
      inline def setTimePeriodEnd(value: Input[String]): Self = StObject.set(x, "timePeriodEnd", value.asInstanceOf[js.Any])
      
      inline def setTimePeriodEndUndefined: Self = StObject.set(x, "timePeriodEnd", js.undefined)
      
      inline def setTimePeriodStart(value: Input[String]): Self = StObject.set(x, "timePeriodStart", value.asInstanceOf[js.Any])
      
      inline def setTimeUnit(value: Input[String]): Self = StObject.set(x, "timeUnit", value.asInstanceOf[js.Any])
    }
  }
  
  trait BudgetState extends StObject {
    
    /**
      * The ID of the target account for budget. Will use current user's accountId by default if omitted.
      */
    val accountId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Whether this budget tracks monetary cost or usage.
      */
    val budgetType: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Map of CostFilters key/value pairs to apply to the budget.
      */
    val costFilters: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * Object containing CostTypes The types of cost included in a budget, such as tax and subscriptions..
      */
    val costTypes: js.UndefOr[Input[typings.pulumiAws.inputMod.budgets.BudgetCostTypes]] = js.undefined
    
    /**
      * The amount of cost or usage being measured for a budget.
      */
    val limitAmount: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The unit of measurement used for the budget forecast, actual spend, or budget threshold, such as dollars or GB. See [Spend](http://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/data-type-spend.html) documentation.
      */
    val limitUnit: js.UndefOr[Input[String]] = js.undefined
    
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
    val notifications: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.budgets.BudgetNotification]]]] = js.undefined
    
    /**
      * The end of the time period covered by the budget. There are no restrictions on the end date. Format: `2017-01-01_12:00`.
      */
    val timePeriodEnd: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The start of the time period covered by the budget. The start date must come before the end date. Format: `2017-01-01_12:00`.
      */
    val timePeriodStart: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The length of time until a budget resets the actual and forecasted spend. Valid values: `MONTHLY`, `QUARTERLY`, `ANNUALLY`.
      */
    val timeUnit: js.UndefOr[Input[String]] = js.undefined
  }
  object BudgetState {
    
    inline def apply(): BudgetState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BudgetState]
    }
    
    extension [Self <: BudgetState](x: Self) {
      
      inline def setAccountId(value: Input[String]): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
      
      inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
      
      inline def setBudgetType(value: Input[String]): Self = StObject.set(x, "budgetType", value.asInstanceOf[js.Any])
      
      inline def setBudgetTypeUndefined: Self = StObject.set(x, "budgetType", js.undefined)
      
      inline def setCostFilters(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "costFilters", value.asInstanceOf[js.Any])
      
      inline def setCostFiltersUndefined: Self = StObject.set(x, "costFilters", js.undefined)
      
      inline def setCostTypes(value: Input[typings.pulumiAws.inputMod.budgets.BudgetCostTypes]): Self = StObject.set(x, "costTypes", value.asInstanceOf[js.Any])
      
      inline def setCostTypesUndefined: Self = StObject.set(x, "costTypes", js.undefined)
      
      inline def setLimitAmount(value: Input[String]): Self = StObject.set(x, "limitAmount", value.asInstanceOf[js.Any])
      
      inline def setLimitAmountUndefined: Self = StObject.set(x, "limitAmount", js.undefined)
      
      inline def setLimitUnit(value: Input[String]): Self = StObject.set(x, "limitUnit", value.asInstanceOf[js.Any])
      
      inline def setLimitUnitUndefined: Self = StObject.set(x, "limitUnit", js.undefined)
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNamePrefix(value: Input[String]): Self = StObject.set(x, "namePrefix", value.asInstanceOf[js.Any])
      
      inline def setNamePrefixUndefined: Self = StObject.set(x, "namePrefix", js.undefined)
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setNotifications(value: Input[js.Array[Input[typings.pulumiAws.inputMod.budgets.BudgetNotification]]]): Self = StObject.set(x, "notifications", value.asInstanceOf[js.Any])
      
      inline def setNotificationsUndefined: Self = StObject.set(x, "notifications", js.undefined)
      
      inline def setNotificationsVarargs(value: Input[typings.pulumiAws.inputMod.budgets.BudgetNotification]*): Self = StObject.set(x, "notifications", js.Array(value :_*))
      
      inline def setTimePeriodEnd(value: Input[String]): Self = StObject.set(x, "timePeriodEnd", value.asInstanceOf[js.Any])
      
      inline def setTimePeriodEndUndefined: Self = StObject.set(x, "timePeriodEnd", js.undefined)
      
      inline def setTimePeriodStart(value: Input[String]): Self = StObject.set(x, "timePeriodStart", value.asInstanceOf[js.Any])
      
      inline def setTimePeriodStartUndefined: Self = StObject.set(x, "timePeriodStart", js.undefined)
      
      inline def setTimeUnit(value: Input[String]): Self = StObject.set(x, "timeUnit", value.asInstanceOf[js.Any])
      
      inline def setTimeUnitUndefined: Self = StObject.set(x, "timeUnit", js.undefined)
    }
  }
}
