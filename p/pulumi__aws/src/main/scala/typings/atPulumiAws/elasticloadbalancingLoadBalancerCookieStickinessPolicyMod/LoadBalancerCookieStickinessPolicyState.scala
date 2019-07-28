package typings.atPulumiAws.elasticloadbalancingLoadBalancerCookieStickinessPolicyMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadBalancerCookieStickinessPolicyState extends js.Object {
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
  val lbPort: js.UndefOr[Input[Double]] = js.undefined
  /**
    * The load balancer to which the policy
    * should be attached.
    */
  val loadBalancer: js.UndefOr[Input[String]] = js.undefined
  /**
    * The name of the stickiness policy.
    */
  val name: js.UndefOr[Input[String]] = js.undefined
}

object LoadBalancerCookieStickinessPolicyState {
  @scala.inline
  def apply(
    cookieExpirationPeriod: Input[Double] = null,
    lbPort: Input[Double] = null,
    loadBalancer: Input[String] = null,
    name: Input[String] = null
  ): LoadBalancerCookieStickinessPolicyState = {
    val __obj = js.Dynamic.literal()
    if (cookieExpirationPeriod != null) __obj.updateDynamic("cookieExpirationPeriod")(cookieExpirationPeriod.asInstanceOf[js.Any])
    if (lbPort != null) __obj.updateDynamic("lbPort")(lbPort.asInstanceOf[js.Any])
    if (loadBalancer != null) __obj.updateDynamic("loadBalancer")(loadBalancer.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadBalancerCookieStickinessPolicyState]
  }
}

