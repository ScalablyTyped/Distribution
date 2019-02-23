package typings
package atPulumiAwsLib.elasticloadbalancingListenerPolicyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/elasticloadbalancing/listenerPolicy", "ListenerPolicy")
@js.native
class ListenerPolicy protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a ListenerPolicy resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: ListenerPolicyArgs) = this()
  def this(name: java.lang.String, args: ListenerPolicyArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * The load balancer to attach the policy to.
    */
  val loadBalancerName: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * The load balancer listener port to apply the policy to.
    */
  val loadBalancerPort: atPulumiPulumiLib.atPulumiPulumiMod.Output[scala.Double] = js.native
  /**
    * List of Policy Names to apply to the backend server.
    */
  val policyNames: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[js.Array[java.lang.String]]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/elasticloadbalancing/listenerPolicy", "ListenerPolicy")
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
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.elasticloadbalancingListenerPolicyMod.ListenerPolicy = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.elasticloadbalancingListenerPolicyMod.ListenerPolicyState
  ): atPulumiAwsLib.elasticloadbalancingListenerPolicyMod.ListenerPolicy = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.elasticloadbalancingListenerPolicyMod.ListenerPolicyState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.elasticloadbalancingListenerPolicyMod.ListenerPolicy = js.native
}

