package typings.atPulumiAws.elbListenerPolicyMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListenerPolicyArgs extends js.Object {
  /**
    * The load balancer to attach the policy to.
    */
  val loadBalancerName: Input[String]
  /**
    * The load balancer listener port to apply the policy to.
    */
  val loadBalancerPort: Input[Double]
  /**
    * List of Policy Names to apply to the backend server.
    */
  val policyNames: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
}

object ListenerPolicyArgs {
  @scala.inline
  def apply(
    loadBalancerName: Input[String],
    loadBalancerPort: Input[Double],
    policyNames: Input[js.Array[Input[String]]] = null
  ): ListenerPolicyArgs = {
    val __obj = js.Dynamic.literal(loadBalancerName = loadBalancerName.asInstanceOf[js.Any], loadBalancerPort = loadBalancerPort.asInstanceOf[js.Any])
    if (policyNames != null) __obj.updateDynamic("policyNames")(policyNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListenerPolicyArgs]
  }
}

