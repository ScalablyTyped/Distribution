package typings.pulumiAws.loadBalancerPolicyMod

import typings.pulumiAws.outputMod.elasticloadbalancing.LoadBalancerPolicyPolicyAttribute
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/elasticloadbalancing/loadBalancerPolicy", "LoadBalancerPolicy")
@js.native
class LoadBalancerPolicy protected () extends CustomResource {
  /**
    * Create a LoadBalancerPolicy resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  /** @deprecated aws.elasticloadbalancing.LoadBalancerPolicy has been deprecated in favor of aws.elb.LoadBalancerPolicy */
  def this(name: String, args: LoadBalancerPolicyArgs) = this()
  def this(name: String, args: LoadBalancerPolicyArgs, opts: CustomResourceOptions) = this()
  
  /**
    * The load balancer on which the policy is defined.
    */
  val loadBalancerName: Output_[String] = js.native
  
  /**
    * Policy attribute to apply to the policy.
    */
  val policyAttributes: Output_[js.UndefOr[js.Array[LoadBalancerPolicyPolicyAttribute]]] = js.native
  
  /**
    * The name of the load balancer policy.
    */
  val policyName: Output_[String] = js.native
  
  /**
    * The policy type.
    */
  val policyTypeName: Output_[String] = js.native
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
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): LoadBalancerPolicy = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): LoadBalancerPolicy = js.native
  def get(name: String, id: Input[ID], state: LoadBalancerPolicyState): LoadBalancerPolicy = js.native
  def get(name: String, id: Input[ID], state: LoadBalancerPolicyState, opts: CustomResourceOptions): LoadBalancerPolicy = js.native
  
  /**
    * Returns true if the given object is an instance of LoadBalancerPolicy.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elasticloadbalancing/loadBalancerPolicy.LoadBalancerPolicy */ Boolean = js.native
}
