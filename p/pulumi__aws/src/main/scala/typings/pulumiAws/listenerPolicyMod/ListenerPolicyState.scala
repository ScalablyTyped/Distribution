package typings.pulumiAws.listenerPolicyMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListenerPolicyState extends js.Object {
  /**
    * The load balancer to attach the policy to.
    */
  val loadBalancerName: js.UndefOr[Input[String]] = js.native
  /**
    * The load balancer listener port to apply the policy to.
    */
  val loadBalancerPort: js.UndefOr[Input[Double]] = js.native
  /**
    * List of Policy Names to apply to the backend server.
    */
  val policyNames: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
}

object ListenerPolicyState {
  @scala.inline
  def apply(
    loadBalancerName: Input[String] = null,
    loadBalancerPort: Input[Double] = null,
    policyNames: Input[js.Array[Input[String]]] = null
  ): ListenerPolicyState = {
    val __obj = js.Dynamic.literal()
    if (loadBalancerName != null) __obj.updateDynamic("loadBalancerName")(loadBalancerName.asInstanceOf[js.Any])
    if (loadBalancerPort != null) __obj.updateDynamic("loadBalancerPort")(loadBalancerPort.asInstanceOf[js.Any])
    if (policyNames != null) __obj.updateDynamic("policyNames")(policyNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListenerPolicyState]
  }
}

