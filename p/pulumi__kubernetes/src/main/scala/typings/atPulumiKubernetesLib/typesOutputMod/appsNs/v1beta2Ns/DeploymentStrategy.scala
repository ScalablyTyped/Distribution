package typings
package atPulumiKubernetesLib.typesOutputMod.appsNs.v1beta2Ns

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
  val rollingUpdate: RollingUpdateDeployment
  /**
    * Type of deployment. Can be "Recreate" or "RollingUpdate". Default is RollingUpdate.
    */
  val `type`: java.lang.String
}

object DeploymentStrategy {
  @scala.inline
  def apply(rollingUpdate: RollingUpdateDeployment, `type`: java.lang.String): DeploymentStrategy = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("rollingUpdate")(rollingUpdate)
    __obj.asInstanceOf[DeploymentStrategy]
  }
}

