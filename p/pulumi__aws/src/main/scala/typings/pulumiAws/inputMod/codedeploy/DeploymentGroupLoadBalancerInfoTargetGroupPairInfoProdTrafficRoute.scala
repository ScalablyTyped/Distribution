package typings.pulumiAws.inputMod.codedeploy

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeploymentGroupLoadBalancerInfoTargetGroupPairInfoProdTrafficRoute extends StObject {
  
  /**
    * List of Amazon Resource Names (ARNs) of the load balancer listeners.
    */
  var listenerArns: Input[js.Array[Input[String]]] = js.native
}
object DeploymentGroupLoadBalancerInfoTargetGroupPairInfoProdTrafficRoute {
  
  @scala.inline
  def apply(listenerArns: Input[js.Array[Input[String]]]): DeploymentGroupLoadBalancerInfoTargetGroupPairInfoProdTrafficRoute = {
    val __obj = js.Dynamic.literal(listenerArns = listenerArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentGroupLoadBalancerInfoTargetGroupPairInfoProdTrafficRoute]
  }
  
  @scala.inline
  implicit class DeploymentGroupLoadBalancerInfoTargetGroupPairInfoProdTrafficRouteMutableBuilder[Self <: DeploymentGroupLoadBalancerInfoTargetGroupPairInfoProdTrafficRoute] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setListenerArns(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "listenerArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListenerArnsVarargs(value: Input[String]*): Self = StObject.set(x, "listenerArns", js.Array(value :_*))
  }
}
