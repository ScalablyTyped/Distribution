package typings.atPulumiAws.albListenerRuleMod

import typings.atPulumiAws.typesOutputMod.albNs.ListenerRuleAction
import typings.atPulumiAws.typesOutputMod.albNs.ListenerRuleCondition
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/alb/listenerRule", "ListenerRule")
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
  val actions: Output[js.Array[ListenerRuleAction]] = js.native
  /**
    * The ARN of the rule (matches `id`)
    */
  val arn: Output[String] = js.native
  /**
    * A Condition block. Condition blocks are documented below.
    */
  val conditions: Output[js.Array[ListenerRuleCondition]] = js.native
  /**
    * The ARN of the listener to which to attach the rule.
    */
  val listenerArn: Output[String] = js.native
  /**
    * The priority for the rule between `1` and `50000`. Leaving it unset will automatically set the rule with next available priority after currently existing highest rule. A listener can't have multiple rules with the same priority.
    */
  val priority: Output[Double] = js.native
}

/* static members */
@JSImport("@pulumi/aws/alb/listenerRule", "ListenerRule")
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
  def get(name: String, id: Input[ID]): ListenerRule = js.native
  def get(name: String, id: Input[ID], state: ListenerRuleState): ListenerRule = js.native
  def get(name: String, id: Input[ID], state: ListenerRuleState, opts: CustomResourceOptions): ListenerRule = js.native
  /**
    * Returns true if the given object is an instance of ListenerRule.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/alb/listenerRule.ListenerRule */ Boolean = js.native
}

