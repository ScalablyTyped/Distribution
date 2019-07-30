package typings.atPulumiAws.elbLoadBalancerCookieStickinessPolicyMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadBalancerCookieStickinessPolicyArgs extends js.Object {
  /**
    * The time period after which
    * the session cookie should be considered stale, expressed in seconds.
    */
  val cookieExpirationPeriod: js.UndefOr[Input[Double]] = js.undefined
  /**
    * The load balancer port to which the policy
    * should be applied. This must be an active listener on the load
    * balancer.
    */
  val lbPort: Input[Double]
  /**
    * The load balancer to which the policy
    * should be attached.
    */
  val loadBalancer: Input[String]
  /**
    * The name of the stickiness policy.
    */
  val name: js.UndefOr[Input[String]] = js.undefined
}

object LoadBalancerCookieStickinessPolicyArgs {
  @scala.inline
  def apply(
    lbPort: Input[Double],
    loadBalancer: Input[String],
    cookieExpirationPeriod: Input[Double] = null,
    name: Input[String] = null
  ): LoadBalancerCookieStickinessPolicyArgs = {
    val __obj = js.Dynamic.literal(lbPort = lbPort.asInstanceOf[js.Any], loadBalancer = loadBalancer.asInstanceOf[js.Any])
    if (cookieExpirationPeriod != null) __obj.updateDynamic("cookieExpirationPeriod")(cookieExpirationPeriod.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadBalancerCookieStickinessPolicyArgs]
  }
}

