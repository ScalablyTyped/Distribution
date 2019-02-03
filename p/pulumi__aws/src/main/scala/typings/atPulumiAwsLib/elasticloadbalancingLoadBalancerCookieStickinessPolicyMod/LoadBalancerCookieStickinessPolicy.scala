package typings
package atPulumiAwsLib.elasticloadbalancingLoadBalancerCookieStickinessPolicyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/elasticloadbalancing/loadBalancerCookieStickinessPolicy", "LoadBalancerCookieStickinessPolicy")
@js.native
class LoadBalancerCookieStickinessPolicy protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a LoadBalancerCookieStickinessPolicy resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: LoadBalancerCookieStickinessPolicyArgs) = this()
  def this(name: java.lang.String, args: LoadBalancerCookieStickinessPolicyArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * The time period after which
    * the session cookie should be considered stale, expressed in seconds.
    */
  val cookieExpirationPeriod: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[scala.Double]] = js.native
  /**
    * The load balancer port to which the policy
    * should be applied. This must be an active listener on the load
    * balancer.
    */
  val lbPort: atPulumiPulumiLib.atPulumiPulumiMod.Output[scala.Double] = js.native
  /**
    * The load balancer to which the policy
    * should be attached.
    */
  val loadBalancer: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * The name of the stickiness policy.
    */
  val name: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
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
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.elasticloadbalancingLoadBalancerCookieStickinessPolicyMod.LoadBalancerCookieStickinessPolicy = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.elasticloadbalancingLoadBalancerCookieStickinessPolicyMod.LoadBalancerCookieStickinessPolicyState
  ): atPulumiAwsLib.elasticloadbalancingLoadBalancerCookieStickinessPolicyMod.LoadBalancerCookieStickinessPolicy = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.elasticloadbalancingLoadBalancerCookieStickinessPolicyMod.LoadBalancerCookieStickinessPolicyState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.elasticloadbalancingLoadBalancerCookieStickinessPolicyMod.LoadBalancerCookieStickinessPolicy = js.native
}

