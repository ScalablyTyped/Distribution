package typings.atPulumiAws.wafRateBasedRuleMod

import typings.atPulumiAws.Anon_DataId
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/waf/rateBasedRule", "RateBasedRule")
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
    * The name or description for the Amazon CloudWatch metric of this rule.
    */
  val metricName: Output[String] = js.native
  /**
    * The name or description of the rule.
    */
  val name: Output[String] = js.native
  /**
    * The objects to include in a rule (documented below).
    */
  val predicates: Output[js.UndefOr[js.Array[Anon_DataId]]] = js.native
  /**
    * Valid value is IP.
    */
  val rateKey: Output[String] = js.native
  /**
    * The maximum number of requests, which have an identical value in the field specified by the RateKey, allowed in a five-minute period. Minimum value is 2000.
    */
  val rateLimit: Output[Double] = js.native
}

/* static members */
@JSImport("@pulumi/aws/waf/rateBasedRule", "RateBasedRule")
@js.native
object RateBasedRule extends js.Object {
  /**
    * Get an existing RateBasedRule resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): RateBasedRule = js.native
  def get(name: String, id: Input[ID], state: RateBasedRuleState): RateBasedRule = js.native
  def get(name: String, id: Input[ID], state: RateBasedRuleState, opts: CustomResourceOptions): RateBasedRule = js.native
  /**
    * Returns true if the given object is an instance of RateBasedRule.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/waf/rateBasedRule.RateBasedRule */ Boolean = js.native
}

