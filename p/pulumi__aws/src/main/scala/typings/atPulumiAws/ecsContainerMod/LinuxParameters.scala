package typings.atPulumiAws.ecsContainerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LinuxParameters extends js.Object {
  var capabilities: js.UndefOr[KernelCapabilities] = js.native
  var devices: js.UndefOr[js.Array[Device]] = js.native
  var initProcessEnabled: js.UndefOr[Boolean] = js.native
}

object LinuxParameters {
  @scala.inline
  def apply(
    capabilities: KernelCapabilities = null,
    devices: js.Array[Device] = null,
    initProcessEnabled: js.UndefOr[Boolean] = js.undefined
  ): LinuxParameters = {
    val __obj = js.Dynamic.literal()
    if (capabilities != null) __obj.updateDynamic("capabilities")(capabilities.asInstanceOf[js.Any])
    if (devices != null) __obj.updateDynamic("devices")(devices.asInstanceOf[js.Any])
    if (!js.isUndefined(initProcessEnabled)) __obj.updateDynamic("initProcessEnabled")(initProcessEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinuxParameters]
  }
}

