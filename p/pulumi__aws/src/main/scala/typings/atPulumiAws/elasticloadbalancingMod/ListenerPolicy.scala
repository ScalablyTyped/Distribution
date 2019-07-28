package typings.atPulumiAws.elasticloadbalancingMod

import typings.atPulumiAws.elasticloadbalancingListenerPolicyMod.ListenerPolicyArgs
import typings.atPulumiAws.elasticloadbalancingListenerPolicyMod.ListenerPolicyState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/elasticloadbalancing", "ListenerPolicy")
@js.native
class ListenerPolicy protected ()
  extends typings.atPulumiAws.elasticloadbalancingListenerPolicyMod.ListenerPolicy {
  /**
    * Create a ListenerPolicy resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: ListenerPolicyArgs) = this()
  def this(name: String, args: ListenerPolicyArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/elasticloadbalancing", "ListenerPolicy")
@js.native
object ListenerPolicy extends js.Object {
  /**
    * Get an existing ListenerPolicy resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typings.atPulumiAws.elasticloadbalancingListenerPolicyMod.ListenerPolicy = js.native
  def get(name: String, id: Input[ID], state: ListenerPolicyState): typings.atPulumiAws.elasticloadbalancingListenerPolicyMod.ListenerPolicy = js.native
  def get(name: String, id: Input[ID], state: ListenerPolicyState, opts: CustomResourceOptions): typings.atPulumiAws.elasticloadbalancingListenerPolicyMod.ListenerPolicy = js.native
  /**
    * Returns true if the given object is an instance of ListenerPolicy.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elasticloadbalancing/listenerPolicy.ListenerPolicy */ Boolean = js.native
}

