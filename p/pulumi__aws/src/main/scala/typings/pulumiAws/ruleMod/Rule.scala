package typings.pulumiAws.ruleMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.cfg.RuleScope
import typings.pulumiAws.outputMod.cfg.RuleSource
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/cfg/rule", "Rule")
@js.native
class Rule protected () extends CustomResource {
  /**
    * Create a Rule resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: RuleArgs) = this()
  def this(name: String, args: RuleArgs, opts: CustomResourceOptions) = this()
  /**
    * The ARN of the config rule
    */
  val arn: Output_[String] = js.native
  /**
    * Description of the rule
    */
  val description: Output_[js.UndefOr[String]] = js.native
  /**
    * A string in JSON format that is passed to the AWS Config rule Lambda function.
    */
  val inputParameters: Output_[js.UndefOr[String]] = js.native
  /**
    * The frequency that you want AWS Config to run evaluations for a rule that
    * is triggered periodically. If specified, requires `messageType` to be `ScheduledNotification`.
    */
  val maximumExecutionFrequency: Output_[js.UndefOr[String]] = js.native
  /**
    * The name of the rule
    */
  val name: Output_[String] = js.native
  /**
    * The ID of the config rule
    */
  val ruleId: Output_[String] = js.native
  /**
    * Scope defines which resources can trigger an evaluation for the rule as documented below.
    */
  val scope: Output_[js.UndefOr[RuleScope]] = js.native
  /**
    * Source specifies the rule owner, the rule identifier, and the notifications that cause
    * the function to evaluate your AWS resources as documented below.
    */
  val source: Output_[RuleSource] = js.native
  /**
    * A map of tags to assign to the resource.
    */
  val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
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
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): Rule = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Rule = js.native
  def get(name: String, id: Input[ID], state: RuleState): Rule = js.native
  def get(name: String, id: Input[ID], state: RuleState, opts: CustomResourceOptions): Rule = js.native
  /**
    * Returns true if the given object is an instance of Rule.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cfg/rule.Rule */ Boolean = js.native
}

