package typings
package atPulumiAwsLib.elasticloadbalancingLoadBalancerCookieStickinessPolicyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadBalancerCookieStickinessPolicyArgs extends js.Object {
  /**
    * The time period after which
    * the session cookie should be considered stale, expressed in seconds.
    */
  val cookieExpirationPeriod: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  /**
    * The load balancer port to which the policy
    * should be applied. This must be an active listener on the load
    * balancer.
    */
  val lbPort: atPulumiPulumiLib.outputMod.Input[scala.Double]
  /**
    * The load balancer to which the policy
    * should be attached.
    */
  val loadBalancer: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The name of the stickiness policy.
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object LoadBalancerCookieStickinessPolicyArgs {
  @scala.inline
  def apply(
    lbPort: atPulumiPulumiLib.outputMod.Input[scala.Double],
    loadBalancer: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    cookieExpirationPeriod: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): LoadBalancerCookieStickinessPolicyArgs = {
    val __obj = js.Dynamic.literal(lbPort = lbPort.asInstanceOf[js.Any], loadBalancer = loadBalancer.asInstanceOf[js.Any])
    if (cookieExpirationPeriod != null) __obj.updateDynamic("cookieExpirationPeriod")(cookieExpirationPeriod.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadBalancerCookieStickinessPolicyArgs]
  }
}

