package typings.pulumiAws.outputMod.codedeploy

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTestTrafficRoute extends StObject {
  
  /**
    * List of Amazon Resource Names (ARNs) of the load balancer listeners.
    */
  var listenerArns: js.Array[String] = js.native
}
object DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTestTrafficRoute {
  
  @scala.inline
  def apply(listenerArns: js.Array[String]): DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTestTrafficRoute = {
    val __obj = js.Dynamic.literal(listenerArns = listenerArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTestTrafficRoute]
  }
  
  @scala.inline
  implicit class DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTestTrafficRouteMutableBuilder[Self <: DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTestTrafficRoute] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setListenerArns(value: js.Array[String]): Self = StObject.set(x, "listenerArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListenerArnsVarargs(value: String*): Self = StObject.set(x, "listenerArns", js.Array(value :_*))
  }
}
