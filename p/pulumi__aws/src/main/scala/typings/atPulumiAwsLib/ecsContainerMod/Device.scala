package typings
package atPulumiAwsLib.ecsContainerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Device extends js.Object {
  var containerPath: js.UndefOr[java.lang.String] = js.undefined
  var hostPath: java.lang.String
  var permissions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object Device {
  @scala.inline
  def apply(
    hostPath: java.lang.String,
    containerPath: java.lang.String = null,
    permissions: js.Array[java.lang.String] = null
  ): Device = {
    val __obj = js.Dynamic.literal(hostPath = hostPath)
    if (containerPath != null) __obj.updateDynamic("containerPath")(containerPath)
    if (permissions != null) __obj.updateDynamic("permissions")(permissions)
    __obj.asInstanceOf[Device]
  }
}

