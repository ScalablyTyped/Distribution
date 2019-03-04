package typings
package atPulumiAwsLib.elasticloadbalancingLoadBalancerPolicyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadBalancerPolicyArgs extends js.Object {
  /**
    * The load balancer on which the policy is defined.
    */
  val loadBalancerName: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * Policy attribute to apply to the policy.
    */
  val policyAttributes: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_NameValueInput]]]
  ] = js.undefined
  /**
    * The name of the load balancer policy.
    */
  val policyName: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The policy type.
    */
  val policyTypeName: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object LoadBalancerPolicyArgs {
  @scala.inline
  def apply(
    loadBalancerName: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    policyName: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    policyTypeName: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    policyAttributes: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_NameValueInput]]] = null
  ): LoadBalancerPolicyArgs = {
    val __obj = js.Dynamic.literal(loadBalancerName = loadBalancerName.asInstanceOf[js.Any], policyName = policyName.asInstanceOf[js.Any], policyTypeName = policyTypeName.asInstanceOf[js.Any])
    if (policyAttributes != null) __obj.updateDynamic("policyAttributes")(policyAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadBalancerPolicyArgs]
  }
}

