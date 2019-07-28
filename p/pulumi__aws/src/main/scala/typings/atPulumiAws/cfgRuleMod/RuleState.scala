package typings.atPulumiAws.cfgRuleMod

import typings.atPulumiAws.Anon_ComplianceResourceIdComplianceResourceTypes
import typings.atPulumiAws.Anon_OwnerSourceDetails
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RuleState extends js.Object {
  /**
    * The ARN of the config rule
    */
  val arn: js.UndefOr[Input[String]] = js.undefined
  /**
    * Description of the rule
    */
  val description: js.UndefOr[Input[String]] = js.undefined
  /**
    * A string in JSON format that is passed to the AWS Config rule Lambda function.
    */
  val inputParameters: js.UndefOr[Input[String]] = js.undefined
  /**
    * The frequency that you want AWS Config to run evaluations for a rule that
    * is triggered periodically. If specified, requires `message_type` to be `ScheduledNotification`.
    */
  val maximumExecutionFrequency: js.UndefOr[Input[String]] = js.undefined
  /**
    * The name of the rule
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  /**
    * The ID of the config rule
    */
  val ruleId: js.UndefOr[Input[String]] = js.undefined
  /**
    * Scope defines which resources can trigger an evaluation for the rule as documented below.
    */
  val scope: js.UndefOr[Input[Anon_ComplianceResourceIdComplianceResourceTypes]] = js.undefined
  /**
    * Source specifies the rule owner, the rule identifier, and the notifications that cause
    * the function to evaluate your AWS resources as documented below.
    */
  val source: js.UndefOr[Input[Anon_OwnerSourceDetails]] = js.undefined
}

object RuleState {
  @scala.inline
  def apply(
    arn: Input[String] = null,
    description: Input[String] = null,
    inputParameters: Input[String] = null,
    maximumExecutionFrequency: Input[String] = null,
    name: Input[String] = null,
    ruleId: Input[String] = null,
    scope: Input[Anon_ComplianceResourceIdComplianceResourceTypes] = null,
    source: Input[Anon_OwnerSourceDetails] = null
  ): RuleState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (inputParameters != null) __obj.updateDynamic("inputParameters")(inputParameters.asInstanceOf[js.Any])
    if (maximumExecutionFrequency != null) __obj.updateDynamic("maximumExecutionFrequency")(maximumExecutionFrequency.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (ruleId != null) __obj.updateDynamic("ruleId")(ruleId.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleState]
  }
}

