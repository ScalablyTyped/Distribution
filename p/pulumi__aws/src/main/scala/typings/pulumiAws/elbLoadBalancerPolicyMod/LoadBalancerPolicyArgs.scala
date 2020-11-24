package typings.pulumiAws.elbLoadBalancerPolicyMod

import typings.pulumiAws.inputMod.elb.LoadBalancerPolicyPolicyAttribute
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(loadBalancerName: Input[String], policyName: Input[String], policyTypeName: Input[String]): LoadBalancerPolicyArgs = {
    val __obj = js.Dynamic.literal(loadBalancerName = loadBalancerName.asInstanceOf[js.Any], policyName = policyName.asInstanceOf[js.Any], policyTypeName = policyTypeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadBalancerPolicyArgs]
  }
  
  @scala.inline
  implicit class LoadBalancerPolicyArgsOps[Self <: LoadBalancerPolicyArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLoadBalancerName(value: Input[String]): Self = this.set("loadBalancerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyName(value: Input[String]): Self = this.set("policyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyTypeName(value: Input[String]): Self = this.set("policyTypeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyAttributesVarargs(value: Input[LoadBalancerPolicyPolicyAttribute]*): Self = this.set("policyAttributes", js.Array(value :_*))
    
    @scala.inline
    def setPolicyAttributes(value: Input[js.Array[Input[LoadBalancerPolicyPolicyAttribute]]]): Self = this.set("policyAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicyAttributes: Self = this.set("policyAttributes", js.undefined)
  }
}
