package typings.atPulumiAws.typesInputMod.codedeploy

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeploymentConfigMinimumHealthyHosts extends js.Object {
  var `type`: js.UndefOr[Input[String]] = js.undefined
  var value: js.UndefOr[Input[Double]] = js.undefined
}

object DeploymentConfigMinimumHealthyHosts {
  @scala.inline
  def apply(`type`: Input[String] = null, value: Input[Double] = null): DeploymentConfigMinimumHealthyHosts = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentConfigMinimumHealthyHosts]
  }
}

