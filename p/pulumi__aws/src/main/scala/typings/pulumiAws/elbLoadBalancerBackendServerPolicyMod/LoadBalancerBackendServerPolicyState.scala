package typings.pulumiAws.elbLoadBalancerBackendServerPolicyMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoadBalancerBackendServerPolicyState extends js.Object {
  
  /**
    * The instance port to apply the policy to.
    */
  val instancePort: js.UndefOr[Input[Double]] = js.native
  
  /**
    * The load balancer to attach the policy to.
    */
  val loadBalancerName: js.UndefOr[Input[String]] = js.native
  
  /**
    * List of Policy Names to apply to the backend server.
    */
  val policyNames: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
}
object LoadBalancerBackendServerPolicyState {
  
  @scala.inline
  def apply(): LoadBalancerBackendServerPolicyState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadBalancerBackendServerPolicyState]
  }
  
  @scala.inline
  implicit class LoadBalancerBackendServerPolicyStateOps[Self <: LoadBalancerBackendServerPolicyState] (val x: Self) extends AnyVal {
    
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
    def setInstancePort(value: Input[Double]): Self = this.set("instancePort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstancePort: Self = this.set("instancePort", js.undefined)
    
    @scala.inline
    def setLoadBalancerName(value: Input[String]): Self = this.set("loadBalancerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadBalancerName: Self = this.set("loadBalancerName", js.undefined)
    
    @scala.inline
    def setPolicyNamesVarargs(value: Input[String]*): Self = this.set("policyNames", js.Array(value :_*))
    
    @scala.inline
    def setPolicyNames(value: Input[js.Array[Input[String]]]): Self = this.set("policyNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicyNames: Self = this.set("policyNames", js.undefined)
  }
}
