package typings.pulumiKubernetes.outputMod.networking.v1

import typings.pulumiKubernetes.outputMod.core.v1.LoadBalancerStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * IngressStatus describe the current state of the Ingress.
  */
trait IngressStatus extends StObject {
  
  /**
    * LoadBalancer contains the current status of the load-balancer.
    */
  var loadBalancer: LoadBalancerStatus
}
object IngressStatus {
  
  @scala.inline
  def apply(loadBalancer: LoadBalancerStatus): IngressStatus = {
    val __obj = js.Dynamic.literal(loadBalancer = loadBalancer.asInstanceOf[js.Any])
    __obj.asInstanceOf[IngressStatus]
  }
  
  @scala.inline
  implicit class IngressStatusMutableBuilder[Self <: IngressStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLoadBalancer(value: LoadBalancerStatus): Self = StObject.set(x, "loadBalancer", value.asInstanceOf[js.Any])
  }
}
