package typings.atPulumiAws.typesInputMod.appmeshNs

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VirtualNodeSpecBackend extends js.Object {
  /**
    * Specifies a virtual service to use as a backend for a virtual node.
    */
  var virtualService: js.UndefOr[Input[VirtualNodeSpecBackendVirtualService]] = js.undefined
}

object VirtualNodeSpecBackend {
  @scala.inline
  def apply(virtualService: Input[VirtualNodeSpecBackendVirtualService] = null): VirtualNodeSpecBackend = {
    val __obj = js.Dynamic.literal()
    if (virtualService != null) __obj.updateDynamic("virtualService")(virtualService.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualNodeSpecBackend]
  }
}

