package typings.pulumiAws.outputMod.codedeploy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeploymentGroupLoadBalancerInfoTargetGroupInfo extends js.Object {
  /**
    * Name of the target group.
    */
  var name: js.UndefOr[String] = js.native
}

object DeploymentGroupLoadBalancerInfoTargetGroupInfo {
  @scala.inline
  def apply(name: String = null): DeploymentGroupLoadBalancerInfoTargetGroupInfo = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentGroupLoadBalancerInfoTargetGroupInfo]
  }
}

