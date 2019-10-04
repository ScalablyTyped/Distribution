package typings.atPulumiAws.elbLoadBalancerPolicyMod

import typings.atPulumiAws.typesOutputMod.elbNs.LoadBalancerPolicyPolicyAttribute
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/elb/loadBalancerPolicy", "LoadBalancerPolicy")
@js.native
class LoadBalancerPolicy protected () extends CustomResource {
  /**
    * Create a LoadBalancerPolicy resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: LoadBalancerPolicyArgs) = this()
  def this(name: String, args: LoadBalancerPolicyArgs, opts: CustomResourceOptions) = this()
  /**
    * The load balancer on which the policy is defined.
    */
  val loadBalancerName: Output[String] = js.native
  /**
    * Policy attribute to apply to the policy.
    */
  val policyAttributes: Output[js.UndefOr[js.Array[LoadBalancerPolicyPolicyAttribute]]] = js.native
  /**
    * The name of the load balancer policy.
    */
  val policyName: Output[String] = js.native
  /**
    * The policy type.
    */
  val policyTypeName: Output[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/elb/loadBalancerPolicy", "LoadBalancerPolicy")
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
  def get(name: String, id: Input[ID]): LoadBalancerPolicy = js.native
  def get(name: String, id: Input[ID], state: LoadBalancerPolicyState): LoadBalancerPolicy = js.native
  def get(name: String, id: Input[ID], state: LoadBalancerPolicyState, opts: CustomResourceOptions): LoadBalancerPolicy = js.native
  /**
    * Returns true if the given object is an instance of LoadBalancerPolicy.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elb/loadBalancerPolicy.LoadBalancerPolicy */ Boolean = js.native
}

