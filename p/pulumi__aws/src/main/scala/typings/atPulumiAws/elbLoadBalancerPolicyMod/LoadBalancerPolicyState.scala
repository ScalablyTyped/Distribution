package typings.atPulumiAws.elbLoadBalancerPolicyMod

import typings.atPulumiAws.typesInputMod.elb.LoadBalancerPolicyPolicyAttribute
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoadBalancerPolicyState extends js.Object {
  /**
    * The load balancer on which the policy is defined.
    */
  val loadBalancerName: js.UndefOr[Input[String]] = js.native
  /**
    * Policy attribute to apply to the policy.
    */
  val policyAttributes: js.UndefOr[Input[js.Array[Input[LoadBalancerPolicyPolicyAttribute]]]] = js.native
  /**
    * The name of the load balancer policy.
    */
  val policyName: js.UndefOr[Input[String]] = js.native
  /**
    * The policy type.
    */
  val policyTypeName: js.UndefOr[Input[String]] = js.native
}

object LoadBalancerPolicyState {
  @scala.inline
  def apply(
    loadBalancerName: Input[String] = null,
    policyAttributes: Input[js.Array[Input[LoadBalancerPolicyPolicyAttribute]]] = null,
    policyName: Input[String] = null,
    policyTypeName: Input[String] = null
  ): LoadBalancerPolicyState = {
    val __obj = js.Dynamic.literal()
    if (loadBalancerName != null) __obj.updateDynamic("loadBalancerName")(loadBalancerName.asInstanceOf[js.Any])
    if (policyAttributes != null) __obj.updateDynamic("policyAttributes")(policyAttributes.asInstanceOf[js.Any])
    if (policyName != null) __obj.updateDynamic("policyName")(policyName.asInstanceOf[js.Any])
    if (policyTypeName != null) __obj.updateDynamic("policyTypeName")(policyTypeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadBalancerPolicyState]
  }
}

