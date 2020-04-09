package typings.pulumiAws.outputMod.codedeploy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeploymentGroupLoadBalancerInfoElbInfo extends js.Object {
  /**
    * The name of the load balancer that will be used to route traffic from original instances to replacement instances in a blue/green deployment. For in-place deployments, the name of the load balancer that instances are deregistered from so they are not serving traffic during a deployment, and then re-registered with after the deployment completes.
    */
  var name: js.UndefOr[String] = js.native
}

object DeploymentGroupLoadBalancerInfoElbInfo {
  @scala.inline
  def apply(name: String = null): DeploymentGroupLoadBalancerInfoElbInfo = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentGroupLoadBalancerInfoElbInfo]
  }
}

