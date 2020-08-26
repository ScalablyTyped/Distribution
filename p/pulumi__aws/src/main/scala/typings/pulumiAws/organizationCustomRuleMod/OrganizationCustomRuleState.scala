package typings.pulumiAws.organizationCustomRuleMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrganizationCustomRuleState extends js.Object {
  /**
    * Amazon Resource Name (ARN) of the rule
    */
  val arn: js.UndefOr[Input[String]] = js.native
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
    * Amazon Resource Name (ARN) of the rule Lambda Function
    */
  val lambdaFunctionArn: js.UndefOr[Input[String]] = js.native
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
    * Tag key of AWS resources to evaluate
    */
  val tagKeyScope: js.UndefOr[Input[String]] = js.native
  /**
    * Tag value of AWS resources to evaluate
    */
  val tagValueScope: js.UndefOr[Input[String]] = js.native
  /**
    * List of notification types that trigger AWS Config to run an evaluation for the rule. Valid values: `ConfigurationItemChangeNotification`, `OversizedConfigurationItemChangeNotification`, and `ScheduledNotification`
    */
  val triggerTypes: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
}

object OrganizationCustomRuleState {
  @scala.inline
  def apply(): OrganizationCustomRuleState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrganizationCustomRuleState]
  }
  @scala.inline
  implicit class OrganizationCustomRuleStateOps[Self <: OrganizationCustomRuleState] (val x: Self) extends AnyVal {
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
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
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
    def setLambdaFunctionArn(value: Input[String]): Self = this.set("lambdaFunctionArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLambdaFunctionArn: Self = this.set("lambdaFunctionArn", js.undefined)
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
    @scala.inline
    def setTriggerTypesVarargs(value: Input[String]*): Self = this.set("triggerTypes", js.Array(value :_*))
    @scala.inline
    def setTriggerTypes(value: Input[js.Array[Input[String]]]): Self = this.set("triggerTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTriggerTypes: Self = this.set("triggerTypes", js.undefined)
  }
  
}

