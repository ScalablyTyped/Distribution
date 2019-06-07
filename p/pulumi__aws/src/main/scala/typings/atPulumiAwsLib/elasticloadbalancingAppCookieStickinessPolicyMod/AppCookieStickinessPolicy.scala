package typings
package atPulumiAwsLib.elasticloadbalancingAppCookieStickinessPolicyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/elasticloadbalancing/appCookieStickinessPolicy", "AppCookieStickinessPolicy")
@js.native
class AppCookieStickinessPolicy protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a AppCookieStickinessPolicy resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: AppCookieStickinessPolicyArgs) = this()
  def this(name: java.lang.String, args: AppCookieStickinessPolicyArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * The application cookie whose lifetime the ELB's cookie should follow.
    */
  val cookieName: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The load balancer port to which the policy
    * should be applied. This must be an active listener on the load
    * balancer.
    */
  val lbPort: atPulumiPulumiLib.outputMod.Output[scala.Double] = js.native
  /**
    * The name of load balancer to which the policy
    * should be attached.
    */
  val loadBalancer: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The name of the stickiness policy.
    */
  val name: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/elasticloadbalancing/appCookieStickinessPolicy", "AppCookieStickinessPolicy")
@js.native
object AppCookieStickinessPolicy extends js.Object {
  /**
    * Get an existing AppCookieStickinessPolicy resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.elasticloadbalancingAppCookieStickinessPolicyMod.AppCookieStickinessPolicy = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.elasticloadbalancingAppCookieStickinessPolicyMod.AppCookieStickinessPolicyState
  ): atPulumiAwsLib.elasticloadbalancingAppCookieStickinessPolicyMod.AppCookieStickinessPolicy = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.elasticloadbalancingAppCookieStickinessPolicyMod.AppCookieStickinessPolicyState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.elasticloadbalancingAppCookieStickinessPolicyMod.AppCookieStickinessPolicy = js.native
  /**
    * Returns true if the given object is an instance of AppCookieStickinessPolicy.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elasticloadbalancing/appCookieStickinessPolicy.AppCookieStickinessPolicy */ scala.Boolean = js.native
}

