package typings.atPulumiAws.typesInputMod.codedeploy

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeploymentGroupLoadBalancerInfoElbInfo extends js.Object {
  /**
    * Name of the target group.
    */
  var name: js.UndefOr[Input[String]] = js.undefined
}

object DeploymentGroupLoadBalancerInfoElbInfo {
  @scala.inline
  def apply(name: Input[String] = null): DeploymentGroupLoadBalancerInfoElbInfo = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentGroupLoadBalancerInfoElbInfo]
  }
}

