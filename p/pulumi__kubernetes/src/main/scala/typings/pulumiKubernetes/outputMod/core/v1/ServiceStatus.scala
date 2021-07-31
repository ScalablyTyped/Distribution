package typings.pulumiKubernetes.outputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ServiceStatus represents the current status of a service.
  */
trait ServiceStatus extends StObject {
  
  /**
    * LoadBalancer contains the current status of the load-balancer, if one is present.
    */
  var loadBalancer: LoadBalancerStatus
}
object ServiceStatus {
  
  @scala.inline
  def apply(loadBalancer: LoadBalancerStatus): ServiceStatus = {
    val __obj = js.Dynamic.literal(loadBalancer = loadBalancer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceStatus]
  }
  
  @scala.inline
  implicit class ServiceStatusMutableBuilder[Self <: ServiceStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLoadBalancer(value: LoadBalancerStatus): Self = StObject.set(x, "loadBalancer", value.asInstanceOf[js.Any])
  }
}
