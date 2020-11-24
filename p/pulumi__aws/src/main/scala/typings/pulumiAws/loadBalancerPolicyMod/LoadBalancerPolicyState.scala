package typings.pulumiAws.loadBalancerPolicyMod

import typings.pulumiAws.inputMod.elasticloadbalancing.LoadBalancerPolicyPolicyAttribute
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): LoadBalancerPolicyState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadBalancerPolicyState]
  }
  
  @scala.inline
  implicit class LoadBalancerPolicyStateOps[Self <: LoadBalancerPolicyState] (val x: Self) extends AnyVal {
    
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
    def deleteLoadBalancerName: Self = this.set("loadBalancerName", js.undefined)
    
    @scala.inline
    def setPolicyAttributesVarargs(value: Input[LoadBalancerPolicyPolicyAttribute]*): Self = this.set("policyAttributes", js.Array(value :_*))
    
    @scala.inline
    def setPolicyAttributes(value: Input[js.Array[Input[LoadBalancerPolicyPolicyAttribute]]]): Self = this.set("policyAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicyAttributes: Self = this.set("policyAttributes", js.undefined)
    
    @scala.inline
    def setPolicyName(value: Input[String]): Self = this.set("policyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicyName: Self = this.set("policyName", js.undefined)
    
    @scala.inline
    def setPolicyTypeName(value: Input[String]): Self = this.set("policyTypeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicyTypeName: Self = this.set("policyTypeName", js.undefined)
  }
}
