package typings.pulumiAws.lbListenerRuleMod

import typings.pulumiAws.outputMod.lb.ListenerRuleAction
import typings.pulumiAws.outputMod.lb.ListenerRuleCondition
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/lb/listenerRule", "ListenerRule")
@js.native
class ListenerRule protected () extends CustomResource {
  /**
    * Create a ListenerRule resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: ListenerRuleArgs) = this()
  def this(name: String, args: ListenerRuleArgs, opts: CustomResourceOptions) = this()
  /**
    * An Action block. Action blocks are documented below.
    */
  val actions: Output_[js.Array[ListenerRuleAction]] = js.native
  /**
    * The Amazon Resource Name (ARN) of the target group.
    */
  val arn: Output_[String] = js.native
  /**
    * A Condition block. Multiple condition blocks of different types can be set and all must be satisfied for the rule to match. Condition blocks are documented below.
    */
  val conditions: Output_[js.Array[ListenerRuleCondition]] = js.native
  /**
    * The ARN of the listener to which to attach the rule.
    */
  val listenerArn: Output_[String] = js.native
  /**
    * The priority for the rule between `1` and `50000`. Leaving it unset will automatically set the rule with next available priority after currently existing highest rule. A listener can't have multiple rules with the same priority.
    */
  val priority: Output_[Double] = js.native
}

/* static members */
@JSImport("@pulumi/aws/lb/listenerRule", "ListenerRule")
@js.native
object ListenerRule extends js.Object {
  /**
    * Get an existing ListenerRule resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): ListenerRule = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): ListenerRule = js.native
  def get(name: String, id: Input[ID], state: ListenerRuleState): ListenerRule = js.native
  def get(name: String, id: Input[ID], state: ListenerRuleState, opts: CustomResourceOptions): ListenerRule = js.native
  /**
    * Returns true if the given object is an instance of ListenerRule.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/lb/listenerRule.ListenerRule */ Boolean = js.native
}

