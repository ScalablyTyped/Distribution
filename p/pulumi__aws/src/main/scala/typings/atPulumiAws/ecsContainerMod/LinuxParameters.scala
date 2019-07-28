package typings.atPulumiAws.ecsContainerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinuxParameters extends js.Object {
  var capabilities: js.UndefOr[KernelCapabilities] = js.undefined
  var devices: js.UndefOr[js.Array[Device]] = js.undefined
  var initProcessEnabled: js.UndefOr[Boolean] = js.undefined
}

object LinuxParameters {
  @scala.inline
  def apply(
    capabilities: KernelCapabilities = null,
    devices: js.Array[Device] = null,
    initProcessEnabled: js.UndefOr[Boolean] = js.undefined
  ): LinuxParameters = {
    val __obj = js.Dynamic.literal()
    if (capabilities != null) __obj.updateDynamic("capabilities")(capabilities)
    if (devices != null) __obj.updateDynamic("devices")(devices)
    if (!js.isUndefined(initProcessEnabled)) __obj.updateDynamic("initProcessEnabled")(initProcessEnabled)
    __obj.asInstanceOf[LinuxParameters]
  }
}

