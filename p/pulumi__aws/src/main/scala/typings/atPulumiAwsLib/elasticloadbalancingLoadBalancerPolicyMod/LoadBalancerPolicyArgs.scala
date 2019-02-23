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

