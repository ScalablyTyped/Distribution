package typings
package atPulumiAwsLib.elasticloadbalancingListenerPolicyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListenerPolicyState extends js.Object {
  /**
    * The load balancer to attach the policy to.
    */
  val loadBalancerName: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The load balancer listener port to apply the policy to.
    */
  val loadBalancerPort: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  /**
    * List of Policy Names to apply to the backend server.
    */
  val policyNames: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
}

object ListenerPolicyState {
  @scala.inline
  def apply(
    loadBalancerName: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    loadBalancerPort: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    policyNames: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null
  ): ListenerPolicyState = {
    val __obj = js.Dynamic.literal()
    if (loadBalancerName != null) __obj.updateDynamic("loadBalancerName")(loadBalancerName.asInstanceOf[js.Any])
    if (loadBalancerPort != null) __obj.updateDynamic("loadBalancerPort")(loadBalancerPort.asInstanceOf[js.Any])
    if (policyNames != null) __obj.updateDynamic("policyNames")(policyNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListenerPolicyState]
  }
}

