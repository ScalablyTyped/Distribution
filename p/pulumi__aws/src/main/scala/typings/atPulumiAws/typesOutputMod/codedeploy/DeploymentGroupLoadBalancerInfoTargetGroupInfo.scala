package typings.atPulumiAws.typesOutputMod.codedeploy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeploymentGroupLoadBalancerInfoTargetGroupInfo extends js.Object {
  /**
    * Name of the target group.
    */
  var name: js.UndefOr[String] = js.undefined
}

object DeploymentGroupLoadBalancerInfoTargetGroupInfo {
  @scala.inline
  def apply(name: String = null): DeploymentGroupLoadBalancerInfoTargetGroupInfo = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[DeploymentGroupLoadBalancerInfoTargetGroupInfo]
  }
}

