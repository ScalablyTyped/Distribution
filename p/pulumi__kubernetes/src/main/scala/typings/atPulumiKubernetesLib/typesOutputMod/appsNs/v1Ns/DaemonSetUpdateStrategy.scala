package typings
package atPulumiKubernetesLib.typesOutputMod.appsNs.v1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * DaemonSetUpdateStrategy is a struct used to control the update strategy for a DaemonSet.
  */
trait DaemonSetUpdateStrategy extends js.Object {
  /**
    * Rolling update config params. Present only if type = "RollingUpdate".
    */
  val rollingUpdate: RollingUpdateDaemonSet
  /**
    * Type of daemon set update. Can be "RollingUpdate" or "OnDelete". Default is RollingUpdate.
    */
  val `type`: java.lang.String
}

object DaemonSetUpdateStrategy {
  @scala.inline
  def apply(rollingUpdate: RollingUpdateDaemonSet, `type`: java.lang.String): DaemonSetUpdateStrategy = {
    val __obj = js.Dynamic.literal(rollingUpdate = rollingUpdate)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[DaemonSetUpdateStrategy]
  }
}

