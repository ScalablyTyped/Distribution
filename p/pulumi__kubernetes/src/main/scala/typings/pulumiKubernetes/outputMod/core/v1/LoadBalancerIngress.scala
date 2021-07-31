package typings.pulumiKubernetes.outputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * LoadBalancerIngress represents the status of a load-balancer ingress point: traffic intended for the service should be sent to an ingress point.
  */
trait LoadBalancerIngress extends StObject {
  
  /**
    * Hostname is set for load-balancer ingress points that are DNS based (typically AWS load-balancers)
    */
  var hostname: String
  
  /**
    * IP is set for load-balancer ingress points that are IP based (typically GCE or OpenStack load-balancers)
    */
  var ip: String
}
object LoadBalancerIngress {
  
  @scala.inline
  def apply(hostname: String, ip: String): LoadBalancerIngress = {
    val __obj = js.Dynamic.literal(hostname = hostname.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadBalancerIngress]
  }
  
  @scala.inline
  implicit class LoadBalancerIngressMutableBuilder[Self <: LoadBalancerIngress] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIp(value: String): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
  }
}
