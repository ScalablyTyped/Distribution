package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
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
  var hostname: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * IP is set for load-balancer ingress points that are IP based (typically GCE or OpenStack load-balancers)
    */
  var ip: js.UndefOr[Input[String]] = js.undefined
}
object LoadBalancerIngress {
  
  inline def apply(): LoadBalancerIngress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadBalancerIngress]
  }
  
  extension [Self <: LoadBalancerIngress](x: Self) {
    
    inline def setHostname(value: Input[String]): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
    
    inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
    
    inline def setIp(value: Input[String]): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
    
    inline def setIpUndefined: Self = StObject.set(x, "ip", js.undefined)
  }
}
