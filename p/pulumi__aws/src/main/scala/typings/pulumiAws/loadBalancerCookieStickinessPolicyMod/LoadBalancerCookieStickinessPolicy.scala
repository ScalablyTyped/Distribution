package typings.pulumiAws.loadBalancerCookieStickinessPolicyMod

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/elasticloadbalancing/loadBalancerCookieStickinessPolicy", "LoadBalancerCookieStickinessPolicy")
@js.native
class LoadBalancerCookieStickinessPolicy protected () extends CustomResource {
  /**
    * Create a LoadBalancerCookieStickinessPolicy resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  /** @deprecated aws.elasticloadbalancing.LoadBalancerCookieStickinessPolicy has been deprecated in favor of aws.elb.LoadBalancerCookieStickinessPolicy */
  def this(name: String, args: LoadBalancerCookieStickinessPolicyArgs) = this()
  def this(name: String, args: LoadBalancerCookieStickinessPolicyArgs, opts: CustomResourceOptions) = this()
  /**
    * The time period after which
    * the session cookie should be considered stale, expressed in seconds.
    */
  val cookieExpirationPeriod: Output_[js.UndefOr[Double]] = js.native
  /**
    * The load balancer port to which the policy
    * should be applied. This must be an active listener on the load
    * balancer.
    */
  val lbPort: Output_[Double] = js.native
  /**
    * The load balancer to which the policy
    * should be attached.
    */
  val loadBalancer: Output_[String] = js.native
  /**
    * The name of the stickiness policy.
    */
  val name: Output_[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/elasticloadbalancing/loadBalancerCookieStickinessPolicy", "LoadBalancerCookieStickinessPolicy")
@js.native
object LoadBalancerCookieStickinessPolicy extends js.Object {
  /**
    * Get an existing LoadBalancerCookieStickinessPolicy resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): LoadBalancerCookieStickinessPolicy = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): LoadBalancerCookieStickinessPolicy = js.native
  def get(name: String, id: Input[ID], state: LoadBalancerCookieStickinessPolicyState): LoadBalancerCookieStickinessPolicy = js.native
  def get(
    name: String,
    id: Input[ID],
    state: LoadBalancerCookieStickinessPolicyState,
    opts: CustomResourceOptions
  ): LoadBalancerCookieStickinessPolicy = js.native
  /**
    * Returns true if the given object is an instance of LoadBalancerCookieStickinessPolicy.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elasticloadbalancing/loadBalancerCookieStickinessPolicy.LoadBalancerCookieStickinessPolicy */ Boolean = js.native
}

