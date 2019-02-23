package typings
package atPulumiAwsLib.elasticloadbalancingListenerPolicyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListenerPolicyArgs extends js.Object {
  /**
    * The load balancer to attach the policy to.
    */
  val loadBalancerName: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The load balancer listener port to apply the policy to.
    */
  val loadBalancerPort: atPulumiPulumiLib.outputMod.Input[scala.Double]
  /**
    * List of Policy Names to apply to the backend server.
    */
  val policyNames: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
}

