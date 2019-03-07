package typings
package atPulumiAwsLib.elasticloadbalancingLoadBalancerPolicyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/elasticloadbalancing/loadBalancerPolicy", "LoadBalancerPolicy")
@js.native
class LoadBalancerPolicy protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a LoadBalancerPolicy resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: LoadBalancerPolicyArgs) = this()
  def this(name: java.lang.String, args: LoadBalancerPolicyArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * The load balancer on which the policy is defined.
    */
  val loadBalancerName: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * Policy attribute to apply to the policy.
    */
  val policyAttributes: atPulumiPulumiLib.outputMod.Output[js.UndefOr[js.Array[atPulumiAwsLib.Anon_NameValueString]]] = js.native
  /**
    * The name of the load balancer policy.
    */
  val policyName: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The policy type.
    */
  val policyTypeName: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/elasticloadbalancing/loadBalancerPolicy", "LoadBalancerPolicy")
@js.native
object LoadBalancerPolicy extends js.Object {
  /**
    * Get an existing LoadBalancerPolicy resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.elasticloadbalancingLoadBalancerPolicyMod.LoadBalancerPolicy = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.elasticloadbalancingLoadBalancerPolicyMod.LoadBalancerPolicyState
  ): atPulumiAwsLib.elasticloadbalancingLoadBalancerPolicyMod.LoadBalancerPolicy = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.elasticloadbalancingLoadBalancerPolicyMod.LoadBalancerPolicyState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.elasticloadbalancingLoadBalancerPolicyMod.LoadBalancerPolicy = js.native
}

