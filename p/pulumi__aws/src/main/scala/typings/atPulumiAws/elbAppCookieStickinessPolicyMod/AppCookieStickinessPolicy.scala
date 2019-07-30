package typings.atPulumiAws.elbAppCookieStickinessPolicyMod

import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/elb/appCookieStickinessPolicy", "AppCookieStickinessPolicy")
@js.native
class AppCookieStickinessPolicy protected () extends CustomResource {
  /**
    * Create a AppCookieStickinessPolicy resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: AppCookieStickinessPolicyArgs) = this()
  def this(name: String, args: AppCookieStickinessPolicyArgs, opts: CustomResourceOptions) = this()
  /**
    * The application cookie whose lifetime the ELB's cookie should follow.
    */
  val cookieName: Output[String] = js.native
  /**
    * The load balancer port to which the policy
    * should be applied. This must be an active listener on the load
    * balancer.
    */
  val lbPort: Output[Double] = js.native
  /**
    * The name of load balancer to which the policy
    * should be attached.
    */
  val loadBalancer: Output[String] = js.native
  /**
    * The name of the stickiness policy.
    */
  val name: Output[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/elb/appCookieStickinessPolicy", "AppCookieStickinessPolicy")
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
  def get(name: String, id: Input[ID]): AppCookieStickinessPolicy = js.native
  def get(name: String, id: Input[ID], state: AppCookieStickinessPolicyState): AppCookieStickinessPolicy = js.native
  def get(name: String, id: Input[ID], state: AppCookieStickinessPolicyState, opts: CustomResourceOptions): AppCookieStickinessPolicy = js.native
  /**
    * Returns true if the given object is an instance of AppCookieStickinessPolicy.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elb/appCookieStickinessPolicy.AppCookieStickinessPolicy */ Boolean = js.native
}

