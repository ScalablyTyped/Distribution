package typings
package atPulumiAwsLib.elasticloadbalancingLoadBalancerBackendServerPolicyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/elasticloadbalancing/loadBalancerBackendServerPolicy", "LoadBalancerBackendServerPolicy")
@js.native
class LoadBalancerBackendServerPolicy protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a LoadBalancerBackendServerPolicy resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: LoadBalancerBackendServerPolicyArgs) = this()
  def this(name: java.lang.String, args: LoadBalancerBackendServerPolicyArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * The instance port to apply the policy to.
    */
  val instancePort: atPulumiPulumiLib.atPulumiPulumiMod.Output[scala.Double] = js.native
  /**
    * The load balancer to attach the policy to.
    */
  val loadBalancerName: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * List of Policy Names to apply to the backend server.
    */
  val policyNames: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[js.Array[java.lang.String]]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/elasticloadbalancing/loadBalancerBackendServerPolicy", "LoadBalancerBackendServerPolicy")
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
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.elasticloadbalancingLoadBalancerBackendServerPolicyMod.LoadBalancerBackendServerPolicy = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.elasticloadbalancingLoadBalancerBackendServerPolicyMod.LoadBalancerBackendServerPolicyState
  ): atPulumiAwsLib.elasticloadbalancingLoadBalancerBackendServerPolicyMod.LoadBalancerBackendServerPolicy = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.elasticloadbalancingLoadBalancerBackendServerPolicyMod.LoadBalancerBackendServerPolicyState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.elasticloadbalancingLoadBalancerBackendServerPolicyMod.LoadBalancerBackendServerPolicy = js.native
}

