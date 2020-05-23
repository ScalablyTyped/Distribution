package typings.pulumiAws.containerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PortMapping extends js.Object {
  var containerPort: js.UndefOr[Double] = js.native
  var hostPort: js.UndefOr[Double] = js.native
  var protocol: js.UndefOr[Protocol] = js.native
}

object PortMapping {
  @scala.inline
  def apply(
    containerPort: js.UndefOr[Double] = js.undefined,
    hostPort: js.UndefOr[Double] = js.undefined,
    protocol: Protocol = null
  ): PortMapping = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(containerPort)) __obj.updateDynamic("containerPort")(containerPort.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hostPort)) __obj.updateDynamic("hostPort")(hostPort.get.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[PortMapping]
  }
}

