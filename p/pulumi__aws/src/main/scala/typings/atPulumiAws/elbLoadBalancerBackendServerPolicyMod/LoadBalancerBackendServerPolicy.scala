package typings.atPulumiAws.elbLoadBalancerBackendServerPolicyMod

import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/elb/loadBalancerBackendServerPolicy", "LoadBalancerBackendServerPolicy")
@js.native
class LoadBalancerBackendServerPolicy protected () extends CustomResource {
  /**
    * Create a LoadBalancerBackendServerPolicy resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: LoadBalancerBackendServerPolicyArgs) = this()
  def this(name: String, args: LoadBalancerBackendServerPolicyArgs, opts: CustomResourceOptions) = this()
  /**
    * The instance port to apply the policy to.
    */
  val instancePort: Output[Double] = js.native
  /**
    * The load balancer to attach the policy to.
    */
  val loadBalancerName: Output[String] = js.native
  /**
    * List of Policy Names to apply to the backend server.
    */
  val policyNames: Output[js.UndefOr[js.Array[String]]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/elb/loadBalancerBackendServerPolicy", "LoadBalancerBackendServerPolicy")
@js.native
object LoadBalancerBackendServerPolicy extends js.Object {
  /**
    * Get an existing LoadBalancerBackendServerPolicy resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): LoadBalancerBackendServerPolicy = js.native
  def get(name: String, id: Input[ID], state: LoadBalancerBackendServerPolicyState): LoadBalancerBackendServerPolicy = js.native
  def get(
    name: String,
    id: Input[ID],
    state: LoadBalancerBackendServerPolicyState,
    opts: CustomResourceOptions
  ): LoadBalancerBackendServerPolicy = js.native
  /**
    * Returns true if the given object is an instance of LoadBalancerBackendServerPolicy.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elb/loadBalancerBackendServerPolicy.LoadBalancerBackendServerPolicy */ Boolean = js.native
}

