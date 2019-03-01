package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DeploymentOption extends js.Object {
  var deploymentOption: js.UndefOr[java.lang.String] = js.undefined
  var deploymentType: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_DeploymentOption {
  @scala.inline
  def apply(deploymentOption: java.lang.String = null, deploymentType: java.lang.String = null): Anon_DeploymentOption = {
    val __obj = js.Dynamic.literal()
    if (deploymentOption != null) __obj.updateDynamic("deploymentOption")(deploymentOption)
    if (deploymentType != null) __obj.updateDynamic("deploymentType")(deploymentType)
    __obj.asInstanceOf[Anon_DeploymentOption]
  }
}

