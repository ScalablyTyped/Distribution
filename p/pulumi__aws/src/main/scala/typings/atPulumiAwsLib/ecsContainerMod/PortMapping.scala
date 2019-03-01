package typings
package atPulumiAwsLib.ecsContainerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PortMapping extends js.Object {
  var containerPort: js.UndefOr[scala.Double] = js.undefined
  var hostPort: js.UndefOr[scala.Double] = js.undefined
  var protocol: js.UndefOr[Protocol] = js.undefined
}

object PortMapping {
  @scala.inline
  def apply(
    containerPort: scala.Int | scala.Double = null,
    hostPort: scala.Int | scala.Double = null,
    protocol: Protocol = null
  ): PortMapping = {
    val __obj = js.Dynamic.literal()
    if (containerPort != null) __obj.updateDynamic("containerPort")(containerPort.asInstanceOf[js.Any])
    if (hostPort != null) __obj.updateDynamic("hostPort")(hostPort.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol)
    __obj.asInstanceOf[PortMapping]
  }
}

