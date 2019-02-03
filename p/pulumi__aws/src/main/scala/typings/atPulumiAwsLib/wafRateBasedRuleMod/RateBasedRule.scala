package typings
package atPulumiAwsLib.wafRateBasedRuleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/waf/rateBasedRule", "RateBasedRule")
@js.native
class RateBasedRule protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a RateBasedRule resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: RateBasedRuleArgs) = this()
  def this(name: java.lang.String, args: RateBasedRuleArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * The name or description for the Amazon CloudWatch metric of this rule.
    */
  val metricName: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * The name or description of the rule.
    */
  val name: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * One of ByteMatchSet, IPSet, SizeConstraintSet, SqlInjectionMatchSet, or XssMatchSet objects to include in a rule.
    */
  val predicates: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[js.Array[atPulumiAwsLib.Anon_DataId]]] = js.native
  /**
    * Valid value is IP.
    */
  val rateKey: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * The maximum number of requests, which have an identical value in the field specified by the RateKey, allowed in a five-minute period. Minimum value is 2000.
    */
  val rateLimit: atPulumiPulumiLib.atPulumiPulumiMod.Output[scala.Double] = js.native
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
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.wafRateBasedRuleMod.RateBasedRule = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.wafRateBasedRuleMod.RateBasedRuleState
  ): atPulumiAwsLib.wafRateBasedRuleMod.RateBasedRule = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.wafRateBasedRuleMod.RateBasedRuleState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.wafRateBasedRuleMod.RateBasedRule = js.native
}

