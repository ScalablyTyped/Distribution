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

