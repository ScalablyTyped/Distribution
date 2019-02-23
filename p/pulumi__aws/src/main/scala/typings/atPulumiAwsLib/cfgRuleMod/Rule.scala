package typings
package atPulumiAwsLib.cfgRuleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/cfg/rule", "Rule")
@js.native
class Rule protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a Rule resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: RuleArgs) = this()
  def this(name: java.lang.String, args: RuleArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * The ARN of the config rule
    */
  val arn: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * Description of the rule
    */
  val description: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * A string in JSON format that is passed to the AWS Config rule Lambda function.
    */
  val inputParameters: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The frequency that you want AWS Config to run evaluations for a rule that
    * is triggered periodically. If specified, requires `message_type` to be `ScheduledNotification`.
    */
  val maximumExecutionFrequency: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The name of the rule
    */
  val name: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * The ID of the config rule
    */
  val ruleId: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * Scope defines which resources can trigger an evaluation for the rule as documented below.
    */
  val scope: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[atPulumiAwsLib.Anon_ComplianceResourceId]] = js.native
  /**
    * Source specifies the rule owner, the rule identifier, and the notifications that cause
    * the function to evaluate your AWS resources as documented below.
    */
  val source: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiAwsLib.Anon_Owner] = js.native
}

/* static members */
@JSImport("@pulumi/aws/cfg/rule", "Rule")
@js.native
object Rule extends js.Object {
  /**
    * Get an existing Rule resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.cfgRuleMod.Rule = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.cfgRuleMod.RuleState
  ): atPulumiAwsLib.cfgRuleMod.Rule = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.cfgRuleMod.RuleState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.cfgRuleMod.Rule = js.native
}

