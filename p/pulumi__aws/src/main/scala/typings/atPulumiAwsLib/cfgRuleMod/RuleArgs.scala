package typings
package atPulumiAwsLib.cfgRuleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RuleArgs extends js.Object {
  /**
    * Description of the rule
    */
  val description: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * A string in JSON format that is passed to the AWS Config rule Lambda function.
    */
  val inputParameters: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The frequency that you want AWS Config to run evaluations for a rule that
    * is triggered periodically. If specified, requires `message_type` to be `ScheduledNotification`.
    */
  val maximumExecutionFrequency: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The name of the rule
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Scope defines which resources can trigger an evaluation for the rule as documented below.
    */
  val scope: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_ComplianceResourceIdComplianceResourceTypes]
  ] = js.undefined
  /**
    * Source specifies the rule owner, the rule identifier, and the notifications that cause
    * the function to evaluate your AWS resources as documented below.
    */
  val source: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_OwnerSourceDetails]
}

object RuleArgs {
  @scala.inline
  def apply(
    source: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_OwnerSourceDetails],
    description: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    inputParameters: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    maximumExecutionFrequency: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    scope: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_ComplianceResourceIdComplianceResourceTypes] = null
  ): RuleArgs = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (inputParameters != null) __obj.updateDynamic("inputParameters")(inputParameters.asInstanceOf[js.Any])
    if (maximumExecutionFrequency != null) __obj.updateDynamic("maximumExecutionFrequency")(maximumExecutionFrequency.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleArgs]
  }
}

