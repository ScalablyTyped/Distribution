package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DeploymentOption extends js.Object {
  var deploymentOption: js.UndefOr[String] = js.undefined
  var deploymentType: js.UndefOr[String] = js.undefined
}

object Anon_DeploymentOption {
  @scala.inline
  def apply(deploymentOption: String = null, deploymentType: String = null): Anon_DeploymentOption = {
    val __obj = js.Dynamic.literal()
    if (deploymentOption != null) __obj.updateDynamic("deploymentOption")(deploymentOption)
    if (deploymentType != null) __obj.updateDynamic("deploymentType")(deploymentType)
    __obj.asInstanceOf[Anon_DeploymentOption]
  }
}

