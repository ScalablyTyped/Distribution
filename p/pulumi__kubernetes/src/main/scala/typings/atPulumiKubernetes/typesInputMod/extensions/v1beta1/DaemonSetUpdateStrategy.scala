package typings.atPulumiKubernetes.typesInputMod.extensions.v1beta1

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  */
trait DaemonSetUpdateStrategy extends js.Object {
  /**
    * Rolling update config params. Present only if type = "RollingUpdate".
    */
  var rollingUpdate: js.UndefOr[Input[RollingUpdateDaemonSet]] = js.undefined
  /**
    * Type of daemon set update. Can be "RollingUpdate" or "OnDelete". Default is OnDelete.
    */
  var `type`: js.UndefOr[Input[String]] = js.undefined
}

object DaemonSetUpdateStrategy {
  @scala.inline
  def apply(rollingUpdate: Input[RollingUpdateDaemonSet] = null, `type`: Input[String] = null): DaemonSetUpdateStrategy = {
    val __obj = js.Dynamic.literal()
    if (rollingUpdate != null) __obj.updateDynamic("rollingUpdate")(rollingUpdate.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DaemonSetUpdateStrategy]
  }
}

