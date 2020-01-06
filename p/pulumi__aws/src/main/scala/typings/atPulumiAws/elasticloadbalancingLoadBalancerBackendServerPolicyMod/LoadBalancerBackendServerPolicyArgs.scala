package typings.atPulumiAws.elasticloadbalancingLoadBalancerBackendServerPolicyMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoadBalancerBackendServerPolicyArgs extends js.Object {
  /**
    * The instance port to apply the policy to.
    */
  val instancePort: Input[Double] = js.native
  /**
    * The load balancer to attach the policy to.
    */
  val loadBalancerName: Input[String] = js.native
  /**
    * List of Policy Names to apply to the backend server.
    */
  val policyNames: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
}

object LoadBalancerBackendServerPolicyArgs {
  @scala.inline
  def apply(
    instancePort: Input[Double],
    loadBalancerName: Input[String],
    policyNames: Input[js.Array[Input[String]]] = null
  ): LoadBalancerBackendServerPolicyArgs = {
    val __obj = js.Dynamic.literal(instancePort = instancePort.asInstanceOf[js.Any], loadBalancerName = loadBalancerName.asInstanceOf[js.Any])
    if (policyNames != null) __obj.updateDynamic("policyNames")(policyNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadBalancerBackendServerPolicyArgs]
  }
}

