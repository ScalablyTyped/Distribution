package typings.pulumiAws.outputMod.codedeploy

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeploymentGroupLoadBalancerInfoTargetGroupPairInfoProdTrafficRoute extends StObject {
  
  /**
    * List of Amazon Resource Names (ARNs) of the load balancer listeners.
    */
  var listenerArns: js.Array[String] = js.native
}
object DeploymentGroupLoadBalancerInfoTargetGroupPairInfoProdTrafficRoute {
  
  @scala.inline
  def apply(listenerArns: js.Array[String]): DeploymentGroupLoadBalancerInfoTargetGroupPairInfoProdTrafficRoute = {
    val __obj = js.Dynamic.literal(listenerArns = listenerArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentGroupLoadBalancerInfoTargetGroupPairInfoProdTrafficRoute]
  }
  
  @scala.inline
  implicit class DeploymentGroupLoadBalancerInfoTargetGroupPairInfoProdTrafficRouteMutableBuilder[Self <: DeploymentGroupLoadBalancerInfoTargetGroupPairInfoProdTrafficRoute] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setListenerArns(value: js.Array[String]): Self = StObject.set(x, "listenerArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListenerArnsVarargs(value: String*): Self = StObject.set(x, "listenerArns", js.Array(value :_*))
  }
}
