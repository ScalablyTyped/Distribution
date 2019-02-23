package typings
package atPulumiAwsLib.elasticloadbalancingLoadBalancerBackendServerPolicyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadBalancerBackendServerPolicyArgs extends js.Object {
  /**
    * The instance port to apply the policy to.
    */
  val instancePort: atPulumiPulumiLib.outputMod.Input[scala.Double]
  /**
    * The load balancer to attach the policy to.
    */
  val loadBalancerName: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * List of Policy Names to apply to the backend server.
    */
  val policyNames: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
}

