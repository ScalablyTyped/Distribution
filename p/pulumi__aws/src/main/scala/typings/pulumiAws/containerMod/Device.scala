package typings.pulumiAws.containerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Device extends js.Object {
  var containerPath: js.UndefOr[String] = js.native
  var hostPath: String = js.native
  var permissions: js.UndefOr[js.Array[String]] = js.native
}

object Device {
  @scala.inline
  def apply(hostPath: String, containerPath: String = null, permissions: js.Array[String] = null): Device = {
    val __obj = js.Dynamic.literal(hostPath = hostPath.asInstanceOf[js.Any])
    if (containerPath != null) __obj.updateDynamic("containerPath")(containerPath.asInstanceOf[js.Any])
    if (permissions != null) __obj.updateDynamic("permissions")(permissions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Device]
  }
}

