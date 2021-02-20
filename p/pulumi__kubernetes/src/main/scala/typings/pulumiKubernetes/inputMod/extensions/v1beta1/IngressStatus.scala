package typings.pulumiKubernetes.inputMod.extensions.v1beta1

import typings.pulumiKubernetes.inputMod.core.v1.LoadBalancerStatus
import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * IngressStatus describe the current state of the Ingress.
  */
@js.native
trait IngressStatus extends StObject {
  
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
  implicit class IngressStatusMutableBuilder[Self <: IngressStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLoadBalancer(value: Input[LoadBalancerStatus]): Self = StObject.set(x, "loadBalancer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadBalancerUndefined: Self = StObject.set(x, "loadBalancer", js.undefined)
  }
}
