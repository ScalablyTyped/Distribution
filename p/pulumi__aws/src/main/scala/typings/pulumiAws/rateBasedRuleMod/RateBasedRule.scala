package typings.pulumiAws.rateBasedRuleMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.wafregional.RateBasedRulePredicate
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/wafregional/rateBasedRule", "RateBasedRule")
@js.native
class RateBasedRule protected () extends CustomResource {
  /**
    * Create a RateBasedRule resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: RateBasedRuleArgs) = this()
  def this(name: String, args: RateBasedRuleArgs, opts: CustomResourceOptions) = this()
  /**
    * The ARN of the WAF Regional Rate Based Rule.
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
  val predicates: Output_[js.UndefOr[js.Array[RateBasedRulePredicate]]] = js.native
  /**
    * Valid value is IP.
    */
  val rateKey: Output_[String] = js.native
  /**
    * The maximum number of requests, which have an identical value in the field specified by the RateKey, allowed in a five-minute period. Minimum value is 100.
    */
  val rateLimit: Output_[Double] = js.native
  /**
    * Key-value map of resource tags
    */
  val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/wafregional/rateBasedRule", "RateBasedRule")
@js.native
object RateBasedRule extends js.Object {
  /**
    * Get an existing RateBasedRule resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): RateBasedRule = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): RateBasedRule = js.native
  def get(name: String, id: Input[ID], state: RateBasedRuleState): RateBasedRule = js.native
  def get(name: String, id: Input[ID], state: RateBasedRuleState, opts: CustomResourceOptions): RateBasedRule = js.native
  /**
    * Returns true if the given object is an instance of RateBasedRule.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/wafregional/rateBasedRule.RateBasedRule */ Boolean = js.native
}

