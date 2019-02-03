package typings
package atPulumiAwsLib.elasticloadbalancingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/elasticloadbalancing", "LoadBalancerBackendServerPolicy")
@js.native
class LoadBalancerBackendServerPolicy protected ()
  extends atPulumiAwsLib.elasticloadbalancingLoadBalancerBackendServerPolicyMod.LoadBalancerBackendServerPolicy {
  /**
    * Create a LoadBalancerBackendServerPolicy resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: atPulumiAwsLib.elasticloadbalancingLoadBalancerBackendServerPolicyMod.LoadBalancerBackendServerPolicyArgs) = this()
  def this(name: java.lang.String, args: atPulumiAwsLib.elasticloadbalancingLoadBalancerBackendServerPolicyMod.LoadBalancerBackendServerPolicyArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/elasticloadbalancing", "LoadBalancerBackendServerPolicy")
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

