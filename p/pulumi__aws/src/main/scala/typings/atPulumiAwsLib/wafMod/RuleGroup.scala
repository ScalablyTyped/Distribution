package typings
package atPulumiAwsLib.wafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/waf", "RuleGroup")
@js.native
class RuleGroup protected ()
  extends atPulumiAwsLib.wafRuleGroupMod.RuleGroup {
  /**
    * Create a RuleGroup resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: atPulumiAwsLib.wafRuleGroupMod.RuleGroupArgs) = this()
  def this(name: java.lang.String, args: atPulumiAwsLib.wafRuleGroupMod.RuleGroupArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
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
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.wafRuleGroupMod.RuleGroup = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.wafRuleGroupMod.RuleGroupState
  ): atPulumiAwsLib.wafRuleGroupMod.RuleGroup = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.wafRuleGroupMod.RuleGroupState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.wafRuleGroupMod.RuleGroup = js.native
}

