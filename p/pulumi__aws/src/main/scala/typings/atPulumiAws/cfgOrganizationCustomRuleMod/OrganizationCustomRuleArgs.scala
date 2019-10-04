package typings.atPulumiAws.cfgOrganizationCustomRuleMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrganizationCustomRuleArgs extends js.Object {
  /**
    * Description of the rule
    */
  val description: js.UndefOr[Input[String]] = js.undefined
  /**
    * List of AWS account identifiers to exclude from the rule
    */
  val excludedAccounts: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * A string in JSON format that is passed to the AWS Config Rule Lambda Function
    */
  val inputParameters: js.UndefOr[Input[String]] = js.undefined
  /**
    * Amazon Resource Name (ARN) of the rule Lambda Function
    */
  val lambdaFunctionArn: Input[String]
  /**
    * The maximum frequency with which AWS Config runs evaluations for a rule, if the rule is triggered at a periodic frequency. Defaults to `TwentyFour_Hours` for periodic frequency triggered rules. Valid values: `One_Hour`, `Three_Hours`, `Six_Hours`, `Twelve_Hours`, or `TwentyFour_Hours`.
    */
  val maximumExecutionFrequency: js.UndefOr[Input[String]] = js.undefined
  /**
    * The name of the rule
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  /**
    * Identifier of the AWS resource to evaluate
    */
  val resourceIdScope: js.UndefOr[Input[String]] = js.undefined
  /**
    * List of types of AWS resources to evaluate
    */
  val resourceTypesScopes: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * Tag key of AWS resources to evaluate
    */
  val tagKeyScope: js.UndefOr[Input[String]] = js.undefined
  /**
    * Tag value of AWS resources to evaluate
    */
  val tagValueScope: js.UndefOr[Input[String]] = js.undefined
  /**
    * List of notification types that trigger AWS Config to run an evaluation for the rule. Valid values: `ConfigurationItemChangeNotification`, `OversizedConfigurationItemChangeNotification`, and `ScheduledNotification`
    */
  val triggerTypes: Input[js.Array[Input[String]]]
}

object OrganizationCustomRuleArgs {
  @scala.inline
  def apply(
    lambdaFunctionArn: Input[String],
    triggerTypes: Input[js.Array[Input[String]]],
    description: Input[String] = null,
    excludedAccounts: Input[js.Array[Input[String]]] = null,
    inputParameters: Input[String] = null,
    maximumExecutionFrequency: Input[String] = null,
    name: Input[String] = null,
    resourceIdScope: Input[String] = null,
    resourceTypesScopes: Input[js.Array[Input[String]]] = null,
    tagKeyScope: Input[String] = null,
    tagValueScope: Input[String] = null
  ): OrganizationCustomRuleArgs = {
    val __obj = js.Dynamic.literal(lambdaFunctionArn = lambdaFunctionArn.asInstanceOf[js.Any], triggerTypes = triggerTypes.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (excludedAccounts != null) __obj.updateDynamic("excludedAccounts")(excludedAccounts.asInstanceOf[js.Any])
    if (inputParameters != null) __obj.updateDynamic("inputParameters")(inputParameters.asInstanceOf[js.Any])
    if (maximumExecutionFrequency != null) __obj.updateDynamic("maximumExecutionFrequency")(maximumExecutionFrequency.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (resourceIdScope != null) __obj.updateDynamic("resourceIdScope")(resourceIdScope.asInstanceOf[js.Any])
    if (resourceTypesScopes != null) __obj.updateDynamic("resourceTypesScopes")(resourceTypesScopes.asInstanceOf[js.Any])
    if (tagKeyScope != null) __obj.updateDynamic("tagKeyScope")(tagKeyScope.asInstanceOf[js.Any])
    if (tagValueScope != null) __obj.updateDynamic("tagValueScope")(tagValueScope.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrganizationCustomRuleArgs]
  }
}

