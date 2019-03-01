package typings
package atPulumiAwsLib.elasticloadbalancingLoadBalancerPolicyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadBalancerPolicyState extends js.Object {
  /**
    * The load balancer on which the policy is defined.
    */
  val loadBalancerName: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Policy attribute to apply to the policy.
    */
  val policyAttributes: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_NameValueInput]]]
  ] = js.undefined
  /**
    * The name of the load balancer policy.
    */
  val policyName: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The policy type.
    */
  val policyTypeName: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object LoadBalancerPolicyState {
  @scala.inline
  def apply(
    loadBalancerName: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    policyAttributes: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_NameValueInput]]] = null,
    policyName: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    policyTypeName: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): LoadBalancerPolicyState = {
    val __obj = js.Dynamic.literal()
    if (loadBalancerName != null) __obj.updateDynamic("loadBalancerName")(loadBalancerName.asInstanceOf[js.Any])
    if (policyAttributes != null) __obj.updateDynamic("policyAttributes")(policyAttributes.asInstanceOf[js.Any])
    if (policyName != null) __obj.updateDynamic("policyName")(policyName.asInstanceOf[js.Any])
    if (policyTypeName != null) __obj.updateDynamic("policyTypeName")(policyTypeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadBalancerPolicyState]
  }
}

