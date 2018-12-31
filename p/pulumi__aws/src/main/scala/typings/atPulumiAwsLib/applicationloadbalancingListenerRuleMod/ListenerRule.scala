package typings
package atPulumiAwsLib.applicationloadbalancingListenerRuleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/applicationloadbalancing/listenerRule", "ListenerRule")
@js.native
class ListenerRule protected ()
  extends atPulumiPulumiLib.pulumiMod.CustomResource {
  /**
    * Create a ListenerRule resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: ListenerRuleArgs) = this()
  def this(name: java.lang.String, args: ListenerRuleArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * An Action block. Action blocks are documented below.
    */
  val actions: atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiAwsLib.Anon_TargetGroupArnRedirect]] = js.native
  /**
    * The ARN of the rule (matches `id`)
    */
  val arn: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * A Condition block. Condition blocks are documented below.
    */
  val conditions: atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiAwsLib.Anon_ValuesFieldString]] = js.native
  /**
    * The ARN of the listener to which to attach the rule.
    */
  val listenerArn: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * The priority for the rule between `1` and `50000`. Leaving it unset will automatically set the rule with next available priority after currently existing highest rule. A listener can't have multiple rules with the same priority.
    */
  val priority: atPulumiPulumiLib.pulumiMod.Output[scala.Double] = js.native
}

@JSImport("@pulumi/aws/applicationloadbalancing/listenerRule", "ListenerRule")
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

