package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
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
  var ingress: js.UndefOr[Input[js.Array[Input[LoadBalancerIngress]]]] = js.native
}
object LoadBalancerStatus {
  
  @scala.inline
  def apply(): LoadBalancerStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadBalancerStatus]
  }
  
  @scala.inline
  implicit class LoadBalancerStatusMutableBuilder[Self <: LoadBalancerStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIngress(value: Input[js.Array[Input[LoadBalancerIngress]]]): Self = StObject.set(x, "ingress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIngressUndefined: Self = StObject.set(x, "ingress", js.undefined)
    
    @scala.inline
    def setIngressVarargs(value: Input[LoadBalancerIngress]*): Self = StObject.set(x, "ingress", js.Array(value :_*))
  }
}
