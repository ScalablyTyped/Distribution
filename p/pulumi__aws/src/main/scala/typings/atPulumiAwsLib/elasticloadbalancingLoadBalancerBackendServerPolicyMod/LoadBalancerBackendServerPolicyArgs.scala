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

object LoadBalancerBackendServerPolicyArgs {
  @scala.inline
  def apply(
    instancePort: atPulumiPulumiLib.outputMod.Input[scala.Double],
    loadBalancerName: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    policyNames: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null
  ): LoadBalancerBackendServerPolicyArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("instancePort")(instancePort.asInstanceOf[js.Any])
    __obj.updateDynamic("loadBalancerName")(loadBalancerName.asInstanceOf[js.Any])
    if (policyNames != null) __obj.updateDynamic("policyNames")(policyNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadBalancerBackendServerPolicyArgs]
  }
}

