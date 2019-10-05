package typings.atPulumiAws.atPulumiAwsMod.wafregional

import typings.atPulumiAws.wafregionalRateBasedRuleMod.RateBasedRuleArgs
import typings.atPulumiAws.wafregionalRateBasedRuleMod.RateBasedRuleState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "wafregional.RateBasedRule")
@js.native
class RateBasedRule protected ()
  extends typings.atPulumiAws.wafregionalMod.RateBasedRule {
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
@JSImport("@pulumi/aws", "wafregional.RateBasedRule")
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
  def get(name: String, id: Input[ID]): typings.atPulumiAws.wafregionalRateBasedRuleMod.RateBasedRule = js.native
  def get(name: String, id: Input[ID], state: RateBasedRuleState): typings.atPulumiAws.wafregionalRateBasedRuleMod.RateBasedRule = js.native
  def get(name: String, id: Input[ID], state: RateBasedRuleState, opts: CustomResourceOptions): typings.atPulumiAws.wafregionalRateBasedRuleMod.RateBasedRule = js.native
  /**
    * Returns true if the given object is an instance of RateBasedRule.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/wafregional/rateBasedRule.RateBasedRule */ Boolean = js.native
}

