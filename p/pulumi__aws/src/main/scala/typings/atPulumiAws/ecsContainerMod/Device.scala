package typings.atPulumiAws.ecsContainerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Device extends js.Object {
  var containerPath: js.UndefOr[String] = js.undefined
  var hostPath: String
  var permissions: js.UndefOr[js.Array[String]] = js.undefined
}

object Device {
  @scala.inline
  def apply(hostPath: String, containerPath: String = null, permissions: js.Array[String] = null): Device = {
    val __obj = js.Dynamic.literal(hostPath = hostPath)
    if (containerPath != null) __obj.updateDynamic("containerPath")(containerPath)
    if (permissions != null) __obj.updateDynamic("permissions")(permissions)
    __obj.asInstanceOf[Device]
  }
}

