package typings.pulumiKubernetes.inputMod.extensions.v1beta1

import typings.pulumiKubernetes.inputMod.core.v1.LoadBalancerStatus
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * IngressStatus describe the current state of the Ingress.
  */
@js.native
trait IngressStatus extends js.Object {
  
  /**
    * LoadBalancer contains the current status of the load-balancer.
    */
  var loadBalancer: js.UndefOr[Input[LoadBalancerStatus]] = js.native
}
object IngressStatus {
  
  @scala.inline
  def apply(): IngressStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IngressStatus]
  }
  
  @scala.inline
  implicit class IngressStatusOps[Self <: IngressStatus] (val x: Self) extends AnyVal {
    
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
    def setLoadBalancer(value: Input[LoadBalancerStatus]): Self = this.set("loadBalancer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadBalancer: Self = this.set("loadBalancer", js.undefined)
  }
}
