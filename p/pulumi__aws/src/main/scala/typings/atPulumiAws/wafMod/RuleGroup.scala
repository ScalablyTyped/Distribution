package typings.atPulumiAws.wafMod

import typings.atPulumiAws.wafRuleGroupMod.RuleGroupArgs
import typings.atPulumiAws.wafRuleGroupMod.RuleGroupState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/waf", "RuleGroup")
@js.native
class RuleGroup protected ()
  extends typings.atPulumiAws.wafRuleGroupMod.RuleGroup {
  /**
    * Create a RuleGroup resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: RuleGroupArgs) = this()
  def this(name: String, args: RuleGroupArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/waf", "RuleGroup")
@js.native
object RuleGroup extends js.Object {
  /**
    * Get an existing RuleGroup resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typings.atPulumiAws.wafRuleGroupMod.RuleGroup = js.native
  def get(name: String, id: Input[ID], state: RuleGroupState): typings.atPulumiAws.wafRuleGroupMod.RuleGroup = js.native
  def get(name: String, id: Input[ID], state: RuleGroupState, opts: CustomResourceOptions): typings.atPulumiAws.wafRuleGroupMod.RuleGroup = js.native
  /**
    * Returns true if the given object is an instance of RuleGroup.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/waf/ruleGroup.RuleGroup */ Boolean = js.native
}

