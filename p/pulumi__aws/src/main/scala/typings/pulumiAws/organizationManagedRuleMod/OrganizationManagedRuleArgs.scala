package typings.pulumiAws.organizationManagedRuleMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrganizationManagedRuleArgs extends js.Object {
  
  /**
    * Description of the rule
    */
  val description: js.UndefOr[Input[String]] = js.native
  
  /**
    * List of AWS account identifiers to exclude from the rule
    */
  val excludedAccounts: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * A string in JSON format that is passed to the AWS Config Rule Lambda Function
    */
  val inputParameters: js.UndefOr[Input[String]] = js.native
  
  /**
    * The maximum frequency with which AWS Config runs evaluations for a rule, if the rule is triggered at a periodic frequency. Defaults to `TwentyFour_Hours` for periodic frequency triggered rules. Valid values: `One_Hour`, `Three_Hours`, `Six_Hours`, `Twelve_Hours`, or `TwentyFour_Hours`.
    */
  val maximumExecutionFrequency: js.UndefOr[Input[String]] = js.native
  
  /**
    * The name of the rule
    */
  val name: js.UndefOr[Input[String]] = js.native
  
  /**
    * Identifier of the AWS resource to evaluate
    */
  val resourceIdScope: js.UndefOr[Input[String]] = js.native
  
  /**
    * List of types of AWS resources to evaluate
    */
  val resourceTypesScopes: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * Identifier of an available AWS Config Managed Rule to call. For available values, see the [List of AWS Config Managed Rules](https://docs.aws.amazon.com/config/latest/developerguide/managed-rules-by-aws-config.html) documentation
    */
  val ruleIdentifier: Input[String] = js.native
  
  /**
    * Tag key of AWS resources to evaluate
    */
  val tagKeyScope: js.UndefOr[Input[String]] = js.native
  
  /**
    * Tag value of AWS resources to evaluate
    */
  val tagValueScope: js.UndefOr[Input[String]] = js.native
}
object OrganizationManagedRuleArgs {
  
  @scala.inline
  def apply(ruleIdentifier: Input[String]): OrganizationManagedRuleArgs = {
    val __obj = js.Dynamic.literal(ruleIdentifier = ruleIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrganizationManagedRuleArgs]
  }
  
  @scala.inline
  implicit class OrganizationManagedRuleArgsOps[Self <: OrganizationManagedRuleArgs] (val x: Self) extends AnyVal {
    
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
    def setRuleIdentifier(value: Input[String]): Self = this.set("ruleIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: Input[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setExcludedAccountsVarargs(value: Input[String]*): Self = this.set("excludedAccounts", js.Array(value :_*))
    
    @scala.inline
    def setExcludedAccounts(value: Input[js.Array[Input[String]]]): Self = this.set("excludedAccounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludedAccounts: Self = this.set("excludedAccounts", js.undefined)
    
    @scala.inline
    def setInputParameters(value: Input[String]): Self = this.set("inputParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputParameters: Self = this.set("inputParameters", js.undefined)
    
    @scala.inline
    def setMaximumExecutionFrequency(value: Input[String]): Self = this.set("maximumExecutionFrequency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximumExecutionFrequency: Self = this.set("maximumExecutionFrequency", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setResourceIdScope(value: Input[String]): Self = this.set("resourceIdScope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceIdScope: Self = this.set("resourceIdScope", js.undefined)
    
    @scala.inline
    def setResourceTypesScopesVarargs(value: Input[String]*): Self = this.set("resourceTypesScopes", js.Array(value :_*))
    
    @scala.inline
    def setResourceTypesScopes(value: Input[js.Array[Input[String]]]): Self = this.set("resourceTypesScopes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceTypesScopes: Self = this.set("resourceTypesScopes", js.undefined)
    
    @scala.inline
    def setTagKeyScope(value: Input[String]): Self = this.set("tagKeyScope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTagKeyScope: Self = this.set("tagKeyScope", js.undefined)
    
    @scala.inline
    def setTagValueScope(value: Input[String]): Self = this.set("tagValueScope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTagValueScope: Self = this.set("tagValueScope", js.undefined)
  }
}
