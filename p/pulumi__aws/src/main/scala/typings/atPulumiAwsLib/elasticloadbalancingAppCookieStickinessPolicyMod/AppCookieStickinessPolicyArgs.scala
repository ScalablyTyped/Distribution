package typings
package atPulumiAwsLib.elasticloadbalancingAppCookieStickinessPolicyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppCookieStickinessPolicyArgs extends js.Object {
  /**
    * The application cookie whose lifetime the ELB's cookie should follow.
    */
  val cookieName: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The load balancer port to which the policy
    * should be applied. This must be an active listener on the load
    * balancer.
    */
  val lbPort: atPulumiPulumiLib.outputMod.Input[scala.Double]
  /**
    * The name of load balancer to which the policy
    * should be attached.
    */
  val loadBalancer: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The name of the stickiness policy.
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

