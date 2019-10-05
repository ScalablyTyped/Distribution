package typings.atPulumiKubernetes.typesInputMod.apps.v1beta1

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * DeploymentStrategy describes how to replace existing pods with new ones.
  */
trait DeploymentStrategy extends js.Object {
  /**
    * Rolling update config params. Present only if DeploymentStrategyType = RollingUpdate.
    */
  var rollingUpdate: js.UndefOr[Input[RollingUpdateDeployment]] = js.undefined
  /**
    * Type of deployment. Can be "Recreate" or "RollingUpdate". Default is RollingUpdate.
    */
  var `type`: js.UndefOr[Input[String]] = js.undefined
}

object DeploymentStrategy {
  @scala.inline
  def apply(rollingUpdate: Input[RollingUpdateDeployment] = null, `type`: Input[String] = null): DeploymentStrategy = {
    val __obj = js.Dynamic.literal()
    if (rollingUpdate != null) __obj.updateDynamic("rollingUpdate")(rollingUpdate.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentStrategy]
  }
}

