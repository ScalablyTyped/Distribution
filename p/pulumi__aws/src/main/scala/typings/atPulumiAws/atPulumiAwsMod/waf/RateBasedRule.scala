package typings.atPulumiAws.atPulumiAwsMod.waf

import typings.atPulumiAws.wafRateBasedRuleMod.RateBasedRuleArgs
import typings.atPulumiAws.wafRateBasedRuleMod.RateBasedRuleState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "waf.RateBasedRule")
@js.native
class RateBasedRule protected ()
  extends typings.atPulumiAws.wafMod.RateBasedRule {
  /**
    * Create a RateBasedRule resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: RateBasedRuleArgs) = this()
  def this(name: String, args: RateBasedRuleArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws", "waf.RateBasedRule")
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
  def get(name: String, id: Input[ID]): typings.atPulumiAws.wafRateBasedRuleMod.RateBasedRule = js.native
  def get(name: String, id: Input[ID], state: RateBasedRuleState): typings.atPulumiAws.wafRateBasedRuleMod.RateBasedRule = js.native
  def get(name: String, id: Input[ID], state: RateBasedRuleState, opts: CustomResourceOptions): typings.atPulumiAws.wafRateBasedRuleMod.RateBasedRule = js.native
  /**
    * Returns true if the given object is an instance of RateBasedRule.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/waf/rateBasedRule.RateBasedRule */ Boolean = js.native
}

