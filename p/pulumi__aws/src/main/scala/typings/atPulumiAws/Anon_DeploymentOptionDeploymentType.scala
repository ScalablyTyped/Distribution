package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DeploymentOptionDeploymentType extends js.Object {
  var deploymentOption: js.UndefOr[Input[String]] = js.undefined
  var deploymentType: js.UndefOr[Input[String]] = js.undefined
}

object Anon_DeploymentOptionDeploymentType {
  @scala.inline
  def apply(deploymentOption: Input[String] = null, deploymentType: Input[String] = null): Anon_DeploymentOptionDeploymentType = {
    val __obj = js.Dynamic.literal()
    if (deploymentOption != null) __obj.updateDynamic("deploymentOption")(deploymentOption.asInstanceOf[js.Any])
    if (deploymentType != null) __obj.updateDynamic("deploymentType")(deploymentType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DeploymentOptionDeploymentType]
  }
}

