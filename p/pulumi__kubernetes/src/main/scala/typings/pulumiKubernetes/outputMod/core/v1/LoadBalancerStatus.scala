package typings.pulumiKubernetes.outputMod.core.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * LoadBalancerStatus represents the status of a load-balancer.
  */
@js.native
trait LoadBalancerStatus extends js.Object {
  
  /**
    * Ingress is a list containing ingress points for the load-balancer. Traffic intended for the service should be sent to these ingress points.
    */
  var ingress: js.Array[LoadBalancerIngress] = js.native
}
object LoadBalancerStatus {
  
  @scala.inline
  def apply(ingress: js.Array[LoadBalancerIngress]): LoadBalancerStatus = {
    val __obj = js.Dynamic.literal(ingress = ingress.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadBalancerStatus]
  }
  
  @scala.inline
  implicit class LoadBalancerStatusOps[Self <: LoadBalancerStatus] (val x: Self) extends AnyVal {
    
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
    def setIngressVarargs(value: LoadBalancerIngress*): Self = this.set("ingress", js.Array(value :_*))
    
    @scala.inline
    def setIngress(value: js.Array[LoadBalancerIngress]): Self = this.set("ingress", value.asInstanceOf[js.Any])
  }
}
