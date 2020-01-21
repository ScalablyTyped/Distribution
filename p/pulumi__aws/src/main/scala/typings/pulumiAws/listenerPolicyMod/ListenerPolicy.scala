package typings.pulumiAws.listenerPolicyMod

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/elasticloadbalancing/listenerPolicy", "ListenerPolicy")
@js.native
class ListenerPolicy protected () extends CustomResource {
  /**
    * Create a ListenerPolicy resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: ListenerPolicyArgs) = this()
  def this(name: String, args: ListenerPolicyArgs, opts: CustomResourceOptions) = this()
  /**
    * The load balancer to attach the policy to.
    */
  val loadBalancerName: Output_[String] = js.native
  /**
    * The load balancer listener port to apply the policy to.
    */
  val loadBalancerPort: Output_[Double] = js.native
  /**
    * List of Policy Names to apply to the backend server.
    */
  val policyNames: Output_[js.UndefOr[js.Array[String]]] = js.native
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
  def get(name: String, id: Input[ID]): ListenerPolicy = js.native
  def get(name: String, id: Input[ID], state: ListenerPolicyState): ListenerPolicy = js.native
  def get(name: String, id: Input[ID], state: ListenerPolicyState, opts: CustomResourceOptions): ListenerPolicy = js.native
  /**
    * Returns true if the given object is an instance of ListenerPolicy.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elasticloadbalancing/listenerPolicy.ListenerPolicy */ Boolean = js.native
}

