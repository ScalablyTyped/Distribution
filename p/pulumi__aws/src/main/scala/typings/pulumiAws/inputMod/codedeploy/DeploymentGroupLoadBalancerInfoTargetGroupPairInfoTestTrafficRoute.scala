package typings.pulumiAws.inputMod.codedeploy

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTestTrafficRoute extends StObject {
  
  /**
    * List of Amazon Resource Names (ARNs) of the load balancer listeners.
    */
  var listenerArns: Input[js.Array[Input[String]]]
}
object DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTestTrafficRoute {
  
  inline def apply(listenerArns: Input[js.Array[Input[String]]]): DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTestTrafficRoute = {
    val __obj = js.Dynamic.literal(listenerArns = listenerArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTestTrafficRoute]
  }
  
  extension [Self <: DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTestTrafficRoute](x: Self) {
    
    inline def setListenerArns(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "listenerArns", value.asInstanceOf[js.Any])
    
    inline def setListenerArnsVarargs(value: Input[String]*): Self = StObject.set(x, "listenerArns", js.Array(value :_*))
  }
}
