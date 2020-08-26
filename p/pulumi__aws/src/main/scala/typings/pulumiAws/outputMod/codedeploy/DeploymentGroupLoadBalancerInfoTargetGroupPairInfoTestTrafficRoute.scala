package typings.pulumiAws.outputMod.codedeploy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTestTrafficRoute extends js.Object {
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
  implicit class DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTestTrafficRouteOps[Self <: DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTestTrafficRoute] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setListenerArnsVarargs(value: String*): Self = this.set("listenerArns", js.Array(value :_*))
    @scala.inline
    def setListenerArns(value: js.Array[String]): Self = this.set("listenerArns", value.asInstanceOf[js.Any])
  }
  
}

