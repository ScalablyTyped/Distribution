package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ServiceStatus represents the current status of a service.
  */
@js.native
trait ServiceStatus extends StObject {
  
  /**
    * LoadBalancer contains the current status of the load-balancer, if one is present.
    */
  var loadBalancer: js.UndefOr[Input[LoadBalancerStatus]] = js.native
}
object ServiceStatus {
  
  @scala.inline
  def apply(): ServiceStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceStatus]
  }
  
  @scala.inline
  implicit class ServiceStatusMutableBuilder[Self <: ServiceStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLoadBalancer(value: Input[LoadBalancerStatus]): Self = StObject.set(x, "loadBalancer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadBalancerUndefined: Self = StObject.set(x, "loadBalancer", js.undefined)
  }
}
