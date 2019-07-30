package typings.atPulumiAws.elbLoadBalancerPolicyMod

import typings.atPulumiAws.Anon_NameValueInput
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadBalancerPolicyArgs extends js.Object {
  /**
    * The load balancer on which the policy is defined.
    */
  val loadBalancerName: Input[String]
  /**
    * Policy attribute to apply to the policy.
    */
  val policyAttributes: js.UndefOr[Input[js.Array[Input[Anon_NameValueInput]]]] = js.undefined
  /**
    * The name of the load balancer policy.
    */
  val policyName: Input[String]
  /**
    * The policy type.
    */
  val policyTypeName: Input[String]
}

object LoadBalancerPolicyArgs {
  @scala.inline
  def apply(
    loadBalancerName: Input[String],
    policyName: Input[String],
    policyTypeName: Input[String],
    policyAttributes: Input[js.Array[Input[Anon_NameValueInput]]] = null
  ): LoadBalancerPolicyArgs = {
    val __obj = js.Dynamic.literal(loadBalancerName = loadBalancerName.asInstanceOf[js.Any], policyName = policyName.asInstanceOf[js.Any], policyTypeName = policyTypeName.asInstanceOf[js.Any])
    if (policyAttributes != null) __obj.updateDynamic("policyAttributes")(policyAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadBalancerPolicyArgs]
  }
}

