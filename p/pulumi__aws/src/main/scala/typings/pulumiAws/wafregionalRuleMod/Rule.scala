package typings.pulumiAws.wafregionalRuleMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.wafregional.RulePredicate
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/wafregional/rule", "Rule")
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
    * The ARN of the WAF Regional Rule.
    */
  val arn: Output_[String] = js.native
  /**
    * The name or description for the Amazon CloudWatch metric of this rule.
    */
  val metricName: Output_[String] = js.native
  /**
    * The name or description of the rule.
    */
  val name: Output_[String] = js.native
  /**
    * The objects to include in a rule (documented below).
    */
  val predicates: Output_[js.UndefOr[js.Array[RulePredicate]]] = js.native
  /**
    * Key-value map of resource tags
    */
  val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/wafregional/rule", "Rule")
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
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/wafregional/rule.Rule */ Boolean = js.native
}

