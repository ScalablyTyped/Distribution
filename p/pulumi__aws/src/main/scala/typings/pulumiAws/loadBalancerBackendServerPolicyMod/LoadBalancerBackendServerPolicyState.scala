package typings.pulumiAws.loadBalancerBackendServerPolicyMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoadBalancerBackendServerPolicyState extends js.Object {
  /**
    * The instance port to apply the policy to.
    */
  val instancePort: js.UndefOr[Input[Double]] = js.native
  /**
    * The load balancer to attach the policy to.
    */
  val loadBalancerName: js.UndefOr[Input[String]] = js.native
  /**
    * List of Policy Names to apply to the backend server.
    */
  val policyNames: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
}

object LoadBalancerBackendServerPolicyState {
  @scala.inline
  def apply(
    instancePort: Input[Double] = null,
    loadBalancerName: Input[String] = null,
    policyNames: Input[js.Array[Input[String]]] = null
  ): LoadBalancerBackendServerPolicyState = {
    val __obj = js.Dynamic.literal()
    if (instancePort != null) __obj.updateDynamic("instancePort")(instancePort.asInstanceOf[js.Any])
    if (loadBalancerName != null) __obj.updateDynamic("loadBalancerName")(loadBalancerName.asInstanceOf[js.Any])
    if (policyNames != null) __obj.updateDynamic("policyNames")(policyNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadBalancerBackendServerPolicyState]
  }
}

