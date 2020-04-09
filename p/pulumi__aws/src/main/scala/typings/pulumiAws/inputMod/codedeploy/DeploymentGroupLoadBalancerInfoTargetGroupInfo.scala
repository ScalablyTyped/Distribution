package typings.pulumiAws.inputMod.codedeploy

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeploymentGroupLoadBalancerInfoTargetGroupInfo extends js.Object {
  /**
    * The name of the target group that instances in the original environment are deregistered from, and instances in the replacement environment registered with. For in-place deployments, the name of the target group that instances are deregistered from, so they are not serving traffic during a deployment, and then re-registered with after the deployment completes.
    */
  var name: js.UndefOr[Input[String]] = js.native
}

object DeploymentGroupLoadBalancerInfoTargetGroupInfo {
  @scala.inline
  def apply(name: Input[String] = null): DeploymentGroupLoadBalancerInfoTargetGroupInfo = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentGroupLoadBalancerInfoTargetGroupInfo]
  }
}

