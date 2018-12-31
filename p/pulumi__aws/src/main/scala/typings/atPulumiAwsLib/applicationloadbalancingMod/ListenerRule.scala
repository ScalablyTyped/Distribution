package typings
package atPulumiAwsLib.applicationloadbalancingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/applicationloadbalancing", "ListenerRule")
@js.native
class ListenerRule protected ()
  extends atPulumiAwsLib.applicationloadbalancingListenerRuleMod.ListenerRule {
  /**
    * Create a ListenerRule resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: atPulumiAwsLib.applicationloadbalancingListenerRuleMod.ListenerRuleArgs) = this()
  def this(name: java.lang.String, args: atPulumiAwsLib.applicationloadbalancingListenerRuleMod.ListenerRuleArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
}

@JSImport("@pulumi/aws/applicationloadbalancing", "ListenerRule")
@js.native
object ListenerRule extends js.Object {
  /**
    * Get an existing ListenerRule resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.applicationloadbalancingListenerRuleMod.ListenerRule = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.applicationloadbalancingListenerRuleMod.ListenerRuleState
  ): atPulumiAwsLib.applicationloadbalancingListenerRuleMod.ListenerRule = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.applicationloadbalancingListenerRuleMod.ListenerRuleState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.applicationloadbalancingListenerRuleMod.ListenerRule = js.native
}

