package typings.pulumiAws.elbLoadBalancerPolicyMod

import typings.pulumiAws.inputMod.elb.LoadBalancerPolicyPolicyAttribute
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoadBalancerPolicyArgs extends js.Object {
  /**
    * The load balancer on which the policy is defined.
    */
  val loadBalancerName: Input[String] = js.native
  /**
    * Policy attribute to apply to the policy.
    */
  val policyAttributes: js.UndefOr[Input[js.Array[Input[LoadBalancerPolicyPolicyAttribute]]]] = js.native
  /**
    * The name of the load balancer policy.
    */
  val policyName: Input[String] = js.native
  /**
    * The policy type.
    */
  val policyTypeName: Input[String] = js.native
}

object LoadBalancerPolicyArgs {
  @scala.inline
  def apply(
    loadBalancerName: Input[String],
    policyName: Input[String],
    policyTypeName: Input[String],
    policyAttributes: Input[js.Array[Input[LoadBalancerPolicyPolicyAttribute]]] = null
  ): LoadBalancerPolicyArgs = {
    val __obj = js.Dynamic.literal(loadBalancerName = loadBalancerName.asInstanceOf[js.Any], policyName = policyName.asInstanceOf[js.Any], policyTypeName = policyTypeName.asInstanceOf[js.Any])
    if (policyAttributes != null) __obj.updateDynamic("policyAttributes")(policyAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadBalancerPolicyArgs]
  }
}

