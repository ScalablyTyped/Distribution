package typings.atPulumiAws.albMod

import typings.atPulumiAws.albListenerRuleMod.ListenerRuleArgs
import typings.atPulumiAws.albListenerRuleMod.ListenerRuleState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/alb", "ListenerRule")
@js.native
class ListenerRule protected ()
  extends typings.atPulumiAws.albListenerRuleMod.ListenerRule {
  /**
    * Create a ListenerRule resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: ListenerRuleArgs) = this()
  def this(name: String, args: ListenerRuleArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/alb", "ListenerRule")
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
  def get(name: String, id: Input[ID]): typings.atPulumiAws.albListenerRuleMod.ListenerRule = js.native
  def get(name: String, id: Input[ID], state: ListenerRuleState): typings.atPulumiAws.albListenerRuleMod.ListenerRule = js.native
  def get(name: String, id: Input[ID], state: ListenerRuleState, opts: CustomResourceOptions): typings.atPulumiAws.albListenerRuleMod.ListenerRule = js.native
  /**
    * Returns true if the given object is an instance of ListenerRule.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/alb/listenerRule.ListenerRule */ Boolean = js.native
}

