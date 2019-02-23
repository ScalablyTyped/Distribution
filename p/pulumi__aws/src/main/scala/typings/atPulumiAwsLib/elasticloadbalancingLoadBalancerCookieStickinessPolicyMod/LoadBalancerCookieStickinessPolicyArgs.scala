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

