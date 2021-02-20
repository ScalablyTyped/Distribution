package typings.pulumiKubernetes.outputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * LoadBalancerStatus represents the status of a load-balancer.
  */
@js.native
trait LoadBalancerStatus extends StObject {
  
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
  implicit class LoadBalancerStatusMutableBuilder[Self <: LoadBalancerStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIngress(value: js.Array[LoadBalancerIngress]): Self = StObject.set(x, "ingress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIngressVarargs(value: LoadBalancerIngress*): Self = StObject.set(x, "ingress", js.Array(value :_*))
  }
}
